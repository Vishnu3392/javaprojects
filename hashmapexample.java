package demo1;

import java.util.HashMap;

public class hashmapexample {

	public static void main(String[] args) {
	HashMap<Integer,String> names=new HashMap<Integer,String>();
	names.put(1,"vishnu");
	names.put(2,"raj");
	names.put(3,"kowshik");
	names.put(4,"venky");
	names.put(5,"mohan");
	names.put(6,"siva");
	
	//System.out.println("names are:"+names);
	//names.remove(5);
	//System.out.println("After removing:\n"+names);
	names.put(3,"MS Dhoni");
	for(Integer rollno:names.keySet()) {
		 System.out.println(rollno + " : " + names.get(rollno));
	}
	
	}

}
