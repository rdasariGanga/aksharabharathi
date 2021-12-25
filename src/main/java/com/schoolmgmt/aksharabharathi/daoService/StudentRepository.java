package com.schoolmgmt.aksharabharathi.daoService;

import com.schoolmgmt.aksharabharathi.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}