DELIMITER $$
DROP PROCEDURE IF EXISTS `new_user_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_user_procedure`(`new_u_id` INT, `new_u_type` ENUM('student','secretary','professor','admin'))
    MODIFIES SQL DATA
BEGIN
    -- Local variables
    DECLARE child_id INT DEFAULT NULL;
    -- Loop required variables
    DECLARE done INT DEFAULT FALSE;
    DECLARE st_cur CURSOR FOR SELECT `id` FROM `student` WHERE (`id`<=>new_u_id);       
    DECLARE se_cur CURSOR FOR SELECT `id` FROM `secratary` WHERE (`id`<=>new_u_id);
    DECLARE pr_cur CURSOR FOR SELECT `id` FROM `professor` WHERE (`id`<=>new_u_id);
    DECLARE ad_cur CURSOR FOR SELECT `id` FROM `admin` WHERE (`id`<=>new_u_id);
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    IF (new_u_type LIKE 'student') THEN
        OPEN st_cur;
        -- Loop through student table
        read_loop: LOOP
            -- Find student with (id = new_user_id)
            FETCH st_cur INTO child_id;
            
            -- Exit the loop at the end of the table
            IF done THEN
                LEAVE read_loop;
            END IF;
        END LOOP;

        -- If student with (id = new_user_id) doesn't exist, INSERT student with (id = new_user_id)
        IF (child_id IS NULL) THEN 
            INSERT INTO student VALUES (new_u_id,1);
        END IF;
        CLOSE st_cur;      
    ELSEIF (new_u_type LIKE 'secretary') THEN
        OPEN se_cur;
        -- Loop through secretary table
        read_loop: LOOP
        -- Find secretary with (id = new_user_id)
            FETCH se_cur INTO child_id;

            -- Exit the loop at the end of the table
            IF done THEN
                LEAVE read_loop;
            END IF;
        END LOOP;

        -- If secretary with (id = new_user_id) doesn't exist, INSERT secretary with (id = new_user_id)
        IF (child_id IS NULL) THEN 
            INSERT INTO secratary VALUES (new_u_id);
        END IF;
        CLOSE se_cur;
    ELSEIF (new_u_type LIKE 'professor') THEN
        OPEN pr_cur;
        -- Loop through professor table
        read_loop: LOOP
            -- Find professor with (id = new_user_id)
            FETCH pr_cur INTO child_id;

            -- Exit the loop at the end of the table
            IF done THEN
                LEAVE read_loop;
            END IF;
        END LOOP;

        -- If professor with (id = new_user_id) doesn't exist, INSERT professor with (id = new_user_id)
        IF (child_id<=>NULL) THEN 
            INSERT INTO professor VALUES (new_u_id);
        END IF;
        CLOSE pr_cur;
    ELSEIF (new_u_type LIKE 'admin') THEN
        OPEN ad_cur;
        -- Loop through admin table
        read_loop: LOOP
            -- Find admin with (id = new_user_id)
            FETCH ad_cur INTO child_id;

            -- Exit the loop at the end of the table
            IF done THEN
                LEAVE read_loop;
            END IF;
        END LOOP;
        
        -- If admin with (id = new_user_id) doesn't exist, INSERT admin with (id = new_user_id)
        IF (child_id<=>NULL) THEN 
            INSERT INTO admin VALUES (new_u_id);
        END IF;
        CLOSE ad_cur;
    END IF;
END $$