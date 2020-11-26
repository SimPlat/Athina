DELIMITER $$
DROP TRIGGER IF EXISTS `assign_credentials_trigger`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `assign_credentials_trigger` BEFORE INSERT ON `user` FOR EACH ROW 
BEGIN
    DECLARE ai_id INT(5) default 0;
    
    SELECT auto_increment INTO ai_id FROM information_schema.tables
    WHERE table_name = 'user' AND table_schema = database();
    
    -- Assign username,password,email to the new user
    SET NEW.username = CONCAT(ifnull(NEW.username,""),SUBSTRING(NEW.type,1,2),LPAD(ai_id,5,0)),
        NEW.password = CONCAT(ifnull(NEW.password,""),LPAD(ai_id,5,0),SUBSTRING(NEW.type,1,2)),
        NEW.email = CONCAT(ifnull(NEW.email,""),SUBSTRING(NEW.type,1,2),LPAD(ai_id,5,0),'@ihu.gr');

END$$
DELIMITER ;