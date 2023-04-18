--2023.04.18
--DML

--INSERT : 데이터를 행 단위로 입력

--테스트 테이블 생성
CREATE TABLE dept01 (
    deptno NUMBER(2)
        CONSTRAINT pk_dept01_deptno PRIMARY KEY,
    dname  VARCHAR2(10) NOT NULL,
    loc    VARCHAR2(10)
);

desc dept01;


--insert into 테이블이름 (컬럼, 컬럼, ...) values (데이터, 데이터, ...)
INSERT INTO dept01 (
    deptno,
    dname,
    loc
) VALUES (
    10,
    'test',
    'test-loc'
);

SELECT
    *
FROM
    dept01;

INSERT INTO dept01 (
    loc,
    dname,
    deptno
) VALUES (
    '서울',
    '개발팀',
    20
);

INSERT INTO dept01 (
    deptno,
    dname,
    loc
) VALUES (
    30,
    '서울',
    'memo'
);


--서브쿼리를 이용한 데이터 입력
CREATE TABLE dept02
    AS
        SELECT
            *
        FROM
            dept
        WHERE
            1 = 0;

desc dept02;

INSERT INTO dept02
    SELECT
        *
    FROM
        dept;
        

--update : 행단위 컬럼들의 데이터를 변경 -> 해당 컬럼의 값을 입력/ 수정/ 삭제
--update 테이블이이름 set 컬럼1=새로운값, 컬럼2=새로운값, ... where
--10번 부서의 이름을 디자인팀 으로 변경하고, 위치정보를 판교로 수정하ㅏㅈ.
UPDATE dept01
SET
    dname = '디자인',
    loc = '판교'
WHERE
    deptno = 10;

SELECT
    *
FROM
    dept01;

DROP TABLE dept02;

CREATE TABLE dept02
    AS
        SELECT
            *
        FROM
            dept;

DROP TABLE emp01;

CREATE TABLE emp01
    AS
        SELECT
            *
        FROM
            emp;

--모든 사원의 부서번호를 30번으로 수정합시다.
UPDATE emp01
SET
    deptno = 30;

--모든 사원의 급여를 10% 인상시키는 update
UPDATE emp01
SET
    sal = sal * 1.1;

SELECT
    *
FROM
    emp01;
    
--87년에 입사한 사람의 입사일을 오늘로 바꾸기.
UPDATE emp01
SET
    hiredate = sysdate
WHERE
    substr(hiredate, 1, 2) = 87;
    
    
--SCOTT 사원의 부서번호는 20번으로, 직급은 MANAGER로 한꺼번에 수정하도록 합시다
update emp01
set 
    deptno = 20,
    job = 'MANAGER'
where 
    ename = 'SCOTT';
    
    
update dept02
set (dname, loc) = (select dname, loc from dept02 where deptno=30)
where deptno = 20;

select * from dept02;