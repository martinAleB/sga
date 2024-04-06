-- begin SGA_CAREER
create unique index IDX_SGA_CAREER_UNIQ_NAME on SGA_CAREER (name)^
create unique index IDX_SGA_CAREER_UNIQ_CODE on SGA_CAREER (code)^
create index IDX_CAREER_CODE on SGA_CAREER (code)^
-- end SGA_CAREER
-- begin SGA_STUDENT
create unique index IDX_SGA_STUDENT_UNIQ_COLLEGE_NUMBER on SGA_STUDENT (college_number)^
create index IDX_STUDENT_COLLEGE_NUMBER on SGA_STUDENT (college_number)^
-- end SGA_STUDENT
-- begin SGA_SUBJECT
create unique index IDX_SGA_SUBJECT_UNIQ_CODE on SGA_SUBJECT (code)^
create index IDX_SUBJECT_CODE on SGA_SUBJECT (code)^
-- end SGA_SUBJECT
-- begin SGA_PROFESSOR
create unique index IDX_SGA_PROFESSOR_UNIQ_CODE on SGA_PROFESSOR (code)^
create index IDX_PROFESSOR_CODE on SGA_PROFESSOR (code)^
-- end SGA_PROFESSOR

-- begin SGA_SUBJECT_PROFESSORS
alter table SGA_SUBJECT_professors add constraint FK_SUBPRO_ON_SUBJECT foreign key (subject_ID) references SGA_SUBJECT(ID)^
alter table SGA_SUBJECT_professors add constraint FK_SUBPRO_ON_PROFESSOR foreign key (professors_ID) references SGA_PROFESSOR(ID)^
-- end SGA_SUBJECT_PROFESSORS
-- begin SGA_STUDENT_CAREERS
alter table SGA_STUDENT_careers add constraint FK_STUCAR_ON_STUDENT foreign key (student_ID) references SGA_STUDENT(ID)^
alter table SGA_STUDENT_careers add constraint FK_STUCAR_ON_CAREER foreign key (careers_ID) references SGA_CAREER(ID)^
-- end SGA_STUDENT_CAREERS
-- begin SGA_CAREER_SUBJECTS
alter table SGA_CAREER_subjects add constraint FK_CARSUB_ON_CAREER foreign key (career_ID) references SGA_CAREER(ID)^
alter table SGA_CAREER_subjects add constraint FK_CARSUB_ON_SUBJECT foreign key (subjects_ID) references SGA_SUBJECT(ID)^
-- end SGA_CAREER_SUBJECTS
-- begin SGA_STUDENT_SUBJECT_COURSE
alter table SGA_STUDENT_SUBJECT_COURSE add constraint FK_SGA_STUDENT_SUBJECT_COURSE_ON_STUDENT foreign key (STUDENT_ID) references SGA_STUDENT(ID)^
alter table SGA_STUDENT_SUBJECT_COURSE add constraint FK_SGA_STUDENT_SUBJECT_COURSE_ON_SUBJECT foreign key (SUBJECT_ID) references SGA_SUBJECT(ID)^
create index IDX_SGA_STUDENT_SUBJECT_COURSE_ON_STUDENT on SGA_STUDENT_SUBJECT_COURSE (STUDENT_ID)^
create index IDX_SGA_STUDENT_SUBJECT_COURSE_ON_SUBJECT on SGA_STUDENT_SUBJECT_COURSE (SUBJECT_ID)^
-- end SGA_STUDENT_SUBJECT_COURSE
