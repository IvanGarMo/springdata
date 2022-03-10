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
create table bankaccount (accno int,lastname varchar(25),firstname varchar(25),bal int)
;
insert into bankaccount values(1,'obama','barack',5000)
;
insert into bankaccount values(2,'donald','trump',4000)
;
select * from bankaccount
;
