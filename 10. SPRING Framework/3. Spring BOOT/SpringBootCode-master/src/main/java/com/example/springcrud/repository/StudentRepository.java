package com.example.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springcrud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}