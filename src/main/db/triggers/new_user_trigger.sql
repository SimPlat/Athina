DELIMITER $$
DROP TRIGGER IF EXISTS `new_user_trigger`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `new_user_trigger` AFTER INSERT ON `user` FOR EACH ROW 
BEGIN
    CALL new_user_procedure(NEW.id);
END$$
