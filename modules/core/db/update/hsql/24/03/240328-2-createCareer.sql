alter table SGA_CAREER add constraint FK_SGA_CAREER_ON_CAREER_TYPE foreign key (CAREER_TYPE_ID) references SGA_CAREER_TYPE(ID);
create unique index IDX_SGA_CAREER_UNIQ_NAME on SGA_CAREER (name);
create index IDX_SGA_CAREER_ON_CAREER_TYPE on SGA_CAREER (CAREER_TYPE_ID);
