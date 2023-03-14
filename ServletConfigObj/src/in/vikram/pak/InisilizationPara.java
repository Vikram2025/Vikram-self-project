package in.vikram.pak;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InisilizationPara extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	               PrintWriter out=response.getWriter();
	               out.println("<body><center><table border='1'");
	               out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");
	            Enumeration<String> ParaNames =  getInitParameterNames();
	            
	            while(ParaNames.hasMoreElements()) {
	            	String ParaKey = (String)ParaNames.nextElement();
	            	 String ParaValue= getInitParameter(ParaKey);
	            	 out.println("<tr>");
	            	 out.println("<td>"+ParaKey+"</td>");
	            	 out.println("<td>"+ParaValue+"</td>");
	            	 out.println("</tr>");
	            	
	            }
	           out.println("</table>");
	           out.println("</center>");  
	           out.println("</body>");
	}

}
