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


