package com.jarvis.lw.core.domain;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements Serializable {
	public User(Long id, String name, Character gender, Integer age, String cell, String address, Date birthday,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.cell = cell;
		this.address = address;
		this.birthday = birthday;
		this.description = description;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 9109628794860125672L;



	public User() {
		super();
	}

	private Long id;
	private String name;
	private Character gender;
	private Integer age;
	private String cell;
	private String address;
	private Date birthday;
	private String description;


	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

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

	public Date getBirthday() {
		return (Date) birthday.clone();
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setBirthday(String birthday) {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
		try {
			this.birthday = myFormat.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cell=" + cell + ", address=" + address + ", birthday="
				+ birthday + ", description=" + description + "]";
	}
}
