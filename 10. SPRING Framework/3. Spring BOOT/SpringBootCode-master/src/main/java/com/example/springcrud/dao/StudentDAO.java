package com.example.springcrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springcrud.entity.Student;
import com.example.springcrud.repository.StudentRepository;

@Repository
public class StudentDAO {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> get() {
		return studentRepository.findAll();
	}

	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public void delete(int id) {
		studentRepository.deleteById(id);
	}
}