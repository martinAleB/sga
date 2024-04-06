create table SGA_PROFESSOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    code varchar(255),
    last_name varchar(255),
    first_name varchar(255),
    --
    primary key (ID)
);