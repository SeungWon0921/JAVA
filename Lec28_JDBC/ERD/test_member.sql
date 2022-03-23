SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS test_member;




/* Create Tables */

CREATE TABLE test_member
(
	mb_no int,
	mb_name varchar(20),
	mb_birthdate datetime DEFAULT now()
);

SELECT * FROM test_member;

UPDATE test_member  SET mb_no = TRUNCATE(rand() * 10, 0); 



ALTER TABLE test_member 
MODIFY COLUMN mb_no INT AUTO_INCREMENT;

DELETE FROM test_member;

INSERT INTO test_member(mb_name) VALUES('백가영');