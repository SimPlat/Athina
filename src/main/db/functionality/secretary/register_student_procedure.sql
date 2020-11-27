DELIMITER $$
DROP PROCEDURE IF EXISTS `register_student_procedure` $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `register_student_procedure`(IN `name` varchar(15),
                                                                         IN `surname` varchar(20),
                                                                         IN `phone` varchar(10),
                                                                         IN `adress` varchar(40))
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    -- Add new student on the user table
    INSERT INTO user values (DEFAULT,'student',NULL,NULL,name,surname,NULL,phone,adress);
    -- Create new student user on Athina_db
    CALL create_db_user_procedure('student');
    
END $$
DELIMITER ;