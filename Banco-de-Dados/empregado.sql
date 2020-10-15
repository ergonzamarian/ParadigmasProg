create table Empregado (
	codEmpregado integer not null,
	pnome varchar (15) not null,
	snome varchar (15) not null,
	DataNasc varchar (10),
	sexo char (1),
	salario numeric (11,2),
	codDepartamento integer,
	codSupervisor integer,
	primary key (codEmpregado)
);

select * from Empregado;

insert into Empregado values(1,'Ergon','Zamarian','25/09/1996','M',15000,1,2)
insert into Empregado values(2,'Alex','Carneiro','25/09/1929','M',30000,1,2)
insert into Empregado values(3,'Thiago','Suzuqui','25/09/2000','M',100,1,3)
insert into Empregado values(4,'Gabriel','Macedo','25/09/1990','M',5600,5,3)
insert into Empregado values(5,'Kelvin','Klain','25/09/1970','M',20050,1,4)

update empregado set sexo = 'F' where codEmpregado = 3;
update empregado set codDepartamento=5,codsupervisor=5 where codEmpregado=5;
update empregado set snome='suzuqui motoca' where codEmpregado = 3;


select * from empregado where sexo ='F'

select * from empregado where salario >= 500

select codEmpregado,pnome,sexo from empregado where codSupervisor = 3