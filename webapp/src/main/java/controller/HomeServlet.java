package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
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
		
		if(uri.equals(context_path+"/index")) { // localhost:8888/webapp/home.jsp
			rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}else if(uri.equals(context_path+"/about")){
			rd = request.getRequestDispatcher("about.jsp");
			rd.forward(request, response);
		}else if(uri.equals(context_path+"/home")) {
			rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}else if(uri.equals(context_path+"/contact")) {
			rd = request.getRequestDispatcher("contact.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		
		String email = request.getParameter("email");
		
		String queryMessage = request.getParameter("message");
		
		StringBuilder sb = new StringBuilder();
		sb.append("<body>");
		sb.append("Hello user " + "<b>" + name + "</b>" + ",<br>");
		sb.append("Your query was submitted. ");
		sb.append("Message: " + queryMessage + "<br>");
		
		sb.append("We will send you a reply on " + email + "<br>");
		sb.append("</body>");
		
		response.getWriter().write(sb.toString());
	}

}
