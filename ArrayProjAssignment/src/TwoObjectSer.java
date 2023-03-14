import java.io.*;
/*
 public java.io.ObjectOutputStream(java.io.OutputStream) throws java.io.IOException;
 public java.io.FileOutputStream(java.lang.String) throws java.io.FileNotFoundException;
 public final void writeObject(java.lang.Object) throws java.io.IOException;

 public java.io.ObjectInputStream(java.io.InputStream) throws java.io.IOException;
 public java.io.FileInputStream(java.lang.String) throws java.io.FileNotFoundException;
 public final java.lang.Object readObject() throws java.io.IOException, java.lang.ClassNotFoundException;
*/

class Doges implements Serializable
{
	static{
		System.out.println("static block gets executed...");
	}
	Doges(){
		System.out.println("Dog Object is created...");
	}

	int i = 10;
	int j = 20;
}

class Cat implements Serializable
{
	static{
		System.out.println("static block gets executed...");
	}
	Cat(){
		System.out.println("Cat Object is created...");
	}

	int i = 100;
	int j = 200;

}
class TwoObjectSer
{
	public static void main(String[] args)throws Exception 
	{
			Doges d = new Doges();
			Cat c = new Cat();

			System.out.println("Serialization started.....");
			String fileName = "abc.ser";
			FileOutputStream fos   = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.writeObject(c);
			System.out.println("the object value are "+ d.i + "------>"+ c.j);
			System.out.println("Serialization ended.....");

			//To pause the execution till we press some key from keyboard
			System.in.read();

			System.out.println("De-Serialization started.....");
			FileInputStream fis   = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Doges d1=(Doges)ois.readObject();
			Cat c1=(Cat)ois.readObject();
			
			
			System.out.println("Dog object data is:: "+d1.i+" ---> "+d1.j);
        	System.out.println("Cat object data is:: "+c1.i+" ---> "+c1.j);
			
		
			System.out.println("De-Serialization ended.....");
	
	}
	//JVM shutdown now
}

