CREATE SCHEMA `mycompany` DEFAULT CHARACTER SET utf32 COLLATE utf32_bin ;


CREATE TABLE `mycompany`.`customers` (
                                         `ID` INT NOT NULL AUTO_INCREMENT,
                                         `FIRST_NAME` VARCHAR(60) NULL,
                                         `LAST_NAME` VARCHAR(60) NULL,
                                         PRIMARY KEY (`ID`));


CREATE TABLE `mycompany`.`products` (
                                        `ID` INT NOT NULL AUTO_INCREMENT,
                                        `PROD_NAME` VARCHAR(45) NULL,
                                        `PROD_Code` VARCHAR(45) NULL,
                                        PRIMARY KEY (`ID`));