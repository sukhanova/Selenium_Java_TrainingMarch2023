package javasessions;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListConcept {

    public static void main(String[] args){

        // ArrayList - dynamic array (size is going to increase when add new element)

        // create the ArrayList Object
        ArrayList arr = new ArrayList<>();
        arr.add(true);
        arr.add(200);
        arr.add("Oliver");
        arr.add(18.71);

        // to print length of array - use .size() method
        System.out.println("Size of array is: "+ arr.size());
        System.out.println(arr);

        // Print each element of array
        for (var element:arr) {
            System.out.println(element);
        }

        // Get element of array by index:
        System.out.println(arr.get(0));

        // To add arrayList with multiple data types:
        ArrayList<Object> employeeData = new ArrayList<Object>();
        employeeData.add("Paul");
        employeeData.add("167190");
        employeeData.add('m');
        employeeData.add(35.18);
        employeeData.add(true);

        System.out.println(employeeData);

        //to print elements of ArrayList:
        //1. for loop:
        System.out.println("Printing arrayList elements using For loop:");
        for (int i = 0; i <employeeData.size(); i++){
            System.out.println(employeeData.get(i));
        }

        System.out.println("Printing arrayList elements using ForEach loop:");
        for (Object element: employeeData) {
            System.out.println(element);
        }

        // Using condition withing loop:
        System.out.println("Printing arrayList elements using ForEach loop with condition:");
        for (Object element: employeeData) {
            System.out.println(element);
                if(element.equals(35.18)){
                    System.out.println("Match found!");
                    break;
                }
        }
    }
}
