 package in.vikram.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Player.Presistence.Factory.PlayerDaoFactory;
import Player.Service.Factory.PlayerServiceFactoryObj;
import PlayerDTO.PlayerdtoObj;
import in.vikram.servicelayer.PlayerService;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/Controller/*")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doprocess(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doprocess(request,response);
	
	}
	private void doprocess(HttpServletRequest request, HttpServletResponse response) throws IOException {
         
		  PlayerService PS =PlayerServiceFactoryObj.getPlayerService();
                
		System.out.println(request.getRequestURI());
		System.out.println(request.getPathInfo());

		
		if(request.getRequestURI().endsWith("addform")) {
			
	
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String teamname = request.getParameter("teamname");
			String salary = request.getParameter("salary");
			
			PlayerdtoObj player = new PlayerdtoObj();
			
			player.setId(Integer.parseInt(id));
			player.setName(name);
			player.setTeamname(teamname);
			player.setSalary(Integer.parseInt(salary));
			
			String status = PS.addPlayer(player);
			System.out.println(status);
			PrintWriter out =response.getWriter();
			if(status.equals("success")) {
			out.println("<h1 style='color:Green; text-align:centre;'> THE PLAYER DETAILS INSERTED SUCCESFULLY</h1>");
				
			}else {
				out.println("<h1 style='color:red; text-align:centre;'> THE PLAYER DETAILS FAILED TO INSERT SUCCESFULLY</h1>");
			}
			
		out.close();
			
		}
		
		
		if(request.getRequestURI().endsWith("searchform")) {
			
			String id = request.getParameter("id");
		     PlayerdtoObj player = PS.searchPlayer(Integer.parseInt(id));
		      PrintWriter out=response.getWriter();
		      
		      
		      if(player!= null) {
		      out.println("<body bgcolor= grey>");
		      out.println("</br></br></br></br>");
		      out.println("<center>");
		      out.println("<table border ='3'>");
		      
		      
		      out.println("<tr><th>ID</th><td>" +player.getId()+  "</td></tr>");
		      out.println("<tr><th>Name</th><td>" +player.getName()+  "</td></tr>");
		      out.println("<tr><th>Teamname</th><td>" +player.getTeamname()+  "</td></tr>");
		      out.println("<tr><th>Salary</th><td>" +player.getSalary()+  "</td></tr>");
		      
		      
		      out.println("</table>");
		      
		      out.println("</center>");
		      out.println("</body>");      
		      
		      }else {
		    	  
			      out.println("<h1   style = 'color:red'; text-align:center;><marquee>the Id which you have entered does not exist Kindly check the Id </marquee></h1>");
		     }
		      
		      out.close();
		      
		      

		     
			
			
		}
		if(request.getRequestURI().endsWith("deleteform")) {
			
			String id = request.getParameter("id");
		     String status = PS.deletePlayer(Integer.parseInt(id));
		      PrintWriter out=response.getWriter();
		      if(status.equalsIgnoreCase("success")) {
		    	  out.println("<h1   style = 'color:green'; text-align:center;><marquee>DATA OF A PLAYER HAS BEEN DELETED SUCCESSFUL</marquee></h1>");
		      }
		      else if (status.equalsIgnoreCase("failure")) {
		    	  out.println("<h1   style = 'color:red'; text-align:center;><marquee>SORRY SOMETHING WENT WRONG  </marquee></h1>");
		    	  
		      }else{
		    	
		    	  out.println("<h1   style = 'color:red'; text-align:center;><marquee>the Id which you have entered does not exist Kindly check the Id </marquee></h1>");
		      }
		      
		      
			out.close();
			
			
		}
			
		if(request.getRequestURI().endsWith("editform"))	{
			
			String id = request.getParameter("id");
			PlayerdtoObj player = PS.searchPlayer(Integer.parseInt(id));
			PrintWriter out=response.getWriter();
			if(player!= null) {
				  out.println("<body bgcolor=cyan >");
			      out.println("</br></br>");
			      out.println("<center>");
			      out.println("<form method='post' action='./Controller/updateRecord'>");
			      out.println("<table border ='3'>");
			      
			      
			  out.println("<tr><th>ID<th><td>"     +player.getId()+"</td><tr></br>");
			  out.println("	<td><input type='hidden'name='id' value="   +player.getId()+" /></td></br>");
			  out.println("<tr><th>NAME</th><td><input type='text' name='name' value=" +player.getName()+" /></td></tr></br>");
			  out.println("<tr><th>TEAMNAME</th><td><input type='text' name='teamname' value=" +player.getTeamname()+" /></td></tr></br>");
			  out.println("<tr><th>SALARY</th><td><input type='text' name='salary' value=" +player.getSalary()+" /></td></tr></br>");
			  out.println("	<td><input type='submit' value='update' /></td>");
			      
			     
			      out.println("</table>");
			      out.println("</form>");
			      out.println("</center>");
			      out.println("</body>");  
				
				
				
				
			}
			else {
		    	  out.println("<h1   style = 'color:red'; text-align:center;><marquee>the Id which you have entered does not exist Kindly check the Id </marquee></h1>");
			}
			
			out.close();
		}
		
		if(request.getRequestURI().endsWith("updateRecord")) {
		
			
			
			
			
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String teamname = request.getParameter("teamname");
			String salary = request.getParameter("salary");
			
			PlayerdtoObj player = new PlayerdtoObj();
			player.setId(Integer.parseInt(id));
			player.setName(name);
			player.setTeamname(teamname);
			player.setSalary(Integer.parseInt(salary));
			
			String status =PS.updatePlayer(player);
			
			PrintWriter out =response.getWriter();
			if(status.equals("success")) {
			out.println("<h1 style='color:Green; text-align:centre;'> THE PLAYER DETAILS UPDATED SUCCESFULLY</h1>");
				
			}else {
				out.println("<h1 style='color:red; text-align:centre;'> THE PLAYER DETAILS FAILED TO INSERT SUCCESFULLY</h1>");
			}
		
			
			out.close();
			
			
			
			
			
			
		}
		
		
		
	}
	
}
