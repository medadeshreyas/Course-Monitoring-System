package com.masai.dao;

import java.util.List;


import com.masai.bean.Course_Plan;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.Course_PlanException;

public interface Course_Plan_Dao {
	
	
public String createCoursePlan(Course_Plan course_plan);
	
	public String deleteCoursePlan(String Planid,String Batch_id);
	
	public List<Course_Plan> viewCoursePlan() throws Course_PlanException;
	
	
	
	
}
