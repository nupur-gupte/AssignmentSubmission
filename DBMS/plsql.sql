--done in oracle live sql
create table rails(tid int primary key,name varchar(40) not null,fare int not null);

insert into rails values(101,'RAJDHANI EXPRESS',5060);

insert into rails values(102,'DURONTO EXPRESS',4500);

insert into rails values(103,'SHATABDI EXPRESS',3850);

insert into rails values(104,'GARIB RATH EXPRESS',1050);

insert into rails values(105,'VANDE BHARAT EXPRESS',6500);

insert into rails values(106,'TEJAS EXPRESS',6950);

insert into rails values(107,'GATIMAN EXPRESS',5010);

insert into rails values(108,'VIVEK EXPRESS',4250);

select * from rails;

CREATE OR REPLACE PROCEDURE changes(x IN INT,y IN INT) IS 
BEGIN 
update rails set fare=fare+y where tid=x; 
commit; 
END;
/

EXECUTE changes(104,-250)


EXECUTE changes(102,100)


select * from rails;

