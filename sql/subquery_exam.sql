--서브쿼리 문제
--43. 사원 번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오.
SELECT
    ename,
    job
FROM
    emp
WHERE
    job = (
        SELECT
            job
        FROM
            emp
        WHERE
            empno = 7788
    );


--44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 감당 업무
SELECT
    ename,
    job
FROM
    emp
WHERE
    sal > (
        SELECT
            sal
        FROM
            emp
        WHERE
            empno = 7499
    );


--45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)
SELECT
    ename,
    job,
    sal
FROM
    emp
WHERE
    sal = (
        SELECT
            MIN(sal)
        FROM
            emp
    );


--46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
SELECT
    job,
    AVG(sal)
FROM
    emp
GROUP BY
    job
HAVING
    AVG(sal) = (
        SELECT
            MIN(AVG(sal))
        FROM
            emp
        GROUP BY
            job
    );


--47. 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.
SELECT
    ename,
    sal,
    deptno
FROM
    emp e,
    (
        SELECT
            MIN(sal) AS minsal
        FROM
            emp
        GROUP BY
            deptno
    )   ms
WHERE
    e.sal = ms.minsal;

  
--48. 담당업무가 ANALYST 인 사원보다 급여가 적으면서 업무가 ANALYST가 아닌 사원들을 
--표시(사원번호, 이름, 담당 업무, 급여)하시오.  
SELECT
    empno,
    ename,
    job,
    sal
FROM
    emp
WHERE
    sal < ALL (
        SELECT
            sal
        FROM
            emp
        WHERE
            job = 'ANALYST'
    )
    AND job != 'ANALYST';


--49. 부하직원이 없는 사원의 이름을 표시하시오.
--나의 사원번호가 다른 사원의 mgr에 있다면 =>나는 관리자, 부하직원이 있다.
--나의 사원번호가 다른 사원의 mgr에 없다면 =>부하직원이 없다!

SELECT DISTINCT
    mgr
FROM
    emp
WHERE
    mgr IS NOT NULL;

SELECT
    ename
FROM
    emp
WHERE
    empno NOT IN (
        SELECT DISTINCT
            mgr
        FROM
            emp
        WHERE
            mgr IS NOT NULL
    );


--50. 부하직원이 있는 사원의 이름을 표시하시오.
SELECT
    ename
FROM
    emp
WHERE
    empno IN (
        SELECT DISTINCT
            mgr
        FROM
            emp
        WHERE
            mgr IS NOT NULL
    );

--51. BLAKE와 동일한 부서에 속한 사원의 이름과 입사일을 표시하는 질의를 작성하시오. ( 단 BLAKE는 제외 )
SELECT
    ename,
    hiredate
FROM
    emp
WHERE
        ename != 'BLAKE'
    AND deptno = (
        SELECT
            deptno
        FROM
            emp
        WHERE
            ename = 'BLAKE'
    );
    

--52. 급여가 평균 급여보다 많은 사원들의 사원 번호와 이름을 표시하되 결과를 급여에 대해서 오름차순으로 정렬하시오.
SELECT
    empno,
    ename
FROM
    emp
WHERE
    sal > (
        SELECT
            AVG(sal)
        FROM
            emp
    )
ORDER BY
    sal;
    
    
--53. 이름에 K가 포함된 사원과 같은 부서에서 일하는 사원의 사원 번호와 이름을 표시하시오.
SELECT
    empno,
    ename
FROM
    emp
WHERE
    deptno IN (
        SELECT
            deptno
        FROM
            emp
        WHERE
            ename LIKE '%K%'
    );


--54. 부서위치가 DALLAS인 사원의 이름과 부서번호 및 담당업무를 표시하시오.
SELECT
    ename,
    deptno,
    job
FROM
    emp
WHERE
    deptno = (
        SELECT
            deptno
        FROM
            dept
        WHERE
            loc = 'DALLAS'
    );
    
    
--55. KING에게 보고하는 사원의 이름과 급여를 표시하시오.
-- emp => mgr(상사) => 사원의 mgr 컬럼이 KING사원의 사원번호 인 경우.
SELECT
    ename,
    sal
FROM
    emp
WHERE
    mgr = (
        SELECT
            empno
        FROM
            emp
        WHERE
            ename = 'KING'
    );

SELECT
    e1.ename,
    e1.sal
FROM
    emp e1,
    emp e2
WHERE
        e2.ename = 'KING'
    AND e1.mgr = e2.empno;
    
    
--56. RESEARCH 부서의 사원에 대한 부서번호, 사원이름 및 담당 업무를 표시하시오.
select deptno, ename, job
from emp where deptno = 
(select deptno from dept where dname = 'RESEARCH');

select deptno, e.ename, e.job
from emp e join dept d using(deptno)
where d.dname = 'RESEARCH';


--57. 평균 월급보다 많은 급여를 받고  이름에 M이 포함된 사원과 같은 부서에서 
--근무하는 사원의 사원 번호, 이름, 급여를 표시하시오.
select empno, ename, sal
from emp where sal > (select avg(sal) from emp)
and deptno in (select deptno from emp where ename like '%M%');


--58. 평균급여가 가장 적은 업무를 찾으시오. 46번 문제랑 동일


--59. 담당업무가 MANAGER 인 사원이 소속된 부서와 동일한 부서의 사원을 표시하시오.
select ename from emp
where deptno in (select deptno from emp where job = 'MANAGER');