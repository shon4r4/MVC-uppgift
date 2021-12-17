package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserBean;
import model.UserHandler;

/**
 * Servlet implementation class MySessionServlet
 */
@WebServlet("/MySessionServlet")
public class MySessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MySessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserHandler uh = new UserHandler();
		boolean loginSuccess = uh.checkUserIsValid(username, password);
		
		UserBean ub = new UserBean();
		if (loginSuccess == true) {
			HttpSession session = request.getSession();
			
			session.setMaxInactiveInterval(60*2);
			session.setAttribute("thisSession", ub.fetchUserData(username));
			
			RequestDispatcher rd = request.getRequestDispatcher("welcomepage.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}
	

	

}
