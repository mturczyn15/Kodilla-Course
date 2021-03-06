ALTER TABLE BOOKS ADD BESTSELLER BOOLEAN;

DROP FUNCTION IF EXISTS Bestseller;

DELIMITER $$

CREATE FUNCTION Bestseller(booksrented int, days int) RETURNS BOOLEAN DETERMINISTIC
BEGIN
	DECLARE result BOOLEAN DEFAULT FALSE;
	    IF booksrented / days  > 2 THEN
	SET result = TRUE;
	ELSE
	    SET result = FALSE;
	END IF;
	RETURN result;
END $$

DELIMITER ;

DROP PROCEDURE IF EXISTS UpdateBestsellers;

DELIMITER $$

CREATE PROCEDURE UpdateBestsellers()
BEGIN
    DECLARE BOOKSRENTED, BKS_ID, DAYS INT;
    DECLARE FINISHED INT DEFAULT 0;
    DECLARE ALL_BOOKS CURSOR FOR SELECT BOOK_ID FROM BOOKS;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET FINISHED = 1;
    OPEN ALL_BOOKS;
    WHILE (FINISHED = 0) DO
    FETCH ALL_BOOKS INTO BKS_ID;
        IF (FINISHED = 0) THEN
	    SELECT COUNT(*) FROM RENTS
             WHERE BOOK_ID = BKS_ID
              INTO BOOKSRENTED;
            SELECT DATEDIFF(MAX(RENT_DATE), MIN(RENT_DATE)) + 1 FROM RENTS
	     WHERE BOOK_ID = BKS_ID
	      INTO DAYS;
	    UPDATE BOOKS SET BESTSELLER = Bestseller(BOOKSRENTED, DAYS)
            WHERE BOOK_ID = BKS_ID;
	    COMMIT;
	END IF;
     END WHILE;
     CLOSE ALL_BOOKS;
     SELECT BOOKSRENTED, DAYS;
END $$

DELIMITER ;
