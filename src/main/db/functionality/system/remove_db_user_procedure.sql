DELIMITER $$
DROP PROCEDURE IF EXISTS `remove_db_user_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `remove_db_user_procedure`(IN `username` VARCHAR(7))
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
   -- Create user variables
   DECLARE `_HOST` CHAR(14) DEFAULT '@\'localhost\'';
   DECLARE db_username VARCHAR(9) DEFAULT NULL;

   -- Escape inputs, create and execute the create user query
   SET `db_username` = CONCAT('\'', REPLACE(TRIM(`username`), CHAR(39), CONCAT(CHAR(92), CHAR(39))), '\'');
   SET @`sql` = CONCAT('DROP USER IF EXISTS', `db_username`, `_HOST`);
   PREPARE `stmt` FROM @`sql`;
   EXECUTE `stmt`;
   DEALLOCATE PREPARE `stmt`;

END$$
DELIMITER ;

