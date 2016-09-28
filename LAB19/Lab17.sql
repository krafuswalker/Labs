--#1 Go to workbench and select all customers form table
SELECT * FROM customers;
--#2 Select Distinct Countries
SELECT * FROM customers;
select distinct country_region
FROM customers;

--#3 Get all the records from the Customers where the customer's lastname starts with "B"
SELECT * FROM customers WHERE Last-Name LIKE 'B%'

--#4 Get First 100 records of the orders table
SELECT * FROM orders
LIMIT 100;

--#5 Get customers in a apecified zip code
--#5 SELECT * FROM Customers where zip_postal-code IN ('1010, '3012, '12209', '05023')
SELECT * FROM customers
WHERE zip_postal_code ='1010'
OR zip_postal_code = '3012';
OR zip_postal_code = '12209'
OR zip_postal_code = '05023';

--#6 Get all orders where the shipRegion is not equal to NULL
-- <> also means not equal
SELECT * FROM orders;
WHERE ship_country-region IS NOT NULL;
--#7 Get All the customers ordered by the Country then by the City
SELECT * FROM customers
Order by country_region, city;

--#8 Add A Customer to the Database
INSERT INTO  customers (id, company, last_name, first_name)
VALUES ('99', 'KWES', 'Walker', 'Krafus');

-->9 Update all ShipRegion to the value EuroZone in the Orders table
UPDATE orders
SET ship_zip_postal_code = '97201'
WHERE ship_city = 'Portland';
-->#9 Practice number 9
UPDATE orders
SET Ship-Country-Region = 'EuroZone'
WHERE Ship-Country = 'France';

-->10 Delete all orders from orders details that have a mquantity of 1
DELETE FROM order_details
WHERE quantity = 1;

-->11 Calculate the Avg Max and Min 
Select max(quantity), avg(quantity), min(quantity) from order_details; 

-->12 Calculate the Avg Max and Min grouped by orderID
Select max(quantity), avg(quantity), min(quantity) from order_details
Group by order_id;

-->13 Find Customer ID that placed order

Select customer-id FROM northwind.orders WHERE id = 65;
--->14 
SELECT * FROM Orders INNER JOIN Customers ON Customer_ID = Customers.ID;
SELECT * FROM Orders LEFT JOIN Customers ON Customer_ID = Customers.ID;
SELECT * FROM Orders RIGHT JOIN Customers ON Customer_ID = Customers.ID;
--> 15  NOT NULL
SELECT first_name FROM northwind.employees WHERE notes IS NULL


-->16   Employee firstname for all Employees who report to Francisco
SELECT Ship_city FROM Orders o INNER JOIN Customers c ON o.customer_id = c.id
WHERE first_name = "Francisco"