/**
 * 
 */
package com.masai.dao;

import java.util.List;

import com.masai.bean.Course;
import com.masai.exceptions.CourseException;

/**
 *
 *
 */
public interface CourseDao {

	public String createCourse(Course course);
	
	public String deleteCourse(int course_id);
	
	public List<Course> viewCourse() throws CourseException;
	
}
