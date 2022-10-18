package com.welly.festcollage.services;

import java.util.List;

import com.welly.festcollage.model.Student;

public interface StudentServices {

	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theStudent);

	public void deleteById(int theId);

	public List<Student> searchBy(String name, String department);
}
