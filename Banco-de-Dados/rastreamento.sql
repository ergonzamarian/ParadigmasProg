create table rastreamento (
	idRastreio integer,
	equnr varchar(36),
	centro_custo varchar(36),
	dataEntrada varchar(12),
	localidade varchar(36),
	primary key (idRastreio)
	/*foreign key (equnr)*/
);

select * from rastreamento;