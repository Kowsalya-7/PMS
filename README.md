# Product Management System

This is a full-stack web application for managing products, built using Java for the backend and React for the frontend.

## Features

- **User Authentication:** Allows users to sign up, sign in, and manage their accounts securely.
- **Product CRUD Operations:** Supports creating, reading, updating, and deleting products.
- **Search and Filtering:** Enables users to search for products by name, category, or price range.
- **Role-Based Access Control:** Admins can manage users and their roles, while regular users have access to product management functionalities.
- **Dashboard Analytics:** Provides insights through graphical representations of product statistics, sales trends, etc.

## Technologies Used

### Backend

- Java
- Spring Boot
- Spring Security
- Hibernate
- MySQL

### Frontend

- React
- Redux
- Axios
- React Router
- Bootstrap

## Getting Started

### Prerequisites

- Node.js and npm installed
- Java Development Kit (JDK) 8 or higher
- MySQL installed and running

### Installation

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the backend directory and configure the database connection in `application.properties`.
3. Run `mvn spring-boot:run` to start the backend server.
4. Navigate to the frontend directory, install dependencies with `npm install`, and start the development server with `npm start`.

## Configuration

1. Update the API base URL in the frontend (`src/api/config.js`) to match your backend server.
2. Optionally, customize the authentication logic, roles, and permissions in the backend (`SecurityConfig.java`).

## Usage

1. Open the application in your browser.
2. Sign up as an admin or regular user.
3. Explore the dashboard, manage products, and view analytics.
4. Admins can also manage users and their roles.

## Accessing the Hosted Application

You can access the hosted version of this application [here](https://6631c40c4bcbfd7a44a85a48--cosmic-rabanadas-703af2.netlify.app/).

## API Endpoints

- `GET /api/products`: Get all products.
- `POST /api/products`: Create a new product.
- `GET /api/products/{id}`: Get a product by ID.
- `PUT /api/products/{id}`: Update a product by ID.
- `DELETE /api/products/{id}`: Delete a product by ID.
- Additional endpoints for user management, authentication, etc.

## Contributing

Contributions are welcome! Fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).


