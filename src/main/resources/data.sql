INSERT INTO CLIENT (NAME, SURNAME, PERSONALCODE, CREATED)
VALUES ('Jake', 'The JailBird', '123', CURRENT_TIMESTAMP());

INSERT INTO CLIENT (NAME, SURNAME, PERSONALCODE, CREATED)
VALUES ('Milburn', 'Pennybags', '456', CURRENT_TIMESTAMP());

INSERT INTO LOAN (CLIENT_ID, LOAN_SUM, INTEREST_RATE, MONTHLY_SUM, CREATED, DURATION)
VALUES(1, 1500, 5, 131.25, CURRENT_TIMESTAMP(), 12);

INSERT INTO LOAN (CLIENT_ID, LOAN_SUM, INTEREST_RATE, MONTHLY_SUM, CREATED, DURATION)
VALUES(1, 3000, 10, 150, CURRENT_TIMESTAMP(), 24);

INSERT INTO LOAN_EXTENSION (LOAN_ID, DURATION, INTEREST_RATE, CREATED)
VALUES (1, 16, 1.5, CURRENT_TIMESTAMP());














