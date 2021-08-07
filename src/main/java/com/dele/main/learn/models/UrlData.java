package com.dele.main.learn.models;

public class UrlData {
	
	private String url;
	
	public UrlData(String url) {
		super();
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return url;
//		return "UrlData [url=" + url + "]";
	}
	
}
