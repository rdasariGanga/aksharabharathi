create schema if not exists aksharabharathi;
    --Create table for Student
    create table if not exists aksharabharathi.tb_student
        (id number(10) not null,
        first_name varchar2(100),
        last_name varchar2(100),
        age number(10),
        roll_number number(10),
        parent_id number(10),
        constraint pk_tb_student primary key (id) using index enable
        );
    --Create table for Parent
    create table if not exists aksharabharathi.tb_parent
                (id number(10) not null,
                first_name varchar2(100),
                last_name varchar2(100),
                age number(10),
                address varchar2(200),
                phone_number number(20),
                profession varchar2(200),
                constraint pk_tb_parent primary key (id) using index enable
                );
    --Add foreign key a record in Student referring to a record in tb_parent
    alter table tb_student add constraint fk_tb_student foreign key (parent_id) references tb_parent(id) deferrable enable;

        create table if not exists aksharabharathi.tb_teacher
                (id number(10) not null,
                first_name varchar2(100),
                last_name varchar2(100),
                age number(10),
                address varchar2(200),
                phone_number number(20),
                constraint pk_tb_teacher primary key (id) using index enable
                );
        commit;


