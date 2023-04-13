--2023.04.13

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

--사원별 급여 등급 표현
select * from salgrade;

select * 
from emp e, salgrade s
where e.sal between s.losal and s.hisal;


-- self join : 자기 자신의 테이블을 조인하는 경우
SELECT e.ename, nvl(m.ename, '없음')
from emp e, emp m
WHERE e.mgr = m.empno;
-- 각 사원의 이름과 각 사원의 매니저 이름을 출력
--outer join : 조건에 만족하지 않는 행도 출력을 하는 join
SELECT e.ename, nvl(m.ename, '없음')
from emp e, emp m
WHERE e.mgr = m.empno(+);

--cross join
select *
from emp, dept;

select *
from emp CROSS join dept;

select *
from emp inner join dept
on emp.deptno = dept.deptno;

select *
from emp join dept
on emp.deptno = dept.deptno;

select *
from emp NATURAL join dept; --조인 조건을 생략할 수 있다.

select *
from emp join dept
using(deptno); --같은 이름의 컬럼이 필요하다.

select *
from emp e right outer join emp m
on e.mgr = m.empno;

-----------------------------------
