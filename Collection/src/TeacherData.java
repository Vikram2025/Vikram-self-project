import java.util.*;



class Information {
	private int batchnumber;
	private  String name;
	private String subject;
	private int salary ;
	
	public  Information (int batchnumber, String name, String subject,int salary ) {
		this.batchnumber=batchnumber;
		this.name=name;
		this.subject=subject;
		this.salary=salary;
	}
		
	
	public int getBatchnumber() {
		return batchnumber;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getSalary() {
		return salary;
	}

   @Override 
   public String toString()
   {
	   return batchnumber + " " + name + " " + subject + " " + salary; 
   }
	
}





public class TeacherData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Information TCI1= new Information(12,"Sai Krishna", "Maths", 28000);
Information TCI2= new Information(13,"ridhi", "Science", 27000);
Information TCI3= new Information(14,"chirag", "Computer", 35000);
Information TCI4= new Information(11,"jay", "Arts", 26000);

ArrayList AL= new ArrayList ();
AL.add(TCI1);
AL.add(TCI2);
AL.add(TCI3);
AL.add(TCI4);
System.out.println("before storing it in a object just for printing on console");
System.out.println(AL);
System.out.println("after storing it in a object type O");
        Iterator IT=AL.iterator();
        while (IT.hasNext()) {
        	Object OB = IT.next();
        	System.out.println(OB);
        	
        }
        
	}

}
