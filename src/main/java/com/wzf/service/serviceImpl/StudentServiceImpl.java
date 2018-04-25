package com.wzf.service.serviceImpl;

import com.wzf.dao.StudentDao;
import com.wzf.pojo.Student;
import com.wzf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;


    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }



    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
