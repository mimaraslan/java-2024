-- VERITABANINI OLUSTURYORUZ
CREATE SCHEMA `my_company_db` DEFAULT CHARACTER SET utf32 COLLATE utf32_bin ;





--  MUSTERILER TABLOSU
CREATE TABLE `my_company_db`.`customers` (
                                             `ID` INT NOT NULL AUTO_INCREMENT,
                                             `FIRST_NAME` VARCHAR(60) NULL,
                                             `LAST_NAME` VARCHAR(60) NULL,
                                             PRIMARY KEY (`ID`));





-- URUNLER TABLOSU
CREATE TABLE `my_company_db`.`products` (
                                            `ID` INT NOT NULL AUTO_INCREMENT,
                                            `PROD_NAME` VARCHAR(200) NULL,
                                            `PROD_CODE` VARCHAR(45) NULL,
                                            PRIMARY KEY (`ID`));

-- TABLO UZERINDE DEGISIKLIK YAPAR
ALTER TABLE `my_company_db`.`products`
    CHANGE COLUMN `PROD_Code` `PROD_CODE` VARCHAR(45) NULL DEFAULT NULL ;

-- URUNLER TABLOLSUNU SILER
-- DROP TABLE `mycompany`.`products`;

-- VERITABINI SILER
-- DROP DATABASE `my_company_db`;



-- MUSTERI TABLOSUNA KAYITLAR EKLENDI
INSERT INTO `my_company_db`.`customers` (`FIRST_NAME`, `LAST_NAME`) VALUES ('Mahmut', 'Sakarya');
INSERT INTO `my_company_db`.`customers` (`FIRST_NAME`, `LAST_NAME`) VALUES ('Hakan', 'Metin');
INSERT INTO `my_company_db`.`customers` (`FIRST_NAME`, `LAST_NAME`) VALUES ('Mücahit', 'Özcan');

-- MUSTERILERI LISTELE GOSTER
SELECT * FROM `my_company_db`.`customers`;