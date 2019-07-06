DROP TABLE IF EXISTS use;
create table use
(
   id integer not null,
   phone varchar(255) not null,
   name varchar(255) not null,
   pin integer,
   location varchar(255) not null,
   primary key(id)
);