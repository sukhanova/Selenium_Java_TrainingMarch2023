package javaassignments;


import java.util.Arrays;

public class Array_ArrayList {

    public static void main(String[] args){

        /*
        * Q1: Write a program to delete a specific number from the given array:
        * int p[] = {1,4,5,2,3,22,31, 2};
        * remove 22 from the p[] array
        * expected output: [1, 4, 5, 2, 3, 31, 2]
        * */

        System.out.println("Question 1:");
        // original array
        int p[] = {1,4,5,2,3,22,31,2};
        System.out.println("Original array: "+ Arrays.toString(p));
        int pArrLength = p.length;
        int indexOfElemToRemove = 6;

        // new array of the size 1 less than original array
        int newArray_p []= new int[pArrLength -1];

        for (int index = 0; index < pArrLength; index++){
            if (index < indexOfElemToRemove){
                // copying all elenets to new array before elem to delete
                newArray_p[index] = p[index];
            }
            else {
                // copying the rest of elements after elem to delete
                newArray_p[index -1] = p[index];
            }
        }

        System.out.println("New array: " + Arrays.toString(newArray_p));
    }
}
