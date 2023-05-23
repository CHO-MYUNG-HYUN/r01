create table tbl_board (
                           bno INT,
                           title varchar(200) not null,
                           content varchar(2000) not null,
                           writer varchar(50) not null,
                           regdate date default (now()),
                           updatedate date default (now())
);
alter table tbl_board add constraint pk_board primary key (bno);

create table tbl_reply (
                           rno INT,
                           bno INT not null,
                           reply varchar(1000) not null,
                           replyer varchar(50) not null,
                           replyDate date default (now()),
                           updateDate date default (now())
);
alter table tbl_reply add constraint pk_reply primary key (rno);
alter table tbl_reply add constraint fk_reply_board foreign key (bno) references tbl_board (bno);

-- tbl_board SQL

-- select
select * from tbl_board;
select count(*) from tbl_board;

-- insert 
insert into tbl_board (title, content, writer) values ('게시글 테스트1', '게시물 쓰기테스트1', '테스터');
-- insert into tbl_board (title, content, writer) values (#{}, #{}, #{});
insert into tbl_board (title, content, memidx)
values( '게시글 테스트1', '글쓰기 테스트1', 1);
insert into tbl_board (title, content, memidx)
values( '게시글 테스트1', '글쓰기 테스트1', 5);

-- update
update tbl_board set title="test11", content="test22", writer="test33", file="aa.jgp" where bno=4;
-- update tbl_board set title="#{}", content="#{}", writer="#{}", file="#{}" where bno=#{};

-- delete



SELECT * FROM project.tbl_board order by bno desc limit 0,5; -- 1page (1-1) * 5 = 0
SELECT * FROM project.tbl_board order by bno desc limit 5,5; -- 2page (2-1) * 5 = 5
SELECT * FROM project.tbl_board order by bno desc limit 10,5; -- 3page (3-1) * 5 = 10
SELECT * FROM project.tbl_board order by bno desc limit 15,5; -- 4page (4-1) * 5 = 15

