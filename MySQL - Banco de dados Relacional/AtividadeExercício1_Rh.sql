CREATE DATABASE db_EmpresaRh;
USE db_EmpresaRh;

CREATE TABLE db_EmpresaRh(
id bigint auto_increment,
nome varchar(255),
idade bigint,
cargo varchar(255),
cracha int,
salario decimal(8,2) not null,

primary key (id)
);

insert into db_EmpresaRh(nome,idade,cargo,cracha,salario) value("Maria", 30, "Enfermeira", 1, 5000.00);
insert into db_EmpresaRh(nome,idade,cargo,cracha,salario) value("Jonas", 50, "Enfermeiro", 2, 10000.00);
insert into db_EmpresaRh(nome,idade,cargo,cracha,salario) value("Lucas", 20, "Desenvolvedor", 3, 6000.00);
insert into db_EmpresaRh(nome,idade,cargo,cracha,salario) value("Paula", 26, "Atendente", 4, 1000.00);
insert into db_EmpresaRh(nome,idade,cargo,cracha,salario) value("Carolina", 29, "Radiologista", 5, 7000.00);

select * from db_EmpresaRh;
select * from db_EmpresaRh where salario>2000;
select * from db_EmpresaRh where salario<2000;

update db_EmpresaRh set salario =8000.00 where id=5;




