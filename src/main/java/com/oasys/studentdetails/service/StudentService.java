package com.oasys.studentdetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.studentdetails.dao.StudentDao;
import com.oasys.studentdetails.entity.Student;
import com.oasys.studentdetails.exception.AgeNotFoundException;
@Service
public class StudentService {
@Autowired
StudentDao stuDao;

	public List<Student> insertStudent(List<Student> e) {
		
		return stuDao.insertStudent(e);
	}

	public Optional<Student> getId(int  id) {
	return stuDao.getId(id);
	}

	public List<Student> updateDetails(Student c) {
		
		return stuDao.updateDetails(c);
	}

	public String getdelete(int id) {
		
		return stuDao.getdelate(id);
	}

	public String ageException(Student s)throws AgeNotFoundException {
		if(s.getAge()>18) {
			throw new AgeNotFoundException("You age less than 18"); 
		}
		else {
			return stuDao.ageException(s);
		}
	}

	public  Student getRoll(int e) {
		// TODO Auto-generated method stub
		return stuDao.getRoll(e);
	}
}
