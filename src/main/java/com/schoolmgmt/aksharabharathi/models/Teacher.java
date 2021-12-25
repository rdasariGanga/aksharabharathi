package com.schoolmgmt.aksharabharathi.models;

import com.schoolmgmt.aksharabharathi.constants.PersistanceConstants;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "teacherSequence", sequenceName = PersistanceConstants.SEQUENCE_SCHEMA_NAME +
        Teacher.DB_SEQUENCE, initialValue = 1, allocationSize = 1)
@Table(name = Teacher.DB_TABLE, schema = PersistanceConstants.SCHEMA_NAME)
public class Teacher {

    public static final String DB_TABLE = "tb_teacher";
    public static final String DB_SEQUENCE = "sq_teacher";

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacherSequence")
    @Column(name = "ID",nullable = false)
    @Id
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "AGE")
    private int age;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PHONE_NUMBER")
    private int phoneNumber;

}
