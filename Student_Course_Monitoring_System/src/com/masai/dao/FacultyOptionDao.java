package com.masai.dao;

import java.sql.Date;
import java.util.List;

import com.masai.bean.Course_Plan;
import com.masai.bean.Faculty;
import com.masai.exceptions.Course_PlanException;
import com.masai.exceptions.FacultyException;

public interface FacultyOptionDao {

	public Faculty loginFaculty(String username, String password) throws FacultyException;

	public List<Course_Plan> viewCoursePlan(int faculty_id) throws Course_PlanException;

	public String update_daywise_schedule(String plan_id, String batch_id, int faculty_id, Date day, String topic,
			boolean status) throws Course_PlanException;

	public String changePassword(int faculty_id, String faculty_password) throws FacultyException;
}
