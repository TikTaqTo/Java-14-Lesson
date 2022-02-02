package com.example.jelaba.servlets;

import com.example.jelaba.models.Student;
import com.example.jelaba.services.StudentService;
import com.example.jelaba.services.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Objects;

@WebServlet(value = "/getStudent")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String group = request.getParameter("group");
        String yearParam = request.getParameter("year");

        StudentService service = new StudentServiceImpl();

        Student studentByName = null;
        if(name != null) {
            studentByName = service.getStudentByName(name);
        }

        Student studentByGroup = null;
        if(group != null) {
            studentByGroup = service.getStudentByGroup(group);
        }

        Student studentByYear = null;
        if(yearParam != null) {
            int year = Integer.parseInt(yearParam);
            studentByYear = service.getStudentByAddmitedYear(year);
        }

        if(Objects.nonNull(studentByName)) {
            request.setAttribute("student", studentByName);
            request.getRequestDispatcher("searchByName.jsp").forward(request, response);
        } else if(Objects.nonNull(studentByGroup)) {
            request.setAttribute("student", studentByGroup);
            request.getRequestDispatcher("searchByGroup.jsp").forward(request, response);
        } else if(Objects.nonNull(studentByYear)) {
            request.setAttribute("student", studentByYear);
            request.getRequestDispatcher("searchByYear.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("404.jsp").forward(request, response);
        }
    }
}
