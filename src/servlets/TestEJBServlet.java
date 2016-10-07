package servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;


//COMPLETE: import the local interface of the EJB

import ejbs.*;

/**
 * Servlet implementation class TestEJBServlet
 */
@WebServlet(urlPatterns = {"/TestEJBServlet"})
public class TestEJBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	// COMPLETE: Inject the EJB
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestEJBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sName = request.getParameter("name");
		
		//if (// ... COMPLETE check if the EJB is null //) {
		if (. . .) {
			out.println("<p>Could not locate EJB!</p>");
		} else {
		//	out.println("<p>" + // ... COMPLETE call the method of the EJB passing the name introduced //+ "</p>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
