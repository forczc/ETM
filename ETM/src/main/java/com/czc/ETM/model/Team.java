package com.czc.ETM.model;

import java.util.List;

public class Team {
	private int id;
	private String name;
	private List<TaskGroup> taskGroupList;
	
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
	public List<TaskGroup> getTaskGroupList() {
		return taskGroupList;
	}
	public void setTaskGroupList(List<TaskGroup> taskGroupList) {
		this.taskGroupList = taskGroupList;
	}
}
