insert into users (username, password, enabled) values ('bob', '{noop}123', true);
insert into authorities (username, authority) values ('bob', 'ROLE_USER');

insert into users (username, password, enabled) values ('admin', '{noop}234', true);
insert into authorities (username, authority) values ('admin', 'ROLE_ADMIN');

insert into personal (id,dni,nombre,apellido) values (1, '44332211', 'LUIS ALBERTO', 'PAREDES ROSAS');
insert into personal (id,dni,nombre,apellido) values (2, '44332222', 'JOSE CARLOS', 'MOISES RIVAS');
insert into personal (id,dni,nombre,apellido) values (3, '44332233', 'PEDRO ANTONIO', 'LEYVA FERRERO');
insert into personal (id,dni,nombre,apellido) values (4, '44332244', 'JUAN PABLO', 'ACOSTA RUIZ');
insert into personal (id,dni,nombre,apellido) values (5, '44332255', 'FABIOLA BRIANA', 'ROJAS RIOS');
insert into personal (id,dni,nombre,apellido) values (6, '44332266', 'MARIA ESTHER', 'CACERES TAVARA');
-------------------------------------------HORARIO--------------------------------------------------
insert into horario(id,horario,tolerancia,habiles,estado) values(1,'Horario Oficina',10,22,true);
insert into horario(id,horario,tolerancia,habiles,estado) values(2,'Horario Operaciones',5,26,true);
insert into horario(id,horario,tolerancia,habiles,estado) values(3,'Horario Ejecutivo',15,22,true);
--------------------------------------------DETALLE HORARIO---------------------------------------------------
insert into horario_detalle(id,id_horario,num_semana,dia_semana,hora_ing,hora_sal) values(1,1,1,'Lunes','0900','1800');
insert into horario_detalle(id,id_horario,num_semana,dia_semana,hora_ing,hora_sal) values(2,1,2,'Martes','0900','1800');
insert into horario_detalle(id,id_horario,num_semana,dia_semana,hora_ing,hora_sal) values(3,1,3,'Miercoles','0900','1800');
insert into horario_detalle(id,id_horario,num_semana,dia_semana,hora_ing,hora_sal) values(4,1,4,'Jueves','0900','1800');
insert into horario_detalle(id,id_horario,num_semana,dia_semana,hora_ing,hora_sal) values(5,1,5,'Viernes','0900','1800');
---------------------------------------------PERSONAL HORARIO-------------------------------------------------
--insert into personal_horario(personal,horario,estado,vigencia) values(1,1,true,'2019-10-30');
--insert into personal_horario(personal,horario,estado,vigencia) values(2,1,true,'2019-10-30');
--insert into personal_horario(personal,horario,estado,vigencia) values(3,1,true,'2019-10-30');
--insert into personal_horario(personal,horario,estado,vigencia) values(4,1,true,'2019-10-30');
--insert into personal_horario(personal,horario,estado,vigencia) values(5,1,true,'2019-10-30');
--insert into personal_horario(personal,horario,estado,vigencia) values(6,1,true,'2019-10-30');--/
----------------------------------------------MOVIMIENTO-----------------------------------------------------------
insert into movimiento(id,id_personal,id_motivo,fecha_inicio,fecha_fin,dias_utiles,obs,estado)
                                                              values(1,1,1,'2019-10-30','2019-10-30',1,'OBS ACEPTADO',true);
insert into movimiento(id,id_personal,id_motivo,fecha_inicio,fecha_fin,dias_utiles,obs,estado)
                                                              values(2,2,1,'2019-10-30','2019-10-30',1,'OBS ACEPTADO',true);
insert into movimiento(id,id_personal,id_motivo,fecha_inicio,fecha_fin,dias_utiles,obs,estado)
                                                              values(3,3,2,'2019-11-10','2019-11-10',1,'OBS ACEPTADO',true);
-------------------------------------------------JUSTIFICACION--------------------------------------------------------
insert into justificacion(id,tipo,id_personal,id_motivo,fecha_justificada,dias,id_movimiento) values(1,1,6,1,'2019-10-30',1.5,1);
insert into justificacion(id,tipo,id_personal,id_motivo,fecha_justificada,dias,id_movimiento) values(2,1,4,1,'2019-10-25',2,2);
insert into justificacion(id,tipo,id_personal,id_motivo,fecha_justificada,dias,id_movimiento) values(3,1,2,1,'2019-10-28',2.5,3);