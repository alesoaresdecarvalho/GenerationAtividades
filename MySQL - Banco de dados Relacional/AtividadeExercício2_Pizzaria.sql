CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_pizzas(
id bigint auto_increment,
nomes varchar(255),
sabores varchar(255) not null,
preco decimal (4,2),
tamanhos varchar(255),
primary key (id)
);

insert into tb_pizzas(nomes, sabores, preco, tamanhos,id_categoria) value ("Morango","MorangoComChocolate", 25.00,"Grande",1);
insert into tb_pizzas(nomes, sabores, preco, tamanhos,id_categoria) value ("Calabresa", "CalabresaCebolaOregano", 15.00,"Pequena",2);
insert into tb_pizzas(nomes, sabores, preco, tamanhos,id_categoria) value ("Queijo", "QueijoMussarelaCheddar", 100.00,"Grande",3);
insert into tb_pizzas(nomes, sabores, preco, tamanhos,id_categoria) value ("Carne", "CarneMoídaMussarelaCebola", 30.00,"Grande",4);
insert into tb_pizzas(nomes, sabores, preco, tamanhos,id_categoria) value ("QueijoBranco","QueijoOreganoTomate", 17.00,"Pequena",2);
insert into tb_pizzas(nomes, sabores, preco, tamanhos,id_categoria) value ("Chocolover","ChocolateAOLeiteMorango", 50.00,"Grande",5);
insert into tb_pizzas(nomes, sabores, preco, tamanhos,id_categoria) value ("RomeuEJulieta","QueijoMussarelaEGoiabada", 35.00,"Grande",1);
insert into tb_pizzas(nomes, sabores, preco, tamanhos,id_categoria) value ("Lombo","CalabresaMoídaEQueijo", 40.00,"Grande",2);

select * from tb_pizzas;
select * from tb_pizzas where preco> 40.00;
select * from tb_pizzas where preco between 50.00 and 100.00;
select * from tb_pizzas where sabores like "%M%";


create table tb_categorias(
id bigint auto_increment,
borda varchar(255),
adicional varchar(255),
primary key (id)
);

insert into tb_categorias(borda,adicional) value ("Chocolate", "Morango");
insert into tb_categorias(borda,adicional) value ("Queijo", "Bacon");
insert into tb_categorias(borda,adicional) value ("Cheddar", "Champignon");
insert into tb_categorias(borda,adicional) value ("CreamCheese", "ovo");
insert into tb_categorias(borda,adicional) value ("ChocolateBranco", "uva");

alter table tb_pizzas add id_categoria bigint;
alter table tb_pizzas add constraint fk_pizzas_categoria foreign key (id_categoria) references tb_pizzas(id);

select nomes,sabores,preco,tamanhos,categoria_id from tb_pizzas inner join tb_categorias on tb_categorias.id = tb_pizzas.id_categoria;

select nomes,sabores,preco,tamanhos,categoria_id from tb_pizzas inner join tb_categorias on tb_categorias.id = tb_pizzas.id_categoria where id_categoria=1;











