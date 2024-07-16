package com.association.onetomany;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//@Entity
public class Course {

	@Id
	@Column(name = "course_id")
	private String cId;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "duration")
	private String duration;
	
	private Instructor instructor;

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", courseName=" + courseName + ", duration=" + duration + ", instructor="
				+ instructor + "]";
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Course() {
		super();
	}

	public Course(String cId, String courseName, String duration, Instructor instructor) {
		super();
		this.cId = cId;
		this.courseName = courseName;
		this.duration = duration;
		this.instructor = instructor;
	}
	
	

}
