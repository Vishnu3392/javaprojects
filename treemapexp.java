package demo1;
import java.util.Scanner;
import java.util.TreeMap;

public class treemapexp {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        TreeMap<Integer, String> tm = new TreeMap<>();
	        tm.put(23, "a");
	        tm.put(24, "A");
	        tm.put(25, "vb");
	        tm.put(26, "B");
	        tm.put(27, "E");

	        System.out.print("Enter the value to search: ");
	        String str = sc.nextLine();

	        if (tm.containsValue(str)) {
	            System.out.println("Yes, the value '" + str + "' is present.");

	            System.out.print("Key value for this value: ");
	            for (Integer key : tm.keySet()) {
	                if (tm.get(key).equals(str)) {
	                    System.out.print(key + " ");
	                }
	            }
	            System.out.println();

	        } else {
	            System.out.println("No, the value '" + str + "' is not present.");
	        }

	        sc.close();
	    }
	}



