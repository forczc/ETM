package com.czc.ETM.model;

import java.util.List;

public class ShareSection {
	private int id;
	private String name;
	private List<Share> shareList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Share> getShareList() {
		return shareList;
	}
	public void setShareList(List<Share> shareList) {
		this.shareList = shareList;
	}
}
