select * from empregado;

create table usuario (
	id integer,
	login varchar(8),
	senha varchar(8),
	primary key (id)
);

select * from usuario

insert into usuario values (1,'ra123456','654321')
update usuario set senha = '12125454' where id=1

insert into empregado values (6,'Teste','da Silva','10/03/1900','M',62598,2,5)
insert into empregado values (6,'Alexsandro','Monteiro','10/03/1950','M',15264,1,3)

delete from empregado where codEmpregado = '8'