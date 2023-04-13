-- 테이블 추가
CREATE table salgrade(
grade NUMBER,
losal NUMBER,
hisal NUMBER
);
INSERT into salgrade VALUES (1, 700, 1200);
INSERT into salgrade VALUES (2, 1201, 1400);
INSERT into salgrade VALUES (3, 1401, 2000);
INSERT into salgrade VALUES (4, 2001, 3000);
INSERT into salgrade VALUES (5, 3001, 9999);
COMMIT;