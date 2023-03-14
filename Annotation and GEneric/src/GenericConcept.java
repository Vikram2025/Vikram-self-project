class Demo <T>{
	T Vik;
	  Demo (T Vik){
	this.Vik = Vik;
		;
	
	}
	  
	  
	 public T getVik() {
		return Vik;
	}


	public void Display(){
		  System.out.println("the generic type is "+ Vik.getClass().getSimpleName());
	  }
	 
	
}






public class GenericConcept {

	public static void main(String[] args) {
	 Demo <Integer> IT=new Demo<Integer>(234);
	 IT.Display();
	 System.out.println(IT.getVik());
	 
	 
	}

}
