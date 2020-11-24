DELIMITER $$
DROP PROCEDURE IF EXISTS `register_student` $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `register_student`(IN `student_id` INT,IN `lecture_id` INT)
    SQL SECURITY INVOKER
    MODIFIES SQL DATA
BEGIN
END $$
DELIMITER ;