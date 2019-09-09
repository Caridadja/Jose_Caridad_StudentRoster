package com.caridadja.studentroster.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.caridadja.studentroster.models.Student;
import com.caridadja.studentroster.repositories.StudentRepository;

@Service
public class StudentService {

	private StudentRepository studentRepository;

	private StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	public Student getStudentById(Long id) {
		Optional<Student> findStudent = studentRepository.findById(id);
		if(findStudent.isPresent()) {
			return findStudent.get();
		}
		else {
			return null;
		}
	}
}
