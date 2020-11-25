DELIMITER $$
DROP PROCEDURE IF EXISTS `show_enrollments_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `show_enrollments_procedure`(IN student_id INT) 
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    -- Fetch IDs and names of the enrolled lectures for the given student
    SELECT E.lecture_id,L.name FROM enroll E JOIN lecture L ON (L.id = E.lecture_id) WHERE (E.student_id <=> student_id);

END$$
DELIMITER ;