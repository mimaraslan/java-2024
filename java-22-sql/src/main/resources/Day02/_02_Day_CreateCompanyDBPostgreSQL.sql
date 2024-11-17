-- VERITABANI DB OLUSTURULDU
CREATE SCHEMA my_company_db
    AUTHORIZATION postgres;


-- MUSTERILER TABLOSU OLUSTURULDU
CREATE TABLE my_company_db.customers
(
    "ID" serial NOT NULL,
    "FIRST_NAME" character varying(60),
    "LAST_NAME" character varying(60),
    PRIMARY KEY ("ID")
);

ALTER TABLE IF EXISTS my_company_db.customers
    OWNER to postgres;


-- PRODUCT TABLOSU OLUSTURULDU
CREATE TABLE my_company_db.products
(
    "ID" bigserial NOT NULL,
    "PROD_NAME" character varying(200),
    "PROD_CODE" character varying(45),
    PRIMARY KEY ("ID")
);

ALTER TABLE IF EXISTS my_company_db.products
    OWNER to postgres;


-- MUSTERI TABLOSUNA KAYITLAR EKLENDI
INSERT INTO my_company_db.customers ("FIRST_NAME", "LAST_NAME") VALUES ('Mahmut', 'Sakarya');
INSERT INTO my_company_db.customers ("FIRST_NAME", "LAST_NAME") VALUES ('Hakan', 'Metin');
INSERT INTO my_company_db.customers ("FIRST_NAME", "LAST_NAME") VALUES ('Mücahit', 'Özcan');


-- MUSTERILERI LISTELE GOSTER
SELECT * FROM my_company_db.customers;


-- SADECE 1 KAYIT EKLE
INSERT INTO my_company_db.customers
("FIRST_NAME", "LAST_NAME")
VALUES ('Ahmet', 'Koray');

-- SADECE 1 KAYIT EKLE
INSERT INTO my_company_db.customers
("FIRST_NAME", "LAST_NAME")
VALUES('Barış', 'Cengiz');


-- MUSTERILERI LISTELE GOSTER
SELECT * FROM my_company_db.customers;


-- TABLOYA 2 TANE YENI KOLON EKLEDIK VE 3 KOLON UZERINDE DE DEGISIKLIK YAPTIK
ALTER TABLE IF EXISTS my_company_db.customers
    RENAME "ID" TO "CUSTOMER_ID";

ALTER TABLE my_company_db.customers
    ALTER COLUMN "FIRST_NAME" TYPE character varying(70) COLLATE pg_catalog."default";

ALTER TABLE my_company_db.customers
    ALTER COLUMN "LAST_NAME" TYPE character varying(75) COLLATE pg_catalog."default";

ALTER TABLE IF EXISTS my_company_db.customers
    ADD COLUMN "AGE" smallint;

ALTER TABLE IF EXISTS my_company_db.customers
    ADD COLUMN "COUNTRY" character varying(65);


-- MUSTERILERI LISTELE GOSTER
SELECT * FROM my_company_db.customers;



-- TABLODA YENI EKLENEN KOLONLARA DEGER GIRILDI
UPDATE my_company_db.customers SET "AGE" = '30', "COUNTRY" = 'TR' WHERE ("CUSTOMER_ID" = '1');
UPDATE my_company_db.customers SET "AGE" = '22', "COUNTRY" = 'BR' WHERE ("CUSTOMER_ID" = '2');
UPDATE my_company_db.customers SET "AGE" = '25', "COUNTRY" = 'DE' WHERE ("CUSTOMER_ID" = '3');
UPDATE my_company_db.customers SET "AGE" = '27', "COUNTRY" = 'GB' WHERE ("CUSTOMER_ID" = '4');
UPDATE my_company_db.customers SET "AGE" = '32', "COUNTRY" = 'TR' WHERE ("CUSTOMER_ID" = '5');

-- MUSTERILERI LISTELE GOSTER
SELECT * FROM my_company_db.customers;

-- MUSTERILERI LISTELE GOSTER
SELECT "FIRST_NAME", "LAST_NAME" FROM my_company_db.customers;


-- MUSTERILERI LISTELE GOSTER
SELECT "CUSTOMER_ID", "FIRST_NAME", "LAST_NAME" FROM my_company_db.customers;