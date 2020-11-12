package last;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;


public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws 
	ServletException,IOException{
		System.out.print("this is get method,,,,,,,,,,,");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>This </h1>");
		out.print(new Date().toString());
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		super.doPost(req, resp);
	}

}
