package com.czc.ETM.model;

import java.util.List;


public class User {
    private int id;
    private String name;
    private String acct;
    private String password;
    private String pic;
    private List<Share> shareList;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcct() {
		return acct;
	}
	public void setAcct(String acct) {
		this.acct = acct;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Share> getShareList() {
		return shareList;
	}
	public void setShareList(List<Share> shareList) {
		this.shareList = shareList;
	}
}