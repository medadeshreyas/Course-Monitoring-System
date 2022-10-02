/**
 * 
 */
package com.masai.run;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.masai.bean.Batch;
import com.masai.bean.Course;
import com.masai.bean.Course_Plan;
import com.masai.bean.Faculty;
import com.masai.bean.Report;
import com.masai.dao.BatchDao;
import com.masai.dao.BatchDaoImpl;
import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.dao.Course_PlanImpl;
import com.masai.dao.Course_Plan_Dao;
import com.masai.dao.FacultyDao;
import com.masai.dao.FacultyDaoImpl;
import com.masai.dao.FacultyOptionDao;
import com.masai.dao.Faculty_Option_dao_Impl;
import com.masai.exceptions.BatchException;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.Course_PlanException;
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
		BatchDao batch_dao = new BatchDaoImpl();
		FacultyDao faculty_dao = new FacultyDaoImpl();
		FacultyOptionDao faculty_option_dao_impl = new Faculty_Option_dao_Impl();
		Course_Plan_Dao course_plan_dao = new Course_PlanImpl();
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
				String main_username = "Shreyas Medade";
				String main_password = "Shreyas@2003";
				if (admin_username.equals(main_username) && admin_password.equals(main_password)) {

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
									scanner.nextLine();
									System.out.println("Please Enter Course_Id :");
									int course_id = scanner.nextInt();
									scanner.nextLine();
									System.out.println("Please Enter Fees To Update :");
									int fees = scanner.nextInt();
									String result_2 = course_dao.updateCourse(course_id, fees);
									System.out.println(result_2);
									System.out.println("");
									break;
								case 3:
									System.out.println("");

									System.out.println("Please Enter Course_Id to Delete :");
									int course_id3 = scanner.nextInt();

									String result_3 = course_dao.deleteCourse(course_id3);

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
											System.out.println(
													"---------------------------------------------------------");

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
									scanner.nextLine();

									System.out.println("Please Enter Batch_Id :");
									String batch_id1 = scanner.nextLine();

									System.out.println("Please Enter Course_Id :");
									int course_id1 = scanner.nextInt();
									scanner.nextLine();

									System.out.println("Please Enter Faculty_Id :");
									int faculty_id1 = scanner.nextInt();
									scanner.nextLine();

									System.out.println("Please Enter No_of_Students :");
									int no_of_students1 = scanner.nextInt();
									scanner.nextLine();

									System.out.println("Please Enter Batch_Start_Date in YYYY-MM-DD:");
									String date1 = scanner.nextLine();
									Date batch_Start_Date = Date.valueOf(date1);

									System.out.println("Please Enter Duration :");
									String duration1 = scanner.nextLine();

									Batch batch_1 = new Batch(batch_id1, course_id1, faculty_id1, no_of_students1,
											batch_Start_Date, duration1);

									String result_1 = batch_dao.createBatch(batch_1);
									System.out.println(result_1);

									break;
								case 2:
									System.out.println("");// Discuss with Shreyas;

									scanner.nextLine();
									System.out.println("Please Enter Batch_Id :");
									String batch_id2 = scanner.nextLine();

									System.out.println("Plese Enter the No. Of Students You Want To Update ");
									int no_of_students2 = scanner.nextInt();

									String result_2 = batch_dao.updateBatch(batch_id2, no_of_students2);
									System.out.println(result_2);
									System.out.println("");
									break;
								case 3:
									System.out.println("");
									scanner.nextLine();
									System.out.println("Please Enter Batch_Id to Delete :");
									String batch_id3 = scanner.nextLine();

									String result_3 = batch_dao.deleteBatch(batch_id3);
									System.out.println(result_3);

									System.out.println("");
									break;
								case 4:
									System.out.println("");

									try {
										List<Batch> list_of_batch = batch_dao.viewBatch();
										list_of_batch.forEach(i -> {
											System.out.println(i);
										});
									} catch (BatchException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
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
									scanner.nextLine();

									System.out.println("Please Enter Faculty_Id :");
									int faculty_id2 = scanner.nextInt();
									scanner.nextLine();
									System.out.println("Pleae Enter New Faculty Name");
									String faculty_name = scanner.nextLine();
									String result_2 = faculty_dao.updateFaculty(faculty_id2, faculty_name);
									System.out.println(result_2);
									System.out.println("");

									break;
								case 3:
									System.out.println("");

									System.out.println("Please Enter Faculty_Id to Delete :");

									int faculty_id_3 = scanner.nextInt();

									String result_3 = faculty_dao.deleteFaculty(faculty_id_3);

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
											System.out.println(
													"---------------------------------------------------------");

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

									System.out.println("");
									scanner.nextLine();

									System.out.println("Please Enter Course_Plan_Id :");
									String course_plan_id1 = scanner.nextLine();

									System.out.println("Please Enter Batch_Id :");
									String batch_id1 = scanner.nextLine();

									Course_Plan course_plan = new Course_Plan();

									course_plan.setPlan_id(course_plan_id1);
									course_plan.setBatch_id(batch_id1);

									String result_1 = course_plan_dao.createCoursePlan(course_plan);
									System.out.println(result_1);
									break;
								case 2:
									System.out.println("");// Discuss with Shreyas;
									scanner.nextLine();

									System.out.println("Please Enter Course_Plan_ID :");
									String course_plan_id = scanner.nextLine();

									System.out.println("Please Enter New Batch_id to replace the Old Batch_id ");

									String batch_id = scanner.nextLine();

									String result_2 = course_plan_dao.updateCoursePlan(course_plan_id, batch_id);
									System.out.println(result_2);
									System.out.println("");
									break;
								case 3:
									System.out.println("");
									scanner.nextLine();

									System.out.println("Please Enter Course_Plan_Id to Delete :");
									String plan_id3 = scanner.nextLine();

									System.out.println("Please Enter Batch_ID for the respective Plan_ID " + plan_id3);
									String batch_id3 = scanner.nextLine();

									String result_3 = course_plan_dao.deleteCoursePlan(plan_id3, batch_id3);
									System.out.println(result_3);

									System.out.println("");
									break;
								case 4:
									System.out.println("");

									try {
										List<Course_Plan> course_plan4 = course_plan_dao.viewCoursePlan();
										course_plan4.forEach(f -> {
//										System.out.println(f.getBatch_id());
//										System.out.println(f.getFaculty_id());
//										System.out.println(f.getPlan_id());
//										System.out.println(f.getTopic());
											System.out.println(f);
//										boolean status_4 = f.isStatus();
//										if (status_4 = true) {
//											System.out.println("Status-Completed");
//
//										} else {
//											System.out.println("Status-Pending");
//
//										}
										});

									} catch (Course_PlanException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

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
							try {
								List<Course_Plan> list_of_CoursePlan = course_plan_dao.viewDayWiseUpdate();
								list_of_CoursePlan.forEach(i -> {
									System.out.println(i);
								});
//							System.out.println(list_of_CoursePlan);
							} catch (Course_PlanException e) {
								System.out.println(e.getMessage());
							}

							break;
						case 6:
							System.out.println("Genrating Reports for all Course :");

							try {
								List<Report> generateReport = course_plan_dao.generateReport();
								generateReport.forEach(i -> {
									System.out.println(i);
								});
							} catch (Course_PlanException e) {
								System.out.println(e.getMessage());
							}
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
				} else {
					System.out.println("INCORRECT ADMIN PASSWORD");
					break;
				}
			case 2:

				System.out.println("");

				System.out.println("Faculty Login");

				System.out.println("");

				scanner.nextLine();

				System.out.println("Enter Your Username");
				String faculty_username = scanner.nextLine();

				System.out.println("Enter Your Password");
				String faculty_password = scanner.nextLine();

				try {
					Faculty faculty = faculty_option_dao_impl.loginFaculty(faculty_username, faculty_password);

					if (faculty != null) {

						Boolean faculty_run = true;

						int active_faculty_id = faculty.getFaculty_Id();

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

								FacultyOptionDao faculty_option1 = new Faculty_Option_dao_Impl();
								try {
									List<Course_Plan> viewCoursePlan = faculty_option1
											.viewCoursePlan(active_faculty_id);
									if (!viewCoursePlan.isEmpty()) {
										viewCoursePlan.forEach(i -> {
//											System.out.println(i.getPlan_id());
//											System.out.println(i.getBatch_id());
//											System.out.println(i.getFaculty_id());
//											System.out.println(i.getTopic());
											System.out.println(i);
										});
									}

								} catch (Course_PlanException e) {

									System.out.println(e.getMessage());
								}

								System.out.println("");
								break;
							case 2:

								System.out.println("");

								System.out.println("Adding Day Wise Plans :");
								scanner.nextLine();

								System.out.println("Enter The Plan_id You Want To Enter ");
								String plan_id2 = scanner.nextLine();

								System.out.println("Enter The Batch_id Of Which You Want To Assign Schedule ");
								String batch_id2 = scanner.nextLine();

								System.out.println("Enter Your Faculty_id");
								int faculty_id2 = scanner.nextInt();
								scanner.nextLine();

								System.out.println("Enter The Date You Want To Assign");
								System.out.println("Please Enter The Date in YYYY-MM-DD Format:-");
								String date_2 = scanner.nextLine();
								Date day_2 = Date.valueOf(date_2);

								System.out.println("Enter Topic To Assign");
								String topic_2 = scanner.nextLine();

								System.out.println("Enter Status 'True' for Completed and 'False' for Pending");

								boolean status_2 = scanner.nextBoolean();

								try {
									String result_2 = faculty_option_dao_impl.update_daywise_schedule(plan_id2,
											batch_id2, active_faculty_id, day_2, topic_2, status_2);

									System.out.println(result_2);
								} catch (Course_PlanException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("");

								break;
							case 3:

								System.out.println("");

								System.out.println("Updating Password  :");
								scanner.nextLine();

								System.out.println("Enter The New Password");
								String new_password = scanner.nextLine();
								System.out.println(new_password);
								System.out.println(active_faculty_id);
								String result_3 = faculty_option_dao_impl.changePassword(active_faculty_id,
										new_password);

								System.out.println(result_3);
//								System.out.println("");

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

					}

				} catch (FacultyException e) {

					System.out.println(e.getMessage());
				}

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
