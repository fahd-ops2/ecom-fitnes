-- Insert into customers table
INSERT INTO customers (name, email, phone) VALUES
('John Doe', 'john@example.com', '1234567890'),
('Alice Smith', 'alice@example.com', '9876543210'),
('Bob Johnson', 'bob@example.com', '5555555555'),
('Emma White', 'emma@example.com', '1112223333'),
('Michael Brown', 'michael@example.com', '9998887777'),
('Sarah Davis', 'sarah@example.com', '4444444444'),
('David Wilson', 'david@example.com', '7777777777'),
('Jennifer Taylor', 'jennifer@example.com', '8888888888'),
('James Anderson', 'james@example.com', '6666666666'),
('Emily Martinez', 'emily@example.com', '2223334444');

-- Insert into categories table
INSERT INTO categories (name) VALUES
('Electronics'),
('Clothing'),
('Books'),
('Furniture'),
('Toys'),
('Sports'),
('Beauty'),
('Food'),
('Home Appliances'),
('Tools');

-- Insert into products table
INSERT INTO products (name, reference, description, price, category_id) VALUES
('Laptop', 'LT1001', 'High performance laptop', 1200.00, 1),
('T-shirt', 'TS2001', 'Cotton t-shirt', 25.00, 2),
('Programming Book', 'PB3001', 'Learn programming with this book', 35.00, 3),
('Sofa', 'SF4001', 'Comfortable sofa for your living room', 500.00, 4),
('Action Figure', 'AF5001', 'Collectible action figure', 15.00, 5),
('Football', 'FB6001', 'Official size and weight football', 20.00, 6),
('Shampoo', 'SH7001', 'Moisturizing shampoo', 10.00, 7),
('Bread', 'BR8001', 'Freshly baked bread', 3.00, 8),
('Refrigerator', 'RF9001', 'Large capacity refrigerator', 800.00, 9),
('Drill', 'DR10001', 'Powerful cordless drill', 100.00, 10);

-- Insert into providers table
INSERT INTO providers (name) VALUES
('TechSupply'),
('FashionWorld'),
('BookEmporium'),
('FurnitureMart'),
('ToyLand'),
('Sportify'),
('BeautyHaven'),
('FoodMarket'),
('ApplianceCenter'),
('ToolDepot');

-- Insert into stores table
INSERT INTO stores (name, address, provider_id) VALUES
('TechStore', '123 Main St', 1),
('Fashion Outlet', '456 Elm St', 2),
('Bookstore', '789 Oak St', 3),
('Furniture Palace', '101 Maple St', 4),
('Toy Store', '111 Pine St', 5),
('Sporting Goods', '222 Cedar St', 6),
('Beauty Store', '333 Walnut St', 7),
('Grocery Store', '444 Cherry St', 8),
('Appliance Store', '555 Spruce St', 9),
('Tool Shop', '666 Birch St', 10);

-- Insert into stocks table
INSERT INTO stocks (product_id, quantity, store_id) VALUES
(1, 20, 1),
(2, 50, 2),
(3, 30, 3),
(4, 10, 4),
(5, 40, 5),
(6, 60, 6),
(7, 25, 7),
(8, 100, 8),
(9, 15, 9),
(10, 5, 10);
