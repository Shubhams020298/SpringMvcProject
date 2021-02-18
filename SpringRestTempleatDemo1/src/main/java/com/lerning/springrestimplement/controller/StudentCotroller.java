package com.lerning.springrestimplement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lerning.springrestimplement.model.StudentModel;
import com.lerning.springrestimplement.service.StudentImp;

@RestController
public class StudentCotroller {

	
	@Autowired
	StudentImp stuDao;
	
	/*@GetMapping("/")
	public String greek()
	{
		return "Hello Spring ";
	}
	
	@RequestMapping("/create")
	public String create()
	{
		StudentModel stu=new StudentModel(1, "Shubham", "shubham@gmail.com", "Andheri");
		StudentModel student=stuDao.save(stu);
		if(student!=null)
		{
			return "RECORD ADD";
		}
		return "RECORD NOT ADD";
	}
	
	@GetMapping("/details")
	public List<StudentModel> getDeatils()
	{
		List<StudentModel> student=stuDao.findAll();
		return student;
	}
	
	@GetMapping("/detail/{id}")
	public String getDetailsById(@PathVariable int id)
	{
		Optional<StudentModel> stu=stuDao.findById(id);
		if(stu.isPresent())
		{
			return stu.toString();
		}
		return "Not Found";
	}*/
	
	@GetMapping("/")
	public ResponseEntity<String> greek()
	{
		return new ResponseEntity<String>("Hello Spring", HttpStatus.OK);
	}
	
	@RequestMapping("/create")
	public ResponseEntity<String> add()
	{
		StudentModel student=new StudentModel(3, "Neeraj", "Neeraj@gmail.com", "Boriwali");
		StudentModel stu=stuDao.save(student);
		if(stu!=null)
		{
			return new ResponseEntity<String>("RECORD ADD", HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.CONFLICT);
	}
	
	@GetMapping("/details")
	public ResponseEntity<List<StudentModel>> getDetails()
	{
		List<StudentModel> student=stuDao.findAll();
		return new ResponseEntity<List<StudentModel>>(student, HttpStatus.OK);
	}
	
	@GetMapping("/detail/{id}")
	public ResponseEntity<Optional<StudentModel>> getDetailsById(@PathVariable int id)
	{
		Optional<StudentModel> student=stuDao.findById(id);
		if(student.isPresent())
		{
			return new ResponseEntity<Optional<StudentModel>>(student, HttpStatus.OK);
		}
		return new ResponseEntity<Optional<StudentModel>>(HttpStatus.CONFLICT);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> Delete(@PathVariable int id)
	{
		
		Optional<StudentModel> student=(Optional<StudentModel>)stuDao.findById(id);
		if(student.isPresent())
		{
			stuDao.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.GONE);
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.CONFLICT);
	}
	
}
