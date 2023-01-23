package JDBCUTil;

//author Vikram Khandelwal
// Date : 21/01/2023
// linkedLn profile S Vikram Kumar.



import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FullPreStatementPro {

	public static void main(String[] args)   {
		Connection connection = null;
		PreparedStatement PreSta = null;
		ResultSet resultset = null;
		Scanner scan =null;
		scan= new Scanner(System.in);
	
		
	try{
	

		System.out.println("enter 1 to insert into table of studentbio ");
		System.out.println("enter 2 to deletedata  from  table of studentbio ");
		System.out.println("enter 3 to update name  into table of studentbio ");
		System.out.println("enter 4 to show the whole table table of studentbio ");
		System.out.println("enter 5 to not perform any query into table of studentbio ");
		int Myvalue=scan.nextInt();
		String MySta=null;
		connection = JdbcUtil.getValues();
		
	if(Myvalue==1)	{

	if(connection!=null) 

MySta = "insert into studentbio (SLno,name,Roll_number,Gender,DOB,DOA,Result) values(?,?,?,?,?,?,?)";
	  PreSta = connection.prepareStatement(MySta);
	
	if(PreSta!=null) 
	
	while(true) 
	{
	 System.out.println("enter the Serial Number ");
	 int SLno= scan.nextInt();
	 System.out.println("enter the student name ");
	 String name=scan.next();
	 System.out.println("enter the student id_number ");
	 int Roll_Number = scan.nextInt();
	 System.out.println("enter the student Gender ");
	 String Gender =scan.next();
	 System.out.println("enter the date of birth of student in format :: (MM-dd-yyyy)");
	 String DOB=scan.next();
//
//	 
	 System.out.println("enter the student Date of addimission :: (yyyy-MM-dd) ");
	 String DOA = scan.next();
//	 
	 
	 System.out.println("enter the student result ");
	 String Result = scan.next();
//	 
//	 System.out.println("enter the image loaction of student ::");
//	 String imagelocation=scan.next();
//	 
//	 System.out.println("enter the file loaction of student ::");
//	 String filelocation=scan.next();
////	 
//	 
//	 // Convering date according to the DB of MYsql
	 SimpleDateFormat SD = new  SimpleDateFormat("MM-dd-yyy");
	 java.util.Date Udate =SD.parse(DOB);
	 long value = Udate.getTime();
	 System.out.println(value);
	 java.sql.Date sqDate = new  java.sql.Date(value);
//	 
//	 // It is already in the MYsql Date format so diretly Insering the date in table 
	java.sql.Date sqDOA =java.sql.Date.valueOf(DOA);
 
////	Setting the value after collecting it and passing it to its respected cloumn 
	 PreSta.setInt(1, SLno);
	 PreSta.setString(2, name);
	 PreSta.setInt(3, Roll_Number);
	 PreSta.setString(4, Gender);
	 PreSta.setDate(5, sqDate);
	 PreSta.setDate(6, sqDOA);
	 PreSta.setString(7,Result);
//	 PreSta.setBinaryStream(8,new  FileInputStream( new File(imagelocation)));
//	 PreSta.setCharacterStream(9,new  FileReader( new File(filelocation)));
//	 
//	 
	 PreSta.addBatch();
	 
	 System.out.println("do you want to add any more data of the student[yes/no]");
	 String userinput=scan.next();
	 int InstNum =PreSta.executeUpdate();
	 System.out.println("the  num of line which has been insert are "+ InstNum);
	 
	 if(userinput.equalsIgnoreCase("no")) {
		 System.out.println("end the entery");
		 break;
	 }
	}
	}

//    	 
    	 
    	if(Myvalue==2) { 
    	 
    	 if (connection !=null) 
    			MySta = "delete from studentbio  where SLno=?";
    			PreSta=connection.prepareStatement(MySta);
    			
    	if (PreSta !=null)	{
    		while(true) {
    		 System.out.println("enter the SLno for which you want to delete the row");
    		int SLno =scan.nextInt();
    		 PreSta.setInt(1, SLno);
    	
    		 PreSta.addBatch();
 			
      		int linedeleted = PreSta.executeUpdate();
      		System.out.println("the selected row has been deleted succefully  "+ linedeleted);
    		 System.out.println("do you want to delete any more data of the student[yes/no]");
    
    		 String userinput=scan.next();
    		 
    		 if(userinput.equalsIgnoreCase("no")) {
    			 System.out.println("end the entery");
    			 break;
    		 }
    		
    		 
    		
    		}
    	}
    	}
   		if(Myvalue==3) {
   	 if (connection !=null) 
			MySta = "update  studentbio set Result= ? where SLno=?";
			PreSta=connection.prepareStatement(MySta);
			while(true) {
	if (PreSta !=null)	{
		 System.out.println("enter the SLno for which you want to update the Result");
		int SLno =scan.nextInt();
		
		 System.out.println("enter the change for Result");
		 String Result =scan.next();
		
		 PreSta.setInt(2, SLno);
		 PreSta.setString(1, Result);
			PreSta.addBatch();
		int lineupdated= PreSta.executeUpdate();
		System.out.println("the selected row has been updated  succefully  ::" + lineupdated);
		 System.out.println("do you want to update any more data of the student[yes/no]");
		    
		 String userinput=scan.next();
		 
		 if(userinput.equalsIgnoreCase("no")) {
			 System.out.println("end the  updation ");
			 break;
		 }
		
		
		
	}
    		}

   		}
   		
   		if(Myvalue==4) {
	if(connection!=null) 
//		 2 Creating a Prepared Statement (Car)
	MySta = "select * from  studentbio where SLno=?";
			  PreSta = connection.prepareStatement(MySta);
		
	if(PreSta!=null) {
		while(true) {
//		Creating Scanner to take user input for storing data in table
		System.out.println("enter the SLno for which you want to get data");
		int SL=scan.nextInt();
	PreSta.setInt(1, SL);
	resultset=PreSta.executeQuery();
	System.out.println("SL\tname \tRoll_number\tGender\t        DOB\t      DOA\t    Result");
	if(resultset.next()) {
//		
	int SLno = resultset.getInt(1);
	String name = resultset.getString(2);
	int Roll_number= resultset.getInt(3);
	String Gender = resultset.getString(4);
    java.sql.Date DOB = resultset.getDate(5);
    SimpleDateFormat sdf = new SimpleDateFormat();
          String StrDOB=sdf.format(DOB);
     java.sql.Date DOA = resultset.getDate(6);
     String StrDOA=sdf.format(DOA);
     String Result = resultset.getString(7);
//     InputStream is= resultset.getBinaryStream(8);
//       Reader Re= resultset.getCharacterStream(9);  
       System.out.println(SLno+"\t"+name+"\t "+Roll_number+"\t        "+Gender+"\t     "+DOB+"\t     "+DOA+"\t     "+Result);
       PreSta.addBatch();
       
       System.out.println("do you want to get  any more data of the student[yes/no]");
	    
		 String userinput=scan.next();
		 
		 if(userinput.equalsIgnoreCase("no")) {
			 System.out.println("end the retreval of data ");
			 break;
		 }
	}
	}
	}
   		}
   		
   		if(Myvalue==5) 
   			System.out.println("dont perform any query ");
	}
   			
   		
	catch(Exception e){
		e.printStackTrace();
	}
	finally 
   		{
   			try {
   			JdbcUtil.closingSta(connection, PreSta, resultset);
   			}
   			catch(Exception se){
   				se.printStackTrace();
   			}
   		
   		}
   		
	}
	
}
   
	



























