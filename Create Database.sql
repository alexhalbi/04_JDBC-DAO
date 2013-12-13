SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
CREATE SCHEMA IF NOT EXISTS `schuldatenbank` DEFAULT CHARACTER SET latin1 ;
USE `mydb` ;
USE `schuldatenbank` ;

-- -----------------------------------------------------
-- Table `schuldatenbank`.`g_gegenstaende`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `schuldatenbank`.`g_gegenstaende` (
  `g_id` CHAR(4) NOT NULL ,
  `g_bez` VARCHAR(50) NOT NULL ,
  PRIMARY KEY (`g_id`) ,
  UNIQUE INDEX `g_id` (`g_id` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `schuldatenbank`.`k_klassen`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `schuldatenbank`.`k_klassen` (
  `k_id` CHAR(4) NOT NULL ,
  `k_bez` VARCHAR(50) NOT NULL ,
  `k_s_klassensprecher` INT(10) NOT NULL ,
  `k_s_klassensprecherstv` INT(10) NOT NULL ,
  `k_l_kvorstand` CHAR(2) NOT NULL ,
  PRIMARY KEY (`k_id`) ,
  UNIQUE INDEX `k_id` (`k_id` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `schuldatenbank`.`l_lehrer`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `schuldatenbank`.`l_lehrer` (
  `l_id` CHAR(2) NOT NULL ,
  `l_nachname` VARCHAR(45) NOT NULL ,
  `l_vorname` VARCHAR(45) NOT NULL ,
  `l_gebdat` DATE NOT NULL ,
  `l_gehalt` INT(11) NOT NULL ,
  `l_v_vorgesetzte` CHAR(2) NOT NULL ,
  PRIMARY KEY (`l_id`) ,
  UNIQUE INDEX `l_id` (`l_id` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `schuldatenbank`.`p_pruefungen`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `schuldatenbank`.`p_pruefungen` (
  `p_s_schueler` INT(10) NOT NULL ,
  `p_datum` DATE NOT NULL ,
  `p_l_lehrer` CHAR(2) NOT NULL ,
  `p_g_gegenstand` CHAR(4) NOT NULL ,
  `p_field` VARCHAR(3) NOT NULL ,
  `p_note` INT(1) NOT NULL ,
  PRIMARY KEY (`p_s_schueler`, `p_g_gegenstand`, `p_datum`, `p_l_lehrer`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `schuldatenbank`.`r_raeume`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `schuldatenbank`.`r_raeume` (
  `r_id` CHAR(3) NOT NULL ,
  `r_anzahl` INT(10) NOT NULL ,
  PRIMARY KEY (`r_id`) ,
  UNIQUE INDEX `r_id` (`r_id` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `schuldatenbank`.`s_schueler`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `schuldatenbank`.`s_schueler` (
  `s_id` INT(10) NOT NULL ,
  `s_nachname` VARCHAR(45) NOT NULL ,
  `s_vorname` VARCHAR(45) NOT NULL ,
  `s_gebdat` DATE NOT NULL ,
  `s_ort` VARCHAR(100) NOT NULL ,
  `s_k_klasse` CHAR(4) NOT NULL ,
  PRIMARY KEY (`s_id`) ,
  UNIQUE INDEX `s_id` (`s_id` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `schuldatenbank`.`st_stunden`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `schuldatenbank`.`st_stunden` (
  `st_k_klasse` CHAR(4) NOT NULL ,
  `st_l_lehrer` CHAR(3) NOT NULL ,
  `st_g_gegenstand` CHAR(4) NOT NULL ,
  `st_zeit` CHAR(3) NOT NULL ,
  `st_r_raum` CHAR(3) NOT NULL ,
  PRIMARY KEY (`st_k_klasse`, `st_zeit`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `schuldatenbank`.`v_vorgesetzte`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `schuldatenbank`.`v_vorgesetzte` (
  `v_id` CHAR(2) NOT NULL ,
  `v_bez` VARCHAR(45) NOT NULL ,
  `v_l_chef` CHAR(2) NOT NULL ,
  PRIMARY KEY (`v_id`, `v_l_chef`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (1,'Adler','Richard','1966-03-12','Gumpendorf','03TA');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (4,'Kneippp','Sebastian','1967-12-24','Fuenfhaus','03TA');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (16,'Geyer','Anton','1966-07-23','Simmering','03TA');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (19,'Sitzenbleiber','Eusebius','1951-02-22','Schweiz','03TA');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (22,'Huber','Seppl','1968-02-02','Margareten','03TA');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (55,'Schulz','Xandl','1964-09-03','Doebling','03TB');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (74,'Hundertwasser','Friederike','1961-02-02','Landstrasse','03TA');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (77,'Berger','Balduin','1964-03-13','Favoriten','03TB');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (84,'Feuerstein','Bebbles','1966-06-12','Steintal','03TB');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (88,'Mayer','Barbara','1965-05-03','Ottakring','03TB');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (111,'Sandler','Eberhard','1959-04-19','Hoechststaettpl','03TB');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (122,'Graf','Bobby','1962-01-01','Doebling','03TA');
INSERT INTO `s_schueler` (`s_id`,`s_nachname`,`s_vorname`,`s_gebdat`,`s_ort`,`s_k_klasse`) VALUES (1266,'Schlager','Ronnie','1963-04-23','Ottakring','03TB');
