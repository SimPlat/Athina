DELIMITER $$
DROP PROCEDURE IF EXISTS `remove_student_procedure` $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `remove_student_procedure`(IN `student_id` varchar(5))
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    DECLARE uname varchar(7) DEFAULT NULL;

    -- Find students username
    SELECT username INTO uname FROM user WHERE (id <=> student_id);
    -- Remove student's db user
    CALL remove_db_user_procedure(uname);
    -- Remove student from the user table
    DELETE FROM user WHERE (id = student_id);
    
END $$
DELIMITER ;