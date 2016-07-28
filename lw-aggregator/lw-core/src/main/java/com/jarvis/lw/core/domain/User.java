package com.jarvis.lw.core.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private Long id;
	private String name;
	private String cell;
	private String address;
	private Long birthday;
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getBirthday() {
		return birthday;
	}

	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = Long.valueOf(birthday.getTime());
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cell=" + cell + ", address=" + address + ", birthday="
				+ birthday + ", description=" + description + "]";
	}

}
