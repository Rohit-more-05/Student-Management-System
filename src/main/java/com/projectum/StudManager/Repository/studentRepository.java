package com.projectum.StudManager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectum.StudManager.Student.Student;

@Repository
public interface studentRepository extends JpaRepository<Student, Integer> {

}
