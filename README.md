# Athina

## Table of Contents
- [General Information](#general-information)  
- [Database](#database)  
    - [Database Setup](#database-setup)  
    - [Database Routines](#database-routines)  

---

## General information
Athina is a University IT system able to support the basic IT needs of any higher education institution.   
It is a team project developed for the needs of the 'Software Engineering' lecture.

---

## Database
Database code is located in `src/main/db`.

### Database setup
1. Execute `DB_setup.sql` to build the database.
2. Execute `DB_data.sql` to insert a testing data set.

### Database Routines
| Category | Access |
| --- | --- |
| System | None |
| Global | All Users |
| Student | Students & Secretaries |
| Secretary | Secretaries |

---

1. Global:  
    * `login_function.sql (varchar username, varchar pass, enum('student','secretary','professor','admin') type)`
    * `user_info_procedure.sql (int user_id, enum('student','secretary','professor','admin') type)`
2. System:  
    * `assign_credentials_trigger.sql`
    * `assign_type_trigger.sql`
    * `create_db_user_procedure.sql`
    * `grand_db_privileges_procedure.sql`
    * `remove_db_user_procedure.sql`
3. Student:  
    * `available_lectures_procedure.sql (int student_id)`
    * `current_enrollments_procedure.sql (int student_id)`
    * `new_enrollment_procedure.sql (int student_id, int lecture_id)`
    * `remove_enrollment_procedure.sql (int student_id, int lecture_id)`
    * `show_enrollments_procedure.sql (int student_id)`
4. Secretary:  
    * `register_student_procedure.sql (varchar name, varchar surname, varchar phoneNo, varchar adress)`
    * `remove_student_procedure.sql (int student_id)`
    
