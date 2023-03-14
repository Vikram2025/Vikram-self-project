<%@ page language="java" import = 'java.sql.*'%>
<%!

Connection connection = null;
PreparedStatement PS1 = null;
PreparedStatement PS2 = null;

public void jspInit(){
	
	
			
	try{
	
		String ST1= "insert into person(pname,page,paddress,psalary) value(?,?,?,?)";
		
		String ST2= "select pid,pname,page,paddress,psalary";
		
		ServletConfig config = getServletConfig();
		String url = config.getInitParameter("url");
		String user= config.getInitParameter("user");
		String password=	config.getInitParameter("password");
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url, user, password);
		
		PS1=connection.prepareStatement(ST1);
		PS2=connection.prepareStatement(ST2);
		
		
		
		
	}
	catch(SQLException  se){
		se.printStackTrace();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	
}
%>


<%

String action = request.getParameter("s1");
if(action.equalsIgnoreCase("register")){
String pname =	request.getParameter("pname");
String Page =	request.getParameter("page");
String paddress =	request.getParameter("paddress");
String psalary =	request.getParameter("psalary");

PS1.setString(1, pname);
PS1.setString(2, Page);
PS1.setString(3, paddress);
PS1.setInt(4, Integer.parseInt(psalary));
    int lineUpdate= PS1.executeUpdate();
    if(lineUpdate==1){
    out.println("<h1 style='color:green; text-align:centre;'>PERSON DETAILS HAS BEEN REGISTERED </h1>");
    }
    else{
    	 out.println("<h1 style='color:Red; text-align:centre;'>PERSON DETAILS HAS NOT BEEN REGISTERED </h1>");
    }
}
else{
	
}







%>














<%!

public void jspDestroy(){
	try{
		if(PS1!=null)
		PS1.close();
	}catch(SQLException se){
		se.printStackTrace();
	}
	
	try{
		if(PS2!=null)
	
		PS1.close();
	
}catch(SQLException se){
	se.printStackTrace();
}
	try{
		if(connection !=null)
			connection.close();
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
}



%>




