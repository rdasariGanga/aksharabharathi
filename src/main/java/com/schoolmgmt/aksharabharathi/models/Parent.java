package com.schoolmgmt.aksharabharathi.models;

import com.schoolmgmt.aksharabharathi.constants.PersistanceConstants;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "parentSequence",sequenceName = PersistanceConstants.SEQUENCE_SCHEMA_NAME+
        Parent.DB_SEQUENCE,initialValue = 1,allocationSize = 1)
@Table(name=Parent.DB_TABLE,schema = PersistanceConstants.SCHEMA_NAME)
public class Parent {

    public static final String DB_TABLE="tb_parent";
    public static final String DB_SEQUENCE="sq_parent";

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "parentSequence")
    @Column(name = "ID",nullable = false)
    @Id
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "AGE")
    private int age;

    @Column(name = "PHONE_NUMBER")
    private int phone_number;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PROFESSION")
    private String profession;
}
