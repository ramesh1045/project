package com.oasys.studentdetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.studentdetails.entity.Student;
import com.oasys.studentdetails.exception.AgeNotFoundException;
import com.oasys.studentdetails.service.StudentService;

@RestController
@RequestMapping(value = "student")
public class StudentController {
@Autowired
StudentService stuSer;
@PostMapping(value ="/detail" )

public List<Student> insertStudent(@RequestBody List<Student> e) {
	return stuSer.insertStudent(e);
}
@GetMapping(value = "/getid/{id}")
public Optional<Student>getId(@PathVariable int id){
	return stuSer.getId(id);
}
@PutMapping(value = "/update")
public List<Student> updateDetails(@RequestBody Student c) {
	return stuSer.updateDetails(c);
}
@DeleteMapping(value = "/delete/{id}")
public String getDelete(@PathVariable int id) {
	return stuSer.getdelete(id);
}
@PostMapping(value = "/exception")
public String ageException(@RequestBody Student s) throws AgeNotFoundException {
return stuSer.ageException(s);
}
@GetMapping(value = "/roll/{e}")
public  Student getRoll(@PathVariable int e){
	return stuSer.getRoll(e);
}

}