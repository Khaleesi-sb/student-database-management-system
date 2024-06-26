# Student Database Management System

A web-based Student Database Management System developed using Java, Spring Boot, and MongoDB for the backend, and React for the frontend. This application supports CRUD operations (Create, Read, Update, Delete) for managing student records efficiently.

## Features

- **Create**: Add new student entries.
- **Read**: View all student entries.
- **Update**: Modify existing student records.
- **Delete**: Remove student entries from the database.

## Tech Stack

- **Backend**: Java, Spring Boot
- **Database**: MongoDB
- **Frontend**: React

## Getting Started

### Prerequisites

- Java 11+
- Node.js and npm
- MongoDB

### Installation

1. **Clone the repository**:
    ```sh
    git clone https://github.com/Khaleesi-sb/student-database-management-system.git
    cd springboot-mongo-student-render
    ```

2. **Backend Setup**:
   - Navigate to the backend directory:
       ```sh
       cd src/main
       ```
   - Install Maven dependencies:
       ```sh
       mvn clean install
       ```
   - Run the Spring Boot application:
       ```sh
       mvn spring-boot:run
       ```

3. **Frontend Setup**:
   - Navigate to the frontend directory:
       ```sh
       cd src/main/frontend
       ```
   - Install npm dependencies:
       ```sh
       npm install
       ```
   - Start the React application:
       ```sh
       npm start
       ```

### Configuration

1. **MongoDB**:
   - Ensure MongoDB is running locally on the default port (27017).
   - Update the MongoDB connection settings in `src/main/resources/application.properties` if necessary.

### Usage

- **Create Student**:
   - Fill out the form on the "Add Student" page and submit to create a new student entry.

- **Read Students**:
   - Navigate to the "All Students" page to view the list of all student entries.

- **Update Student**:
   - Click the "Edit" button next to a student entry, modify the details, and save changes.

- **Delete Student**:
   - Click the "Delete" button next to a student entry to remove it from the database.

## Project Structure

```plaintext
springboot-mongo-student-render/
│
├── .mvn/               # Maven wrapper files
├── src/
│   ├── main/
│   │   ├── java/       # Java source files
│   │   ├── resources/  # Configuration files
│   │   └── frontend/   # React frontend
├── mvnw                # Maven wrapper script for Unix
├── mvnw.cmd            # Maven wrapper script for Windows
├── pom.xml             # Maven configuration file
└── README.md           # Project documentation
```

### Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any enhancements, bug fixes, or new features.

- Fork the Project
- Create your Feature Branch (git checkout -b feature/AmazingFeature)
- Commit your Changes (git commit -m 'Add some AmazingFeature')
- Push to the Branch (git push origin feature/AmazingFeature)
- Open a Pull Request