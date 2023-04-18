--2023.04.18
-- DDL exam

drop table phoneinfo_basic;
drop table phoneinfo_univ;
drop table phoneinfo_com;


CREATE TABLE phoneinfo_basic (
    idx            NUMBER(6) PRIMARY KEY,
    fr_name        VARCHAR2(20) NOT NULL,
    fr_phonenumber VARCHAR2(20) NOT NULL,
    fr_email       VARCHAR2(20),
    fr_address     VARCHAR2(20),
    fr_regdate     DATE DEFAULT sysdate
);

CREATE TABLE phoneinfo_univ (
    idx        NUMBER(6) PRIMARY KEY,
    fr_u_major VARCHAR2(20) DEFAULT 'N' NOT NULL,
    fr_u_year  NUMBER(1) DEFAULT 1 NOT NULL CHECK ( fr_u_year BETWEEN 1 AND 4 ),
    fr_ref     NUMBER(7) not null REFERENCES phoneinfo_basic ( idx )
);

CREATE TABLE phoneinfo_com (
    idx          NUMBER(6) PRIMARY KEY,
    fr_c_company VARCHAR2(20) DEFAULT 'N' NOT NULL,
    fr_ref       NUMBER(6) not null REFERENCES phoneinfo_basic ( idx )
);

select * from phoneinfo_basic;
select * from phoneinfo_univ;
select * from phoneinfo_com;

delete from phoneinfo_basic where idx = 2;

insert into phoneinfo_basic 
values (1, '가나다', '010~~~', '네이버', '서울시', sysdate-10);

insert into phoneinfo_univ
values (1, '기계공학', 3, 1);


insert into phoneinfo_com
values (1, 'Y', 1);

desc phoneinfo_com;