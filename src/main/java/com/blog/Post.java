package com.blog;

import java.util.Date;

public class Post {
	
	private String title;
	private String info;
	private Date date;
	
	public Post(String title, String text) {
		this.title = title;
		info = text;
		date = new Date();
	}
	public String getTitle() {
		return title;
	}
	public String getInfo() {
		return info;
	}
	public Date getDate() {
		return date;
	}
}
