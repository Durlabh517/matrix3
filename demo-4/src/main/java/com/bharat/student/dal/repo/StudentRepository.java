package com.bharat.student.dal.repo;

import org.springframework.data.repository.CrudRepository;

import com.bharat.student.dal.entities.Model;


public interface StudentRepository extends 
CrudRepository<Model, Long> {

}
