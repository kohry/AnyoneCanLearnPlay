create database test;
use test;
show databases;
show tables;

create table member(
  mid int primary key auto_increment,
  userid varchar(20),
  password varchar(50),
  nickname varchar(50),
  email varchar(100),
  regdate date
);

desc member;

INSERT INTO member values(1,'john', '1234', 'johny', 'john@naver.com',20141205);
INSERT INTO member values(2, 'chulsoo', '123', 'cs', 'cs@naver.com',20141201);

SELECT * FROM member;