package demo1;

import java.util.ArrayList;

class ArrayListpractice {
    // Constructor (no return type)
    public ArrayListpractice() {
        System.out.println("list of students");
    }
    
    
       
}

class LinkedList1 extends ArrayListpractice {
    // Constructor (no return type)
    public LinkedList1() {
        System.out.println("list of names");
    }
}

public class Alllists {

    public static void main(String[] args) {
        // Create an object of ArrayListpractice
        //ArrayListpractice studentsList = new ArrayListpractice();
        
        // Create an object of LinkedList1
        LinkedList1 namesList = new LinkedList1();
    }
}
