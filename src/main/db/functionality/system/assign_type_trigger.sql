DELIMITER $$
DROP TRIGGER IF EXISTS `assign_type_trigger`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `assign_type_trigger` AFTER INSERT ON `user` FOR EACH ROW 
BEGIN

    -- Add new user to it's corresponding type table 
    IF (NEW.type LIKE 'student') THEN
        INSERT INTO student VALUES (NEW.id,DEFAULT);   
    ELSEIF (NEW.type LIKE 'secretary') THEN
        INSERT INTO secretary VALUES (NEW.id);
    ELSEIF (NEW.type LIKE 'professor') THEN
        INSERT INTO professor VALUES (NEW.id);
    ELSEIF (NEW.type LIKE 'admin') THEN 
        INSERT INTO admin VALUES (NEW.id);
    END IF;

END$$
DELIMITER ;