# Credit Card System

## Overview
This project is a simple credit card system implemented in Java. It demonstrates object-oriented programming (OOP) principles such as encapsulation, aggregation, method overloading, and proper use of constructors.

## Features
- `Money.java`: Represents money values with dollars and cents, supporting arithmetic operations.
- `Address.java`: Stores address details including street, city, state, and zip code.
- `Person.java`: Defines a person with a name and address.
- `CreditCard.java`: Simulates a credit card with a balance, credit limit, and methods for charging and payments.
- `CreditCardDemo.java`: A test driver that demonstrates the functionality of the system.

## UML Diagram
The project follows a structured UML model where:
- A `CreditCard` **has a** `Person` (aggregation).
- A `Person` **has an** `Address` (aggregation).
- A `CreditCard` also **has** `Money` objects to represent the balance and credit limit.

## Installation & Usage
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/credit-card-system.git
