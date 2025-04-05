# DateTime Project

## Overview

The **DateTime** project is a Java-based application that demonstrates the handling, parsing, and storing of both dates and times using the `java.sql.Date` and `SimpleDateFormat` classes. The project provides functionality to insert date-time values into a MySQL database.

### Key Features:
- Supports multiple date formats (`dd-MM-yyyy`, `yyyy-MM-dd`, etc.)
- Converts `String` input to `java.sql.Date` using `SimpleDateFormat`
- Stores the formatted date-time values into a MySQL database
- Allows users to input custom ID numbers and date strings

## Technologies Used
- **Java** (JDK 8+)
- **MySQL** (for database storage)
- **AWT/Swing** (for potential GUI extensions, if needed)
- **JDBC** (for database interaction)

## Project Setup

### Prerequisites:
- **Java 8+** installed on your system
- **MySQL** server up and running
- A MySQL database with a table `developer_date` having at least two columns: `id` (INT) and `date` (DATE).

### Steps to Setup:
### 1. Clone the repository or download the project files.
   
### 2. Create a MySQL database and a table named `developer_date` with the following structure: 
CREATE TABLE developer_date (
    id INT PRIMARY KEY,
    date DATE
);

### 3.Update the database connection URL in the code:

Open the Date class in your preferred IDE.

Locate the following line of code:

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root", "root");
Modify the connection string to match your MySQL configuration:

localhost should be replaced with your MySQL server host (if not on your local machine).

3306 is the default MySQL port; update it if you're using a different port.

mini_project should be the name of your database.

Replace "root" and "root" with your MySQL username and password, if they are different.



### 4.Compile and run the program:

Open your IDE (e.g., IntelliJ IDEA, Eclipse) or use the command line to compile and run the Date class.

When prompted, enter the required input:

ID number: Enter a unique integer ID.

Date: Enter the date in the format dd-MM-yyyy (e.g., 05-04-2025).

The application will convert the entered date to the java.sql.Date format and insert the record into the MySQL database.



