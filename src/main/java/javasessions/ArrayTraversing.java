package javasessions;

import java.util.Arrays;

public class ArrayTraversing {
    public static void main(String[] args){
        int k[] = {10, 20, 30, 40};

        // Print array
        System.out.println(Arrays.toString(k));

        // iterate the array
        // For loop (index based):
        for (int i = 0; i < k.length; i++){
            System.out.println(k[i]);
        }

        System.out.println("-----------");
        // Foreach loop:
        for (int item:k) {
            System.out.println(item);
        }

        //
        String[] browsers = new String[4];
        browsers[0] = "chrome";
        browsers[1] = "firefox";
        browsers[2] = "safari";
        browsers[3] = "edge";

        for (String element:browsers) {
            // with String we use .equals method
            if (element.equals("edge")){
                System.out.println("We do not support such browser!");
                break;
            }
            System.out.println(element);
        }


        System.out.println("-------------");
        //To store Employee data: String, int, double, char, boolean
        // use Object array: static array
        //Object is a class that can store any type of data

        // name, age, pay rate, m/f, isEmployee
        Object employees[] = new Object[5];
        employees[0] = "Tom";
        employees[1] = "25";
        employees[2] = 35.09;
        employees[3] = 'm';
        employees[4] = true;

        for (var e:employees) {
            System.out.println(e);
        }

//        for (int i = 0; i < employees.length; i++){
//            System.out.println(employees[i]);
//        }

        int counter = 0;
        for (Object e:employees) {
            System.out.println(counter + " = " + e);
            counter++;
        }

        // reverse order with index based loop:
        System.out.println("------------------------------------");
        System.out.println("reverse order with index based loop:");

        for (int i = employees.length -1; i >= 0; i--){
            System.out.println(employees[i]);
        }
    }
}
