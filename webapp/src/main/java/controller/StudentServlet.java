package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modal.Student;

import java.io.IOException;
import java.util.Arrays;

import dao.StudentDao;

/**
 * Servlet implementation class Student
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String context_path = request.getContextPath();
		RequestDispatcher rd = null;
		
		if(uri.equals(context_path+"/student")) { // localhost:8888/webapp/home.jsp
			rd = request.getRequestDispatcher("student.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name = request.getParameter("name");
//		String address = request.getParameter("address");
//		String hobby = request.getParameter("hobby");
//		int age = Integer.valueOf(request.getParameter("age"));
//		
////		int test = request.getContentLength();
//				
//		StringBuilder studentDisplay = new StringBuilder();
//		studentDisplay.append("<body>");
//		studentDisplay.append("<p>Student name: " + name + ", address: " + address + ", hobby: " + hobby + " and age: " + age);
//		studentDisplay.append("<br>");
//		studentDisplay.append("</body>");
//		
//		response.getWriter().write(studentDisplay.toString());
		
		Student sm = new Student();
		sm.setName(request.getParameter("name"));
		sm.setAddress(request.getParameter("address"));
		sm.setHobby(Arrays.toString(request.getParameterValues("hobby")));
		sm.setAge(Integer.parseInt(request.getParameter("age")));
		
		if(new StudentDao().saveStudent(sm)) {
			request.setAttribute("student_info", sm);
			request.getRequestDispatcher("confirm.jsp").forward(request, response); // the student data will be available in pass as student_info object
		}else {
			response.sendRedirect(request.getContextPath() + "/student?Save_Failed");
		}
	}

}
