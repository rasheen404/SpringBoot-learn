package com.example2.SpringBoot.Entities;

public class Student {

	String kodid;
	String st_name;
	int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String kodid, String st_name, int age) {
		super();
		this.kodid = kodid;
		this.st_name = st_name;
		this.age = age;
	}

	public String getKodid() {
		return kodid;
	}

	public void setKodid(String kodid) {
		this.kodid = kodid;
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [kodid=" + kodid + ", st_name=" + st_name + ", age=" + age + "]";
	}

}
