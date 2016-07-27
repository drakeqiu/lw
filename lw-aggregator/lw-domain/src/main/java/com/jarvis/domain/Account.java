package com.jarvis.domain;

import java.io.Serializable;

public class Account implements Serializable {
	private Long id;
	private String username;
	private String password;
	private Boolean isActived;
	private Long modifiedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsActived() {
		return isActived;
	}

	public void setIsActived(Boolean isActived) {
		this.isActived = isActived;
	}

	public Long getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Long modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
