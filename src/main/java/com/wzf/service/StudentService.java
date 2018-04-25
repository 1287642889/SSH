package com.wzf.service;

import com.wzf.pojo.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    List<Student> getAllStudent();
}
