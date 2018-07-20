package Blogcase;

import java.util.LinkedList;
import java.util.List;

import Blogcase.Entry;

public class Blog {

	private Entry entry;

	private List<Entry> entryList;

	public void newList() {
		entryList = new LinkedList<Entry>();
	}

	public boolean newPost(Entry entry) {

		entryList.add(entry);
		return true;
	}

	public boolean deletePost(int id) { // we are suposing that the entry id is
										// the same than the position it is
										// submited in the list. Also we always
										// know the id of the post to be
										// deleted.

		entryList.remove(id);
		return true;
	}

	public List<Entry> recentEntries() {
		List<Entry> recentList;
		recentList = new LinkedList<Entry>();
		for (int i = 0; i < 10; i++) {
			entry = entryList.get(entryList.size() - i);
			recentList.add(entry);
			entry.getEntryId();
			System.out.print("Author: " + entry.getDirector() + "\nTitle: " + entry.getTitle() + "\n\n" + entry.getGenero()
					+ "\nRelease Date: " + entry.getDate().toString() + "\n");
			if (entryList.size() - i < 0) {
				break;
			}
		}
		return recentList;
	}
}
