package com.schoolmgmt.aksharabharathi.models;

import com.schoolmgmt.aksharabharathi.constants.PersistanceConstants;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "studentSequence",sequenceName = PersistanceConstants.SEQUENCE_SCHEMA_NAME+
        Student.DB_SEQUENCE,initialValue = 1,allocationSize = 1)
@Table(name=Student.DB_TABLE,schema = PersistanceConstants.SCHEMA_NAME)
public class Student {
    public static final String DB_TABLE="tb_student";
    public static final String DB_SEQUENCE="sq_student";

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "studentSequence")
    @Column(name = "ID",nullable = false)
    @Id
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "AGE")
    private int age;

    @Column(name = "ROLL_NUMBER")
    private int rollNumber;

}
