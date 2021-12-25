package com.schoolmgmt.aksharabharathi.models;

import com.schoolmgmt.aksharabharathi.constants.Grade;
import com.schoolmgmt.aksharabharathi.constants.PersistanceConstants;
import com.schoolmgmt.aksharabharathi.constants.Subject;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@SequenceGenerator(name = "classroomSequence", sequenceName = PersistanceConstants.SEQUENCE_SCHEMA_NAME +
        ClassRoom.DB_SEQUENCE, initialValue = 1, allocationSize = 1)
@Table(name = ClassRoom.DB_TABLE, schema = PersistanceConstants.SCHEMA_NAME)
public class ClassRoom {

    public static final String DB_TABLE = "tb_classroom";
    public static final String DB_SEQUENCE = "sq_classroom";

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "classroomSequence")
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="TEACHER_ID", nullable=false)
    private long teacherId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="STUDENT_ID", nullable=true)
    private long studentId;

}
