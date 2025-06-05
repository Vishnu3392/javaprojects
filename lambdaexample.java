package demo;
interface message{
	void say();
}
public class lambdaexample {
	public static void main(String[]args) {
		message hellomessage=()->System.out.println("this is lambda");
		hellomessage.say();
	}

}
