/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  IvanGarMo
 * Created: 5 mar. 2022
 */
use jpa
;
DELIMITER //
CREATE PROCEDURE GetAllProducts()
BEGIN
	SELECT *  FROM product;
END //
DELIMITER //
CREATE PROCEDURE GetAllProductsByPrice(IN price_in decimal)
BEGIN
	SELECT *  FROM product where price>price_in;
END //
DELIMITER //
CREATE PROCEDURE GetAllProductsCountByPrice(IN price_in decimal)
BEGIN
	SELECT count(*)  FROM product where price>price_in;
END //

drop procedure GetAllProducts;
drop procedure GetAllProductsByPrice;
drop procedure GetAllProductsCountByPrice;
