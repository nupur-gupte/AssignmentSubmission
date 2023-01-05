--databases are needed to store large volumes of data, multiple users can access and update data at same time, data stored in organized way, data search is quick and easy
--create table, primary key, foreign key
create table department(dept_name varchar(20), building	varchar(15), budget numeric(12,2) check (budget > 0),primary key (dept_name));
create table course(course_id varchar(8), title varchar(50), dept_name varchar(20),credits numeric(2,0) check (credits > 0),primary key (course_id),foreign key (dept_name) references department on delete set null);
insert into department values ('Biology', 'Watson', '90000');
insert into department values ('Comp. Sci.', 'Taylor', '100000');
insert into department values ('Elec. Eng.', 'Taylor', '85000');
insert into department values ('Finance', 'Painter', '120000');
insert into department values ('History', 'Painter', '50000');
insert into department values ('Music', 'Packard', '80000');
insert into department values ('Physics', 'Watson', '70000');
insert into course values ('BIO-101', 'Intro. to Biology', 'Biology', '4');
insert into course values ('BIO-301', 'Genetics', 'Biology', '4');
insert into course values ('BIO-399', 'Computational Biology', 'Biology', '3');
insert into course values ('CS-101', 'Intro. to Computer Science', 'Comp. Sci.', '4');
insert into course values ('CS-190', 'Game Design', 'Comp. Sci.', '4');
insert into course values ('CS-315', 'Robotics', 'Comp. Sci.', '3');
insert into course values ('CS-319', 'Image Processing', 'Comp. Sci.', '3');
insert into course values ('CS-347', 'Database System Concepts', 'Comp. Sci.', '3');
insert into course values ('EE-181', 'Intro. to Digital Systems', 'Elec. Eng.', '3');
insert into course values ('FIN-201', 'Investment Banking', 'Finance', '3');
insert into course values ('HIS-351', 'World History', 'History', '3');
insert into course values ('MU-199', 'Music Video Production', 'Music', '3');
insert into course values ('PHY-101', 'Physical Principles', 'Physics', '4');
select * from department;
select * from course;

--where clause
select * from department where building='Painter';
select * from course where dept_name='Biology';

--like and wildcards
select course_id,title from course where title like 'Intro.%';
select * from course where course_id like '%101';

--and or
select * from course where dept_name='Comp. Sci.' and credits=4;
select * from department where building='Watson' or budget>=100000;

--order by , selecting top rows
select * from department order by budget desc fetch first 5 row only;

--update
update department set budget=85000 where building='Packard';
select * from department order by building desc,budget desc;

--delete
delete from course where title='Robotics';
select * from course;

select * from course limit 3;
select * from course limit 4 offset 3;

select building, sum(budget) from department group by building;--Group by
select building, sum(budget) from department group by building having sum(budget)>100000;--group by and having

--select distinct
select distinct building from department;
--select into
select course_id,dept_name into table newcoursetable from course where credits=3;
select * from newcoursetable;

--alter table
alter table course rename column title to course_name;
select * from course;

--between
select * from department where budget between 70000 and 91000;
select * from course where dept_name in ('Music','History','Biology');

alter table course drop column credits;
alter table course add column credits int default 3;

