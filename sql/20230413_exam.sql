--32. EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서 이름을 출력하시오.
select d.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno
and e.ename = 'SCOTT';

--33. INNER JOIN과 ON 연산자를 사용하여 사원 이름과 함께 그 사원이 소속된 부서이름과 지역 명을 출력하시오.
select e.ename, d.dname, d.loc
from emp e inner join dept d
on e.deptno = d.deptno;

--36. 조인과 WildCARD를 사용하여 이름에 ‘A’가 포함된 모든 사원의 이름과 부서명을 출력하시오.
select e.ename, d.dname
from emp e join dept d
using(deptno)
where e.ename like '%A%';

--37. JOIN을 이용하여 NEW YORK에 근무하는 모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.
select e.ename, e.job, deptno, d.dname, d.loc
from emp e join dept d
using(deptno)
where d.loc ='NEW YORK';

--select e.ename, e.job, e.deptno, d.dname, d.loc
--from emp e join dept d
--on e.deptno = d.deptno
--where d.loc ='NEW YORK';

--38. SELF JOIN을 사용하여 사원의 이름 및 사원번호, 관리자 이름을 출력하시오.
select e.ename, e.empno, m.mgr
from emp e join emp m
on e.mgr = m.empno;

--39. OUTER JOIN, SELF JOIN을 사용하여 관리자가 없는 사원을 포함하여 사원번호를 기준으로 내림차순 정렬하여 출력하시오.
select e.ename, e.empno, m.mgr
from emp e left outer join emp m
on e.mgr = m.empno
order by e.empno desc;

--42. SELF JOIN 을 사용하여 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 이름 및 입사일과 함께 출력하시오.
select e.ename as "사원 이름", e.hiredate as "사원 입사일", m.ename as "관리자 이름", m.hiredate as "관리자 입사일"
from emp e join emp m
on e.mgr = m.empno
where e.hiredate < m.hiredate;

