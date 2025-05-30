package demo;
 abstract class machine {
	 abstract void ATM();
	 public void ATM2() {
		 System.out.println("atm using java with php");
		 
	 }
	 

}
class Bank extends machine{
	void ATM() {
		System.out.println("Atm machine using java");
	}
}
public class A{
	public static void main(String[]args) {
		Bank b=new Bank();
		b.ATM();
		b.ATM2();
	}
}