package com.jarvis.lw.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
	private Long id;
	private String username;
	private String password;
	private Boolean isActivated;
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

	public Boolean getIsActivated() {
		return isActivated;
	}

	public void setIsActivated(Boolean isActivated) {
		this.isActivated = isActivated;
	}

	public Long getModifyDate() {
		return modifiedDate;
	}

	public void setModifyDate(Long modifyDate) {
		this.modifiedDate = modifyDate;
	}
	
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = Long.valueOf(modifiedDate.getTime());
	}

}
