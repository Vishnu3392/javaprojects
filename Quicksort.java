package demo1;

public class Quicksort {

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);  
            quicksort(arr, low, pivotIndex - 1);        
            quicksort(arr, pivotIndex + 1, high);       
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  
        int i = low - 1;        

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
               
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

       
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; 
    }
    public static void printArray1(int[]arr) {
    	for(int num:arr)
    		System.out.print(num+" ");
    	System.out.println();
    	
    }

   
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("original array:");
      printArray1(arr);
      
        quicksort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		
	}
}

