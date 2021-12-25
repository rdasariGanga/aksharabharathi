package com.schoolmgmt.aksharabharathi.models;

import com.schoolmgmt.aksharabharathi.constants.Grade;
import com.schoolmgmt.aksharabharathi.constants.PersistanceConstants;
import com.schoolmgmt.aksharabharathi.constants.Subject;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@SequenceGenerator(name = "examSequence", sequenceName = PersistanceConstants.SEQUENCE_SCHEMA_NAME +
        Exam.DB_SEQUENCE, initialValue = 1, allocationSize = 1)
@Table(name = Exam.DB_TABLE, schema = PersistanceConstants.SCHEMA_NAME)
public class Exam {

    public static final String DB_TABLE = "tb_exam";
    public static final String DB_SEQUENCE = "sq_exam";

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "examSequence")
    @Column(name = "ID", nullable = false)
    @Id
    private long id;

    @Column(name = "SUBJECT")
    private Subject subject;

    @Column(name = "GRADE")
    private Grade grade;

    @Column(name = "START_TIME")
    private Timestamp startTime;

    @Column(name = "END_TIME")
    private Timestamp endTime;
}
