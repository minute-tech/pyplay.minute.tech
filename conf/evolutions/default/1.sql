# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table support_request (
  id                        bigint not null,
  title                     varchar(255),
  body                      varchar(255),
  difficulty                integer,
  constraint pk_support_request primary key (id))
;

create table technician (
  id                        bigint not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  constraint pk_technician primary key (id))
;

create table token (
  token                     varchar(255) not null,
  user_id                   bigint,
  type                      varchar(8),
  date_creation             timestamp,
  email                     varchar(255),
  constraint ck_token_type check (type in ('password','email')),
  constraint pk_token primary key (token))
;

create table user (
  id                        bigint not null,
  email                     varchar(255),
  fullname                  varchar(255),
  confirmation_token        varchar(255),
  password_hash             varchar(255),
  date_creation             timestamp,
  validated                 boolean,
  constraint uq_user_email unique (email),
  constraint uq_user_fullname unique (fullname),
  constraint pk_user primary key (id))
;

create sequence support_request_seq;

create sequence technician_seq;

create sequence token_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists support_request;

drop table if exists technician;

drop table if exists token;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists support_request_seq;

drop sequence if exists technician_seq;

drop sequence if exists token_seq;

drop sequence if exists user_seq;

