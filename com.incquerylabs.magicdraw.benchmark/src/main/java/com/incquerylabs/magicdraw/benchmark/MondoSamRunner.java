package com.incquerylabs.magicdraw.benchmark;

import java.io.File;

import org.eclipse.viatra.query.runtime.api.IQuerySpecification;

import com.incquerylabs.magicdraw.benchmark.mondo.sam.QueryMatcherToken;
import com.incquerylabs.magicdraw.benchmark.mondo.sam.SingleQueryScenario;
import com.nomagic.ci.persistence.versioning.IVersionDescriptor;
import com.nomagic.esi.api.ESI;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.esi.EsiUtils;
import com.nomagic.magicdraw.esi.EsiUtils.EsiBranchInfo;
import com.nomagic.magicdraw.teamwork2.ITeamworkService;
import com.nomagic.magicdraw.teamwork2.ServerLoginInfo;

import eu.mondo.sam.core.BenchmarkEngine;
import eu.mondo.sam.core.metrics.MemoryMetric;
import eu.mondo.sam.core.results.JsonSerializer;

public class MondoSamRunner {

	private final BenchmarkParameters parameters;

	public MondoSamRunner(BenchmarkParameters parameters) {
		this.parameters = parameters;
	}

	private static void openProject(String projectName, String revision, String server, String user, String password) {

		ITeamworkService teamworkService = EsiUtils.getTeamworkService();
		try {
			teamworkService.login(new ServerLoginInfo(server, user, password, true), true);
			
			ProjectDescriptor projectDescriptor = teamworkService.getProjectDescriptorByQualifiedName(projectName);

			ProjectDescriptor revisionDescriptor = null;

			if (revision != null) {
				revisionDescriptor = teamworkService.getProjectDescriptorById(teamworkService.getProjectIdByQualifiedName(projectName) + "/" + revision);
			}
			else {
				revisionDescriptor = projectDescriptor;
			}

			Application.getInstance().getProjectsManager().loadProject(revisionDescriptor, true);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			teamworkService.logout();
		}
	}

	@SuppressWarnings("deprecation")
	public void runPerformanceMeasurement(boolean isWarmup) throws Exception {
		int size = parameters.getModelSize();
		int runIndex = parameters.getRunIndex();

		String modelPath = parameters.getProjectName(isWarmup);
		String modelRevision = parameters.getProjectRevision(isWarmup);
		String resultPath = parameters.getResultPath(isWarmup);
		BackendSelection queryBackend = parameters.getSelectedBackend();
		if (!queryBackend.canHandleParameters(parameters)) {
			throw new InvalidBenchmarkParameterizationException("Invalid parameter configuration");
		}
		String server = parameters.getServer();
		String user = parameters.getUser();
		String password = parameters.getPassword();
		openProject(modelPath, modelRevision, server, user, password);
		runBenchmark(queryBackend, resultPath, size, runIndex);
		Application.getInstance().getProjectsManager().closeProjectNoSave();
	}

	private void runBenchmark(BackendSelection backend, String resultPath, Integer size, int runIndex)
			throws Exception {
		IQuerySpecification<?> querySpecification = backend.findQuery(parameters);
		String path = resultPath + getName(querySpecification) + File.separator;
		new File(path).mkdirs();

		BenchmarkEngine engine = new BenchmarkEngine();
		JsonSerializer.setResultPath(path);
		MemoryMetric.setNumberOfGC(5);

		QueryMatcherToken token = new QueryMatcherToken();
		SingleQueryScenario scenario = new SingleQueryScenario(getName(querySpecification), querySpecification,
				backend.getEngineImplementation(), backend.getEngineDefaultHints(), backend.isPreindexingRequired(),
				runIndex, backend.getToolName());
		scenario.setSize(size);
		engine.runBenchmark(scenario, token);
	}

	/**
	 * Returns the simple (not fully qualified) name of a query.
	 */
	@Deprecated
	private String getName(IQuerySpecification<?> querySpecification) {
		return querySpecification.getFullyQualifiedName()
				.substring(querySpecification.getFullyQualifiedName().lastIndexOf(".") + 1);
	}

}
