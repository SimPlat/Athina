# Athina

## Table of Contents
- [General Information](#general-information)  
- [Database](#database)  
    - [Database Setup](#database-setup)  
    - [Database Routines](#database-routines)  

---

## General information
Athina is a University IT system able to support the basic IT needs of a higher education institution.   
It is a team project developed for the needs of the 'Software Engineering' lecture of International Hellenic University.

---

## Database
Database code is located in `src/main/db`.

### Database setup
1. Execute `DB_setup.sql` to build the database and initialize test data.

### Database Routines
| Category | Access |
| --- | --- |
| System | None |
| Global | All Users |
| Student | Students & Secretaries |
| Secretary | Secretaries |

1. System:  
    * `assign_credentials_trigger.sql`  
       *Generates username,password,email for the new user.*
    * `assign_type_trigger.sql`  
       *Adds the new user to the corresponding type table.*
    * `create_db_user_procedure.sql (enum user_type('student','secretary','professor','admin')`  
       *Creates a DB user using the generated credentials.*
    * `grand_db_privileges_procedure.sql (varchar sanitized_username, enum user_type)`  
       *Grants the predefined privileges to the new user based on user type.*
    * `remove_db_user_procedure.sql (varchar username)`  
       *Removes the DB user and all of his privileges.*
2. Global:  
    * `lecture_info_procedure.sql (int lecture_id)`  
       *Returns lecture info for the given ID(-1 returns all lectures).*
3. Student:  
    * `student_info_procedure.sql (int student_id)`  
       *Returns student info for the given ID.*
    * `available_lectures_procedure.sql (int student_id)`,  
       *Returns info about lectures available for enrollment(not passed or not out of season).*
    * `unavailable_lectures_procedure.sql (int student_id)`  
       *Returns info about lectures unavailable for enrollment(passed or out of season).*
    * `current_enrollments_procedure.sql (int student_id)`  
       *Returns info about lectures registered on the current term.*
    * `new_enrollment_procedure.sql (int student_id, int lecture_id)`  
       *Registers a new lecture to the given student for the current term.*
    * `remove_enrollment_procedure.sql (int student_id, int lecture_id)`  
       *Removes the specified lecture from the given student for the current term.*
    * `show_enrollments_procedure.sql (int student_id)`  
       *Returns info about lectures registered over the course of each term.*
4. Secretary:  
    * `employee_info_procedure.sql (int user_id, enum('secretary','professor','admin') type)`  
       *Returns employee info for the given ID and employee type.*
    * `register_student_procedure.sql (varchar name, varchar surname, varchar phoneNo, varchar adress)`  
       *Register a new student to Athina.*
    * `remove_student_procedure.sql (int student_id)`  
       *Remove a student from Athina.*
    
