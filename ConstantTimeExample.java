package demo1;

public class ConstantTimeExample {

	
		public static void printFirstElement(int[]arr) {
			if(arr.length>0) {
				System.out.println("First element is:"+arr[0]);
			}else {
				System.out.println("Arrsy is empty");
			}
			
		}
		public static void  main(String[]args) {
			int []num= {10,29,3,45,5};
			printFirstElement(num);
		}

	}


