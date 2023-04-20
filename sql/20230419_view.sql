--2023.04.19
--VIEW : 가상 테이블
--view 객체는 sql을 가진다. => sql 실행결과를 가상의 테이블로 사용한다.

SELECT
    empno,
    ename,
    deptno
FROM
    emp
WHERE
    deptno = 30;
    

--view 객체 생성
--create or replace view 뷰이름 as 서브쿼리
CREATE OR REPLACE VIEW emp_view30 AS
    SELECT
        empno,
        ename,
        deptno
    FROM
        emp
    WHERE
        deptno = 30;

SELECT
    *
FROM
    emp_view30;


--주문 정보
SELECT
    o.orderid,
    c.name,
    b.bookname,
    b.price,
    o.saleprice,
    o.orderdate,
    c.phone
FROM
    orders   o,
    book     b,
    customer c
WHERE
        o.bookid = b.bookid
    AND o.custid = c.custid;
    
--VIEW 생성 --수정시 create문을 실행.
CREATE OR REPLACE VIEW orderinfo AS
    SELECT
        o.orderid,
        c.name,
        b.bookname,
        b.price,
        o.saleprice,
        o.orderdate,
        c.phone
    FROM
        orders   o,
        book     b,
        customer c
    WHERE
            o.bookid = b.bookid
        AND o.custid = c.custid;

SELECT
    bookname
FROM
    orderinfo;

SELECT
    view_name,
    text
FROM
    user_views;

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
    ROWNUM <= 3
ORDER BY
    hiredate;

CREATE OR REPLACE VIEW emp_hiredate_view AS
    SELECT
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
    emp_hiredate_view
WHERE
    ROWNUM <= 3;
    
--select to_char(hiredate, 'YYYY MM DD') from emp;
--select * from emp;
--update emp set hiredate = to_date('1987/07/13', 'YYYY/MM/DD') where ename = 'SCOTT';