package org.example.demo_jstl_mvc.repository;

import org.example.demo_jstl_mvc.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
   private static List<Student> studentList = new ArrayList<>();
   static {
       studentList.add(new Student(1, "chánh",true,8.0f));
       studentList.add(new Student(2, "sự",false,4.0f));
       studentList.add(new Student(3, "tiên",true,6.0f));
   }
    @Override
    public List<Student> findAll() {
       // kết nối DB
        return studentList;
    }
}
