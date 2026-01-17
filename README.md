# Idiot Club

A Spring Boot application for managing community clubs and member interactions. This platform allows creators to establish communities, leaders to manage clubs, and members to join and participate in activities.

## Overview

Idiot Club is a backend service built with Spring Boot that facilitates the creation and management of communities and clubs. It provides role-based access control with three primary user types:

- **Community Creators**: Create and manage communities
- **Club Leaders**: Lead and manage clubs within communities
- **Members**: Join clubs and participate in community activities

## Features

- **Community Management**: Create, update, and manage communities
- **Club Management**: Leaders can create and manage clubs within communities
- **Member Management**: Members can join communities and clubs
- **Authentication**: Sign-up and login functionality for different user roles
- **Join Requests**: Handle community join requests with approval workflows
- **Role-Based Access Control**: Different endpoints and permissions for creators, leaders, and members

## Tech Stack

- **Framework**: Spring Boot 3.4.1
- **Language**: Java 21
- **Database**: H2 (in-memory) / MySQL (optional)
- **ORM**: JPA/Hibernate
- **Build Tool**: Maven
- **Web Framework**: Spring Web
- **Validation**: Jakarta Bean Validation
- **Container**: Docker

## Project Structure

```
src/main/java/com/project/idiotclub/app/
├── auth/                          # Authentication & Authorization
│   ├── CommunityCreatorAuth.java
│   ├── UserAuth.java
│   └── dto/                       # DTOs for login/signup
├── controller/                    # REST API Endpoints
│   ├── CommunityCreatorController.java
│   ├── ClubLeaderController.java
│   └── ClubMemberController.java
├── entity/                        # JPA Entities
│   ├── community/
│   │   ├── Community.java
│   │   ├── CommunityCreator.java
│   │   ├── CommunityMembers.java
│   │   └── JoinCommunityRequest.java
│   ├── leader/                    # Leader-related entities
│   ├── member/                    # Member-related entities
│   ├── ClubRole.java              # Role enumeration
│   └── RequestStatus.java         # Request status enumeration
├── repo/                          # Repository Interfaces (Data Access)
│   ├── community/
│   ├── leader/
│   └── member/
├── service/                       # Business Logic
│   ├── creatorservice/            # Community creator services
│   ├── leaderservice/             # Club leader services
│   └── memberservice/             # Member services
├── response/                      # API Response Models
│   └── ApiResponse.java
├── util/                          # Utility Classes & DTOs
│   ├── clubleader/
│   ├── community/
│   └── member/
├── config/                        # Configuration
│   └── WebConfig.java
└── IdiotClub01Application.java    # Main Application Class
```

## Database Configuration

### Default (H2 In-Memory)
The application is pre-configured to use H2 database for development:

```properties
spring.datasource.url=jdbc:h2:mem:clubdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=idiot
spring.datasource.password=idiot
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

Access H2 Console: `http://localhost:8080/h2-console`

### MySQL (Optional)
To use MySQL instead, uncomment the MySQL configuration in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/idiot
spring.datasource.username=idiot
spring.datasource.password=idiot
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

## Getting Started

### Prerequisites
- Java 21 or higher
- Maven 3.6+
- (Optional) MySQL 8.0+
- Docker (for containerized deployment)

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/paung29/idiot-club.git
cd idiot-club
```

2. **Build the project**
```bash
./mvnw clean package
```

3. **Run the application**
```bash
./mvnw spring-boot:run
```

The server will start on `http://localhost:8080`

### Docker Setup

Build and run the application in a Docker container:

```bash
docker build -t idiot-club:latest .
docker run -p 8080:8080 idiot-club:latest
```

## API Endpoints

### Community Creator Endpoints (`/api/creator`)
- `POST /signup` - Register as a community creator
- `POST /login` - Login as a community creator
- `POST /create-community` - Create a new community
- `PUT /edit-community` - Update community details

### Club Leader Endpoints (`/api/leader`)
- `POST /signup` - Register as a club leader
- `POST /login` - Login as a club leader
- `POST /create-club` - Create a new club
- `PUT /edit-club` - Update club details

### Member Endpoints (`/api/member`)
- `POST /signup` - Register as a member
- `POST /login` - Login as a member
- `POST /join-community` - Request to join a community
- `GET /my-clubs` - View clubs the member belongs to

## Entity Relationships

- **Community** ↔ **CommunityCreator** (One-to-One)
- **Community** ↔ **CommunityMembers** (One-to-Many)
- **Community** ↔ **JoinCommunityRequest** (One-to-Many)
- **MyClub** ↔ **ClubLeader** (One-to-One)
- **MyClub** ↔ **ClubMember** (One-to-Many)

## Configuration Files

### application.properties
Located in `src/main/resources/`, contains:
- Database connection settings
- Hibernate/JPA configuration
- H2 Console configuration
- Logging settings

### pom.xml
Maven configuration file with dependencies:
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Jakarta Bean Validation
- H2 Database
- MySQL Driver (optional)

## Development

### Running Tests
```bash
./mvnw test
```

### Code Structure
- **Controllers**: Handle HTTP requests and responses
- **Services**: Contain business logic and validation
- **Repositories**: Perform database operations
- **Entities**: Define database schema and relationships
- **DTOs**: Transfer data between layers
- **Utilities**: Helper functions and form validators

## Authentication Flow

1. User signs up with name, email, and password
2. System validates input and checks for duplicate emails
3. User credentials are stored in the database
4. User logs in with email and password
5. System returns authentication token/response
6. Authenticated user can access role-specific endpoints

## Logging

The application enables SQL logging for development:
- `spring.jpa.show-sql=true` - Shows SQL queries
- `spring.jpa.properties.hibernate.format_sql=true` - Formats SQL output

## Error Handling

The application uses `ApiResponse` class for consistent error/success responses across all endpoints. HTTP status codes:
- `200 OK` - Successful request
- `400 Bad Request` - Invalid input or failed operation
- `401 Unauthorized` - Authentication required
- `403 Forbidden` - Insufficient permissions
- `500 Internal Server Error` - Server error

## Future Enhancements

- JWT token-based authentication
- Email verification
- Advanced authorization with role-based access control (RBAC)
- Activity logging and audit trails
- Community event scheduling
- Notification system
- File upload for community images
- Payment integration for premium features

## Contributing

1. Create a feature branch
2. Make your changes
3. Commit with clear messages
4. Push to your branch
5. Open a pull request

