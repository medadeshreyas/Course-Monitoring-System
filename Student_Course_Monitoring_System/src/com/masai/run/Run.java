/**
 * 
 */
package com.masai.run;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Course;
import com.masai.bean.Faculty;
import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.dao.FacultyDao;
import com.masai.dao.FacultyDaoImpl;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.FacultyException;

/**
 * 
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CourseDao course_dao = new CourseDaoImpl();

		FacultyDao faculty_dao = new FacultyDaoImpl();

		Boolean admin = true;

		Scanner scanner = new Scanner(System.in);

		Boolean run = true;

		while (run) {

			System.out.println("Welcome to Course Monitoring System ");

			System.out.println("");

			System.out.println("Please Enter Your Choice");

			System.out.println("");

			System.out.println("1. Admin Login");
			System.out.println("2. Faculty Login");
			System.out.println("3. Exit");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:

				System.out.println("");

				System.out.println("Admin Login");

				System.out.println("");

				scanner.nextLine();

				System.out.println("Enter Your Username");
				String admin_username = scanner.nextLine();

				System.out.println("Enter Your Password");
				String admin_password = scanner.nextLine();

				Boolean admin_run = true;

				while (admin_run) {

					System.out.println("");

					System.out.println("Welcome to Admin Dashboard");

					System.out.println("");

					System.out.println("Please Enter Your Choice");

					System.out.println("");

					System.out.println("1. Course");
					System.out.println("2. Batch");
					System.out.println("3. Faculty");
					System.out.println("4. Course Plan");
					System.out.println("5. View All Course Plans");
					System.out.println("6. Generate Report");
					System.out.println("7. Exit Admin Dashboard");
					System.out.println("8. Exit Application");

					int admin_choice = scanner.nextInt();

					switch (admin_choice) {

					case 1:

						Boolean course_run = true;

						while (course_run) {

							System.out.println("");

							System.out.println("Welcome to Course Dashboard");

							System.out.println("");

							System.out.println("Please Enter Your Choice");

							System.out.println("");

							System.out.println("1. Create Course");
							System.out.println("2. Update Course");
							System.out.println("3. Delete Course");
							System.out.println("4. View All Courses");
							System.out.println("5. Exit Course Dashboard");
							System.out.println("6. Exit Admin Dashboard");
							System.out.println("7. Exit Application");

							int course_choice = scanner.nextInt();

							switch (course_choice) {

							case 1:

								System.out.println("");

								System.out.println("Please Enter Course Details");

								System.out.println("");

								scanner.nextLine();

								System.out.println("Please Enter Course_Name :");
								String course_name = scanner.nextLine();

								System.out.println("Please Enter Course_Fee :");
								int course_fee = scanner.nextInt();

								scanner.nextLine();

								System.out.println("Please Enter Course_Description :");
								String course_desc = scanner.nextLine();

								Course course = new Course();

								course.setCourse_name(course_name);
								course.setCourse_fee(course_fee);
								course.setCourse_description(course_desc);

								String result_1 = course_dao.createCourse(course);

								System.out.println("");

								System.out.println(result_1);

								break;
							case 2: // Check with Shreyas
								System.out.println("");

								System.out.println("Please Enter Course_Id :");

								System.out.println("");
								break;
							case 3:
								System.out.println("");

								System.out.println("Please Enter Course_Id to Delete :");
								int course_id = scanner.nextInt();

								String result_3 = course_dao.deleteCourse(course_id);

								System.out.println(result_3);

								break;
							case 4:
								System.out.println("");

								try {
									List<Course> list_of_courses = course_dao.viewCourse();

									list_of_courses.forEach(c -> {
										System.out.println("");

										System.out.println("Course Id : " + c.getCourse_id());
										System.out.println("Course Name : " + c.getCourse_name());
										System.out.println("Course Fee : " + c.getCourse_fee());
										System.out.println("Course Description : " + c.getCourse_description());

										System.out.println("");
										System.out.println("---------------------------------------------------------");

									});

								} catch (CourseException e) {

									System.out.println(e.getMessage());
								}

								break;
							case 5:
								course_run = false;
								break;
							case 6:
								course_run = false;
								admin_run = false;
								break;
							case 7:
								System.out.println("Thank You For Using The Appilcation ! ");
								course_run = false;
								admin_run = false;
								run = false;
								break;
							default:
								System.out.println("Please Enter A Valid Choice !");
								break;
							}

						}
						break;
					case 2:
						Boolean batch_run = true;

						while (batch_run) {

							System.out.println("");

							System.out.println("Welcome to Batch Dashboard");

							System.out.println("");

							System.out.println("Please Enter Your Choice");

							System.out.println("");

							System.out.println("1. Create Batch");
							System.out.println("2. Update Batch");
							System.out.println("3. Delete Batch");
							System.out.println("4. View Batch");
							System.out.println("5. Exit Batch Dashboard");
							System.out.println("6. Exit Admin Dashboard");
							System.out.println("7. Exit Application");

							int batch_choice = scanner.nextInt();

							switch (batch_choice) {

							case 1:

								System.out.println("");

								System.out.println("Please Enter Batch Details :");

								System.out.println("");

								System.out.println("Please Enter Batch_Id :");
								System.out.println("Please Enter Course_Id :");
								System.out.println("Please Enter Faculty_Id :");
								System.out.println("Please Enter No_of_Students :");
								System.out.println("Please Enter Start_Date :");
								System.out.println("Please Enter Duration :");

								break;
							case 2:
								System.out.println("");// Discuss with Shreyas;

								System.out.println("Please Enter Batch_Id :");

								System.out.println("");
								break;
							case 3:
								System.out.println("");

								System.out.println("Please Enter Batch_Id to Delete :");

								System.out.println("");
								break;
							case 4:
								System.out.println("");

								System.out.println("Please Enter Batch_Id :");

								System.out.println("");
								break;
							case 5:
								batch_run = false;
								break;
							case 6:
								batch_run = false;
								admin_run = false;
								break;
							case 7:
								System.out.println("Thank You For Using The Application ! ");
								batch_run = false;
								admin_run = false;
								run = false;
								break;
							default:
								System.out.println("Please Enter A Valid Choice !");
								break;
							}

						}
						break;
					case 3:
						Boolean faculty_run = true;

						while (faculty_run) {

							System.out.println("");

							System.out.println("Welcome to Faculty Dashboard");

							System.out.println("");

							System.out.println("Please Enter Your Choice");

							System.out.println("");

							System.out.println("1. Create Faculty");
							System.out.println("2. Update Faculty");
							System.out.println("3. Delete Faculty");
							System.out.println("4. View Faculty");
							System.out.println("5. Exit Faculty Dashboard");
							System.out.println("6. Exit Admin Dashboard");
							System.out.println("7. Exit Application");

							int faculty_choice = scanner.nextInt();

							switch (faculty_choice) {

							case 1:

								System.out.println("");

								System.out.println("Please Enter Faculty Details :");

								System.out.println("");

								scanner.nextLine();
								
								System.out.println("Please Enter Faculty_Name :");
								String faculty_Name = scanner.nextLine();
								

								System.out.println("Please Enter Faculty_Address :");
								String faculty_Address = scanner.nextLine();

								System.out.println("Please Enter Faculty_Mobile  :");
								String faculty_Mobile = scanner.nextLine();

								System.out.println("Please Enter Faculty_Email :");
								String faculty_Email = scanner.nextLine();

								System.out.println("Please Enter Faculty_Username :");
								String faculty_User = scanner.nextLine();

								System.out.println("Please Enter Faculty_Password :");
								String faculty_Password = scanner.nextLine();

								Faculty faculty = new Faculty();

								faculty.setFaculty_Name(faculty_Name);
								faculty.setFaculty_Address(faculty_Address);
								faculty.setFaculty_Mobile(faculty_Mobile);
								faculty.setFaculty_Email(faculty_Email);
								faculty.setFaculty_User(faculty_User);
								faculty.setFaculty_Password(faculty_Password);

								String result_1 = faculty_dao.createFaculty(faculty);

								System.out.println("");

								System.out.println(result_1);

								break;
							case 2:
								System.out.println("");// Discuss with Shreyas;

								System.out.println("Please Enter Faculty_Id :");

								System.out.println("");

								break;
							case 3:
								System.out.println("");

								System.out.println("Please Enter Faculty_Id to Delete :");

								int faculty_id = scanner.nextInt();

								String result_3 = faculty_dao.deleteFaculty(faculty_id);

								System.out.println(result_3);

								break;
							case 4:
								System.out.println("");

								try {
									List<Faculty> list_of_faculty = faculty_dao.viewFaculty();

									list_of_faculty.forEach(f -> {
										
										System.out.println("");

										System.out.println("Faculty Id : " + f.getFaculty_Id());
										System.out.println("Faculty Name : " + f.getFaculty_Name());
										System.out.println("Faculty Mobile : " + f.getFaculty_Mobile());
										System.out.println("Faculty Address : " + f.getFaculty_Address());
										System.out.println("Faculty Email : " + f.getFaculty_Email());
										System.out.println("Faculty User : " + f.getFaculty_User());
										System.out.println("Faculty Password : " + f.getFaculty_Password());

										System.out.println("");
										System.out.println("---------------------------------------------------------");

									});

								} catch (FacultyException e) {

									System.out.println(e.getMessage());
								}

								break;

							case 5:
								faculty_run = false;
								break;
							case 6:
								faculty_run = false;
								admin_run = false;
								break;
							case 7:
								System.out.println("Thank You For Using The Application ! ");
								faculty_run = false;
								admin_run = false;
								run = false;
								break;
							default:
								System.out.println("Please Enter A Valid Choice !");
								break;
							}

						}
						break;
					case 4:
						Boolean course_plan_run = true;

						while (course_plan_run) {

							System.out.println("");

							System.out.println("Welcome to Course Plan Dashboard");

							System.out.println("");

							System.out.println("Please Enter Your Choice");

							System.out.println("");

							System.out.println("1. Create  Course_Plan ");
							System.out.println("2. Update Course_Plan");
							System.out.println("3. Delete Course_Plan");
							System.out.println("4. View Course_Plans");
							System.out.println("5. Exit Course_Plan Dashboard");
							System.out.println("6. Exit Admin Dashboard");
							System.out.println("7. Exit Application");

							int course_plan_choice = scanner.nextInt();

							switch (course_plan_choice) {

							case 1:

								System.out.println("");

								System.out.println("Please Enter Faculty Details :");

								System.out.println("");

								System.out.println("Please Enter Course_Plan_Id :");
								System.out.println("Please Enter Batch_Id :");
								System.out.println("Please Enter Day :");
								System.out.println("Please Enter Topic of the Day:");
								System.out.println("Please Enter Status of the Topic:");

								break;
							case 2:
								System.out.println("");// Discuss with Shreyas;

								System.out.println("Please Enter Course_Plan_Id :");

								System.out.println("");
								break;
							case 3:
								System.out.println("");

								System.out.println("Please Enter Course_Plan_Id to Delete :");

								System.out.println("");
								break;
							case 4:
								System.out.println("");

								System.out.println("Please Enter Course_Plan_Id :");

								System.out.println("");
								break;
							case 5:
								course_plan_run = false;
								break;
							case 6:
								course_plan_run = false;
								admin_run = false;
								break;
							case 7:
								System.out.println("Thank You For Using The Application ! ");
								course_plan_run = false;
								admin_run = false;
								run = false;
								break;
							default:
								System.out.println("Please Enter A Valid Choice !");
								break;
							}

						}
						break;
					case 5:
						System.out.println("Viewing all Course Plans   :");
						break;
					case 6:
						System.out.println("Genrating Reports for all Course :");
						break;
					case 7:
						admin_run = false;
						break;
					case 8:
						System.out.println("Thank You For Using The Application ! ");
						admin_run = false;
						run = false;
						break;
					default:
						System.out.println("Please Enter A Valid Choice !");
						break;

					}

				}

				break;

			case 2:

				System.out.println("");

				System.out.println("Faculty Login");

				System.out.println("");

				scanner.nextLine();

				System.out.println("Enter Your Username");
				String faculty_username = scanner.nextLine();

				System.out.println("Enter Your Password");
				String faculty_password = scanner.nextLine();

				Boolean faculty_run = true;

				while (faculty_run) {

					System.out.println("");

					System.out.println("Welcome to Faculty Dashboard");

					System.out.println("");

					System.out.println("Please Enter Your Choice");

					System.out.println("");

					System.out.println("1. View Course Plans");
					System.out.println("2. Add Day Wise Topics");
					System.out.println("3. Update Password");
					System.out.println("4. Exit Faculty Dashboard");
					System.out.println("5. Exit Application");

					int faculty_choice = scanner.nextInt();

					switch (faculty_choice) {

					case 1:
						System.out.println("");

						System.out.println("Viewing all Course Plans Assigned To The Faculty  :");

						System.out.println("");
						break;
					case 2:

						System.out.println("");

						System.out.println("Adding Day Wise Plans :");

						System.out.println("");

						break;
					case 3:

						System.out.println("");

						System.out.println("Updating Password  :");

						System.out.println("");

						break;
					case 4:
						faculty_run = false;
						break;
					case 5:
						System.out.println("Thank You For Using The Application ! ");
						faculty_run = false;
						run = false;
						break;
					default:
						System.out.println("Please Enter A Valid Choice !");

					}

				}
				break;

			case 3:
				System.out.println("Thank You For Using The Application ! ");
				run = false;
				break;

			default:
				System.out.println("Please Enter A Valid Choice !");

			}

		}

	}

}
