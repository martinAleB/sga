update SGA_STUDENT_SUBJECT_COURSE set CLOSED = false where CLOSED is null ;
alter table SGA_STUDENT_SUBJECT_COURSE alter column CLOSED set not null ;
