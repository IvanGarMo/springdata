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
CREATE TABLE customer (
	id int primary key,
    username varchar(200),
    email varchar(100),
    streetaddress varchar(100),
    city varchar(100),
    state varchar(100),
    zipcode varchar(5),
    country varchar(100)
)