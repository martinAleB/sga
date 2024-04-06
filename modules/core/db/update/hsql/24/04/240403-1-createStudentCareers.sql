create table SGA_STUDENT_careers (
    student_ID varchar(36) not null,
    careers_ID varchar(36) not null,
    primary key (student_ID, careers_ID)
);
