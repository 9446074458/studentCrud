package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.services.StudentServices;

@RestController
@RequestMapping("/stttt")
public class StudentController {
	StudentServices ss;

	public StudentController(StudentServices ss) {
		super();
		this.ss = ss;
	}

	@PostMapping
	public String addStudent(@RequestBody Student s) {
		String msg = ss.addStudent(s);
		return msg;

	}
	@GetMapping(value= "{kodid}")
	public Student getStudent(@PathVariable("kodid") String kodId) {
		Student s = ss.getStudent(kodId);
		return s;
	}

	@GetMapping
	public List<Student> getAllStudents() {
		return ss.getAllStudents();
	}
@DeleteMapping(value= "{kodid}")
public String deleteStudent(@PathVariable("kodid") String kodid) {
	String msg=ss.deleteStudent(kodid);
	return msg;
}

}
