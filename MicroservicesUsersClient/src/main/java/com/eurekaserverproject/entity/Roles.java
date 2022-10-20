package com.eurekaserverproject.entity;

import javax.persistence.Entity;

@Entity
public class Roles {
	
	private int roleId;
	private String roleName;

	public Roles() {

	}

	public Roles(int roleId, String roleName) {

		this.roleId = roleId;
		this.roleName = roleName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
