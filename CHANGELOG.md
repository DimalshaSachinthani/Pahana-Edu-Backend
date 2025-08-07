# 📦 Changelog
All notable changes to this project will be documented in this file.  
This project follows [Semantic Versioning](https://semver.org/).

---

## [1.0.0] - 2025-08-07
🎉 **Initial Production Release**

### 🚀 Overview
This is the **first stable production release** of the Pahan Edu Bookshop Management System, built using Java, JSP, and Servlets. It includes customer, item, and billing management modules, secure authentication, and a styled dashboard.

### ✅ Features

- **Authentication**
    - Secure session-based login/logout system
    - Restricted access to protected pages
    - Basic login UI (`login.jsp`, `dashboard.jsp`)

- **Customer Management**
    - Add, view, update, and delete customer records
    - `CustomerServlet`, `CustomerDAO`, `CustomerService` included

- **Item Management**
    - Manage bookshop items (CRUD)
    - Styled UI for item list and forms
    - Seed data for sample items

- **Billing System**
    - Create and view bills dynamically
    - Bill items selection, price calculation
    - `BillServlet`, `BillDAO`, `BillService`

- **Dashboard**
    - Navigation to all modules
    - Clean layout and basic styles

### 🛡️ Security

- Session validation for protected pages
- JSPs hidden under `WEB-INF/` to prevent direct access

### 🎨 UI/UX

- Clean and simple layout
- Dark theme styling applied to forms and tables
- Navigation using basic buttons

### 🧪 Testing

- Unit tests written using JUnit 5
- DAO and Service classes tested
- Dynamic test setup/teardown for isolation

### 📂 Project Structure

- Layered Maven structure:
    - `daoimpl`, `dao`, `model`, `util`
- `sql/` folder contains schema and seed data
- `webapp/` contains `index.jsp`, `WEB-INF/web.xml`

### 🔀 Release Notes

- Finalized after testing on `regression` and `staging` branches
- Merged into `main`
- Git tag `v1.0.0` created
- Documentation and test checklist added to `docs/` folder

---
