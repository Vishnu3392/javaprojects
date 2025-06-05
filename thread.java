package demo1;

class car extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
		System.out.println("BMW car is moving"+i);
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			
	}
		}
	}
	
}
class bike extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
		System.out.println("ninja bike is moving"+i);
		try {
			Thread.sleep(500);
		}catch(Exception e) {
	}
		}
	}
	
}
public class thread {
	public static void main(String[]args) {
		new car().start();
		new bike().start();

}}