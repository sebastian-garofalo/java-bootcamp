package exercise4_builder;

public class DBConnection {

	private String path = "";
	private String serverName = "";
	private int port = 0;
	private String protocol = "";
	
	public void setPath(String path) {
		this.path = path;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
	@Override
	public String toString() {
		return "DBConnection [path=" + path + ", serverName=" + serverName + ", port=" + port + ", protocol=" + protocol + "]";
	}
	
	
}
