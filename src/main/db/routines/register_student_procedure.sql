DELIMITER $$
DROP PROCEDURE IF EXISTS `register_student` $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `register_student`(IN `student_id` INT,IN `lecture_id` INT)
    SQL SECURITY INVOKER
    MODIFIES SQL DATA
BEGIN
    -- Check if removal date is on a winter or a spring term
    IF (MONTH(CURRENT_DATE) > 8) OR (MONTH(CURRENT_DATE) < 3) THEN
        -- Remove given lecture from the latest winter term enrollment
        DELETE FROM enroll WHERE (enroll.studen_id <=> student_id) AND (enroll.lecture_id <=> lecture_id) AND (enroll.term LIKE 'winter') AND (enroll.year <=> YEAR(CURRENT_DATE));
    ELSE
        -- Remove given lecture from the latest spring term enrollment
        DELETE FROM enroll WHERE (enroll.studen_id <=> student_id) AND (enroll.lecture_id <=> lecture_id) AND (enroll.term LIKE 'spring') AND (enroll.year <=> YEAR(CURRENT_DATE));
    END IF;
    
END $$
DELIMITER ;