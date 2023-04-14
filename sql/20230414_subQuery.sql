--2023.04.14
--sub query

--스칼라 부족질의 : select 절에 쓸수 있는 서브쿼리, 단일값(질의의 결과가 단일행 단일열)
SELECT
    deptno,
    (
        SELECT
            dname
        FROM
            dept
        WHERE
            dept.deptno = emp.deptno
    ) AS dname
FROM
    emp
WHERE
    ename = 'SCOTT';

SELECT
    o.custid,
    c.name,
    SUM(saleprice)
FROM
    orders   o,
    customer c
WHERE
    o.custid = c.custid
GROUP BY
    o.custid,
    c.name;

SELECT
    o.custid,
    (
        SELECT
            name
        FROM
            customer c
        WHERE
            c.custid = o.custid
    )              AS name,
    (
        SELECT
            sysdate
        FROM
            dual
    ),
    SUM(saleprice) custid
FROM
    orders o
GROUP BY
    o.custid;
    
    
--인라인 뷰 : from 절 뒤에 오는 서브쿼리, 가상의 테이블, 테이블처럼 사용

SELECT
    *
FROM
    (
        SELECT
            empno,
            ename,
            job,
            hiredate
        FROM
            emp
        WHERE
            deptno = 30
    )
WHERE
    ename = 'SCOTT';


--고객번호가 2이하인 고객들의 총 판매액
SELECT
    o.custid,
    SUM(saleprice) total
FROM
    (
        SELECT
            custid,
            name
        FROM
            customer
        WHERE
            custid <= 2
    )      c,
    orders o
WHERE
    c.custid = o.custid
GROUP BY
    o.custid;

SELECT
    ROWNUM,
    ename,
    hiredate
FROM
    emp
ORDER BY
    hiredate;

SELECT
    ROWNUM,
    ename,
    hiredate
FROM
    (
        SELECT
            ROWNUM,
            ename,
            hiredate
        FROM
            emp
        ORDER BY
            hiredate
    )
WHERE
    ROWNUM <= 3;
    
-- emp 테이블에서 최고 급여를 받는 사람 5명을 뽑아서 사원의 이름 급여 정보를 출력하세요.
SELECT
    ename,
    sal
FROM
    (
        SELECT
            sal,
            ename
        FROM
            emp
        ORDER BY
            sal DESC
    )
WHERE
    ROWNUM <= 5;

--비교 : 단일값이 아노는 서브쿼리를 사용
--평균급여보다 더 많은 급여를 받는 사원
SELECT --2074
    AVG(sal)
FROM
    emp;

SELECT
    *
FROM
    emp
WHERE
    sal > (
        SELECT
            AVG(sal)
        FROM
            emp
    );
    
    
--평균 주문금액 이하의
--주문에 대해서 
SELECT
    orderid,
    saleprice
FROM
    orders
WHERE
    saleprice <= (
        SELECT
            AVG(saleprice)
        FROM
            orders
    ); --평균 주문금액

SELECT
    AVG(saleprice)
FROM
    orders;


--각 고객의 평균 주문금액보다 큰 금액의
--주문 내역에 대해서
--주문번호, 고객번호, 금액을 보이시오.
SELECT
    custid,
    orderid,
    saleprice
FROM
    orders o1
WHERE
    saleprice > (
        SELECT
            AVG(saleprice)
        FROM
            orders o2
        WHERE
            o2.custid = o1.custid
    );
--group by custid, orderid, saleprice;

SELECT
    AVG(saleprice)
FROM
    orders;


--주어진 문제가 3000 이상 받는 사원이 소속된 부서(10번, 20번)와
--동일한 부서에서 근무하는 사원

SELECT
    *
FROM
    emp
WHERE
    sal >= 3000;

SELECT
    deptno
FROM
    emp
WHERE
    sal >= 3000;

SELECT
    *
FROM
    emp
WHERE
    deptno = 10
    OR deptno = 20;

SELECT
    *
FROM
    emp
WHERE
    deptno IN (
        SELECT DISTINCT
            deptno
        FROM
            emp
        WHERE
            sal >= 3000
    );

SELECT
    *
FROM
    emp
WHERE
    deptno IN (
        SELECT
            deptno
        FROM
            emp
        WHERE
            sal >= 3000
        GROUP BY
            deptno
    );

--대한민국에 거주하는 고객에게
--판매한 도서의 총 판매액을 구하시오.
--서브쿼리로
SELECT
    SUM(saleprice)
FROM
    orders
WHERE
    custid IN (
        SELECT
            custid
        FROM
            customer
        WHERE
            address LIKE '%대한민국%'
    );


--조인으로
SELECT
    SUM(saleprice)
FROM
         orders o
    JOIN customer c USING ( custid )
WHERE
    c.address LIKE '%대한민국%';


--대한민국에 거주하는 고객 번호
SELECT
    custid
FROM
    customer
WHERE
    address LIKE '%대한민국%';

SELECT
    custid
FROM
    customer
WHERE
    address NOT LIKE '%대한민국%';


--3번 고객이 주문한 도서의 최고 금액보다 더 비싼 도서를 구입한 주문의 주문번호와 금액을 보이시오. 
SELECT
    orderid,
    saleprice
FROM
    orders
WHERE
    saleprice > (
        SELECT
            MAX(saleprice)
        FROM
            orders
        WHERE
            custid = 3
    );

--all : 서브쿼리의 결과 데이터 모두와 비교해서 참일 때 => 참
SELECT
    orderid,
    saleprice
FROM
    orders
WHERE
    saleprice > ALL (
        SELECT
            saleprice
        FROM
            orders
        WHERE
            custid = 3
    );

--3번 고객이 주문한 최고 금액
SELECT
    MAX(saleprice)
FROM
    orders
WHERE
    custid = 3;


-- 부서번호가 30번인 사원들의 급여 중 가장 작은 값(950)보다 많은 급여를 받는 사원의 이름, 급여 출력
SELECT
    ename,
    sal
FROM
    emp
WHERE
    deptno = 30;

SELECT
    MIN(sal)
FROM
    emp
WHERE
    deptno = 30;

SELECT
    ename,
    sal
FROM
    emp
WHERE
    sal > ANY (
        SELECT
            sal
        FROM
            emp
        WHERE
            deptno = 30
    );
-- sal > 2850 or sal >1600 or sal >1250 or sal >1500 or sal >950


--exists, not exists
--상관관계가 반드시 필요한 서브쿼리가 조건의 결과로 사용된다. : select의 결과가 존재 하는지 여부에 따라 결과출력
--EXISTS 연산자로 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오. 
select
    sum ( saleprice ) FROM orders o WHERE EXISTS (
        SELECT
            *
        FROM
            customer c
        WHERE
                c.custid = o.custid
            AND address LIKE '%대한민국%'
    )



-- limit index, count  <- mysql에서 쓸때