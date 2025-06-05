package demo;

class animal{
	void sound() {
		System.out.println("animal has different sounds");
	}
}
class dog extends animal{
	void sound() {
		System.out.println("dog barks");
	}
}
class cat extends animal{
	void sound() {
		System.out.println("cat meows");
	}
}


public class methodoverride {

	public static void main(String[] args) {
		animal a = new animal();
		animal a1= new dog();
		animal a2 =new cat();
		a.sound();
		a1.sound();
		a2.sound();
		

	}

}
