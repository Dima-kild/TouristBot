drop database if exists thelper;

create database thelper
    character set `utf8`;

use thelper;
create table city
(
    id        integer primary key not null auto_increment,
    name varchar(24)         not null unique,
    info varchar (512)
);




