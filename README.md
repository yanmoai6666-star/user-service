# User Service

This is a Spring Boot microservice for user management.

## Features

- User registration and authentication
- User profile management
- Role and permission management
- Address management
- Notification management
- Activity logging
- User settings
- Report generation

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           ├── UserServiceApplication.java
│   │           └── controller/
│   │               ├── AuthController.java
│   │               ├── UserController.java
│   │               ├── ProfileController.java
│   │               ├── PermissionController.java
│   │               ├── ReportController.java
│   │               ├── AddressController.java
│   │               ├── RoleController.java
│   │               ├── ActivityController.java
│   │               ├── NotificationController.java
│   │               └── SettingsController.java
│   └── resources/
│       └── application.properties
```

## Technology Stack

- Java 17
- Spring Boot 3.2.0
- Maven

## Getting Started

1. Clone the repository
2. Build the project: `mvn clean install`
3. Run the application: `mvn spring-boot:run`

## API Endpoints

The application provides RESTful API endpoints for:

- `/users` - User management
- `/auth` - Authentication and authorization
- `/profiles` - User profile management
- `/roles` - Role management
- `/permissions` - Permission management
- `/addresses` - Address management
- `/notifications` - Notification management
- `/activities` - Activity logging
- `/settings` - User settings
- `/reports` - Report generation

## License

MIT
