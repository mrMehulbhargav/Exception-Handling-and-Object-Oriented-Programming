
# Practical Programming - Exception Handling and OOP Mastery

This repository contains my practical assignment focusing on Exception Handling and Object-Oriented Programming (OOP) in Java. The goal of this assignment is to demonstrate how to handle exceptions effectively and implement key OOP principles like inheritance, constructors, and method overriding in a real-world application.

## Project Structure

The project is divided into two parts:

### 1. Exception Handling
In this part, I've developed a **Calculator Program** that handles different kinds of exceptions such as division by zero and invalid input. Additionally, it throws a custom exception for unsupported operations. The program ensures proper resource management with a `try-catch-finally` block to close resources.

- **File Location**: `Exception_Handling/CalculatorProgram.java`

### 2. OOP Concepts
In this part, I've implemented a **Vehicle Management System** with a base class `Vehicle` and two subclasses `Car` and `Motorcycle`. This demonstrates inheritance, method overriding, and constructor overloading to provide multiple ways of initializing objects.

- **File Location**: `OOP_Concepts/VehicleManagementSystem.java`

## How to Run

1. Clone this repository to your local machine.
   ```bash
   git clone https://github.com/yourusername/Practical-Programming-Assignment.git
   ```

2. Navigate to the relevant directory (Exception_Handling or OOP_Concepts).

3. Compile and run the Java programs using the following commands:
   ```bash
   javac CalculatorProgram.java
   java CalculatorProgram
   ```

   ```bash
   javac VehicleManagementSystem.java
   java VehicleManagementSystem
   ```

## Conclusion
This project demonstrates effective error handling using custom exceptions and the application of OOP concepts in Java. It simulates real-world scenarios like a calculator with various arithmetic operations and a vehicle management system with cars and motorcycles.
