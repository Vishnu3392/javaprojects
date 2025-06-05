package demo1;

class car1 implements Runnable{
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
class bike1 implements Runnable{
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


public class samplerunnable {

	public static void main(String[] args) {
		Thread carthread = new Thread(new car1());
		Thread bikethread = new Thread(new bike());
	    carthread.start();
        bikethread.start();
	}

}
