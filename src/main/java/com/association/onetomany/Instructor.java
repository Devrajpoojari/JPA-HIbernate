package com.association.onetomany;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

//@Entity
public class Instructor {

	@Id
	@Column(name = "instructor_id")
	private String iID;

	@Column(name = "instructor_name")
	private String iName;

	@Column(name = "phone_number")
	private Long pNumber;


	private List<Course> courses;

	public String getiID() {
		return iID;
	}

	public void setiID(String iID) {
		this.iID = iID;
	}

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public Long getpNumber() {
		return pNumber;
	}

	public void setpNumber(Long pNumber) {
		this.pNumber = pNumber;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

//	@Override
//	public String toString() {
//		return "Instructor [iID=" + iID + ", iName=" + iName + ", pNumber=" + pNumber + ", courses=" + courses + "]";
//	}

	public Instructor(String iID, String iName, Long pNumber, List<Course> courses) {
		this.iID = iID;
		this.iName = iName;
		this.pNumber = pNumber;
		this.courses = courses;
	}

	public Instructor() {
		super();
	}

}
