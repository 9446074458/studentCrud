package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServicesImpl implements StudentServices {
	StudentRepository srepo;

	public StudentServicesImpl(StudentRepository srepo) {
		super();
		this.srepo = srepo;
	}

	@Override
	public String addStudent(Student s) {
		srepo.save(s);
		return "Student added successfully";
	}

	@Override
	public Student getStudent(String kodId) {
		Student st = srepo.findById(kodId).get();
		return st;
	}

	@Override
	public List<Student> getAllStudents() {

		List<Student> slist = srepo.findAll();
		// TODO Auto-generated method stub
		return slist;
	}

	@Override
	public String updateStudent(Student s) {
		srepo.save(s);
		return "Student updated successfully";
	}

	@Override
	public String deleteStudent(String kodId) {

		srepo.deleteById(kodId);

		return "Student deleted successfully";
	}

}
