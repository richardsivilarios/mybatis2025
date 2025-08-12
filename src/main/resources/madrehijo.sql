INSERT INTO familia.madremuchosamuchos(mci, am, ap, nombre) VALUES (1, 'martinez', 'lopez','julio');
INSERT INTO familia.madremuchosamuchos(mci, am, ap, nombre)	VALUES (2, 'fernandez', 'cardozo','roger');

INSERT INTO familia.hijomuchosamuchos(
	hci, am, ap, nombre)
	VALUES (1, 'gonzales', 'castillo', 'walter');
	INSERT INTO familia.hijomuchosamuchos(
hci , am , ap, nombre)
VALUES (2, 'iñiguez','galarza','rosii');
	
    INSERT INTO familia.familia_hijomuchosamuchos_madres(
	hijos_hci, madres_mci)
	VALUES (1,1 );
	INSERT INTO familia.familia_hijomuchosamuchos_madres(
	hijos_hci, madres_mci)
	VALUES (2,2 );