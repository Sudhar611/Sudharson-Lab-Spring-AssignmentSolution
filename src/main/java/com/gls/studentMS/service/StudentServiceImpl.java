package com.gls.studentMS.service;

import java.util.List;

import com.gls.studentMS.entity.Student;
import com.gls.studentMS.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		List<Student> students=studentRepository.findAll();
		return students;
	}

	@Override
	public Student findById(int theId) {
		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student theBook) {
		studentRepository.save(theBook);
	}

	@Override
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);
	}
	
	
}
