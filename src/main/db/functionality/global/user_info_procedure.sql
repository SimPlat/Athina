DELIMITER $$
DROP PROCEDURE IF EXISTS `user_info_procedure` $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `user_info_procedure`(IN `user_id` INT,IN `user_type` ENUM('student','secretary','professor','admin'))
    SQL SECURITY DEFINER
    CONTAINS SQL DATA
BEGIN
    IF (user_type LIKE 'student') AND (user_id IN (SELECT id FROM student)) THEN                    -- If user is student append the student specific info
        SELECT user.*,student.ects FROM user JOIN student ON (user.id = student.id) WHERE (student.id <=> user_id);
    ELSEIF (user_type LIKE 'secretary') AND (user_id IN (SELECT id FROM secretary)) THEN            -- Nothing to append for user secretary ATM 
        SELECT * FROM user WHERE (user.id <=> user_id);                                         
    ELSEIF (user_type like 'professor') AND (user_id IN (SELECT id FROM professor)) THEN            -- Nothing to append for user professor ATM 
        SELECT * FROM user WHERE (user.id <=> user_id);
    ELSEIF (user_type like 'admin') AND (user_id IN (SELECT id FROM admin)) THEN                    -- Nothing to append for user admin ATM 
        SELECT * FROM user WHERE (user.id <=> user_id);
    END IF;

END $$
DELIMITER ;