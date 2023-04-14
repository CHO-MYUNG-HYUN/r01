--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.

--(5) 박지성이구매한도서의출판사수
SELECT
    COUNT(publisher)
FROM
    book b
WHERE
    bookid IN (
        SELECT
            bookid
        FROM
                 orders o
            JOIN customer c USING ( custid )
        WHERE
            name = '박지성'
    );


--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
SELECT
    bookname,
    b.price - p.saleprice AS pricegap
FROM
         book b
    JOIN (
        SELECT
            o.bookid,
            o.saleprice
        FROM
                 orders o
            JOIN customer c USING ( custid )
        WHERE
            name = '박지성'
    ) p USING ( bookid );
    

--(7) 박지성이구매하지않은도서의이름
SELECT
    bookname
FROM
    book
WHERE
    bookid NOT IN (
        SELECT
            o.bookid
        FROM
                 orders o
            JOIN customer c USING ( custid )
        WHERE
            name = '박지성'
    );


--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(8) 주문하지않은고객의이름(부속질의사용)
SELECT
    c.name
FROM
    customer c
WHERE
    c.custid NOT IN (
        SELECT
            custid
        FROM
            orders
    );


--(9) 주문금액의총액과주문의평균금액
SELECT
    SUM(saleprice) AS total,
    AVG(saleprice) AS avgsaleprice
FROM
    orders;
    

--(10) 고객의이름과고객별구매액 
SELECT
    c.name,
    SUM(o.saleprice)
FROM
         customer c
    JOIN orders o USING ( custid )
GROUP BY
    name;
    
    
--(11) 고객의이름과고객이구매한도서목록
SELECT
    c.name,
    b.bookname
FROM
         customer c
    JOIN orders o ON c.custid = o.custid
    JOIN book   b ON b.bookid = o.bookid;


--(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
SELECT
    *
FROM
         orders o
    JOIN book b USING ( bookid )
WHERE
    abs(b.price - o.saleprice) = (
        SELECT
            MAX(abs(b.price - o.saleprice))
        FROM
                 book b
            JOIN orders o USING ( bookid )
    );
    
    
--(13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름
SELECT
    name
FROM
         orders o
    JOIN customer c USING ( custid )
GROUP BY
    name
HAVING
    AVG(saleprice) > (
        SELECT
            AVG(saleprice)
        FROM
            orders
    );
    
    
--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
--(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
SELECT
    name
FROM
         orders o
    JOIN customer c USING ( custid )
    JOIN book     b USING ( bookid )
WHERE
        c.name != '박지성'
    AND b.publisher IN (
        SELECT
            publisher
        FROM
                 customer c
            JOIN orders o USING ( custid )
            JOIN book   b USING ( bookid )
        WHERE
            c.name = '박지성'
    );


--(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
SELECT
    name
FROM
         customer c
    JOIN orders o USING ( custid )
    JOIN book   b USING ( bookid )
GROUP BY
    name
HAVING
    COUNT(publisher) > 2;