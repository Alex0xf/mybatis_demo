package com.javasm.student.model;

import java.util.Date;
/**
 * 
 * ClassName: StudentModel 
 * @Description: 学生实体类
 * @author Alex
 * @date 2018年7月27日
 */
public class StudentModel {

	private int id;
	private String name;
	private int age;
	private String address;
	private Date birthday;
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", birthday="
				+ birthday + "]";
	}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
