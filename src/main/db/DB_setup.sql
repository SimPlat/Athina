-- Last modification date: 2020-11-19 17:59:55.451

-- TABLES

-- Table: admin
CREATE TABLE admin (
    id int NOT NULL,
    CONSTRAINT admin_pk PRIMARY KEY (id)
);
-- Table: application
CREATE TABLE application (
    id int NOT NULL,
    application_type varchar(20) NOT NULL,
    verified varchar(20) NOT NULL,
    CONSTRAINT application_pk PRIMARY KEY (id)
);
-- Table: enroll
CREATE TABLE enroll (
    student_id int NOT NULL,
    lecture_id int NOT NULL,
    term_year int NOT NULL,
    term enum('winter','spring') NOT NULL,
    id int NOT NULL AUTO_INCREMENT,
    UNIQUE INDEX id (id),
    CONSTRAINT enroll_pk PRIMARY KEY (student_id,lecture_id,term_year,term)
);
-- Table: exam
CREATE TABLE exam (
    student_id int NOT NULL,
    lecture_id int NOT NULL,
    date date NOT NULL,
    graded_by int NOT NULL,
    grade int NOT NULL,
    CONSTRAINT exam_pk PRIMARY KEY (student_id,lecture_id,date)
);
-- Table: lecture
CREATE TABLE lecture (
    id int NOT NULL,
    name varchar(35) NOT NULL,
    semester int NOT NULL,
    ects int NOT NULL DEFAULT 6,
    mandatory bool NOT NULL,
    CONSTRAINT lecture_pk PRIMARY KEY (id)
);
-- Table: professor
CREATE TABLE professor (
    id int NOT NULL,
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
    admin_id int NOT NULL,
    lecture_id int NOT NULL,
    CONSTRAINT register_lecture_pk PRIMARY KEY (admin_id,lecture_id)
);
-- Table: register_user
CREATE TABLE register_user (
    registerer_id int NOT NULL,
    registeree_id int NOT NULL,
    date date NOT NULL,
    CONSTRAINT register_user_pk PRIMARY KEY (registeree_id)
);
-- Table: secretary
CREATE TABLE secretary (
    id int NOT NULL,
    CONSTRAINT secretary_pk PRIMARY KEY (id)
);
-- Table: student
CREATE TABLE student (
    id int NOT NULL,
    ects int NOT NULL DEFAULT 0,
    CONSTRAINT student_pk PRIMARY KEY (id)
);
-- Table: teach
CREATE TABLE teach (
    professor_id int NOT NULL,
    lecture_id int NOT NULL,
    CONSTRAINT teach_pk PRIMARY KEY (professor_id,lecture_id)
);
-- Table: user
CREATE TABLE user (
    id int NOT NULL,
    type enum('student','secretary','professor','admin') NOT NULL,
    username varchar(15) NOT NULL,
    password varchar(35) NOT NULL,
    name varchar(15) NOT NULL,
    surname varchar(20) NOT NULL,
    email varchar(30) NOT NULL,
    phone int NOT NULL,
    adress varchar(25) NULL,
    UNIQUE INDEX email (email),
    UNIQUE INDEX username (username),
    UNIQUE INDEX phone (phone),
    CONSTRAINT user_pk PRIMARY KEY (id)
);
-- Table: verify
CREATE TABLE verify (
    secretary_id int NOT NULL,
    application_id int NOT NULL,
    date date NOT NULL,
    CONSTRAINT verify_pk PRIMARY KEY (secretary_id,application_id)
);
-- ----------------------------------------------------------------------------------------------------------------------------------
-- FOREIGN KEY

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
-- PROCEDURES
DELIMITER $$

-- Procedure: assign_type_procedure(user_id)
DROP PROCEDURE IF EXISTS `assign_type_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `assign_type_procedure`(new_user_id INT) 
    SQL SECURITY INVOKER
    MODIFIES SQL DATA
    DETERMINISTIC
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

-- Procedure: user_info_procedure(user_id,user_type)
DROP PROCEDURE IF EXISTS `user_info_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `user_info_procedure`(IN `user_id` INT,IN `user_type` ENUM('student','secretary','professor','admin'))
    SQL SECURITY INVOKER
    MODIFIES SQL DATA
    DETERMINISTIC
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

-- Procedure: available_lectures_procedure_procedure(student_id)
DROP PROCEDURE IF EXISTS `available_lectures_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `available_lectures_procedure`(`student_id` INT)
    SQL SECURITY INVOKER 
    MODIFIES SQL DATA 
    DETERMINISTIC
BEGIN
    DECLARE passed_lecture_ids INT;

    SELECT exam.lecture_id INTO passed_lecture_ids FROM exam WHERE (exam.student_id<=>student_id) AND (exam.grade >= 5);
    
    IF (MONTH(CURRENT_DATE) > 8) OR (MONTH(CURRENT_DATE) < 3) THEN
        SELECT * FROM lecture WHERE lecture.semester%2=1 AND lecture.id NOT IN (passed_lecture_ids);
    ELSE
         SELECT * FROM lecture WHERE lecture.semester%2=0 AND lecture.id NOT IN (passed_lecture_ids);
    END IF;

END$$

-- Procedure: show_enrollments_procedure(student_id)
DROP PROCEDURE IF EXISTS `show_enrollments_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `show_enrollments_procedure`(IN student_id INT) 
    SQL SECURITY INVOKER
    MODIFIES SQL DATA
BEGIN
    -- Fetch IDs and names of the enrolled lectures for the given student
    SELECT E.lecture_id,L.name FROM enroll E JOIN lecture L ON (L.id = E.lecture_id) WHERE (E.student_id <=> student_id);

END$$

-- Procedure: current_enrollments_procedure(student_id)
DROP PROCEDURE IF EXISTS `current_enrollments_procedure`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `current_enrollments_procedure`(IN student_id INT) 
    SQL SECURITY INVOKER
    MODIFIES SQL DATA
BEGIN
    -- Fetch IDs and names of the latest enrollment for the given student 
    IF (MONTH(CURRENT_DATE) > 8) OR (MONTH(CURRENT_DATE) < 3) THEN    
        SELECT E.lecture_id,L.name FROM enroll E JOIN lecture L ON (L.id = E.lecture_id) WHERE (E.student_id <=> student_id) AND (e.term_year <=> YEAR(CURRENT_DATE)) AND e.term LIKE 'winter';
    ELSE    
        SELECT E.lecture_id,L.name FROM enroll E JOIN lecture L ON (L.id = E.lecture_id) WHERE (E.student_id <=> student_id) AND (e.term_year <=> YEAR(CURRENT_DATE)) AND e.term LIKE 'spring';
    END IF;

END$$

-- Procedure new_enrollment_procedure(student_id,lecture_id)
DROP PROCEDURE IF EXISTS `new_enrollment_procedure` $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_enrollment_procedure`(IN `student_id` INT,IN `lecture_id` INT)
    SQL SECURITY INVOKER
    MODIFIES SQL DATA
BEGIN
    -- NO CHECKS ON THE AVAILABILITY OF THE LECTURES!!!!!!!!!!
    INSERT INTO enroll values (student_id,lecture_id,CURRENT_DATE);

END $$

-- Procedure remove_enrollment_procedure(student_id,lecture_id)
DROP PROCEDURE IF EXISTS `remove_enrollment_procedure` $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `remove_enrollment_procedure`(IN `student_id` INT,IN `lecture_id` INT)
    SQL SECURITY INVOKER
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
-- ----------------------------------------------------------------------------------------------------------------------------------
-- FUNCTIONS

-- Function: login(uname,upass,utype)
DROP FUNCTION IF EXISTS `login_function`$$
CREATE DEFINER=`root`@`localhost` FUNCTION `login_function`(`login_username` VARCHAR(15),`login_password` VARCHAR (35),`login_type` ENUM('student','secretary','professor','admin'))
    RETURNS BOOLEAN 
    SQL SECURITY INVOKER
    READS SQL DATA
    DETERMINISTIC 
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
-- ----------------------------------------------------------------------------------------------------------------------------------
-- TRIGGERS

-- Trigger: new_user_trigger
DROP TRIGGER IF EXISTS `new_user_trigger`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `new_user_trigger` 
    AFTER INSERT ON `user` FOR EACH ROW 
BEGIN
    CALL assign_type_procedure(NEW.id);
END$$

DELIMITER ;
-- End of file.

