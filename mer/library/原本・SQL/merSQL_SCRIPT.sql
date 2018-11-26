
create sequence userNum
start with 1
nocache;

commit;

/**

menberテーブル

メンバーNO　…　シークエンスで管理する　N
ID　
名前
パスワード


**/
create table MENBER (
  userNum NUMBER(3) UNIQUE,
  userId VARCHAR2(20) PRIMARY KEY,
  userName VARCHAR(20) NOT NULL);

  commit;

  insert into MENBER values(userNum.nextval, 'yskn_sid25', 'kengo1225');
  commit;

  alter table menber add password VARCHAR2(100);

commit;

insert into menber values(userNum.nextval,'yskn_sid25','k_yoshida','kengo1225');
commit;

/**

Bookテーブル

本のID　…　シークエンスで管理する　N
本のタイトル N
本の著者 N
出版社 Y
出版年月日 Y
登録したユーザーの名前 N
登録年月日　N
借りているユーザーの名前 N
返却予定日 貸出日をDateクラスで取得し、そこから10日以内　N
返却済みフラグ 1=貸出中　0 || null = 在庫在り

**/

create sequence seq_bookId
start with 1
nocache;

create table book (
bookid NUMBER(5) primary key,
booktitle varchar2(50) NOT NULL,
author varchar2(15) not null,
publisher varchar2(15),
publishday varchar2(15),
runame varchar2(10) not null,
registday date not null,
buname varchar2(10)
);

alter table book add returnday date;
alter table book add returnFlg NUMBER(2);

/**

いいねテーブル

いいねした本のID
いいねしたユーザーのID
いいねカウントフラグ


**/

create table good(

  bookid NUMBER(5) not null,
  usernum NUMBER(3) not null,
  goodFlg NUMBER(1) not null

);
