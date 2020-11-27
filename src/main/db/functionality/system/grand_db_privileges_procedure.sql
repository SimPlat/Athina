DELIMITER $$
DROP PROCEDURE IF EXISTS `grand_db_privileges_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `grand_db_privileges_procedure`(IN username VARCHAR(20),
                                                                            IN `user_type` ENUM('student','secretary','professor','admin')) 
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN

    -- Assign privilege variables
    DECLARE `_HOST` CHAR(14) DEFAULT '@\'localhost\'';
    DECLARE db_username_host VARCHAR(25) DEFAULT username;

    SET db_username_host = CONCAT(username,`_HOST`);

    FLUSH PRIVILEGES;

    IF (user_type LIKE 'student') THEN
        -- Grand student access to global(2) and student specific(5) routines 
        SET @`sql` = CONCAT('GRANT EXECUTE ON FUNCTION Athina_db.login_function TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`; 
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.user_info_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.available_lectures_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.show_enrollments_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.current_enrollments_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.new_enrollment_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.remove_enrollment_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
    ELSEIF (user_type LIKE 'secretary') THEN
        -- Grand secretary access to global(2) and secretary specific(0) routines 
        SET @`sql` = CONCAT('GRANT EXECUTE ON FUNCTION Athina_db.login_function TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`; 
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.user_info_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
    ELSEIF (user_type LIKE 'professor') THEN
        -- Grand professor access to global(2) and professor specific(0) routines 
        SET @`sql` = CONCAT('GRANT EXECUTE ON FUNCTION Athina_db.login_function TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`; 
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.user_info_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
    ELSEIF (user_type LIKE 'admin') THEN
        -- Grand admin access to global(2) and admin specific(0) routines 
        SET @`sql` = CONCAT('GRANT EXECUTE ON FUNCTION Athina_db.login_function TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`; 
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.user_info_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
    END IF;
    
    DEALLOCATE PREPARE `stmt`;
    
    FLUSH PRIVILEGES;

END$$
DELIMITER ; 
