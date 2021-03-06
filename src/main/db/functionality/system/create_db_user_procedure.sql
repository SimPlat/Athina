DELIMITER $$
DROP PROCEDURE IF EXISTS `create_db_user_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_db_user_procedure`(IN `user_type` 
                                                                           ENUM('student','secretary','professor','admin')) 
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    DECLARE ai_id INT(5) default NULL;
    -- Create user variables
    DECLARE `_HOST` CHAR(14) DEFAULT '@\'localhost\'';
    DECLARE db_username VARCHAR(20) DEFAULT NULL;
    DECLARE db_password VARCHAR(20) DEFAULT NULL; 
    -- Username/user password variables
    DECLARE username VARCHAR(20) DEFAULT NULL;
    DECLARE password VARCHAR(20) DEFAULT NULL;

    FLUSH PRIVILEGES;

    -- Get the next auto increment value for table user
    SELECT auto_increment INTO ai_id FROM information_schema.tables
    WHERE table_name = 'user' AND table_schema = 'Athina_db';
    
    SET @ai_id = ai_id - 1;

    -- Build the username/user password based on the autoincremented value which is about to be used as the user ID
    SET username = CONCAT(SUBSTRING(user_type,1,2),LPAD(@ai_id,5,0)),
        password = CONCAT(LPAD(@ai_id,5,0),SUBSTRING(user_type,1,2));

    -- Escape inputs, create and execute the create user query
    SET `db_username` = CONCAT('\'', REPLACE(TRIM(`username`), CHAR(39), CONCAT(CHAR(92), CHAR(39))), '\''),
        `db_password` = CONCAT('\'', REPLACE(`password`, CHAR(39), CONCAT(CHAR(92), CHAR(39))), '\'');
    SET @`sql` = CONCAT('CREATE USER ', `db_username`, `_HOST`, ' IDENTIFIED BY ', `db_password`);
    PREPARE `stmt` FROM @`sql`;
    EXECUTE `stmt`;
    DEALLOCATE PREPARE `stmt`;

    FLUSH PRIVILEGES;
    
END$$
DELIMITER ;

