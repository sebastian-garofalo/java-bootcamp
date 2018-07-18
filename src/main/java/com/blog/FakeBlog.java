package com.blog;

import java.util.ArrayList;

public class FakeBlog implements IBlog{
	
	private String name;
	private ArrayList<Post> posts;
	
	public FakeBlog() {
		posts = new ArrayList();
	}
	public ArrayList<Post> getPosts(int quantityPosts) {
		return this.getAllPosts();
	}
	public ArrayList<Post> getAllPosts() {
		return new ArrayList(posts);
	}
	public void setPost(String title, String text) {
		Post postAux = new Post(title, text);
		posts.add(postAux);
	}
	public String getName() {
		return name;
	}
	public void setName(String blogName) {
		name = blogName;
	}
	public void deletePost(String postTitle) {
		if(!posts.isEmpty()) {
			posts.remove(0);
		}
	}
	public Post getPost(String postTitle) {
		return new Post(postTitle, "fake post"); 
	}
}
