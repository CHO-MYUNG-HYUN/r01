
--DEPT MANAGER

--1. List
select * from dept;

--2. Search
select * from dept where deptno = 10;
--select * from dept where deptno = ?;
select * from dept where ? like '%?%';

--3. Insert
insert into dept values (50, 'Test', 'Seoul');
--insert into dept values (?,?,?);
rollback;

--4. update
update dept set dname='AAAA', loc = 'BBBB' where deptno = 60;
--update dept set dname=?, loc = ? where deptno = ?;

--5. delete
delete from dept where deptno = 60;
--delete from dept where deptno = ?;

commit;