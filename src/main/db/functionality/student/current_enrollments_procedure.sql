DELIMITER $$
DROP PROCEDURE IF EXISTS `current_enrollments_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `current_enrollments_procedure`(IN student_id INT) 
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    -- Fetch IDs and names of the latest enrollment for the given student 
    IF (MONTH(CURRENT_DATE) > 8) OR (MONTH(CURRENT_DATE) < 3) THEN    
        SELECT E.lecture_id,L.name FROM enroll E JOIN lecture L ON (L.id = E.lecture_id) WHERE (E.student_id <=> student_id) AND (e.term_year <=> YEAR(CURRENT_DATE)) AND e.term LIKE 'winter';
    ELSE    
        SELECT E.lecture_id,L.name FROM enroll E JOIN lecture L ON (L.id = E.lecture_id) WHERE (E.student_id <=> student_id) AND (e.term_year <=> YEAR(CURRENT_DATE)) AND e.term LIKE 'spring';
    END IF;

END$$
DELIMITER ;