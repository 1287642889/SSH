package com.wzf.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wzf.pojo.Student;
import com.wzf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class StudentAction extends ActionSupport{

    @Autowired
    private StudentService studentService;

    public String getAllStudent() {
        List<Student> list = studentService.getAllStudent();
        System.out.println(list.toString());
        return "success";
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

}
