# Fixed Asset Registration System (FARS) <sub>(Computer Programming II Project)</sub>

 
## The Purpose of the Project:

- The Fixed Asset Registration System aims to provide a comprehensive solution for managing fixed assets, user interactions, and data management through a series of Java classes and graphical user interface (GUI) pages, with the purpose of tracking the status of any company's fixed assets (user, when purchased, price, whether actively used, etc.) and the company's employees.


## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Project Overview](#project-overview)
- [Classes and Pages](#classes-and-pages)
- [Images](#images)


## Installation

- To run this project locally, follow these steps:
		
1. Clone the repository:
  ```sh
    git clone https://github.com/ekrem-bas/CPII-Project.git
  ```

2. Ensure you have the `Java Development Kit (JDK)` and [`MySQL`](https://dev.mysql.com/downloads/) installed .

3. Open the project in your preferred Integrated Development Environment (IDE) such as `Apache NetBeans`.


## Usage

- To use the project, open it in your IDE and run the `Page_Login` or the specific page you are working on. The application includes several GUI pages for managing fixed assets and user accounts.


## Project Overview

- The Fixed Asset Registration System is designed to facilitate the management of fixed assets within an organization. It includes functionality for adding, updating, and exporting asset data, as well as managing user accounts and permissions. The project is structured around a set of Java classes that handle the core business logic and GUI pages that provide a user-friendly interface for interacting with the system.


## Classes and Pages

**DatabaseManager.java**
 + **Purpose**: Manages database connections and operations.
 + **Details**: This class handles tasks such as connecting to the database, executing queries, and closing connections. It provides methods for common database operations and ensures that resources are properly managed.

 >[!IMPORTANT]
 > Please make sure to customize the database connection settings according to your environment. Modify the `URL`, `USERNAME`, and `PASSWORD` fields in the `DatabaseManager.java` class to match your database configuration.
 > Also, update the `table names` in the `SQL Queries` within methods such as `register`, `login`, `delete`, etc., to reflect your own table names.

```java
private static final String URL = "jdbc:mysql://localhost:3306/your_database";
private static final String USERNAME = "your_username";
private static final String PASSWORD = "your_password";
```

**FixedAssets.java**
 + **Purpose**: Handles operations related to fixed assets.
 + **Details**: This class includes methods for adding, updating, and retrieving asset data. It ensures that asset information is stored correctly and can be accessed efficiently.

**Page_Add.java**
 + **Purpose**: Provides the functionality for adding new fixed assets.
 + **Details**: This page includes forms for entering asset details and input validation to ensure accurate data entry. It interacts with the `FixedAssets` class to save new assets to the database.

**Page_Export.java**
 + **Purpose**: Handles the export of fixed asset data to external formats.
 + **Details**: This page allows users to select export options (e.g., CSV, Excel) and initiate the export process. It ensures that data is formatted correctly and can be used in external applications.

**Page_Home.java**
 + **Purpose**: Serves as the home page of the application.
 + **Details**: This page provides an overview of the application’s functionality and quick access to other pages. It acts as the main navigation hub for users.

**Page_Login.java**
 + **Purpose**: Manages user login functionality.
 + **Details**: This page includes fields for entering credentials and authentication logic to verify user identity. It interacts with the `DatabaseManager` to validate user information.

**Page_Register.java**
 + **Purpose**: Handles user registration.
 + **Details**: This page includes forms for entering user information and logic to save new user accounts to the database. It ensures that new users are properly registered and can access the system.

**Page_Update.java**
 + **Purpose**: Provides functionality for updating existing fixed assets.
 + **Details**: This page allows users to search for an asset and modify its details. It interacts with the `FixedAssets` class to save updated information to the database.

**Person.java**
 + **Purpose**: Represents a person, typically a user or employee.
 + **Details**: This class includes attributes such as name, email, and role. It is used to manage user data and ensure that users have appropriate access rights.

**SubPage_EmployeesList.java**
 + **Purpose**: Displays a list of employees.
 + **Details**: This subpage provides functionality for viewing employee details and managing employee records. It interacts with the `Person` class to retrieve and display employee information.

**SubPage_TermsOfService.java**
 + **Purpose**: Displays the terms of service.
 + **Details**: This subpage provides information about the application’s terms and conditions for users. It ensures that users are aware of their rights and responsibilities.

## Images

- ### Login Page
<img width="730" alt="login_page" src="https://github.com/user-attachments/assets/53f0030f-e93b-47af-9189-2370f9471259" />

- ### Register Page
<img width="641" alt="register_page" src="https://github.com/user-attachments/assets/23b41beb-b20b-4882-b548-a3283ed6259e" />

- ### Home Page
<img width="1362" alt="home_page_1" src="https://github.com/user-attachments/assets/db439109-5a1d-4adb-9ff4-ef064b496bcc" />
<img width="1362" alt="home_page_2" src="https://github.com/user-attachments/assets/73f9e35d-a392-4a64-b74c-110ab21626b5" />

- ### Add Page
<img width="1325" alt="add_page" src="https://github.com/user-attachments/assets/6bfe4255-25c0-4299-a7e8-9a5dcac7e926" />

- ### Export Page
<img width="1302" alt="export_page" src="https://github.com/user-attachments/assets/ecab8b2b-ce16-4a0d-8679-155a3ff7e384" />
<img width="1025" alt="exported_file" src="https://github.com/user-attachments/assets/02d12a25-2f68-4eb6-8e8d-3204704c9512" />
