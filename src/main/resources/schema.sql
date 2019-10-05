create table users(
	username varchar_ignorecase(50) not null primary key,
	password varchar_ignorecase(200) not null,
	enabled boolean not null
);

create table authorities (
	username varchar_ignorecase(50) not null,
	authority varchar_ignorecase(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);

create table personal(
	id INT NOT NULL primary key,
	dni varchar_ignorecase(200) not null,
	nombre varchar_ignorecase(200) not null,
	apellido varchar_ignorecase(200) not null
);
create table horario(
	id INT AUTO_INCREMENT primary key,
	horario varchar_ignorecase(200) not null,
	tolerancia INT,
	habiles INT,
	estado boolean
);
create table horario_detalle(
	id INT AUTO_INCREMENT primary key,
	id_horario varchar_ignorecase(200) not null,
	num_semana INT,
	dia_semana varchar_ignorecase(200),
	hora_ing varchar_ignorecase(5),
	hora_sal varchar_ignorecase(5)
);
create table movimiento(
	id INT AUTO_INCREMENT primary key,
	id_personal INT,
	id_motivo INT,
	fecha_inicio DATE,
	fecha_fin DATE,
	dias_utiles INT,
	obs varchar_ignorecase(200),
	estado boolean
);
create table justificacion(
	id INT AUTO_INCREMENT primary key,
	tipo INT,
	id_personal INT,
	id_motivo INT,
	fecha_justificada DATE,
	dias DOUBLE,
	id_movimiento INT
);