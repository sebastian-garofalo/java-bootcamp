package com.filelist;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class FileList {
	
	private ArrayList<String> files;
	private int capacity = 0;
	
	public FileList(int capacity) {
		files = new ArrayList();
		this.capacity = capacity;
	}
	public void newEntry(String file) {
		if(files.contains(file)) {
			this.deleteEntry(file);
		}
		if(this.full()) {
			this.files.remove(0);
		}
		files.add(file);
	}
	public void deleteEntry(String file) {
		if(files.contains(file)) {
			files.remove(file);
		}
	}
	public ArrayList<String> getRecentFileList(){
		ArrayList<String> aux = new ArrayList(files);
		Collections.reverse(aux);
		return aux;
	}
	private boolean full() {
		if(files.size() >= capacity) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String concat = "";
		for (String f : getRecentFileList()) {
			concat += f +"-"; 
		}
		concat = (!concat.isEmpty())?concat.substring(0, concat.length()-1):concat; 
		return concat;
	}
}
