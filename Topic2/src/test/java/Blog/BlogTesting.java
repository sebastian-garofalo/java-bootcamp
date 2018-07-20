package Blog;

import static org.junit.Assert.*;


import java.util.List;
import Blogcase.*;
import org.junit.Before;
import org.junit.Test;

public class BlogTesting {

	Entry e;
	Blog b;

	@Before
	public void setUpBlog() throws Exception {
		b = new Blog();
		Entry entry1 = new Entry("Avatar", "James Cameron", "Novela", "2018-05-16");
		b.newPost(entry1);
		Entry entry2 = new Entry("Avengers", "Joss Whedon", "Accion", "2018-06-28");
		b.newPost(entry2);
		Entry entry3 = new Entry("Harry Potter", "Chris Colombus", "Ciencia Ficcion", "2018-07-07");
		b.newPost(entry3);
	}

	@Test
	public void newEntryTest() {
		Entry e = new Entry("Mision imposible Repercusion", "Christopher McQuarrie", "Accion", "2018-07-26");
		b.newPost(e);
		assertTrue(b.newPost(e));
	}

	@Test
	public void deleteEntryTest() {
		Entry e = new Entry("delete entry test", "tester", "this is a test", "2018-06-28");
		b.deletePost(e.getEntryId());
		assertTrue(b.deletePost(e.getEntryId()));

	}

	@Test
	public void RecentEntriesAre10Test() {
		List<Entry> recentList;

		recentList = b.recentEntries();

		assertEquals(10, recentList.size());
	}

}
