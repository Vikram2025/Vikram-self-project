interface Dog{
	public void color();
}
class GermanShepherd implements Dog{
	public void color() {
		System.out.println("The color of the germanshepherd is brown");
	}
}
class Bulldog implements Dog{
	public void color() {
		System.out.println("The color of the Bulldog is white");
	}
}
class SoundOfDog{
	public void sound(Dog DG) {
		System.out.println("The sound of a dog is bow bow ...");
		DG.color();
	}
}


public class MyMain {

	public static void main(String[] args) {
		
		Dog DG= new Bulldog();
		SoundOfDog SDG= new SoundOfDog();
		SDG.sound(DG);
		
	

	}

}
