
--create database proyecto;
--Creación de la tabla escuela:
create table escuela (
	-- codigo varchar(55),
	codigo serial constraint pkescuela PRIMARY KEY,
	nombre varchar(50) not null,
	calle varchar(100) not  null,
	numero varchar (10) not null,
	colonia varchar (100) not null,
	CP integer not null,
	ciudad varchar(100) not null,
	estado varchar(100) not null
);

--Restricciones para la tabla escuela:
	create sequence codigoEscuela start 10000000;
	alter table escuela alter codigo set default nextval('codigoEscuela');
	--drop sequence codigoEscuela

--Creación de la tabla telEscuela:
create table telEscuela(
	codEsc integer references escuela (codigo) on update cascade on delete cascade,
	telefono varchar(20) not null,
	constraint pktelEscuela PRIMARY KEY (codEsc, telefono)
);

--Creación de la tabla correoEscuela:
create table correoEscuela(
	codEsc integer not null references escuela (codigo) on update cascade on delete cascade,
	correo varchar(100) not null,
	constraint pkcorreo PRIMARY KEY (codEsc, correo)
);

--Creación de la tabla persona:
create table persona(
	-- CURP char(16),
	CURP varchar(20) constraint pkpersona PRIMARY KEY,
	fecha_nac date not null,
	nombre varchar(50) not null,
	aPaterno varchar(100) not null,
	aMaterno varchar(100) not null,
	constraint fechaValida check (fecha_nac < now())
);


--Creación de la tabla pertenecer:

create table pertenecer(
	codEsc integer references escuela (codigo) on update cascade on delete cascade,
	curpPersona varchar(20) references persona (CURP) on update cascade on delete cascade,
	grado varchar(50) not null,
	tipo varchar(100) not null,
	constraint pkpertenecer PRIMARY KEY (codEsc, curpPersona)
);

--Creación de la tabla tipos(para boleto):
create table tipoBoleto(
	clave serial constraint pktipoBoleto PRIMARY KEY,
	descripcion varchar(255) not null
);

--Creación de la tabla boleto:
create table boleto(
	id serial constraint pkboleto PRIMARY KEY,
	tipo integer DEFAULT 0 references tipoBoleto (clave) on update cascade on delete cascade,
	curpPersona varchar(20) references persona (CURP) on update cascade on delete cascade,
	fecha date,
	precio float constraint precio_boleto check (precio > 0)
);
--Creación de una secuencia para id boleto:
create sequence id_boleto start 20000000;
alter table boleto alter id set default nextval('id_boleto');


--Creación de la tabla tipoVisita:
create table tipoVisita (
	id serial constraint pktipovisita PRIMARY KEY,
	descripcion varchar(255)
);
--Creación de la tabla reservacion:
create table reservacion(
	id serial constraint pkreservacion PRIMARY KEY,
	tipo integer references tipoVisita (id) on update cascade on delete cascade,
	fecha date default now()
);
--Creación de una secuencia para id reservacion:
create sequence id_reservacion start 30000000;
alter table reservacion alter id set default nextval('id_reservacion');

--Creación de la tabla asistentes
create table asistentes(
	idReser integer references reservacion(id) on update cascade on delete cascade,
	curpPersona varchar(20) references persona(CURP) on update cascade on delete cascade,
	constraint pkAsistentes PRIMARY KEY (idReser, curpPersona)
);

--Creación de la tabla realizar(persona-realizar-reservacion):
create table realizar(
	idReser integer references reservacion (id) on update cascade on delete cascade,
	curpPersona varchar(20) references persona (CURP) on update cascade on delete cascade,
	fecha date default now(),
	medio varchar(100) not null,
	constraint pkrealizar primary key (curpPersona, idReser)
);

--Creación de la tabla Parque:
create table parque (
	id serial constraint pkParque PRIMARY KEY,
	nombre varchar(50) not null,
	calle varchar(100) not null,
	num varchar(10) not null,
	colonia varchar(100) not null,
	CP integer not null,
	ciudad varchar(100) not null,
	estado varchar(100) not null
);

--Creación de la tabla correosParque:
create table correosParque(
	idParque int references parque (id) on update cascade on delete cascade,
	correo varchar(100) not null,
	constraint pkcorreoParque PRIMARY KEY (idParque, correo)
);

--Creación de la tabla telefonosParque:
create table telefonosParque(
	idParque int references parque (id) on update cascade on delete cascade,
	telefono varchar(100) not null, 
	constraint pktelefonosParque PRIMARY KEY (idParque, telefono)
);

--Creación de la tabla Habitat:
create table Habitat(
	id serial constraint pkhabitat PRIMARY KEY ,
	nombre varchar(100) not null,
	vegetacion varchar(150) not null,
	clima varchar(100) not null
);
--Creacion de una secuencia para id de habitat:
create sequence id_habitat start 10001;
alter table Habitat alter id set default nextval('id_habitat');

--Creación de la tabla Dinosaurio:
create table dinosaurio(
	id  serial constraint pkdino PRIMARY KEY,
	idHabitat integer  references habitat (id) on update cascade on delete cascade,
	alimentacion varchar(255) not null,
	reino varchar(100) not null,
	filo varchar(100) not null,
	clase varchar(100) not null,
	nombre varchar(100) not null
);

--Creación de la tabla requerimientos(dinosaurio):
create table requerimientosDino(
	idDino integer references dinosaurio (id) on update cascade on delete cascade,
	id serial not null,
	nombre varchar(100) not null,
	valor varchar(255) not null,
	constraint pkreqDino primary key (idDino, id)
);

--Creacion de la tabla caracteristicas(dinosaurio):

create table caracteristicasDino(
	idDino integer references dinosaurio (id) on update cascade on delete cascade,
	id serial not null,
	nombre varchar(100) not null,
	valor varchar(255) not null,
	constraint pkcaracDino primary key (idDino, id)
);

--Creación de la tabla Empleado:
create table empleado(
	RFC varchar(20) constraint pkempleado PRIMARY KEY,
	rfcSupervisor varchar(20) not null,
	nombre varchar(50) not null,
	aPaterno varchar(100) not null,
	aMaterno varchar(100) not null,
	fecha_nac date not null,
	calle varchar(100) not null,
	numero varchar(10) not null,
	colonia varchar(100) not null,
	ciudad  varchar(100) not null,
	estado varchar(100) not null,
	CP integer not null,
	cargo  varchar(100) not null
);

--creación de la tabla telefonosEmpleado:
create table telefonosEmpleado(
	rfcEmpleado  varchar(20) references empleado (RFC) on update cascade on delete cascade,
	telefono varchar(20) not null,
	constraint pktelEmpleado PRIMARY KEY (rfcEmpleado, telefono)
);

--Creación de la tabla correosEmpleado:
create table correosEmpleado(
	rfcEmpleado varchar(20) references empleado on update cascade on delete cascade,
	correo varchar(100) not null,
	constraint pkCorreoEmp Primary key (rfcEmpleado, correo)
);

--Creación de la tabla trabajar:
create table trabajar(
	idParque integer references parque (id) on update cascade on delete cascade,
	rfcEmpleado varchar(20) references empleado (RFC) on update cascade on delete cascade,
	sueldo float  constraint sueldo_trabajar check (sueldo > 0),
	diaDescanso varchar(15),
	constraint pktrabajar Primary key (idParque, rfcEmpleado)
);

--Creación de la tabla zona:
create table zona(
	id serial constraint pkzona primary key,
	idParque integer references parque (id) on update cascade on delete cascade,
	idDino integer references dinosaurio(id) on update cascade on delete cascade,
	rfcResponsable varchar(20) references empleado(rfc) on update cascade on delete cascade,
	rfcRespSeguridad varchar(20) references empleado(rfc) on update cascade on delete cascade,
	rfcRespLimpieza varchar(20) references empleado(rfc) on update cascade on delete cascade,
	superficie integer constraint superficie_zona check (superficie > 0),
	numEjem integer constraint numEjem_zona check (numEjem > 0)
);
--Creación de una secuencia para id zona:
create sequence id_zona start 0001;

--Creación de la tabla auxiliar(zona):
create table auxiliar(
	idZona integer references zona(id) on update cascade on delete cascade,
	rfcEmpleado varchar(20) references empleado(RFC) on update cascade on delete cascade,
	nombramiento varchar(255) not null,
	constraint pkauxiliar PRIMARY KEY(idZona, rfcEmpleado)
);

--Creación de la tabla visitar(reservacion-visitar-zona):
create table visitar(
	idReser integer references reservacion (id) on update cascade on delete cascade,
	idZona integer references zona (id) on update cascade on delete cascade,
	constraint pkvisitar PRIMARY KEY (idReser, idZona)
);

--Creación de la tabla vehículo:
create table vehiculo (
	id serial primary key id,
	idParque integer references parque (id) on update cascade on delete cacade,
	tipo varchar(255) not null,
	capacidad integer constraint capacidad_vehiculo check(capacidad > 0)
);

--creacion de una secuencia para id vehiculo:
create sequence id_vehiculo start 10001;
alter table vehiculo alter id set default nextval ('id_vehiculo');

--Creación de la tabla caractVehiculo:
create table caractVehiculo(
	idVehiculo integer references vehiculo (id) on update cascade on delete cascade,
	idCaract serial,
	caracteristica varchar(255) not null,
	constraint pkCarcVehiculo Primary key (idVehiculo, idCaract)
);
--creacion de una secuencia para la idCaract:
create sequence id_Caract start 2000;
alter table caractVehiculo alter idCaract set default nextval('id_Caract');
