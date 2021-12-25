package com.schoolmgmt.aksharabharathi.models;

import com.schoolmgmt.aksharabharathi.constants.Grade;
import com.schoolmgmt.aksharabharathi.constants.PersistanceConstants;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@SequenceGenerator(name = "attendanceSequence", sequenceName = PersistanceConstants.SEQUENCE_SCHEMA_NAME +
        Attendance.DB_SEQUENCE, initialValue = 1, allocationSize = 1)
@Table(name = Attendance.DB_TABLE, schema = PersistanceConstants.SCHEMA_NAME)
public class Attendance {

    public static final String DB_TABLE = "tb_attendance";
    public static final String DB_SEQUENCE = "sq_attendance";

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attendanceSequence")
    @Column(name = "ID", nullable = false)
    @Id
    private long id;

    @Column(name = "DATE")
    private Timestamp date;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID", nullable = true)
    private long studentId;

    //check is this can be made as obsolete
    @Column(name = "Grade")
    private Grade grade;

    @Column(name = "IS_PRESENT")
    private Boolean isPresent;

    @Column(name = "REMARKS")
    private String remarks;
}
