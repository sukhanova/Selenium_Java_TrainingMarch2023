package javaassignments;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array_ArrayList {

    public static void main(String[] args){

        /*
        * Q1: Write a program to delete a specific number from the given array:
        * int p[] = {1,4,5,2,3,22,31, 2};
        * remove 22 from the p[] array
        * expected output: [1, 4, 5, 2, 3, 31, 2]
        * */

        // Solution #1:
//        System.out.println("Question 1:");
//        // original array
//        int p[] = {1,4,5,2,3,22,31,2};
//        System.out.println("Original array: "+ Arrays.toString(p));
//        int pArrLength = p.length;
//        int indexOfElemToRemove = 6;
//
//        // new array of the size 1 less than original array
//        int newArray_p []= new int[pArrLength -1];
//
//        for (int index = 0; index < pArrLength; index++){
//            if (index < indexOfElemToRemove){
//                // copying all elenets to new array before elem to delete
//                newArray_p[index] = p[index];
//            }
//            else {
//                // copying the rest of elements after elem to delete
//                newArray_p[index -1] = p[index];
//            }
//        }
//        System.out.println("New array: " + Arrays.toString(newArray_p));

        // Solution #2:
        int p[] = {1,4,5,2,3,22,31,2};
        System.out.println("Original array: "+ Arrays.toString(p));
        int newArray_p []= new int[p.length -1];

        int j = 0;
        for (int i= 0; i < p.length; i++){
            if(p[i] != 22){
                newArray_p[j] = p[i];
                j++;
            }
        }
        System.out.println("New array: " + Arrays.toString(newArray_p));


        System.out.println("--------------");
        /* Q2: Write a Java program to create a new array list, which contains all color names.
        -add some colors (string)
        -and print out list of colors using loops.
        */
        System.out.println("Q2:");

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Black");
        colors.add("White");
        for (String color:colors) {
            System.out.println(color);
        }

        System.out.println("--------------");
        //3. Write a Java program to retrieve an element at a specified index from a given array list.
        System.out.println("Q3:");
        String color = colors.get(4);
        System.out.println(color);


        System.out.println("--------------");
        //4. Write a Java program to update specific array element by given element.
        System.out.println("Q4:");
        String updatedColor = "Coral";
        colors.set(5, updatedColor);
        System.out.println(colors);

        System.out.println("--------------");
        //5. Write a Java program to remove the third element from an array list.
        System.out.println("Q5:");
        int indexToRemove = 2;
        colors.remove(indexToRemove);
        System.out.println(colors);


        System.out.println("--------------");
        /*6. Write a Java program to search an element in an array list using for loop.
        Once we find that element, break the loop.*/
        System.out.println("Q6:");
        String colorLookup = "Coral";

        for (String elem:colors) {
            if(elem.equals(colorLookup)){
                System.out.println(colorLookup + " color match found!");
                break;
            }
            System.out.println(elem);
        }

        System.out.println("---------");

        /*7. Reverse this array List:
            ArrayList<String> studentNames = new ArrayList<String>();
              studentNames.add("James");
              studentNames.add("Helen");
              studentNames.add("Oliver");
              studentNames.add("Peter");
              studentNames.add("Jenna");
        * */
        System.out.println("Q7:");
        ArrayList<String> studentNames = new ArrayList<String>();
        studentNames.add("James");
        studentNames.add("Helen");
        studentNames.add("Oliver");
        studentNames.add("Peter");
        studentNames.add("Jenna");

        Collections.reverse(studentNames);
        System.out.println(studentNames);
        System.out.println("----------");

        //8. Write a Java program to extract a portion of an array list.
        System.out.println("Q8:");
        ArrayList<String> newListOfColors = new ArrayList<>(colors.subList(1, 5));
        System.out.println(newListOfColors);

        System.out.println("--------");
        //9. Write a Java program to empty an array list.
        System.out.println("Q9:");
        colors.clear();
        System.out.println(colors);
        System.out.println(colors.size());

        System.out.println("--------");
        //10. Write a Java program to trim the virtual capacity of an array list the current list size.
        System.out.println("Q10:");
        ArrayList<String> studentsList = new ArrayList<String>(12);
        studentsList.add("James");
        studentsList.add("Helen");
        studentsList.add("Oliver");
        studentsList.add("Peter");
        studentsList.add("Jenna");

        System.out.println("Size of students array list After trim: " + studentsList.size());

        //11. Write a Java program to print all the elements of an ArrayList using the position of the elements.
        ArrayList<String> colors11 = new ArrayList<String>();
        colors11.add("Orange");
        colors11.add("Yellow");
        colors11.add("Green");
        colors11.add("Blue");
        colors11.add("Purple");
        colors11.add("Black");
        colors11.add("White");

        for (int i = 0; i<colors11.size(); i++){
            System.out.println("color "+ colors11.get(i) + " has an index of "+ i);
        }

    }
}
