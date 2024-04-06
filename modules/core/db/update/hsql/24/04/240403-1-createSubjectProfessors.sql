create table SGA_SUBJECT_professors (
    subject_ID varchar(36) not null,
    professors_ID varchar(36) not null,
    primary key (subject_ID, professors_ID)
);
