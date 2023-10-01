CREATE TABLE product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    categoryId INT,
    price DECIMAL(10, 2),
    qty INT
);
