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
create table payment(
id int PRIMARY KEY,
amount decimal(8,3)
)
;
create table card(
id int ,
cardnumber varchar(20),
 FOREIGN KEY (id)
REFERENCES payment(id)
)
;
create table bankcheck(
id int ,
checknumber varchar(20),
FOREIGN KEY (id)
REFERENCES payment(id)
)
