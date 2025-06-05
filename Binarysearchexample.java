package demo;

public class Binarysearchexample {

	public static void main(String[] args) {
		int []numbers= {3,4,5,6,5,7,8,9,7};
		int target=8;
		int left=0;
		int right=numbers.length-1;
		boolean found=false;
		while(left<=right) {
			int mid=(left+right)/2;
			if(numbers[mid]==target) {
				System.out.println("Found"+target+"at index"+mid);
				found=true;
				break;
				
			}else if(target<numbers[mid]) {
				right=mid-1;
				
			}else {
				left=mid+1;
			}
		}
		if(!found) {
			System.out.println("number"+target+"not found");
		}

	}

}
