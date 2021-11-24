package com.demo.repository;

import com.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentjpaRepository extends JpaRepository<Student,Long>{

}

