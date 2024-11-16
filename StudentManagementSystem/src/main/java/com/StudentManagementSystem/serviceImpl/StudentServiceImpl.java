package com.StudentManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.entity.Student;
import com.StudentManagementSystem.repository.StudentRepository;
import com.StudentManagementSystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList=studentRepository.findAll();
		return studentList;
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}

}

