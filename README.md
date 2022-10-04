
![Logo](https://media.istockphoto.com/vectors/business-meeting-people-conference-flat-vector-illustration-vector-id1217401032?k=20&m=1217401032&s=170667a&w=0&h=a_GBVoQ0NafCwBGYh62AaIB5Lm4vTL2pyT_8LfNF_-w=)


# Course Monitoring System

 **C.L.I BASED APPLICATION**

This application has designed to allocate courses to particular faculties and particular batches. It has a smooth workflow and is a ease to use. It allows the faculties
to create course plan for the week. 

The application will be used by the **two** categories of users:

- **Admin (Administrator)**

- **Faculty (Professors)** 
## Tech Stack

- JAVA
- J.D.B.C
- MYSQL







## System Structure

The application allows the admin to create New Courses, Faculties, Batches and Course Plans for the entire week.Where as it allows the faculty to update the Course plan day wise for a particular week. 

After the day wise schedule has updated the faculty Administrator can check the current status of a particular week and can be updated with the Course Plan . 

This helps the Admin to be aware of the ongoing batches and their course plans.




- Administrator
    -
    - Add, Update, Delete New Courses
    - Add, Update, Delete Batches
    - Add, Update , Delete Faculty 
    - Add, Update Delete Course Plan
    - View Current Courses, Batches, Course Plans in the database
    - View Reports Of The Course Plans 

- Faculty
    -
    - Update Password
    - Update Day-Wise Schedule For the Week In Course Plans
    - Check Course Plan Status




## Setting & Installation 

Install the Spring Tools Suite 
```bash
https://spring.io/tools
```

Install MySQL Community Server

```bash
https://dev.mysql.com/downloads/mysql/
```

Clone the Project

```bash
git clone https://github.com/medadeshreyas/average-collar-3069
```

Open MySQL Server
```bash
Create a New Database in SQL: Course_Monitoring_System 
```
Go to the Project Directory & Open SQL Folder > SQL Tables

```bash
Create The Same Tables in Your Course_Monitoring_System Database 
```

Create a Admin For Your Database

```bash
INSERT INTO ADMIN VALUES('Shreyas Medade','Shreyas@2003');
```




## Run Locally


Go to the Project Directory

```bas
Open the Course_Monitoring_System Folder With S.T.S 
```

Go to Build Path > Libraries > Class_Path

```bash
 Add the Jar File Present in JDBC Driver As External Jar
```
Go to Utility Package > Data Base Utility 

```bash
Connection = DriverManager.getConnection(url, "root", "ENTER YOUR SQL SERVER PASSWORD");
```

Go to Run Package 

```bash
NOTE : Insert Data Into Database Either Through Application OR Through MySQL By Entering the Queries From SQL Queries  
```

```bash
Run as Java Application !
```


## Demo





## Screenshots



## Contributions

Contributions are always **Welcome** !

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **Greatly Appreciated**.

If you have a suggestion that would make this application better, Please fork the repo and create a pull request. You can also connect with me for further development of this application !

Don't forget to give the project a star ! Thank You !

## 🔗 Contact Me
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://medadeshreyas.github.io/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shreyasmedade/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/ShreyasMedade)


## Authors

- [Shreyas Vilas Medade](https://github.com/medadeshreyas)
## Acknowledgements


- [Anand Singh](https://github.com/mohitagrawal22)

- [Masai School](https://www.masaischool.com/)
 
