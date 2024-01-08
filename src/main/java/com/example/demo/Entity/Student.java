package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	String kodid;
	String name;
	String branch;
	public String getKodid() {
		return kodid;
	}
	public void setKodid(String kodid) {
		this.kodid = kodid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String kodid, String name, String branch) {
		super();
		this.kodid = kodid;
		this.name = name;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [kodid=" + kodid + ", name=" + name + ", branch=" + branch + "]";
	}
	

}
