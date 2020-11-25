DELIMITER $$
DROP FUNCTION IF EXISTS `login_function`$$
CREATE DEFINER=`root`@`localhost` FUNCTION `login_function`(IN `login_username` VARCHAR(15),IN `login_password` VARCHAR (35),IN `login_type` ENUM('student','secretary','professor','admin'))
    RETURNS BOOLEAN 
    SQL SECURITY DEFINER
    READS SQL DATA
BEGIN
    -- Local variables
    DECLARE uname VARCHAR(15);
    DECLARE upass VARCHAR(35);
    DECLARE utype ENUM('student','secretary','professor','admin');

    -- Fetch username, password and type of the given username
    SELECT user.username,user.password,user.type INTO uname,upass,utype from user where (user.username <=> login_username);

    -- Check if username, password and type are correct
    IF (uname LIKE login_username) AND (upass LIKE login_password) AND (utype LIKE login_type) THEN
        RETURN 1;
	END IF;

    RETURN 0;

END$$
DELIMITER ;