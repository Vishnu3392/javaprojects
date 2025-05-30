package demo;
interface printable{
	void print();
	
}
class Message implements printable{
	public void print() {
		System.out.println("hello from interface");
	}
}

public class InterfaceExample {
	public static void main (String[]args) {
		Message m=new Message();
	m.print();
	}
	

}
