create table tbl_todo (

	tno int auto_increment primary key,
	title varchar(500) not null,
	content varchar(1000) not null,
	writer varchar(100) not null,
	complete tinyint default 0,
	dueDate date

)
;
create table tbl_reply (

	rno int auto_increment primary key,
	tno int not null,
	reply varchar(1000) not null,
	replyer varchar(100) not null,
	replyDate timestamp default now()
)
;
select count(*) from tbl_reply;

insert into tbl_reply (tno,reply,replyer)
(
select 
tno, 
concat('Reply...',tno) reply,
concat ('user', mod(tno,10)) replyer
from tbl_todo order by tno desc limit 50, 100
)
;
insert into tbl_reply (tno,reply,replyer)
(select tno,reply, replyer from tbl_reply);

select * from tbl_reply
where tno>0 and rno >0
order by tno desc, rno asc;

create index idx_reply1 on tbl_reply (tno desc, rno asc);

##1376224
select count(rno) from tbl_reply where tno = 1376224 order by rno asc;

select tt.tno,tt.title,tt.writer, count(re.rno)
from tbl_todo tt left outer join tbl_reply re
on re.tno = tt.tno
group by tt.tno 
order by tt.tno desc
limit 0,10
;


alter table tbl_todo add column (replycnt int default 0);

select * from tbl_todo order by tno desc ;

update tbl_todo set replycnt = 
(select count(rno) from tbl_reply re where re.tno = tbl_todo.tno )
where tno > 0;

select * from tbl_todo;

insert into tbl_todo (title, content, writer, dueDate)
values ('Title', 'Content', 'user', '2023-06-30')
;

select count(*) from tbl_todo;

insert into tbl_todo (title, content, writer, dueDate)
select title, content, writer, duedate from tbl_todo
;

update tbl_todo
	set 
		title = concat(title, tno),
		content = concat(content, tno),
		writer = concat(writer, mod(tno,100)),
		duedate = DATE_ADD(dueDate, interval mod(tno,100) day)
where tno <= 1000
;

select * from tbl_todo 
where writer = 'user96'
order by tno  desc;


create index idx_writer on tbl_todo (writer asc);

create index idx_writer2 on tbl_todo (writer asc, tno desc);

select * from tbl_todo 
where
	content like '%12345%'
	and tno > 0
order by tno desc
limit 10,20	
;
