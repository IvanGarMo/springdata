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
create table if not exists product(
id int PRIMARY KEY,
name varchar(20),
description varchar(100),
price decimal(8,3) 
);
create table customer(
	id INT PRIMARY KEY,
    username VARCHAR(200),
    email VARCHAR(100)
);
