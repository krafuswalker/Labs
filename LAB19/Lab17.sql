--#1 Go to workbench and select all customers form table
SELECT * FROM customers;
--#2 Select Distinct Countries
SELECT * FROM customers;

select distinct country_region
FROM customers;
--#3 Get all the records from the Customers where the customer's lastname starts with "B"
SELECT * FROM customers
--#4 Get First 100 records of the orders table
SELECT * FROM orders
LIMIT 100;

--#5 Get customers in a apecified zip code
SELECT * FROM customers
WHERE zip_postal_code ='1010'
OR zip_postal_code = '3012';
OR zip_postal_code = '12209'
OR zip_postal_code = '05023';

--#6 Get all orders where the shipRegion is not equal to NULL
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
SELECT o.id, o.ship_name, od.order_id 
FROM orders o 
LEFT JOIN order_details od ON o.id = od.id
Select customer-id FROM northwind.orders WHERE id = 65;
--->14 

--> 15NULL
SELECT first-name FROM northwind.employees WHERE notes IS NOT NULL


-->16
SELECT first-name FROM northwind.employees WHERE report_to = Andrew