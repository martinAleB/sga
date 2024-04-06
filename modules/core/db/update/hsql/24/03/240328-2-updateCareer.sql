alter table SGA_CAREER alter column CAREER_TYPE_ID rename to CAREER_TYPE_ID__U35844 ^
drop index IDX_SGA_CAREER_ON_CAREER_TYPE ;
alter table SGA_CAREER add column CODE varchar(255) ;
