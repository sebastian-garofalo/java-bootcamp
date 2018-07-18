package com.filelist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.filelist.FileList;

public class FileListTest {

	public static int listSize = 15;
	
	@Test
	public void testCreateList() {
		/* no entries*/
		FileList fileList = new FileList(listSize);
		String expectedEntries = "";
		assertEquals("0 entries - 0 documents",expectedEntries, fileList.toString());
	}
		
	@Test
	public void testAddEntries() {
		/* 7 entries and 7 documents*/
		FileList fileList = new FileList(listSize);
		String expectedEntries = "";
		expectedEntries = "doc15-doc10-doc8-doc7-doc3-doc6-doc49";
		fileList.newEntry("doc49");
		fileList.newEntry("doc6");
		fileList.newEntry("doc3");
		fileList.newEntry("doc7");
		fileList.newEntry("doc8");
		fileList.newEntry("doc10");
		fileList.newEntry("doc15");
		assertEquals("Expexted 7 documents",expectedEntries, fileList.toString());
	}
	
	@Test
	public void testRepeatedEntries() {
		FileList fileList = new FileList(listSize);
		String expectedEntries = "";
		/* 4 entries and 2 documents. 2 entries repeated*/
		expectedEntries = "doc6-doc49";
		fileList.newEntry("doc49");
		fileList.newEntry("doc6");
		fileList.newEntry("doc49");
		fileList.newEntry("doc6");
		assertEquals("Expected 2 documents",expectedEntries, fileList.toString());
	}

	@Test
	public void testFullList() {
		/* 17 entries and 16 documents. 1 entry repeated*/
		FileList fileList = new FileList(listSize);
		String expectedEntries = "";
		expectedEntries = "doc16-doc21-doc13-doc1-doc45-doc4-doc9-doc25-doc5-doc15-doc10-doc8-doc7-doc3-doc6";
		fileList.newEntry("doc49");
		fileList.newEntry("doc6");
		fileList.newEntry("doc15");
		fileList.newEntry("doc3");
		fileList.newEntry("doc7");
		fileList.newEntry("doc8");
		fileList.newEntry("doc10");
		fileList.newEntry("doc15");
		fileList.newEntry("doc5");
		fileList.newEntry("doc25");
		fileList.newEntry("doc9");
		fileList.newEntry("doc4");
		fileList.newEntry("doc45");
		fileList.newEntry("doc1");
		fileList.newEntry("doc13");
		fileList.newEntry("doc21");
		fileList.newEntry("doc16");
		assertEquals("Expected 15 documents",expectedEntries, fileList.toString());
	}
	
	@Test
	public void testDeleteEntry() {
		/* 2 entries added - 1 entry deleted */
		FileList fileList = new FileList(listSize);
		String expectedEntries = "";
		assertEquals("0 entries - 0 documents",expectedEntries, fileList.toString());
		expectedEntries = "doc49";
		fileList.newEntry("doc49");
		fileList.newEntry("doc6");
		fileList.deleteEntry("doc6");
		assertEquals("Expected 1 document",expectedEntries, fileList.toString());
	}
}
