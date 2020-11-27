-- Last modification date: 2020-11-25 19:41:26.923

-- DATABASE
DROP DATABASE IF EXISTS Athina_db;
CREATE DATABASE Athina_db;
USE Athina_db;
-- ----------------------------------------------------------------------------------------------------------------------------------
-- TABLES

-- Table: admin
CREATE TABLE admin (
    id int(8) NOT NULL,
    CONSTRAINT admin_pk PRIMARY KEY (id)
);
-- Table: application
CREATE TABLE application (
    id int NOT NULL AUTO_INCREMENT,
    application_type varchar(20) NOT NULL,
    verified bool NOT NULL DEFAULT 0,
    CONSTRAINT application_pk PRIMARY KEY (id)
);
-- Table: enroll
CREATE TABLE enroll (
    id int NOT NULL AUTO_INCREMENT,
    student_id int(8) NOT NULL,
    lecture_id int NOT NULL,
    term_year int NOT NULL,
    term enum('winter','spring') NOT NULL,
    UNIQUE INDEX id (id),
    CONSTRAINT enroll_pk PRIMARY KEY (student_id,lecture_id,term_year,term)
);
-- Table: exam
CREATE TABLE exam (
    student_id int(8) NOT NULL,
    lecture_id int NOT NULL,
    date date NOT NULL,
    graded_by int(8) NOT NULL,
    grade int NOT NULL,
    CONSTRAINT exam_pk PRIMARY KEY (student_id,lecture_id,date)
);
-- Table: lecture
CREATE TABLE lecture (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(35) NOT NULL,
    semester int NOT NULL,
    ects int NOT NULL DEFAULT 6,
    mandatory bool NOT NULL,
    CONSTRAINT lecture_pk PRIMARY KEY (id)
);
-- Table: professor
CREATE TABLE professor (
    id int(8) NOT NULL,
    CONSTRAINT professor_pk PRIMARY KEY (id)
);
-- Table: register_application
CREATE TABLE register_application (
    applicant_id int NOT NULL,
    application_id int NOT NULL,
    date date NOT NULL,
    CONSTRAINT register_application_pk PRIMARY KEY (applicant_id,application_id)
);
-- Table: register_lecture
CREATE TABLE register_lecture (
    admin_id int(8) NOT NULL,
    lecture_id int NOT NULL,
    CONSTRAINT register_lecture_pk PRIMARY KEY (admin_id,lecture_id)
);
-- Table: register_user
CREATE TABLE register_user (
    registerer_id int(8) NOT NULL,
    registeree_id int(8) NOT NULL,
    date date NOT NULL,
    CONSTRAINT register_user_pk PRIMARY KEY (registeree_id)
);
-- Table: secretary
CREATE TABLE secretary (
    id int(8) NOT NULL,
    CONSTRAINT secretary_pk PRIMARY KEY (id)
);
-- Table: student
CREATE TABLE student (
    id int(8) NOT NULL,
    ects int NOT NULL DEFAULT 0,
    CONSTRAINT student_pk PRIMARY KEY (id)
);
-- Table: teach
CREATE TABLE teach (
    professor_id int(8) NOT NULL,
    lecture_id int NOT NULL,
    CONSTRAINT teach_pk PRIMARY KEY (professor_id,lecture_id)
);
-- Table: user
CREATE TABLE user (
    id int(8) NOT NULL AUTO_INCREMENT,
    type enum('student','secretary','professor','admin') NOT NULL,
    username varchar(15) NULL,
    password varchar(35) NULL,
    name varchar(15) NOT NULL,
    surname varchar(20) NOT NULL,
    email varchar(30) NOT NULL,
    phone varchar(10) NOT NULL,
    adress varchar(40) NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);
-- Table: verify
CREATE TABLE verify (
    secretary_id int(8) NOT NULL,
    application_id int NOT NULL,
    date date NOT NULL,
    CONSTRAINT verify_pk PRIMARY KEY (secretary_id,application_id)
);
-- ----------------------------------------------------------------------------------------------------------------------------------
-- FOREIGN KEYS

-- Reference: Verify_secretary (table: verify)
ALTER TABLE verify ADD CONSTRAINT Verify_secretary FOREIGN KEY Verify_secretary (secretary_id)
    REFERENCES secretary (id)
    ON UPDATE CASCADE;
-- Reference: create_applications (table: register_application)
ALTER TABLE register_application ADD CONSTRAINT create_applications FOREIGN KEY create_applications (application_id)
    REFERENCES application (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: enroll_student (table: enroll)
ALTER TABLE enroll ADD CONSTRAINT enroll_student FOREIGN KEY enroll_student (student_id)
    REFERENCES student (id)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;
-- Reference: exam_lecture (table: exam)
ALTER TABLE exam ADD CONSTRAINT exam_lecture FOREIGN KEY exam_lecture (lecture_id)
    REFERENCES lecture (id)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT;
-- Reference: exam_professor (table: exam)
ALTER TABLE exam ADD CONSTRAINT exam_professor FOREIGN KEY exam_professor (graded_by)
    REFERENCES professor (id)
    ON UPDATE CASCADE;
-- Reference: exam_student (table: exam)
ALTER TABLE exam ADD CONSTRAINT exam_student FOREIGN KEY exam_student (student_id)
    REFERENCES student (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: lecture_enroll (table: enroll)
ALTER TABLE enroll ADD CONSTRAINT lecture_enroll FOREIGN KEY lecture_enroll (lecture_id)
    REFERENCES lecture (id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE;
-- Reference: register_admin (table: register_user)
ALTER TABLE register_user ADD CONSTRAINT register_admin FOREIGN KEY register_admin (registerer_id)
    REFERENCES admin (id)
    ON UPDATE CASCADE;
-- Reference: register_application_professor (table: register_application)
ALTER TABLE register_application ADD CONSTRAINT register_application_professor FOREIGN KEY register_application_professor (applicant_id)
    REFERENCES professor (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: register_application_student (table: register_application)
ALTER TABLE register_application ADD CONSTRAINT register_application_student FOREIGN KEY register_application_student (applicant_id)
    REFERENCES student (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: register_lecture_admin (table: register_lecture)
ALTER TABLE register_lecture ADD CONSTRAINT register_lecture_admin FOREIGN KEY register_lecture_admin (admin_id)
    REFERENCES admin (id)
    ON UPDATE CASCADE;
-- Reference: register_lecture_lecture (table: register_lecture)
ALTER TABLE register_lecture ADD CONSTRAINT register_lecture_lecture FOREIGN KEY register_lecture_lecture (lecture_id)
    REFERENCES lecture (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: register_secretary (table: register_user)
ALTER TABLE register_user ADD CONSTRAINT register_secretary FOREIGN KEY register_secretary (registerer_id)
    REFERENCES secretary (id)
    ON UPDATE CASCADE;
-- Reference: register_user (table: register_user)
ALTER TABLE register_user ADD CONSTRAINT register_user FOREIGN KEY register_user (registeree_id)
    REFERENCES user (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: teach_lecture (table: teach)
ALTER TABLE teach ADD CONSTRAINT teach_lecture FOREIGN KEY teach_lecture (lecture_id)
    REFERENCES lecture (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: teach_professor (table: teach)
ALTER TABLE teach ADD CONSTRAINT teach_professor FOREIGN KEY teach_professor (professor_id)
    REFERENCES professor (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: user_admin (table: admin)
ALTER TABLE admin ADD CONSTRAINT user_admin FOREIGN KEY user_admin (id)
    REFERENCES user (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: user_professor (table: professor)
ALTER TABLE professor ADD CONSTRAINT user_professor FOREIGN KEY user_professor (id)
    REFERENCES user (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: user_secretary (table: secretary)
ALTER TABLE secretary ADD CONSTRAINT user_secretary FOREIGN KEY user_secretary (id)
    REFERENCES user (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: user_student (table: student)
ALTER TABLE student ADD CONSTRAINT user_student FOREIGN KEY user_student (id)
    REFERENCES user (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- Reference: verify_application (table: verify)
ALTER TABLE verify ADD CONSTRAINT verify_application FOREIGN KEY verify_application (application_id)
    REFERENCES application (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------
-- ROUTINES
DELIMITER $$

-- 1.Function: login(uname,upass,utype)
CREATE DEFINER=`root`@`localhost` FUNCTION `login_function`(`login_username` VARCHAR(15),`login_password` VARCHAR(35),`login_type` ENUM('student','secretary','professor','admin'))
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
-- 2.Procedure: user_info_procedure(user_id,user_type)
CREATE DEFINER=`root`@`localhost` PROCEDURE `user_info_procedure`(IN `user_id` INT,IN `user_type` ENUM('student','secretary','professor','admin'))
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
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
-- 3.Procedure: available_lectures_procedure_procedure(student_id)
CREATE DEFINER=`root`@`localhost` PROCEDURE `available_lectures_procedure`(`student_id` INT)
    SQL SECURITY DEFINER 
    MODIFIES SQL DATA 
BEGIN
    DECLARE passed_lecture_ids INT;

    SELECT exam.lecture_id INTO passed_lecture_ids FROM exam WHERE (exam.student_id<=>student_id) AND (exam.grade >= 5);
    
    IF (MONTH(CURRENT_DATE) > 8) OR (MONTH(CURRENT_DATE) < 3) THEN
        SELECT * FROM lecture WHERE lecture.semester%2=1 AND lecture.id NOT IN (passed_lecture_ids);
    ELSE
         SELECT * FROM lecture WHERE lecture.semester%2=0 AND lecture.id NOT IN (passed_lecture_ids);
    END IF;

END$$
-- 4.Procedure: show_enrollments_procedure(student_id)
CREATE DEFINER=`root`@`localhost` PROCEDURE `show_enrollments_procedure`(IN student_id INT) 
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    -- Fetch IDs and names of the enrolled lectures for the given student
    SELECT E.lecture_id,L.name FROM enroll E JOIN lecture L ON (L.id = E.lecture_id) WHERE (E.student_id <=> student_id);
END$$
-- 5.Procedure: current_enrollments_procedure(student_id)
CREATE DEFINER=`root`@`localhost` PROCEDURE `current_enrollments_procedure`(IN student_id INT) 
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    -- Fetch IDs and names of the latest enrollment for the given student 
    IF (MONTH(CURRENT_DATE) > 8) OR (MONTH(CURRENT_DATE) < 3) THEN    
        SELECT E.lecture_id,L.name FROM enroll E JOIN lecture L ON (L.id = E.lecture_id) WHERE (E.student_id <=> student_id) AND (e.term_year <=> YEAR(CURRENT_DATE)) AND e.term LIKE 'winter';
    ELSE    
        SELECT E.lecture_id,L.name FROM enroll E JOIN lecture L ON (L.id = E.lecture_id) WHERE (E.student_id <=> student_id) AND (e.term_year <=> YEAR(CURRENT_DATE)) AND e.term LIKE 'spring';
    END IF;

END$$
-- 6.Procedure: new_enrollment_procedure(student_id,lecture_id)
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_enrollment_procedure`(IN `student_id` INT,IN `lecture_id` INT)
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    -- NO CHECKS ON THE AVAILABILITY OF THE LECTURES!!!!!!!!!!
    INSERT INTO enroll values (student_id,lecture_id,CURRENT_DATE);
END $$
-- 7.Procedure: remove_enrollment_procedure(student_id,lecture_id)
CREATE DEFINER=`root`@`localhost` PROCEDURE `remove_enrollment_procedure`(IN `student_id` INT,IN `lecture_id` INT)
    SQL SECURITY DEFINER
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
-- 8.Procedure: create_db_user_procedure(user_type)
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_db_user_procedure`(IN `user_type` 
                                                                           ENUM('secretary','student','professor','admin')) 
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    DECLARE ai_id INT(5) default NULL;
    -- Create user variables
    DECLARE `_HOST` CHAR(14) DEFAULT '@\'localhost\'';
    DECLARE db_username VARCHAR(20) DEFAULT NULL;
    DECLARE db_password VARCHAR(20) DEFAULT NULL; 
    -- Username/user password variables
    DECLARE username VARCHAR(20) DEFAULT NULL;
    DECLARE password VARCHAR(20) DEFAULT NULL;

    FLUSH PRIVILEGES;

    -- Get the next auto increment value for table user
    SELECT auto_increment INTO ai_id FROM information_schema.tables
    WHERE table_name = 'user' AND table_schema = 'Athina_db';
    
    SET @ai_id = ai_id - 1;

    -- Build the username/user password based on the autoincremented value which is about to be used as the user ID
    SET username = CONCAT(SUBSTRING(user_type,1,2),LPAD(@ai_id,5,0)),
        password = CONCAT(LPAD(@ai_id,5,0),SUBSTRING(user_type,1,2));

    -- Escape inputs, create and execute the create user query
    SET db_username = CONCAT('\'', REPLACE(TRIM(`username`), CHAR(39), CONCAT(CHAR(92), CHAR(39))), '\''),
        db_password = CONCAT('\'', REPLACE(`password`, CHAR(39), CONCAT(CHAR(92), CHAR(39))), '\'');
    SET @`sql` = CONCAT('CREATE USER ', `db_username`, `_HOST`, ' IDENTIFIED BY ', `db_password`);
    PREPARE `stmt` FROM @`sql`;
    EXECUTE `stmt`;
    DEALLOCATE PREPARE `stmt`;

    FLUSH PRIVILEGES;

    CALL grand_db_privileges_procedure(db_username,user_type);

END$$
-- 9.Procedure: remove_db_user_procedure(username)
CREATE DEFINER=`root`@`localhost` PROCEDURE `remove_db_user_procedure`(IN `username` VARCHAR(7))
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
   -- Create user variables
   DECLARE `_HOST` CHAR(14) DEFAULT '@\'localhost\'';
   DECLARE db_username VARCHAR(9) DEFAULT NULL;

   -- Escape inputs, create and execute the create user query
   SET `db_username` = CONCAT('\'', REPLACE(TRIM(`username`), CHAR(39), CONCAT(CHAR(92), CHAR(39))), '\'');
   SET @`sql` = CONCAT('DROP USER IF EXISTS', `db_username`, `_HOST`);
   PREPARE `stmt` FROM @`sql`;
   EXECUTE `stmt`;
   DEALLOCATE PREPARE `stmt`;

END$$
-- 10.Procedure: grand_db_privileges_procedure(quoted_username,usertype)
CREATE DEFINER=`root`@`localhost` PROCEDURE `grand_db_privileges_procedure`(IN username VARCHAR(20),
                                                                            IN `user_type` ENUM('student','secretary','professor','admin')) 
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    -- Assign privilege variables
    DECLARE `_HOST` CHAR(14) DEFAULT '@\'localhost\'';
    DECLARE db_username_host VARCHAR(25) DEFAULT username;

    SET db_username_host = CONCAT(username,`_HOST`);

    FLUSH PRIVILEGES;

    IF (user_type LIKE 'student') THEN
        -- Grand student access to global(2) and student specific(5) routines 
        SET @`sql` = CONCAT('GRANT EXECUTE ON FUNCTION Athina_db.login_function TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`; 
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.user_info_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.available_lectures_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.show_enrollments_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.current_enrollments_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.new_enrollment_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.remove_enrollment_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
    ELSEIF (user_type LIKE 'secretary') THEN
        -- Grand secretary access to global(2) and secretary specific(0) routines 
        SET @`sql` = CONCAT('GRANT EXECUTE ON FUNCTION Athina_db.login_function TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`; 
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.user_info_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
    ELSEIF (user_type LIKE 'professor') THEN
        -- Grand professor access to global(2) and professor specific(0) routines 
        SET @`sql` = CONCAT('GRANT EXECUTE ON FUNCTION Athina_db.login_function TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`; 
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.user_info_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
    ELSEIF (user_type LIKE 'admin') THEN
        -- Grand admin access to global(2) and admin specific(0) routines 
        SET @`sql` = CONCAT('GRANT EXECUTE ON FUNCTION Athina_db.login_function TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`; 
        SET @`sql` = CONCAT('GRANT EXECUTE ON PROCEDURE Athina_db.user_info_procedure TO' , `db_username_host`);
        PREPARE `stmt` FROM @`sql`; EXECUTE `stmt`;
    END IF;
    
    DEALLOCATE PREPARE `stmt`;
    
    FLUSH PRIVILEGES;

END$$
-- 11.Procedure: register_student_procedure(student_name,student_surname,phone_number,adress)
CREATE DEFINER=`root`@`localhost` PROCEDURE `register_student_procedure`(IN `name` varchar(15),
                                                                         IN `surname` varchar(20),
                                                                         IN `phone` varchar(10),
                                                                         IN `adress` varchar(40))
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN

    -- Add new student on the user table
    INSERT INTO user values (DEFAULT,'student',NULL,NULL,name,surname,NULL,phone,adress);
    -- Create new student user on Athina_db
    CALL create_db_user_procedure('student');    

END $$
-- 12.Procedure: remove_student_procedure(student_id)
CREATE DEFINER=`root`@`localhost` PROCEDURE `remove_student_procedure`(IN `student_id` varchar(5))
    SQL SECURITY DEFINER
    MODIFIES SQL DATA
BEGIN
    DECLARE uname varchar(7) DEFAULT NULL;

    -- Find students username
    SELECT username INTO uname FROM user WHERE (id <=> student_id);
    -- Remove student's db user
    CALL remove_db_user_procedure(uname);
    -- Remove student from the user table
    DELETE FROM user WHERE (id = student_id);
    
END $$
-- ----------------------------------------------------------------------------------------------------------------------------------
-- TRIGGERS

-- 1.Trigger: assign_credentials_trigger
CREATE DEFINER=`root`@`localhost` TRIGGER `assign_credentials_trigger` BEFORE INSERT ON `user` FOR EACH ROW 
BEGIN
    DECLARE ai_id INT(5) default NULL;
    
    SELECT auto_increment INTO ai_id FROM information_schema.tables
    WHERE table_name = 'user' AND table_schema = 'Athina_db';
    
    -- Assign username,password,email to the new user
    SET NEW.username = CONCAT(ifnull(NEW.username,""),SUBSTRING(NEW.type,1,2),LPAD(ai_id,5,0)),
        NEW.password = CONCAT(ifnull(NEW.password,""),LPAD(ai_id,5,0),SUBSTRING(NEW.type,1,2)),
        NEW.email = CONCAT(ifnull(NEW.email,""),SUBSTRING(NEW.type,1,2),LPAD(ai_id,5,0),'@ihu.gr');

END$$
-- 2.Trigger: assign_type_trigger
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
-- End of file.

