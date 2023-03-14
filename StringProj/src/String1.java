class ST1
{
 protected int a  ;
 protected int b;

public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public float getResult() {
	return result;
}
public void setResult(int result) {
	this.result = result;
}
protected float result;	
 void add()
{
result = (a+b);

}
}
 class Cal extends ST1{
	  void sub(){
	  
	  result = a-b;
	  }
	  void mul() {
		  result = a*b;
	  }
	  void div() {
		  result = a/b;
	  }
	
	
}


public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Cal RE= new Cal();
RE.setA(20);
RE.setB(20);
RE.mul();
System.out.println(RE.getResult());
RE.div();
System.out.println(RE.getResult());
RE.add();
System.out.println(RE.getResult());
RE.sub();
	   
	
		System.out.println(RE.getResult());
	}
	}


