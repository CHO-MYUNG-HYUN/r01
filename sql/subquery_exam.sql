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
GROUP BY
    ename,
    job,
    sal
HAVING
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
select empno, ename, job, sal
from emp
where sal < (select distinct sal from emp where job = 'ANALYST')
and job != 'ANALYST';


--49. 부하직원이 없는 사원의 이름을 표시하시오.
--select *--e1.ename
--from emp e1, emp e2
--where e1.empno = e2.mgr
--and e.mgr=;

