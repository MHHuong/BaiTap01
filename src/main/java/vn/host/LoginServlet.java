package vn.host;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;

@WebServlet(urlPatterns= {"/login"})
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("/vidu1/Login.html");

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		if (user.equals("trung") && pass.equals("123")) {
			Cookie cookie = new Cookie("username", user); 
			cookie.setMaxAge(30);
			resp.addCookie(cookie);
			resp.sendRedirect("/vidu1/hello");
		} else {
			resp.sendRedirect("/vidu1/Login.html");
		}
		
	}

}
