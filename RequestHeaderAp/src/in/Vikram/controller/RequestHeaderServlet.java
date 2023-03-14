package in.Vikram.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class RequestHeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	             PrintWriter out=  response.getWriter();
	             out.println("<body><center>");
	             out.println("<h1 style='color:red;'><marquee>This is the info present in the header data</marquee></h1>  ");
	             out.println("<table border ='4'>");
	             out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");
	                Enumeration <String>HeaderNames= request.getHeaderNames();
	                while(HeaderNames.hasMoreElements()) {
	                	String Headerkey = HeaderNames.nextElement();
	                	String HeaderValue=	request.getHeader(Headerkey);	
	                	
	                	out.println("<tr>");
	                	out.println("<td>"+Headerkey+"</td>" );
	                	out.println("<td>"+HeaderValue+"</td>" );
	                	out.println("</tr>");
	             }
	                out.println("</table>");
	                out.println("</body></center>");
	             
	}

}
