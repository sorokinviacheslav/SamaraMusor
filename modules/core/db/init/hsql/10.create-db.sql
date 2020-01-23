-- begin SAMARAMUSOR_CONTRACT
create table SAMARAMUSOR_CONTRACT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PAYMENT_STATUS varchar(255) not null,
    ORGANIZATION_ID varchar(36) not null,
    START_DATE date not null,
    END_DATE date not null,
    --
    primary key (ID)
)^
-- end SAMARAMUSOR_CONTRACT
-- begin SAMARAMUSOR_STREET
create table SAMARAMUSOR_STREET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    MIN_NUMBER integer not null,
    MAX_NUMBER integer not null,
    --
    primary key (ID)
)^
-- end SAMARAMUSOR_STREET
-- begin SAMARAMUSOR_ORGANIZATION
create table SAMARAMUSOR_ORGANIZATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INN varchar(20) not null,
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end SAMARAMUSOR_ORGANIZATION
