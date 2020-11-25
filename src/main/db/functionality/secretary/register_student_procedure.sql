DELIMITER $$
DROP PROCEDURE IF EXISTS `register_student` $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `register_student`(IN `name` varchar(15),
                                                               IN `surname` varchar(20),
                                                               IN `phone` varchar(10),
                                                               IN `adress` varchar(40))
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN

    INSERT INTO user values (DEFAULT,'student',NULL,NULL,name,surname,NULL,phone,adress);

END $$
DELIMITER ;