package org.example.service.impl;

import org.example.dto.Student;
import org.example.entity.StudentEntity;
import org.example.repo.StudentRepository;
import org.example.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(modelMapper.map(student, StudentEntity.class));
    }

    @Override
    public List<Student> getAll() {
        List<StudentEntity> studentEntities = studentRepository.findAll();
        List<Student> students = new ArrayList<>();
        studentEntities.forEach(entity -> students.add(modelMapper.map(entity, Student.class)));
        return students;
    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(modelMapper.map(student, StudentEntity.class));
    }

    @Override
    public Student findByName(String name) {
        return modelMapper.map(studentRepository.findByName(name), Student.class);
    }
}
