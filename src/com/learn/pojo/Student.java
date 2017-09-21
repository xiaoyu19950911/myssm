package com.learn.pojo;

public class Student {
	private int id;
	private String name;
	private String sex;
	private int age;
	private String tel;
	private String adr;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[id=" + id + ",name=" + name + ",sex=" + sex + ",age=" + age + ",tel=" + tel + ",adr=" + adr
				+ "]";
	}

}
