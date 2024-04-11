alter table SGA_STUDENT_SUBJECT_COURSE alter column CLOSED rename to CLOSED__U89124 ^
alter table SGA_STUDENT_SUBJECT_COURSE alter column CLOSED__U89124 set null ;
alter table SGA_STUDENT_SUBJECT_COURSE add column CONSOLIDATED boolean ^
update SGA_STUDENT_SUBJECT_COURSE set CONSOLIDATED = false where CONSOLIDATED is null ;
alter table SGA_STUDENT_SUBJECT_COURSE alter column CONSOLIDATED set not null ;
