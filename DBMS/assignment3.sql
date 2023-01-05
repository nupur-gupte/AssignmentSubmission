create table student(id int, name varchar(10),courses varchar(20));
insert into student values
(1,'Leo','c1,c2'),
(2,'Mia','c3'),
(3,'Sam','c2,c3');
select * from student;--Not in 1NF has multiple values per column

delete from student where courses='c1,c2';
insert into student values
(1,'Leo','c1'),
(1,'Leo','c2');

delete from student where courses='c2,c3';
insert into student values
(3,'Sam','c2'),
(3,'Sam','c3');

select * from student;--Satisfies 1NF

---------------------------------------------------------------------------------------------------------
drop table courseDetails;
drop table studCourseDet;
drop table courseFeeDet;
create table courseDetails(stud_no int,course_no varchar(5),fee int);
insert into courseDetails values
(1,'c1',1000),
(2,'c2',1500),
(1,'c4',2000),
(4,'c3',1000),
(4,'c1',1000),
(2,'c5',2000);
select * from courseDetails;
--many courses have same course fees, course fee alone cant decide course no or student no
--there is a partial dependency, so it is not in 2NF

select stud_no,course_no into table studCourseDet from courseDetails;
select * from studCourseDet;

select distinct course_no, fee into table courseFeeDet from courseDetails;
select * from courseFeeDet;

--now it is in 2NF

-----------------------------------------------------------------------------------------------
create table stud(stud_no int, stud_name varchar(10),stud_state varchar(15),stud_country varchar(15),stud_age int);
insert into stud values
(1,'ram','haryana','india',20),
(2,'ram','punjab','india',19),
(3,'suresh','punjab','india',21);
select * from stud;
--Not in 3NF, has transitive dependency, no -> state and state->country
select stud_no,stud_name,stud_age,stud_state into table stud_det from stud;
select * from stud_det;
select distinct stud_state, stud_country into table state_det from stud;
select * from state_det;
--Now in 3 NF