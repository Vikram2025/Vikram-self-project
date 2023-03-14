import java.io.*;

/*
 public java.io.ObjectOutputStream(java.io.OutputStream) throws java.io.IOException;
 public java.io.FileOutputStream(java.lang.String) throws java.io.FileNotFoundException;
 public final void writeObject(java.lang.Object) throws java.io.IOException;

 public java.io.ObjectInputStream(java.io.InputStream) throws java.io.IOException;
 public java.io.FileInputStream(java.lang.String) throws java.io.FileNotFoundException;
 public final java.lang.Object readObject() throws java.io.IOException, java.lang.ClassNotFoundException;

*/

class Animal 
{
	int i = 10;
	Animal(){
		System.out.println("Animal constructor called...");
	}
}

class Dog extends Animal implements Serializable
{
	int j = 20;
	Dog(){
		System.out.println("Dog constructor called...");
	}
}

class ParentRule
{
	public static void main(String[] args)throws Exception 
	{
			
			Dog d = new Dog();
			d.i = 888;
			d.j = 999;

			System.out.println("Serialization started.....");
			String fileName = "abc.ser";
			FileOutputStream fos   = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			System.out.println("Serialization ended.....");

			//To pause the execution till we press some key from keyboard
			System.in.read();

			System.out.println("De-Serialization started.....");
			FileInputStream fis   = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog d1=(Dog)ois.readObject();
						
			System.out.println(d1.i+"------>"+d1.j);
			System.out.println("De-Serialization ended.....");
	
	}
	//JVM shutdown now
}
