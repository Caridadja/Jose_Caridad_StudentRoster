package com.caridadja.studentroster.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.caridadja.studentroster.models.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{
	List<Student> findAll();
}
