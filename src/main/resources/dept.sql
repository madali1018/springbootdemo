create table dept(
    id int primary key auto_increment,#部门编号 整形 主键 自增长
    name varchar(18),#部门名称
    description varchar(100)#描述
 );

--
select * from dept;

show tables;

INSERT INTO dept(name,description) VALUES("部门1","部门1--------");

