package com.bharat.student.dal;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharat.student.dal.entities.Model;
import com.bharat.student.dal.repo.StudentRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
class Demo4ApplicationTests {
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateModel() {
		Model student = new Model();
		student.setName("John");
		student.setCourse("Java web Service");
		student.setFee(30d);

		studentRepository.save(student);
		System.out.println("Connnected");

	}

}
