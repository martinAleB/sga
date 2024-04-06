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
    --
    primary key (ID)
);