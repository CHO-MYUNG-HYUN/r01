--2023.04.18
-- DDL exam

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
    fr_ref     NUMBER(7) REFERENCES phoneinfo_basic ( idx )
);

CREATE TABLE phoneinfo_com (
    idx          NUMBER(6) PRIMARY KEY,
    fr_c_company VARCHAR2(20) DEFAULT 'N' NOT NULL,
    fr_ref       NUMBER(6) REFERENCES phoneinfo_basic ( idx )
);