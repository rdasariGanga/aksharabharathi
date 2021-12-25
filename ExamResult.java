package com.schoolmgmt.aksharabharathi.models;

import com.schoolmgmt.aksharabharathi.constants.Grade;
import com.schoolmgmt.aksharabharathi.constants.PersistanceConstants;
import com.schoolmgmt.aksharabharathi.constants.Subject;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "examResultSequence", sequenceName = PersistanceConstants.SEQUENCE_SCHEMA_NAME +
        ExamResult.DB_SEQUENCE, initialValue = 1, allocationSize = 1)
@Table(name = ExamResult.DB_TABLE, schema = PersistanceConstants.SCHEMA_NAME)
public class ExamResult {

    public static final String DB_TABLE = "tb_exam_result";
    public static final String DB_SEQUENCE = "sq_exam_result";

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "examResultSequence")
    @Column(name = "ID", nullable = false)
    @Id
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="EXAM_ID", nullable=false)
    private Exam examId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="STUDENT_ID", nullable=false)
    private Student studentId;

    @Column(name = "GRADE")
    private Grade grade;

    @Column(name = "subject")
    private Subject subject;

    @Column(name = "marks")
    private int marks;


}
