package com.masai.bean;

import java.util.Date;

public class Course_Plan {
	
	private String plan_id ;
	private String batch_id ;
	private Date day ;
	private String topic ;
	private boolean status ;
	/**
	 * @return the plan_id
	 */
	public String getPlan_id() {
		return plan_id;
	}
	/**
	 * @param plan_id the plan_id to set
	 */
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	/**
	 * @return the batch_id
	 */
	public String getBatch_id() {
		return batch_id;
	}
	/**
	 * @param batch_id the batch_id to set
	 */
	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}
	/**
	 * @return the day
	 */
	public Date getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(Date day) {
		this.day = day;
	}
	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Course_Plan(String plan_id, String batch_id, Date day, String topic, boolean status) {
		super();
		this.plan_id = plan_id;
		this.batch_id = batch_id;
		this.day = day;
		this.topic = topic;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Course_Plan [plan_id=" + plan_id + ", batch_id=" + batch_id + ", day=" + day + ", topic=" + topic
				+ ", status=" + status + "]";
	}
	
	
	
	
	

}


