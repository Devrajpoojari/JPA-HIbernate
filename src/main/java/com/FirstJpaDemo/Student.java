package com.FirstJpaDemo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
//@NamedQuery(name="MyQuery",query="select s from Student s where s.sname='Nia' ")
public class Student {
	
	@Id
	@GeneratedValue
	private int sid;
	private String sname;
	private String tech;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", tech=" + tech + ", laptop=" + laptop + "]";
	}
	
}
