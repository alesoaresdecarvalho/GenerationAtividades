drop database db_RegistroEscola;
CREATE DATABASE db_RegistroEscola;
USE db_RegistroEscola;

create table db_RegistroEscola(
id bigint auto_increment,
nome varchar(255),
matricula int,
turma varchar(255),
contato bigint,
nota float,

primary key (id)
);

insert into db_RegistroEscola(nome,matricula,turma,contato,nota) value("Katy ferreira santos", 1234, "3ºB", 11956789089, 8.7);
insert into db_RegistroEscola(nome,matricula,turma,contato,nota) value("Pedro rafael dos santos", 1277, "2ºA", 11987678567, 1.9);
insert into db_RegistroEscola(nome,matricula,turma,contato,nota) value("Joana pereira", 1298, "1ºB", 11978657785, 9.7);
insert into db_RegistroEscola(nome,matricula,turma,contato,nota) value("Nicolas souza dias", 1278, "4ºC", 1128786778, 9.5);
insert into db_RegistroEscola(nome,matricula,turma,contato,nota) value("Carlos souza dias", 1111, "8ºB", 1128786778, 6.1);
insert into db_RegistroEscola(nome,matricula,turma,contato,nota) value("Michelle soares silva", 1456, "9ºC", 1198786778, 5.4);
insert into db_RegistroEscola(nome,matricula,turma,contato,nota) value("Kelvin aparecido carvalho", 1235, "7ºC", 1125678987, 8.8);
insert into db_RegistroEscola(nome,matricula,turma,contato,nota) value("Lucas oliveira", 1347, "1ºC", 1128790987, 1.9);

select * from db_RegistroEscola;
select * from db_RegistroEscola where nota>7;
select * from db_RegistroEscola where nota<7;

update db_RegistroEscola set nota=9.5 where id=10;






