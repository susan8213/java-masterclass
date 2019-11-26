package academy.learnprogramming;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        // String is an object, or called object "wrapper"
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

        //Error:  ArrayList<int> intArrayList = new ArrayList<>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // Integer is an object, or called object "wrapper", int is primitive type
        ArrayList<Integer> intArrayList = new ArrayList<>();
        // Autoboxing: converting primitive type "int" to object wrapper "Integer"
        for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i)); // "Integer.valueOf()" is autoboxing
        }
        //Unboxing: converting object wrapper back to a primitive type
        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());  // Integer.intValue() is unboxing
        }

        Integer myIntValue = 56; // compiler will convert "56" to "Integer.valueOf(56)"
        int myInt = myIntValue;  // compiler will convert "myIntValue" to "myIntValue.intValue()"

        // Double case
        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for(int i=0; i<myDoubleValues.size(); i++) {
            System.out.println(i + " --> " + myDoubleValues.get(i).doubleValue());
        }

    }
}
