INSERT INTO customer (name, email, phone) VALUES ('John Doe', 'john@example.com', '1234567890');
-- Assuming it will get ID = 1

INSERT INTO orders (product, quantity, price, customer_id)
VALUES ('Keyboard', 3, 499.00, 1);
