-- Primero insertar pasaportes (tabla referenciada)
INSERT INTO dominio.pasaporte2 (id, numero, pais_emision) VALUES 
(1, 'P12345', 'Chile'),
(2, 'P67890', 'Argentina'),
(3, 'P54321', 'Perú'),
(4, 'P11111', 'Colombia'),
(5, 'P22222', 'Ecuador');

-- Luego insertar personas (tabla que contiene la FK)
INSERT INTO dominio.persona2 (id, nombre, dni, pasaporte_id) VALUES 
(1, 'Ana Torres', '12345678A', 1),
(2, 'Luis Pérez', '87654321B', 2),
(3, 'Marta Silva', '11223344C', 3),
(4, 'Carlos Ruiz', '99887766D', 4),
(5, 'Laura Gómez', '44556677E', 5);