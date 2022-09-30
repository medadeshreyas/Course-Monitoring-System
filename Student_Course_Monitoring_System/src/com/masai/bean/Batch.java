/**
 * 
 */
package com.masai.bean;

import java.sql.Date;

/**
 * 
 *
 */
public class Batch {

	/**
	 * 
	 */

	

		private String batch_Id;
		private int course_Id;
		private int faculty_Id;
		private int no_of_Students;
		private Date batch_Start_Date;
		private String duration;
		
		
		

		public Batch(String batch_Id, int course_Id, int faculty_Id, int no_of_Students, Date batch_Start_Date,
				String duration) {
			super();
			this.batch_Id = batch_Id;
			this.course_Id = course_Id;
			this.faculty_Id = faculty_Id;
			this.no_of_Students = no_of_Students;
			this.batch_Start_Date = batch_Start_Date;
			this.duration = duration;
		}



		@Override
		public String toString() {
			return "Batch [batch_Id=" + batch_Id + ", course_Id=" + course_Id + ", faculty_Id=" + faculty_Id
					+ ", no_of_Students=" + no_of_Students + ", batch_Start_Date=" + batch_Start_Date + ", duration="
					+ duration + "]";
		}



		/**
	 * @return the batch_Id
	 */
	public String getBatch_Id() {
		return batch_Id;
	}



	/**
	 * @param batch_Id the batch_Id to set
	 */
	public void setBatch_Id(String batch_Id) {
		this.batch_Id = batch_Id;
	}



	/**
	 * @return the course_Id
	 */
	public int getCourse_Id() {
		return course_Id;
	}



	/**
	 * @param course_Id the course_Id to set
	 */
	public void setCourse_Id(int course_Id) {
		this.course_Id = course_Id;
	}



	/**
	 * @return the faculty_Id
	 */
	public int getFaculty_Id() {
		return faculty_Id;
	}



	/**
	 * @param faculty_Id the faculty_Id to set
	 */
	public void setFaculty_Id(int faculty_Id) {
		this.faculty_Id = faculty_Id;
	}



	/**
	 * @return the no_of_Students
	 */
	public int getNo_of_Students() {
		return no_of_Students;
	}



	/**
	 * @param no_of_Students the no_of_Students to set
	 */
	public void setNo_of_Students(int no_of_Students) {
		this.no_of_Students = no_of_Students;
	}



	/**
	 * @return the batch_Start_Date
	 */
	public Date getBatch_Start_Date() {
		return batch_Start_Date;
	}



	/**
	 * @param batch_Start_Date the batch_Start_Date to set
	 */
	public void setBatch_Start_Date(Date batch_Start_Date) {
		this.batch_Start_Date = batch_Start_Date;
	}



	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}



	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
