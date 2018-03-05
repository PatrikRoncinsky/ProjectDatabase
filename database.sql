CREATE database parking;
use parking;


CREATE TABLE Car( 
    id INT PRIMARY KEY AUTO_INCREMENT,
	SPZ VARCHAR,
);


CREATE TABLE Park( 
    id INT PRIMARY KEY AUTO_INCREMENT, 
	Name VARCHAR,
	Price INT, 
	Capacity INT,
	FOREIGN KEY (idu) REFERENCES Car(id)  ON DELETE CASCADE,
);

