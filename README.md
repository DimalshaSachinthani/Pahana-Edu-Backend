📘 Pahan Edu Web - Bookshop Management System
Pahan Edu Web is a Java Maven-based web application built using JSP and Servlets, developed for managing billing, customers, and item data for the Pahan Edu Bookshop.

⚙️ Technologies Used
Java 21
Maven (WAR packaging)
JSP + Servlets (Jakarta EE)
MySQL (schema + seed data included)
Apache Tomcat 11 (for deployment)
JUnit 5 (unit testing)
IntelliJ IDEA (recommended IDE)

📂 Project Structure

pahan-edu-web/
├── pom.xml
├── README.md
├── LICENSE
└── src/
├── sql/
└── main/
├── java/
│ └── com/uni/
│   └── controller/
│     └── BillServlet.java
│   └── dao/
│     └── BillDAO.java
│   └── model/
│     └── Bill.java
│   └── service/
│     └── BillService.java
│   └── util/
│     └── DatabaseUtil.java
├── resources/
└── webapp/
├── index.jsp
└── WEB-INF/
└── web.xml

🚀 How to Run Locally

No EXE installer — you can run locally via WAR deployment on Tomcat.

📦 Prerequisites

Java 21+
Apache Tomcat 11+
MySQL Server (5.7+) / WAMP Server / XAMPP Server
Maven 3.8+

🔧 Setup Instructions
Install dependencies

Java JDK 21
Apache Tomcat
MySQL
Configure the database

Create a database pahana_edu in MySQL.
Import schema and seed data:
mysql -u root -p pahana_edu < sql/schema.sql
mysql -u root -p pahana_edu < sql/seed_data.sql
Configure properties

Create a new file:
src/main/resources/application.properties
Use the template provided in:
application-template.properties
Build the WAR

mvn clean package
Deploy on Tomcat

Copy the generated WAR file from target/pahan-edu-web.war to the webapps directory of your Tomcat installation.
Start Tomcat:
cd /path/to/tomcat/bin
./startup.sh
Access the application

Open your web browser and go to:
http://localhost:8080/pahan-edu-web/
Login with default credentials:
Username: test
Password: test

📖 Documentation
JSP Documentation
Servlet Documentation
Maven Documentation
Tomcat Documentation
MySQL Documentation
Java Documentation
Jakarta EE Documentation
Apache Commons Documentation
JUnit Documentation

🛠️ Testing
Unit tests are written using JUnit 5.
Run tests using:
mvn test
All testing checklists available in PR: PR #8

📫 Contact
For any issues or contributions, please open an issue or submit a pull request on the pahan-edu-web repository.

📈 Versioning and Changelog
This project uses Semantic Versioning.

Version: 1.0.0
Changelog: CHANGELOG.md

📣 Author
K.K. Dimalsha Sachinthani - DimalshaSachinthani
Developed as part of the Pahan Edu project for university coursework CIS6003

📝 License
This project is licensed under the MIT License.
