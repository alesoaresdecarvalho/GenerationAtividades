create database db_farmacia_bem_estar;
USE db_farmacia_bem_estar;

create table tb_categorias(
id bigint auto_increment,
nome varchar(255),
descricao varchar(255),
primary key (id)
);

insert into tb_categorias(nome,descricao) value ("Medicamentos","Remédio melhora de saúde");
insert into tb_categorias(nome,descricao) value ("Alimentos","Comidas rápidas e facil consumo");
insert into tb_categorias(nome,descricao) value ("Cosméticos","Cuidados para o corpo");
insert into tb_categorias(nome,descricao) value ("Higiene","bem estar do corpo");
insert into tb_categorias(nome,descricao) value ("Equipamentos"," Fisioterapia");

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal (10,2),
tamanho varchar(255),
descrição text,
primary key (id)
);

insert into tb_produtos(nome,preco,tamanho,descrição) value ("Doril",10.00,"Pequeno","Remédio para dor de cabeça",1);
insert into tb_produtos(nome,preco,tamanho,descrição) value ("Fralda",50.00,"Grande","Higiene de crianças e adultos",4);
insert into tb_produtos(nome,preco,tamanho,descrição) value ("Shampoo",20.00,"Grande","Higiene pessoal para o cabelo",3);
insert into tb_produtos(nome,preco,tamanho,descrição) value ("Whey",100.00,"Grande","Produto para massa muscular",2);
insert into tb_produtos(nome,preco,tamanho,descrição) value ("Dipirona",15.00,"Pequeno","Remédio para dor de cabeça",1);
insert into tb_produtos(nome,preco,tamanho,descrição) value ("Chocolate",5.00,"Pequeno","Alimento rápido",2);
insert into tb_produtos(nome,preco,tamanho,descrição) value ("Xarope Vick",20.00,"Pequeno","Remédio para tosse");
insert into tb_produtos(nome,preco,tamanho,descrição) value ("Muleta",120.00,"Grande","Equipamento para fratura");

select * from tb_produtos;
select * from tb_produtos where preco>50.00;
select * from tb_produtos where preco between 5.00 and 60.00;
select * from tb_produtos where nome like "%c%";

alter table tb_produtos add categoria_id bigint;
alter table tb_produtos add constraint fk_produtos_categorias foreign key (categoria_id) references tb_categorias(id);

select nome,preco,tamanho,descrição,categoria_id from tb_produtos inner join tb_categorias on tb_categorias.id = tb_produtos.categoria_id;
select nome,preco,tamanho,descrição,categoria_id from tb_produtos inner join tb_categorias on tb_categorias.id = tb_produtos.categoria_id where categoria_id=4;

