package com.incquerylabs.magicdraw.benchmark;

import java.io.File;
import java.util.Objects;

public class BenchmarkParameters {

	private static final String WARMUP_PATH_POSTFIX = "warmup" + File.separator;

	private String projectName;
	private String projectRevision;
	private String resultPath;
	private String warmupProjectName;
	private String warmupProjectRevision;

	private BackendSelection backend = BackendSelection.RETE;

	private String queryName = "transitiveSubstatesWithCheck3";
	private int runIndex = 1;
	int modelSize = 300000;

	private String server;
	private String user;
	private String password;

	public String getResultPath() {
		return resultPath;
	}

	public String getResultPath(boolean isWarmup) {
		return isWarmup ? resultPath + WARMUP_PATH_POSTFIX : resultPath;
	}

	public String getProjectName(boolean isWarmup) {
		return isWarmup ? warmupProjectName : projectName;
	}

	public int getModelSize() {
		return modelSize;
	}

	public int getRunIndex() {
		return runIndex;
	}

	public BackendSelection getSelectedBackend() {
		return backend;
	}

	public String getQueryName() {
		return queryName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setWarmupProjectName(String warmupProjectName) {
		this.warmupProjectName = warmupProjectName;
	}

	public void setResultPath(String resultPath) {
		if (resultPath.endsWith(File.separator)) {
			this.resultPath = resultPath;
		} else {
			this.resultPath = resultPath + File.separator;
		}
	}

	public void setSelectedBackend(String backendString) {
		if (Objects.equals("RETE", backendString)) {
			backend = BackendSelection.RETE;
		} else if (Objects.equals("LOCAL_SEARCH", backendString)) {
			backend = BackendSelection.LOCALSEARCH;
		} else if (Objects.equals("LOCAL_SEARCH_HINTS-CONDITION_FIRST", backendString)) {
			backend = BackendSelection.LOCAL_SEARCH_HINTS_CONDITION_FIRST;
		} else if (Objects.equals("LOCAL_SEARCH_HINTS-TC_FIRST", backendString)) {
			backend = BackendSelection.LOCAL_SEARCH_HINTS_TC_FIRST;
		} else if (Objects.equals("HYBRID", backendString)) {
			backend = BackendSelection.HYBRID;
		} else {
			throw new IllegalArgumentException("Invalid benchmark engine " + backendString);
		}
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	public void setRunIndex(String runIndex) {
		this.runIndex = Integer.parseInt(runIndex);
	}

	public void setModelSize(String modelSize) {
		this.modelSize = Integer.parseInt(modelSize);
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProjectRevision(boolean isWarmup) {
		return isWarmup ? warmupProjectRevision : projectRevision;
	}

	public void setProjectRevision(String revision) {
		this.projectRevision = revision;
	}

	public void setWarmupProjectRevision(String warmupProjectRevision) {
		this.warmupProjectRevision = warmupProjectRevision;
	}

}