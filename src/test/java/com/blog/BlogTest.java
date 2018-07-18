package com.blog;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import org.junit.Test;

public class BlogTest {
	
	private static String NAMEP = "Post";
	private static String NAMEB = "Blog";
	
	@Test
	public void getPostMock() {
		Post post = null; 
		IBlog blogMock = mock(IBlog.class);
		when(blogMock.getPost(NAMEP)).thenReturn(post);
		assertEquals(blogMock.getPost(NAMEP), post);
	}
	@Test
	public void emptyBlogMock() {
		ArrayList<Post> posts = new ArrayList();
		IBlog blogMock = mock(IBlog.class);
		when(blogMock.getAllPosts()).thenReturn(posts);
		assertTrue(blogMock.getAllPosts().isEmpty());
	}
	@Test
	public void getNameBlogUsingMock() {
		IBlog blogMock = mock(IBlog.class);
		when(blogMock.getName()).thenReturn(NAMEB);
		assertEquals(blogMock.getName(), NAMEB);
	}
	@Test
	public void getNameBlogUsingStub() {
		IBlog blogMockD,blogMock = mock(IBlog.class);
		stub(blogMock.getName()).toReturn(NAMEB);
		assertEquals(blogMock.getName(), NAMEB);
	}
	@Test
	public void getNameFakeBlogTest() {
		FakeBlog fakeBlog = new FakeBlog();
		fakeBlog.setName(NAMEB);
		assertEquals(fakeBlog.getName(), NAMEB);
	}
	@Test
	public void addPostToFakeBlogTest() {
		FakeBlog fakeBlog = new FakeBlog();
		fakeBlog.setPost(NAMEP, "...");
		assertFalse(fakeBlog.getAllPosts().isEmpty());
	}
	@Test
	public void getPostsToFakeBlogTest() {
		FakeBlog fakeBlog = new FakeBlog();
		fakeBlog.setPost(NAMEP, "...");
		assertFalse(fakeBlog.getAllPosts().isEmpty());
	}
}