/**
 * 
 */
package com.masai.bean;


public class Course {

	/**
	 * @param args
	 */
	private int course_Id;
	private String course_Name;
	private String course_Description;
	private int course_Fee;
	
	
	
	@Override
	public String toString() {
		return "Course [course_id=" + course_Id + ", course_name=" + course_Name + ", course_description="
				+ course_Description + ", course_fee=" + course_Fee + "]";
	}

	public Course(int course_id, String course_name, String course_description, int course_fee) {
		super();
		this.course_Id = course_id;
		this.course_Name = course_name;
		this.course_Description = course_description;
		this.course_Fee = course_fee;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the course_id
	 */
	public int getCourse_id() {
		return course_Id;
	}

	/**
	 * @param course_id the course_id to set
	 */
	public void setCourse_id(int course_id) {
		this.course_Id = course_id;
	}

	/**
	 * @return the course_name
	 */
	public String getCourse_name() {
		return course_Name;
	}

	/**
	 * @param course_name the course_name to set
	 */
	public void setCourse_name(String course_name) {
		this.course_Name = course_name;
	}

	/**
	 * @return the course_description
	 */
	public String getCourse_description() {
		return course_Description;
	}

	/**
	 * @param course_description the course_description to set
	 */
	public void setCourse_description(String course_description) {
		this.course_Description = course_description;
	}

	/**
	 * @return the course_fee
	 */
	public int getCourse_fee() {
		return course_Fee;
	}

	/**
	 * @param course_fee the course_fee to set
	 */
	public void setCourse_fee(int course_fee) {
		this.course_Fee = course_fee;
	}

	public static void main(String[] args) {
		

	}

}
