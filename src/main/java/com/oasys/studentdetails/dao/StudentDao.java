package com.oasys.studentdetails.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.studentdetails.entity.Student;
import com.oasys.studentdetails.repository.StudentRepository;
@Repository
public class StudentDao {
@Autowired
StudentRepository stuRepo;
	public List<Student> insertStudent(List<Student> e) {
		// TODO Auto-generated method stub
	return	stuRepo.saveAll(e);
	}
	public Optional<Student> getId(int id) {
		
		return stuRepo.findById(id);
	}
	public List<Student> updateDetails(Student c) {
		// TODO Auto-generated method stub
		stuRepo.save(c);
		return stuRepo.findAll();
	}
	public String getdelate(int id) {
	stuRepo.deleteById(id);
		return "Sucess";
	}
	public String ageException(Student s) {
		// TODO Auto-generated method stub
	stuRepo.save(s);
	return "added";
	}
	public  Student getRoll(int e) {
		// TODO Auto-generated method stub
		return stuRepo.getRoll(e);
	}

}
