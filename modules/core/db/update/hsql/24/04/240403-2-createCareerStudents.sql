alter table SGA_CAREER_students add constraint FK_CARSTU_ON_CAREER foreign key (career_ID) references SGA_CAREER(ID);
alter table SGA_CAREER_students add constraint FK_CARSTU_ON_STUDENT foreign key (students_ID) references SGA_STUDENT(ID);