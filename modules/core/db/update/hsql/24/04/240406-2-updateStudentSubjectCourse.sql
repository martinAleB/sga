alter table SGA_STUDENT_SUBJECT_COURSE alter column NOTE rename to NOTE__U59434 ^
alter table SGA_STUDENT_SUBJECT_COURSE alter column EXAM_FINAL_NOTE rename to EXAM_FINAL_NOTE__U56293 ^
alter table SGA_STUDENT_SUBJECT_COURSE alter column COURSE_NOTE rename to COURSE_NOTE__U87427 ^
alter table SGA_STUDENT_SUBJECT_COURSE add column EXAM_FINAL_GRADE double precision ;
alter table SGA_STUDENT_SUBJECT_COURSE add column GRADE double precision ;
alter table SGA_STUDENT_SUBJECT_COURSE add column COURSE_GRADE double precision ;
