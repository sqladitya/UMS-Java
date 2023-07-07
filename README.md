# UMS-Java
A comprehensive Java-based software solution designed to streamline and automate various administrative tasks, academic processes, and student management within a university.
## JAVA Project Note

1.	Java project name is <b>[University Management System](https://github.com/sqladitya/UMS-Java/tree/main/University%20Management%20System)</b>
2.	All Java source files in package name = <b>’university.management.system’</b>.
3.	Start Page of the Application – [main.java](https://github.com/sqladitya/UMS-Java/blob/main/University%20Management%20System/src/university/management/system/Main.java)
4.	All the Images are in [Icons](https://github.com/sqladitya/UMS-Java/tree/main/University%20Management%20System/src/icons) folder.
5.	Import all [Jar](https://github.com/sqladitya/UMS-Java/tree/main/University%20Management%20System/Jar) files in Libraries which is <br><b>	1. mysql-connector-java-8.0.28.jar</b> – Official JDBC Driver for Mysql.<br><b>2.	jcalendar-tz-1.3.3-4.jar</b> – Java Date chooser bean for graphically picking a date.<br>	3. <b>rx2xml.jar</b> - display the data in a table format.
## 
## MYSQL Note

### If you are developing this same, then first create these all of the tables with the same table, column name which is visible in the below tables. Run all of the queries in Mysql workbench [SQL Queries](https://github.com/sqladitya/UMS-Java/blob/main/University%20Management%20System/Queries.sql)

1.	use universitymanagementsystem;

2.	show tables; 
 ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/8a46859d-28fd-4737-9e0e-493678f54612)


3.	select * from collegefee;
 ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/59801fab-6258-4409-9165-1be70a351e63)

4.	select * from fee;
 ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/c10169a0-0b3d-4143-8038-216b8fb9eea8)


5.	select * from login;
 ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/a5728a7f-3c80-46b9-a677-6e01dc284f96)


6.	select * from marks;
 ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/1487989d-7823-4338-b0f7-180b1a5c2679)


7.	select * from student;
 ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/c1142d10-4f3c-4384-8ca4-c057b87c65d6)


8.	select * from studentleave;
 ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/adad6a70-c304-418a-801a-530eb891634f)

9.	select * from subject;
 ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/1ecc9aa2-0d52-4adc-86b9-999510a9a057)

10.	select * from teacher;
 ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/2ff68c2f-113b-48a9-8409-a86c198dd323)

11.	select * from teacherleave;
 ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/23c76329-67ac-45d0-ba1e-821f129bd3eb)

## NOTE (Database, Tables): 

NOTE (Database): Firstly, I have created the database of name <b>universitymanagementsystem

NOTE (All Table’s except login and fee):</b> Here, in all of the table’s data is inserted by using the Application not by inserting the data directly into the database by using queries.

<b>NOTE (login table):</b> For the login table username and password, I have inserted the user data by running queries in the database because I have not created any separate page for User-login.

NOTE (fee table): For the fee table, I have inserted the fee Details in the respective course in database by running queries.



## NOTE (JDBC Connection): 

#### ("jdbc:mysql://localhost:3306/universitymanagementsystem", "USERNAME","PASSWORD")
1.	I have used MYSQL Workbench Application for the Database. In MYSQL Workbench, by default the port number is 3306, So I have used their port no. 3306 for JDBC Connection. And I have used LocalHost.
2.	Database <b>Username = ‘USERNAME’. </b>
3.	Database <b>Password = ‘PASSWORD’.</b>
4.	If anything is different in your case, then you have to change all of different data’s in <b>[conn.java](https://github.com/sqladitya/UMS-Java/blob/main/University%20Management%20System/src/university/management/system/conn.java)</b> class respectively.

<b>Recommendation:</b> <br>1. Install MYSQL Workbench by using the MYSQL installer- Community, so that server will install and other important things.<br>
<b>MYSQL installer-</b> Community download link - [Click Here](https://dev.mysql.com/get/archives/mysql-installer/mysql-installer-web-community-8.0.28.0.msi)<br> 2. Install Apache Netbeans for the application development.<br>
<b>Apache NetBeans download link</b> - [Click here](https://archive.apache.org/dist/netbeans/netbeans-installers/17/Apache-NetBeans-17-bin-windows-x64.exe)
## Project Images
This main page will only start for 5 sec. After 5 sec it will close and open login page. <br>
![image](https://github.com/sqladitya/UMS-Java/assets/84535788/eaa46555-c7f3-44c9-8ee4-a1567cc561df)<br>
Then entering the value of username and password, then clicking submit If matches then it will open Home Page of UMS, if not matches then it will return a popup of Username or password invalid.<br>
![image](https://github.com/sqladitya/UMS-Java/assets/84535788/73240470-d45b-474e-be5d-edf267773b3c) ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/73eade7f-1267-4453-bb67-520a62980ba2)<br>
In Home page <br>
![image](https://github.com/sqladitya/UMS-Java/assets/84535788/1b12f892-de6f-4115-81b4-349860c912d5)<br>
Menubars are there<br>
![image](https://github.com/sqladitya/UMS-Java/assets/84535788/44d251ad-c40c-4131-a502-88523e0693b0)<br>
All Menubars are<br>
![image](https://github.com/sqladitya/UMS-Java/assets/84535788/dde95817-8626-4645-aada-97fb6dea5d4d) ![image](https://github.com/sqladitya/UMS-Java/assets/84535788/3f0030b4-f6be-4974-a0ce-05bfb10b83ae)<br><br>
The <b>EXIT</b> button will will close the application




