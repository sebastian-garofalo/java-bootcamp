package com.blog;

import java.util.ArrayList;

public interface IBlog {
	public abstract ArrayList<Post> getPosts(int quantityPosts);
	public abstract ArrayList<Post> getAllPosts();
	public abstract void setPost(String title, String text);
	public abstract String getName();
	public abstract void setName(String blogName);
	public abstract void deletePost(String postTitle);
	public abstract Post getPost(String postTitle);
}
