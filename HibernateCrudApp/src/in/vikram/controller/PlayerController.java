package in.vikram.controller;

import java.util.Scanner;

import Player.Service.Factory.PlayerServiceFactoryObj;
import PlayerDTO.PlayerdtoObj;
import in.vikram.servicelayer.PlayerService;

public class PlayerController {

	public static void main(String[] args) {
		while(true) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the value 1 for INSERT ");
		System.out.println( );
		System.out.println("enter the value 2 for DELETING ");
		System.out.println( );
		System.out.println("enter the value 3 for UPDATING ");
		System.out.println( );
		System.out.println("enter the value 4 for SEARCHING ");
		System.out.println( );
		System.out.println(" Enter 5 for EXIT");
		int myvalue = scan.nextInt() ;
	PlayerService playerservice = PlayerServiceFactoryObj.getPlayerService();
	
	if(myvalue==1) {

	System.out.println("enter the name of the  of player");
	String name  = scan.next();
	System.out.println("enter the teamname  of player");
	String teamname = scan.next();
	System.out.println("enter the salary of player");
	int salary = scan.nextInt();
	
	 String P1data =playerservice.addPlayer( name, teamname, salary);
            if(P1data.equalsIgnoreCase("success")) {
            	System.out.println("the player 1 record is inserted successfully");
            	
            }else {
             	System.out.println("the player 1 record is not inseted successfully");
            }
	}
            
            if(myvalue==2) {
            System.out.println("enter the id number of a player to delete his data from table");
            int id= scan.nextInt();
           String P2details = playerservice.deletePlayer(id);
           if(P2details.equalsIgnoreCase("success")) {
        	   System.out.println("the player record is deleted successfully");}
            }
            
            if(myvalue==3) {
            	System.out.println("enter the id number of player");
            	int id = scan.nextInt();
            	System.out.println("enter the name of the  of player to update");
            	String name  = scan.next();
            	System.out.println("enter the teamname  of player to be update");
            	String teamname = scan.next();
            	System.out.println("enter the salary of player to be update");
            	int salary = scan.nextInt();
            	
            	 String P3data =playerservice.updatePlayer(id, name, teamname, salary);
                 if(P3data.equalsIgnoreCase("success")) {
                 	System.out.println("the player 1 record is updated successfully");
                 	
                 }else {
                  	System.out.println("the player 1 record is not updated successfully");
                 }
            	
            }
            
	
            if(myvalue==4) {
            	System.out.println("enter the id number of player");
            	int id = scan.nextInt();
              PlayerdtoObj plydtoObj=playerservice.searchPlayer(id);
              if(plydtoObj!=null) {
              System.out.println("ID\tNAME\t   TEAMNAME\tSALARY");
              plydtoObj.getId();
              plydtoObj.getName();
              plydtoObj.getTeamname();
              plydtoObj.getSalary();
              System.out.println(plydtoObj.getId() +"\t"+plydtoObj.getName() +"\t   "+   plydtoObj.getTeamname() +"\t        "
              		+   plydtoObj.getSalary() );
              }
              else {
            	  System.out.println("the  id number :: " + id +"  which you have inserted for a player is incorrect ");
              }
              
            }
            
            if(myvalue==5) {
            	System.out.println("the  CRUD operation is been closed ");
            	break;
            }
		}

}
        	   
           
}


