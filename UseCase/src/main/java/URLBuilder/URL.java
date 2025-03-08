package URLBuilder;

public class URL {

	private String protocol;
	private String hostName;
	private String portNum; // opt
	private String pathParam; // opt
	private String queryParam; // opt
	
	private URL () {};
	
	private URL (Builder b) {
		this.protocol = b.protocol;
		this.hostName = b.hostName;
		this.portNum = b.portNum;
		this.pathParam = b.pathParam;
		this.queryParam = b.queryParam;
	}
	
	public String toString () {
		if (this.portNum != null && this.pathParam != null && this.queryParam != null) {
			return this.protocol + this.hostName + this.portNum + this.pathParam + this.queryParam;
		} else {
			return this.protocol + this.hostName;
		}
	}
	
	public String getProtocol() {
		return protocol;
	}

	public String getHostName() {
		return hostName;
	}

	public String getPortNum() {
		return portNum;
	}

	public String getPathParam() {
		return pathParam;
	}

	public String getQueryParam() {
		return queryParam;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	public static class Builder {

		private String protocol;
		private String hostName;
		private String portNum; // opt
		private String pathParam; // opt
		private String queryParam; // opt
		
		public URL build () {
			if (this.protocol == null || this.protocol.length() == 0) {
				throw new RuntimeException("Please enter valid protocol");
			}
			if (this.hostName == null || this.hostName.length() == 0) {
				throw new RuntimeException("Please enter valid host name");
			}
			return new URL(this);
		}

		public Builder setProtocol(String protocol) {
			this.protocol = protocol;
			return this;
		}

		public Builder setHostName(String hostName) {
			this.hostName = hostName;
			return this;
		}

		public Builder setPortNum(String portNum) {
			if (portNum.length() == 0 || portNum.isEmpty()) {
				throw new RuntimeException("Please provide valid port number");
			}
			int currPort = Integer.parseInt(portNum.split(":")[1]);
			if (currPort < 7000 || currPort > 8080) {
				throw new RuntimeException("Port number should be between 7000 and 8080");
			}
			this.portNum = portNum;
			return this;
		}

		public Builder setPathParam(String pathParam) {
			this.pathParam = pathParam;
			return this;
		}

		public Builder setQueryParam(String queryParam) {
			if (queryParam.length() == 0 || queryParam.isEmpty()) {
				throw new RuntimeException("Please enter valid query Param");
			}
//			String query = queryParam.split("?")[1];
//			String[] queries = query.split("=");
//			String key = queries[0];
//			String value = queries[1];
//			if (key.length() < 1 || value.length() < 1) {
//				throw new RuntimeException("Please enter valid key and value combo");
//			}
			this.queryParam = queryParam;
			return this;
		}

	}

}
