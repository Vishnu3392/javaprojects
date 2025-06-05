package demo;

public class LinearSearchexample {
	public static void main(String[]args) {
		int[] numbers= {5,8,3,24,9,3};
		int target=9;
		boolean found=false;
		for(int i=0;i<numbers.length;i++) {
			  if (numbers[i] == target) {
			System.out.println("Found "+"|"+target+"at index "+i);
			found=true;
			break;
		}
	
		
	}

}
}
