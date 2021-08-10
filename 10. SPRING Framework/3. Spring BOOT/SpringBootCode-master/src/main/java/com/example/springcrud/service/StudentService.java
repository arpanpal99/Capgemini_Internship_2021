package com.example.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springcrud.dao.StudentDAO;
import com.example.springcrud.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public List<Student> get() {
		return studentDAO.get();
	}

	public Student save(Student student) {
		return studentDAO.save(student);
	}

	public void delete(int id) {
		studentDAO.delete(id);
	}
}