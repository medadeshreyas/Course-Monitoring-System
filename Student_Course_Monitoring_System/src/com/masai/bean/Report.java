package com.masai.bean;

import java.sql.Date;

public class Report {

	private String plan_id;
	private String batch_id;
	private int faculty_id;
	private Date day;
	private boolean status;

	public Report(String plan_id, String batch_id, int faculty_id, Date day, boolean status) {
		super();
		this.plan_id = plan_id;
		this.batch_id = batch_id;
		this.faculty_id = faculty_id;
		this.day = day;
		this.status = status;
	}

	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}

	public String getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}

	public int getFaculty_id() {
		return faculty_id;
	}

	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Report [plan_id=" + plan_id + ", batch_id=" + batch_id + ", faculty_id=" + faculty_id + ", day=" + day
				+ ", status=" + status + "]";
	}
	
	

}
