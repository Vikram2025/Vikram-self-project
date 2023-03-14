import java.io.*;

import javax.imageio.IIOException;


class Student implements Serializable



{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	String name = "rajesh";
	int standard = 4;
	int RollNumber = 1234235;
	int marks = 267;
	
}


public class Practice1Seri {
 
	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		Student s = new Student();
		
 System.out.println("program output decoding started");
           String file= "student.ser";
     FileOutputStream FOS = new FileOutputStream("student.txt");
     System.out.println("program output coding in process-------------------");
     ObjectOutputStream OOS = new ObjectOutputStream(FOS);
            OOS.writeObject(s);
System.out.println("program output decoding finished");

       System.in.read();

System.out.println("program Input decoding started");
FileInputStream FIS = new FileInputStream("student.txt");
ObjectInputStream OIS = new ObjectInputStream(FIS);
Student  S1= (Student)OIS.readObject();

System.out.println("the name of a student is "+ S1.name +" the student is studying in "+ S1.standard +" standard he scored "+ S1.marks + " and his rollnuber is " + S1.RollNumber );
System.out.println("program Input decoding finished");


	}

}
