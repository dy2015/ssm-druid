package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.po.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public List<Student> getAllStudentInfo() {
		List<Student> student = null;
		try {
			student = studentDao.queryStudentAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

}
