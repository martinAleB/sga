alter table SGA_SUBJECT_careers add constraint FK_SUBCAR_ON_SUBJECT foreign key (subject_ID) references SGA_SUBJECT(ID);
alter table SGA_SUBJECT_careers add constraint FK_SUBCAR_ON_CAREER foreign key (careers_ID) references SGA_CAREER(ID);