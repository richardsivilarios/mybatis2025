INSERT INTO usuario (id,username, last_name, first_name, email_id, password, role) VALUES 
(1,'admin', 'Admin', 'Super', 'admin@example.com', '123456', 'ADMIN'),
(2,'user1', 'Doe', 'John', 'john@example.com', '123456', 'USER'),
(3,'user2', 'Smith', 'Jane', 'jane@example.com', '123456', 'USER'),
(4,'user3', 'White', 'Walter', 'walter@example.com', '123456', 'USER'),
(5,'user4', 'Brown', 'Charlie', 'charlie@example.com', '123456', 'USER');


/**uno a uno **/
/** persona pasaporte **/
INSERT INTO pasaporte (id, numero, pais_emision) 
VALUES 
(1, 'P12345678', 'España'),
(2, 'P87654321', 'México'),
(3, 'P11223344', 'Argentina');

INSERT INTO persona (id, nombre, dni, pasaporte_id) 
VALUES 
(1, 'Juan Pérez', '12345678A', 1),
(2, 'María García', '87654321B', 2),
(3, 'Carlos López', '11223344C', 3);

/**uno a muchos **/
/**departamento tiene muchos empleados **/
INSERT INTO departamento (id, nombre) VALUES 
(1, 'Ventas'),
(2, 'TI'),
(3, 'Recursos Humanos');

INSERT INTO empleado 
(id, nombre, puesto, departamento_id) 
VALUES 
(1, 'Ana Martínez', 'Vendedor', 1),
(2, 'Luis Fernández', 'Vendedor', 1),
(3, 'Pedro Gómez', 'Desarrollador', 2),
(4, 'Sofía Ramírez', 'DBA', 2),
(5, 'Elena Díaz', 'Reclutador', 3);

/**muchos a muchos sin atributos **/
/**Estudiante y Curso **/
INSERT INTO estudiante (id, nombre, matricula) VALUES 
(1, 'Laura Sánchez', 'MAT001'),
(2, 'Jorge Castro', 'MAT002'),
(3, 'Mónica Vázquez', 'MAT003');

INSERT INTO curso (id, nombre, codigo) VALUES 
(1, 'Matemáticas', 'MATH101'),
(2, 'Programación', 'PROG201'),
(3, 'Bases de Datos', 'DB301');

INSERT INTO estudiante_cursos 
(estudiantes_id, cursos_id) VALUES 
(1, 1), 
(1, 2),
(2, 2), 
(2, 3),
(3, 1), 
(3, 3);
