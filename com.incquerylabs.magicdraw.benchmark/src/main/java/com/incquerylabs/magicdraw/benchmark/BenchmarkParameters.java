package com.incquerylabs.magicdraw.benchmark;

import java.io.File;
import java.util.List;
import java.util.Objects;

import com.beust.jcommander.internal.Lists;

public class BenchmarkParameters {
		
		private static final String WARMUP_PATH_POSTFIX = "warmup" + File.separator;
	
		private String projectPath;
		private String resultPath;
		private String warmupProjectPath;
		
		private BackendSelection backend = BackendSelection.RETE;

		private String queryName = "transitiveSubstatesWithCheck3";
		private int runIndex = 1;
		int modelSize = 300000;
		
		private String server;
		private String user;
		private String password;

		private List<String> excludedQueries;
		
		public String getResultPath() {
			return resultPath;
		}
		
		public String getResultPath(boolean isWarmup) {
			return isWarmup ? resultPath + WARMUP_PATH_POSTFIX : resultPath;
		}

		public String getProjectPath(boolean isWarmup) {
			return isWarmup ? warmupProjectPath : projectPath;
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
	    
	    public void setProjectPath(String projectPath) {
		    	if (projectPath.endsWith(File.separator)) {
	    			this.projectPath = projectPath;
	    		} else {
	    			this.projectPath = projectPath + File.separator;
	    		}
	    }
	    
	    public void setWarmupProjectPath(String warmupProjectPath) {
			if (warmupProjectPath.endsWith(File.separator)) {
				this.warmupProjectPath = warmupProjectPath;
			} else {
				this.warmupProjectPath = warmupProjectPath + File.separator;
			}
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

		public void setExcludedQueries(String excludedQueries) {
			this.excludedQueries = Lists.newArrayList(excludedQueries.split(", "));
		}	
		
		public boolean isExcluded(String query) {
			return excludedQueries.contains(query);
		}
	}