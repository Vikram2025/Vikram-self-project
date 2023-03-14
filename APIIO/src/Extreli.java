import java.io.*;

/*
 public java.io.ObjectOutputStream(java.io.OutputStream) throws java.io.IOException;
 public java.io.FileOutputStream(java.lang.String) throws java.io.FileNotFoundException;
 public final void writeObject(java.lang.Object) throws java.io.IOException;

 public java.io.ObjectInputStream(java.io.InputStream) throws java.io.IOException;
 public java.io.FileInputStream(java.lang.String) throws java.io.FileNotFoundException;
 public final java.lang.Object readObject() throws java.io.IOException, java.lang.ClassNotFoundException;

*/
class Demo implements Externalizable
{
	transient String name;
	int i;
	int j;

	public Demo(){
		System.out.println("public zero argument constructor is called");
	}

	public Demo(String name,int i,int j){
		this.name =name;
		this.i = i;
		this.j = j;
	}
	
	//Write the logic of selective Serialization
	public void writeExternal(ObjectOutput oo) throws IOException{
		System.out.println("writeExternal() is called for Serialization....");

		//variables need to participated write into abc.ser
		oo.writeObject(name);
		oo.writeInt(i);
		
	}

	// Write a logic of selective Deserialzation
	public  void readExternal(ObjectInput oi) throws IOException,
	  ClassNotFoundException{
		System.out.println("readExternal() is called for DeSerialization....");

		//variables need to retrived from abc.ser
		name = (String)oi.readObject();
		i    = oi.readInt();
	}

}

class Extreli
{
	public static void main(String[] args)throws Exception 
	{
			Demo d1 = new Demo("sachin",10,100);
			
			System.out.println("Serialization started.....");
			String fileName = "abc.ser";
			FileOutputStream fos   = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);
			System.out.println("Serialization ended.....");

			//To pause the execution till we press some key from keyboard
			System.in.read();

			System.out.println("De-Serialization started.....");
			FileInputStream fis   = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Demo d2 = (Demo)ois.readObject();
						
			System.out.println(d2.name+" ----->"+d2.i);
			System.out.println("De-Serialization ended.....");
	
	}
	//JVM shutdown now
}

