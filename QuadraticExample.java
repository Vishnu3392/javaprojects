package demo1;

public class QuadraticExample {

	public static void main(String[] args) {
		int[]numbers= {1,2,3,45,3,4,4};
		boolean hashDuplicate=false;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					hashDuplicate=true;
					System.out.println("Duplicate found:"+numbers[i]);
				}
			}
		}
		if(!hashDuplicate) {
			System.out.println("no duplicates found");
		}

	}

}
