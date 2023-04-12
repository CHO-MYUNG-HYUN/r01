select 1234.567, round(1234.567), round(1234.567,1), round(1234.567,-1)
from dual;

select 'SCOTT', lower('SCOTT') FROM dual;

select * from emp where ename='scott';

select initcap('scoTT') from dual;

select '안녕하세요. 손흥민입니다.', 
        substr('안녕하세요. 손흥민입니다.', 5),
        subStr('안녕하세요. 손흥민입니다.',2,8)
from dual;

select length('안녕하세요.!!!!!') from dual;

select deptno, lpad(deptno, 5, '0') from dept;

select '     abc     '
        , trim('     abc     ')
        , trim('abc     ')
        , trim('   abc')
from dual;

select 'Steven King',
        replace('Steven King', 'Steven', 'S.'),
        replace('Steven King', 'e', ' ')
from dual;

select sysdate ,months_between('23/12/12', sysdate) from dual;
select add_months(sysdate, 8) from dual;
select next_day(sysdate, 5) from dual; --요일을 값 
select last_day(sysdate) from dual;
select round(sysdate) from dual;
select trunc(sysdate) from dual;

--변환함수
--DATE -> CHAR
--to_char(원본, '패턴')
select sysdate,
        to_char(sysdate, 'YYYY-MM-DD'),
        to_char(sysdate, 'YYYY.MM.DD') as day2,
        to_char(sysdate, 'YYYY-MM-DD DAY') as day3,
        to_char(sysdate, 'YYYY.MM.DD. HH24:MI:SS') as day7
from dual;

-- number -> char
select 123456789,
        to_char(123456789, '00000000000'),
        to_char(123456789, '000,000,000,000'),
        to_char(123456789, '999999999'),
        to_char(123456789, 'L99999999999')        
from dual;

select ename, sal, to_char(sal*1300,'L999,999,999') as 연봉
from emp;

--char->date
--to_date('문자열', '패턴')
 select *
 from emp
 where hiredate = to_date('1981.02.20', 'YYYY.MM.DD');
 
 insert into emp values(9999, 'SON', 'MANAGER', 7782, '2023-04-12', 4000, null, 10);
 select * from emp;
 rollback;
 
 select '20,000' - '10,000'
 from dual;
 
 select to_number('20,000', '999,999') - to_number('10,000', '999,999')
 from dual;
 
 --decode 함수 => = 비교 연산 후 결과 출력 하는 함수 switch-case
 select ename, deptno,
        decode(deptno,
                10, 'ACCOUNTING',
                20, 'RESEARCH',
                30, 'SALE',
                40, 'PERATIONS'
        ) as DNAME,
        case when deptno=10 then 'ACCOUNTING'
            when deptno=20 then 'RESEARCH'
            when deptno=30 then 'SALES'
            else 'OPERATIONS'
        end as dname2
 from emp
 order by DNAME;
 
 select empno, ename, job, sal,
        decode(job,
                'ANALYST', sal*1.05,
                'SALESMAN', sal*1.1,
                'MANAGER', sal*1.15,
                'CLERK', sal*1.2,
                sal
        )as UPSAL
from emp order by empno;

select sum(comm), count(comm)
from emp;
select comm from emp where comm is not null;

select avg(sal), trunc(avg(sal)), round(avg(sal))
from emp;

--최대 급여 max(), 최소급여 min()
select max(sal), min(sal)
from emp;

select distinct job
from emp
order by job;

select count(distinct job)
from emp;

select * from emp order by deptno;

select deptno, count(*)
from emp
group by deptno
order by deptno;

select deptno, 
        trunc(avg(sal)),
        sum(sal),
        max(sal),
        min(sal),
        count(comm)
from emp
group by deptno
--having avg(sal)>=2000
--having sum(sal) >10000
order by deptno;

select job, count(*)
from emp
group by job
;

