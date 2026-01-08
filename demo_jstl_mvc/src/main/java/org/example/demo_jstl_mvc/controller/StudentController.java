package org.example.demo_jstl_mvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.demo_jstl_mvc.service.IStudentService;
import org.example.demo_jstl_mvc.service.StudentService;

import java.io.IOException;

@WebServlet(name = "StudentController", value = {"/students","/sinh-vien"})
public class StudentController extends HttpServlet {
    private IStudentService studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String action = req.getParameter("action");
       if (action==null){
           action = "";
       }
       switch (action){
           case "add":
               showFormAdd(req,resp);
               break;
           case "delete":
               break;
           default:
              showList(req,resp);
       }

    }

    private void showList(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("studentList",studentService.findAll());
        try {
            req.getRequestDispatcher("views/student/list.jsp").forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showFormAdd(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("views/student/add.jsp").forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action==null){
            action = "";
        }
        switch (action){
            case "add":
                save(req,resp);
                break;
            case "delete":
                break;
            default:

        }
    }

    private void save(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");

    }
}
