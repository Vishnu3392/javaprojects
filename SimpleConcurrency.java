package demo1;
class Mytask extends Thread{
	private String taskName;
	public Mytask(String taskName){
		this.taskName=taskName;
	}
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println(taskName+"Steps awersdtygjok'psviehnihvgfd" +i);
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println(taskName+"was interrupted.");
	}
}
}}
public class SimpleConcurrency {
	public static void main(String[]args) {
		Mytask t1 = new Mytask("Cooking ");
		Mytask t2 = new Mytask("Washing ");
		t1.start();
		t2.start();
		
	}

}
