/**
 * 
 */
package com.masai.dao;

import java.util.List;

import com.masai.bean.Course;
import com.masai.bean.Faculty;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.FacultyException;

/**
 
 *
 */
public interface FacultyDao {

	public String createFaculty(Faculty faculty);

	public String updateFaculty(int faculty_id, String faculty_name);

	public String deleteFaculty(int faculty_id);

	public List<Faculty> viewFaculty() throws FacultyException;

}
