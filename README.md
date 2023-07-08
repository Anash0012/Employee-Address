# *Employee Address*


## Frameworks and Language Used
- **Java**
- **Spring Boot**
- **MySQL**
- **Swagger UI**
- **Hibernate**

## API Endpoints
The following endpoints are available in the API:

### Employee Endpoints
- **GET /employees-** Get a list of all employees
- **GET /employees/{id}-** Get an employee by ID
- **POST /employees-** Create a new employee
- **PUT /employees/{id}-** Update an existing employee
- **DELETE /employees/{id}-** Delete an employee

### Address Endpoints
- **GET /addresses-** Get a list of all addresses
- **GET /addresses/{id}-** Get an address by ID
- **POST /addresses-** Create a new address
- **PUT /addresses/{id}-** Update an existing address
- **DELETE /addresses/{id}-** Delete an address

## Controllers
The project has two controllers:
### EmployeeController
- Handles requests related to the Employee model

### AddressController
- Handles requests related to the Address model

## Services
The project has two services:
### EmployeeService
- Handles CRUD operations on the Employee model

### AddressService
- Handles CRUD operations on the Address model

## Repositories
The project has two repositories:
### EmployeeRepository
- Provides access to the Employee data source

### AddressRepository
- Provides access to the Address data source

## Data Structure

1. **Employee Address Model**: The Employee Address model represents the data structure for storing employee address information. It typically includes attributes such as employeeId, address, city, state, and postalCode.

## Project Summary

The Employee Address Management system is designed to manage and perform CRUD operations on employee address data. It provides a RESTful API for interacting with employee addresses. The application is built using Spring Boot and uses MySQL as the database for storing employee address information. The API endpoints can be explored and tested using Swagger UI.


## Database

This Project uses MySQL as the database to store employee address data.