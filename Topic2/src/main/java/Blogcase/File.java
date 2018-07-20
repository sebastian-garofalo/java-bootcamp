package Blogcase;

public class File {

	String fileDirectory;
	String fileName;
	boolean openFile = false;

	public void openFile() {
		this.openFile = true;
	}

	public void closeFile() {
		this.openFile = false;
	}

	public String getDirectory() {
		return fileDirectory;
	}

	public String getFileName() {
		return fileName;
	}

	public boolean isOpen() {
		return openFile;
	}
}
