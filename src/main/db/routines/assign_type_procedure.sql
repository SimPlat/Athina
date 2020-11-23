DELIMITER $$
DROP PROCEDURE IF EXISTS `assign_type_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `assign_type_procedure`(IN new_user_id INT) 
    SQL SECURITY INVOKER
    MODIFIES SQL DATA
BEGIN
    -- Local variables
    DECLARE user_type ENUM('student','secretary','professor','admin') DEFAULT NULL;
    -- Loop required variables
    DECLARE done INT DEFAULT FALSE;
    DECLARE user_cur CURSOR FOR SELECT user.type FROM user WHERE (user.id<=>new_user_id);       
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN user_cur;
    
    user_loop: LOOP                         -- Loop through user table
        FETCH user_cur INTO user_type;      -- Get user type for given user_id 

        IF done THEN
            LEAVE user_loop;                -- Exit loop upon scanning user table
        END IF;

    END LOOP;

    -- Add new user to it's corresponding type table 
    IF (user_type LIKE 'student') THEN
        INSERT INTO student VALUES (new_user_id,DEFAULT);   
    ELSEIF (user_type LIKE 'secretary') THEN
        INSERT INTO secretary VALUES (new_user_id);
    ELSEIF (user_type LIKE 'professor') THEN
        INSERT INTO professor VALUES (new_user_id);
    ELSEIF (user_type LIKE 'admin') THEN 
        INSERT INTO admin VALUES (new_user_id);
    END IF;

END$$
DELIMITER ;
