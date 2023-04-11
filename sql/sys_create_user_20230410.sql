
--2023.04.10
--주석

--사용자 생성

alter session set "_ORACLE_SCRIPT"=true;

--0. 도구 -> 환경설정 -> 환경 -> 인코딩 UTF-8;
--1. 다른사용자 -> 팝업메뉴 -> 사용자 생성;
--2. 계정이름 c##himedia -> C## 생략을 위해서는 
--  alter session set "_ORACLE_SCRIPT"=true; 를 실행;
--3. 권한 부여 : CONNECTION, RESOURCE, DBA;