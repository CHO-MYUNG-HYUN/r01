--2023.04.11
--select

--로그인 한 사용자가 소유하고 있는 테이블의 정보
select * from tab;

-- 테이블 정보 확인
desc emp;
desc dept;

--데이터 추출하는 질의어 : select
--select 컬럼이름, 컬럼이름... from 테이블이름(view사용가능)
--select * from 테이블이름;

select * from dept;
SELECT * FROM DEPT;

--특정 컬럼의 데이터만 검색
select dname,deptno, loc
from dept
;

-- select 구문의 프리젠테이션영역에 테이블이 가지는 컬럼 뿐 아니라 연산의 결과를 새로운 컬럼으로 출력.
select sal from emp;
select sal +100 from emp;
select sal *10 from emp;
select sal /10 from emp;

-- 사원테이블에서 사원의 이름과 급여, 연봉계산 결과를 출력. 
-- 연봉의 계산은 급여*12
select ename, sal, sal*12 as 연봉
from emp;

--상여금 계산 => sal*12+comm
select sal,comm, sal*12+comm from emp;
select sal,comm, nvl(comm,0), sal*12+nvl(comm,0) from emp;

--컬럼의 이름에 별칭 부여
--컬럼 뒤에 as 키워드를 쓰고 별칭을 작성
select sal,comm, nvl(comm,0), sal*12+nvl(comm,0)as "yearSal" from emp;

--문자열의 연산 문자열을 붙여준다 : 문자열 || 문자열
select ename || ' is a ' ||  job
from emp;

--select [distinct] from...
select deptno from emp;
select distinct deptno from emp;
select job from emp;
select distinct job from emp;

select * from emp where sal >= 3000;

select *
from emp
where deptno = 10
;

select *
from emp
where ename  = 'FORD'
;

select *
from emp
where hiredate > '81/12/03'
;

select * from emp where deptno=10 or job = 'MANAGER';
select * from emp where deptno=20 or deptno=30 or deptno=40;
select * from emp where not deptno=10;
select * from emp where deptno<>10;
select * from emp where deptno!=10;
select * from emp where sal >= 2000 and sal<=3000;
select * from emp where sal between 2000 and 3000;
select * from emp where hiredate between '87/01/01' and '87/12/31';
select * from emp where deptno in (10,20,30);
select * from emp where ename like '%A%';
select * from emp where comm > 0 and comm is not null;

select * from emp order by sal asc;
select * from emp order by sal desc;