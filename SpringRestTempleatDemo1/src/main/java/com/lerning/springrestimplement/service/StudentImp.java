package com.lerning.springrestimplement.service;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Controller;

import com.lerning.springrestimplement.model.StudentModel;

@Controller  
public interface StudentImp extends JpaRepositoryImplementation<StudentModel, Integer> {

	
}
