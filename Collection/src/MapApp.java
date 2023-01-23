
import java.security.KeyStore.Entry;
import java.util.*;

class TicketInformation {
	private String trainame;
	private int trainnumber;
	private String from;
	private String to;
	private String name;
	private int age;
	private String gender;
	private String Status;
	private int fair ;
	
	public  TicketInformation  ( String trainame,int trainnumber,String from,String to, String name, int age, String gender,String Status, int fair) {
		
		this.trainame= trainame;
		this.trainnumber=trainnumber;
		this.from=from;
		this.to= to;
		this.name = name;
		this.age=age;
		this.gender = gender;
		this.Status=Status;
		this.fair= fair;
	}
		
	
	public String getTrainname() {
		return trainame;
	}
	
	
	public int getTrainnumber() {
		return trainnumber;
	}


	public String getFrom() {
		return from;
	}


	public String getTo() {
		return to;
	}


	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	public String getStatus() {
		return Status;
	}


	public int getFair() {
		return fair;
	}
	

//		
	@Override
	public String toString() 
	{
		return   trainame + " "+ trainnumber + " "+ from + " "+ to + " "+ name + " " + age + " "+ gender+ " " + Status+ " "+ fair;
	}
//		
//		
//	
//		
//	}
	 
}




public class MapApp {

	public static void main(String[] args) {
	TicketInformation TI1= new TicketInformation("MAS LTT EXPRESS /",11074 , " Mgr Chennai /", " Lokmanayatilak T /", "Chirag /",24, "Male /","WL6/",240 );
	TicketInformation TI2= new TicketInformation("MAS CMST EXP /" ,06340, " /Mgr Chennai", " /PUNE", " /Priti /",28, " /Female", "/S8-56 /",437);
	TicketInformation TI3= new TicketInformation("KARNATAKA EXPRESS /" ,12628, " / Bengaluru Cant", " /AgraCantt", "/Golu /",17, " /male"," /B2-6/ ",480 );
	TicketInformation TI4= new TicketInformation("Sanghamitra Express /" ,12295, " /Kuppa", " /Nagpur", " /Charan /",26, " /Male"," /WL90 /",370 );
	TicketInformation TI5= new TicketInformation("Aravali Exprerss /" ,19708, " /Borivali", " /Jaipur", "/Jay /",32, " /Male", " /RAC-44 /",280 );
	TicketInformation TI6= new TicketInformation("Grand Trunk Express /" ,-12615, " /Gwalior /", " Chennai Mgr /", "Ridhi /",21, "/ Female/ ","GNWL-6 /",630 );
	TicketInformation TI7= new TicketInformation("MaS CMS EXP /" ,06340, " /Mgr Chennai", " /Guntakal", " /pritesh /",25, " /Male"," /PQWL-77 / ",530 );
	
	
	HashMap HM = new HashMap();
	
   HM.put(1234567812, TI1);
   HM.put(1234567813, TI2);
   HM.put(1234567814, TI3);
   HM.put(1234567815, TI4);
   HM.put(1234567816, TI5);
   HM.put(1234567817, TI6);
   HM.put(1234567818, TI7);
   
   
   

	
	System.out.println("-----------------------------------------------");
	 boolean flag=false;
	System.out.println("Storing data for only key in Integer type I ");
           Set	IT=HM.entrySet();
            Iterator ITS =IT.iterator();
	 Scanner Scan = new Scanner(System.in);
	 System.out.println("Kindly enter your PNR Number");
	 Integer IS = Scan.nextInt();
	while(ITS.hasNext())
	{
	Map.Entry  Values=(java.util.Map.Entry)ITS.next();
		Object I=Values.getKey();
		if(IS.equals(I))
		{
			System.out.println("your PNR:----> " + I +" STATUS:-----> "+ Values.getValue());

		flag=true;
	}
	
	}	

		
if(flag== false)
{
	System.out.println("kindly enter valid data");
}
	
	
 
	}
}
// Q1. I am not able to access Map.Entry its Throwing an CE why?

   


