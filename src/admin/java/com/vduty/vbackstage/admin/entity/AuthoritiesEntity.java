package com.vduty.vbackstage.admin.entity;

import java.io.Serializable;

import VdutySecurity.VsAuthorities;

/**
 * 权限
 * @author lye
 *
 */
public class AuthoritiesEntity extends VsAuthorities implements Serializable {

	
	public AuthoritiesEntity(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	String path;
	String name;
	int id;
	String description;
	
	
	
	

}
