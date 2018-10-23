# proyecto
create table if not exists propietario(
	rutProp int unsigned not null primary key,
    nombreP varchar(30),
    telefono varchar(20),
    direccion varchar(40)
) engine=InnoDB;

create table if not exists veterinario(
	rutVet int unsigned not null primary key,
    nombreV varchar(30),
    direccion varchar(40),
    especialidad varchar (20),
    telefono varchar(20)
) engine=InnoDB;

create table if not exists registro(
	fechaConsulta date,
    hora time,
    descripcion varchar(500),
    numero int(5) REFERENCES bitacora(numero)
) engine=InnoDB;

create table if not exists bitacora( /*se supone falta atributo*/
	numero int(5) unsigned auto_increment not null primary key,
    idPaciente int(5) references paciente(idPaciente)
) engine=InnoDB;

create table if not exists paciente(
	idPaciente int(5) unsigned auto_increment not null primary key,
    nombre varchar(20),
    raza varchar(20) not null,
    especie varchar (20) not null,
    fechaNac date,
    sexo varchar(6) not null, /*hembra o macho*/
    esterilizado varchar(2) ,/*si o no*/
    pelaje varchar(20) not null,
    microchip varchar(2), /*si o no*/
    alergias varchar (30),
    rutProp int references propietario(rutProp)
) engine=InnoDB;
