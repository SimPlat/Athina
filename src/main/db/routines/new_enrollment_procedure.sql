DELIMITER $$
DROP PROCEDURE IF EXISTS `new_enrollment_procedure` $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_enrollment_procedure`(IN `student_id` INT,IN `lecture_id` INT)
    SQL SECURITY INVOKER
    MODIFIES SQL DATA
BEGIN
    -- NO CHECKS ON THE AVAILABILITY OF THE LECTURES OR THE ECTS CAP!!!!!!!!!!
    INSERT INTO enroll values (student_id,lecture_id,CURRENT_DATE);

END $$
DELIMITER ;