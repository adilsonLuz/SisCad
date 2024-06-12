CREATE DATABASE sisCadRubensAlves;

CREATE USER 'admin'@'%' IDENTIFIED BY '123';

GRANT ALL ON *.* TO 'admin'@'%' WITH GRANT OPTION;

flush privileges;

USE sisCadRubensAlves;

/*TABELA MUNICIPES*/
CREATE TABLE tb_municipes (
id int auto_increment primary key,
nome varchar(100),
rg varchar(12),
cpf varchar(14),
email varchar (25),
celular varchar (15),
cep varchar (9),
endereco varchar (200),
numero int,
bairro varchar (50),
complemento varchar (30),
cidade varchar (50),
estado varchar (2)
);

CREATE TABLE tb_votacao (
id int auto_increment primary key,
data datetime,
zona int,
secao int,
colegio varchar (100),
for_id int,
FOREIGN KEY (for_id) REFERENCES tb_municipes (id)
);