# E-Commerce Platform (Java)

## Project Overview

This repository contains a Java-based e-commerce platform. Core capabilities include:

- Search for products
- Add products to a shopping cart (basket)
- Manage user information
- Place and track orders

The project is designed to be scalable and suitable for both small businesses and larger deployments.

## Project Modules

### Product Management

- Creates and initializes product objects using constructors
- Adds products to the `Basket` class
- Displays all products in the basket

### User Management

- Initializes products as parameters
- Defines user information
- Adds products to the user’s shopping cart
- Displays shopping cart details

### Order Management

- Manages orders using `User` and `Order` classes
- Initializes orders with a user and an empty product list
- Adds products to the order via a method
- Calculates the total price (iterating over products) and prints product prices
- Places orders and prints order details

## Tech Stack & Tools

- **Language:** Java
- **Build tool:** Maven
- **Testing:** JUnit
- **Database:** MySQL (optional, for order persistence)
- **Logging:** SLF4J & Logback
