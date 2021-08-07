package com.dele.main.learn.navigation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigate", eager = true)
@RequestScoped
public class NavigationController implements Serializable {
	
	private static final long serialVersionUID = -7972492458012429476L;
	
	@ManagedProperty(value = "#{param.pageId}")
	private String pageId;
	
	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String moveNextPage() {
		return "page2";
	}
	
	public String moveToNavigatePage() {
		return "navigator";
	}
	
	public String viewPage() {
		if(pageId == null || pageId == "") return "index";
		return pageId;
	}
	
}
