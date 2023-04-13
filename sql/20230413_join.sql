--2023.04.13

--
select *
from emp, dept 
where emp.deptno = dept.deptno
;

select e.empno, e.deptno, d.deptno
from emp e, dept d
where e.deptno=d.deptno;

select deptno
from emp
where ename = 'SCOTT';

select dname from dept where deptno = 20;

select *
from emp e, dept d
where e.deptno = d.deptno
and e.ename='SCOTT'
;