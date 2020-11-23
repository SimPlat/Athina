DELIMITER $$
DROP PROCEDURE IF EXISTS `available_lectures_procedure` $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `available_lectures_procedure`(IN `student_id` INT)
    SQL SECURITY INVOKER 
    MODIFIES SQL DATA 
BEGIN

IF (MONTH(CURRENT_DATE) > 8) OR (MONTH(CURRENT_DATE) < 3) THEN                                  -- Detect Fall semester.
    SELECT lecture.lecture_id FROM(
        SELECT id as lecture_id from lecture  WHERE (semester % 2 = 1)) lecture                     -- Select all fall semester lectures as lecture.
    LEFT JOIN(
        SELECT lecture_id from exam WHERE (student_id<=>student_id) AND (grade >= 5)) passed        -- Select all passed fall lectures of the given student.
    ON (lecture.lecture_id = passed.lecture_id) WHERE passed.lecture_id IS NULL;                    -- Remove passed from the lecture set.
ELSE                                                                                            -- Detect Spring semester.
    SELECT lecture.lecture_id FROM(                                                                 
        SELECT id as lecture_id from lecture  WHERE (semester % 2 = 0)) lecture                     -- Select all spring semester lectures as lecture. 
    LEFT JOIN(
        SELECT lecture_id from exam WHERE (student_id<=>student_id) AND (grade >= 5)) passed        -- Select all passed spring lectures of the given student.
    ON (lecture.lecture_id = passed.lecture_id) WHERE passed.lecture_id IS NULL;                    -- Remove passed from the lecture set.
END IF;

END$$
DELIMITER ;