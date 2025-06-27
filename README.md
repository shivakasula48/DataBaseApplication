# Task 4: Connect to MySQL Database and Design the Homepage in NetBeans IDE 

This project is part of an internship task to connect a Java application to a MySQL database and design a simple homepage using `JFrame`.

---


*COMPANY*: Main Flow Services and Technologies Pvt. Ltd. 

*NAME* : shiva kasula

*INTERN ID* : 17203

*DOMAIN* : Full Stack Web Development

*DURATION* : 8WEEKS

---



## Key Features

### Database Connectivity
- Establishes a secure connection with MySQL using JDBC.
- Configurable database credentials for flexibility.

### User-Friendly Interface
- A well-designed homepage built using Java Swing (JFrame).
- Navigation buttons for user interactions:
  - **View Profile**: Fetches and displays user details from the database.
  - **Settings**: Placeholder for future settings functionality.
  - **Logout**: Closes the application.

### Data Management
- Retrieves user data from the `users` table in the database.
- Displays user information through a pop-up dialog.

---


## Technologies Used

- **Java**: Programming language for application logic.
- **MySQL**: Database management system for storing user information.
- **JDBC**: API for connecting the application to the MySQL database.
- **NetBeans IDE**: Development environment.
- **XAMPP**: Tool for running MySQL locally.

---

## Setup Instructions

### 1. Clone the Repository
- Open your terminal or command prompt.
- Run the following commands to clone the repository and navigate into the project directory:

```bash
git clone https://github.com/shivakasula48/DataBaseApplication.git

```
```
cd DataBaseApplication
```


### 2. Install Prerequisites

Ensure the following software is installed on your system:

- **Java Development Kit (JDK)**: Version 8 or later.
- **NetBeans IDE**: Recommended for developing and running the project.
- **XAMPP**: For running the MySQL server locally.
- **MySQL Connector/J**: Ensure the JDBC driver `.jar` file is added to the project.


### 3. Configure the Database

#### Start MySQL Server
- Launch XAMPP and click "Start" next to MySQL.

#### Create a Database
1. Open phpMyAdmin (via the "Admin" button in XAMPP).
2. Create a new database named `testdb`.

#### Create the Users Table
- Run the following SQL query in phpMyAdmin to create the `users` table:

```sql
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```
#### Insert Sample Data
- Add some sample records for testing by running the following SQL query in phpMyAdmin:

```sql
INSERT INTO users (username, password, email)
VALUES 
('testuser', 'testpassword', 'testuser@example.com'),
('admin', 'adminpassword', 'admin@example.com');
```

### 4. Configure the Java Project

#### Open the Project
- Open the project in **NetBeans IDE**.

#### Add MySQL Connector/J to the Project
1. Right-click on the project in NetBeans.
2. Go to **Properties > Libraries > Add JAR/Folder**.
3. Select the MySQL Connector `.jar` file (e.g., `mysql-connector-java-8.x.x.jar`).

#### Modify the `DatabaseConnection.java` File
- Update the database details in the file with your configuration:

```java
private static final String URL = "jdbc:mysql://localhost:3306/testdb";
private static final String USER = "root";
private static final String PASSWORD = "";
```
### 5. Run the Application

#### Run `Homepage.java` in NetBeans
1. Right-click `Homepage.java` in the project explorer.
2. Select **Run File**.

#### Interact with the Application
- Use the **"View Profile"** button to fetch user details.

---

### 6. Troubleshooting

#### Database Connection Fails
- Ensure MySQL is running in XAMPP.
- Verify the database name, username, and password in `DatabaseConnection.java`.

#### JAR File Missing
- Ensure the MySQL Connector `.jar` file is added to the project’s classpath.



## OUTPUT





# License

This project is open-source and free to use by anyone for personal or educational purposes.  
Feel free to modify, distribute, and use the code as long as proper credit is given to the original author, **Kasula Shiva**.


