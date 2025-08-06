# 📘 Pahan Edu Web - Bookshop Management System
Pahan Edu Web is a Java Maven-based web application built using JSP and Servlets, developed for managing billing, customers, and item data for the Pahan Edu Bookshop.

## ⚙️ Technologies Used
- Java 21  
- Maven (WAR packaging)  
- JSP + Servlets (Jakarta EE)  
- MySQL (schema + seed data included)  
- Apache Tomcat 11 (for deployment)  
- JUnit 5 (unit testing)  
- IntelliJ IDEA (recommended IDE)  

## 📂 Project Structure

<pre>  
  pahan-edu-web/ 
  ├── pom.xml 
  ├── README.md 
  ├── LICENSE
  ├── sql/
  └── src/
  │ └── main/ 
  │      └── main/  
  │           └── dao/
  │           │    └── impl/
  │           │    │    └── CustomerDAOImpl.java
  │           │    ├── CustomerDAO.java
  │           ├── servlet/ 
  │           │     └── CustomerServlet.java 
  │           ├── model/ 
  │           │     └── Customer.java 
  │           └── util/
  │                 ├── DBConnection.java
  │                 ├── PasswordHasher
  │                 └── Validator
  ├── resources/ 
  └── webapp/ 
  ├── index.jsp 
  └── WEB-INF/ 
  └── web.xml ``` </pre>

  ## 🚀 How to Run Locally
_No EXE installer — you can run locally via WAR deployment on Tomcat._

### 📦 Prerequisites
- Java 21+  
- Apache Tomcat 11+  
- MySQL Server (5.7+) / WAMP / XAMPP  
- Maven 3.8+

### 🔧 Setup Instructions
1. Install dependencies: Java, Tomcat, MySQL  
2. Configure database:  
```bash
mysql -u root -p pahana_edu < sql/schema.sql
mysql -u root -p pahana_edu < sql/seed_data.sql
