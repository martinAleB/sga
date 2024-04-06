-- begin SGA_CAREER
create table SGA_CAREER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    name varchar(255),
    code varchar(255),
    --
    primary key (ID)
)^
-- end SGA_CAREER
-- begin SGA_STUDENT
create table SGA_STUDENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    last_name varchar(255),
    college_number bigint,
    first_name varchar(255),
    --
    primary key (ID)
)^
-- end SGA_STUDENT
-- begin SGA_SUBJECT
create table SGA_SUBJECT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    code varchar(255),
    name varchar(255),
    --
    primary key (ID)
)^
-- end SGA_SUBJECT
-- begin SGA_PROFESSOR
create table SGA_PROFESSOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    code varchar(255),
    last_name varchar(255),
    first_name varchar(255),
    --
    primary key (ID)
)^
-- end SGA_PROFESSOR

-- begin SGA_SUBJECT_PROFESSORS
create table SGA_SUBJECT_professors (
    subject_ID varchar(36) not null,
    professors_ID varchar(36) not null,
    primary key (subject_ID, professors_ID)
)^
-- end SGA_SUBJECT_PROFESSORS
-- begin SGA_STUDENT_CAREERS
create table SGA_STUDENT_careers (
    student_ID varchar(36) not null,
    careers_ID varchar(36) not null,
    primary key (student_ID, careers_ID)
)^
-- end SGA_STUDENT_CAREERS
-- begin SGA_CAREER_SUBJECTS
create table SGA_CAREER_subjects (
    career_ID varchar(36) not null,
    subjects_ID varchar(36) not null,
    primary key (career_ID, subjects_ID)
)^
-- end SGA_CAREER_SUBJECTS
-- begin SGA_STUDENT_SUBJECT_COURSE
create table SGA_STUDENT_SUBJECT_COURSE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    student_id varchar(36),
    subject_id varchar(36),
    course_note double precision,
    note double precision,
    exam_final_note double precision,
    --
    primary key (ID)
)^
-- end SGA_STUDENT_SUBJECT_COURSE
