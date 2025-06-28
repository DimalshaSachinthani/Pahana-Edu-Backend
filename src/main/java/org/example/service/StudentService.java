package org.example.service;

import org.example.dto.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List<Student> getAll();
    void deleteById(Integer id);
    void updateStudent(Student student);
    Student findByName(String name); // Optional
}
