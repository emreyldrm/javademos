--Select
--ANSII
SELECT ContactName Adi,CustomerName Musteriadi,City Sehir FROM Customers

SELECT * from Customers where City = "London"
--case insensitive
sElECt * from Products
SELECT * FROM Products where categoryId=1
SELECT * FROM Products where categoryId=1 or categoryId=3
SELECT * FROM Products where categoryId=1 and Price>=10
SELECT * FROM Products ORDER BY ProductName
SELECT * FROM Products ORDER BY CategoryID,ProductName
SELECT * FROM Products ORDER BY Price
SELECT * FROM Products ORDER BY Price asc --ascending
SELECT * FROM Products ORDER BY Price desc --descending
SELECT * FROM Products where categoryID=1 ORDER BY Price desc --descending
Select count(*) from Products
Select count(*) from Products where CategoryId=2
Select count(*) Adet from Products where CategoryId=2
Select CategoryId from Products group by CategoryId
Select CategoryId, count(*) Adet from Products group by CategoryId
Select CategoryId, count(*) from Products group by CategoryId having count(*)<10
Select CategoryId, count(*) from Products where Price>20 group by CategoryId having count(*)<10
Select Products.ProductId, Products.ProductName, Products.Price, Categories.CategoryName from Products inner join Categories on Products.CategoryId = Categories.CategoryId
--DTO Data Tranformation Object
Select Products.ProductId, Products.ProductName, Products.Price, Categories.CategoryName from Products inner join Categories on Products.CategoryId = Categories.CategoryId where Products.Price>10
Select * from Products p inner join OrderDetails od on p.ProductId = od.ProductID
Select * from Products p left join OrderDetails od on p.ProductId = od.ProductID
Select * from Customers c left join Orders o on c.CustomerID = o.CustomerID
Select * from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null
Select * from Products p inner join OrderDetails od on p.ProductId = od.ProductID inner join Orders o on o.OrderID = od.OrderID