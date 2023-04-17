package javasessions;

public class LoopsConcept {

    public static void main(String[] args){
        // Print values from 1 to 10:

        // while loop:
        System.out.println("While loop:");
        int indWhileLoop = 1;
        while(indWhileLoop <= 10){
            System.out.println(indWhileLoop);
            indWhileLoop++;
        }

        // for loop
        System.out.println("---------");
        System.out.println("For loop:");
        int indForLoop = 1;
        for(int index = 1; index <= 10; index++){
            System.out.println(index);
        }

        // do-while loop
        System.out.println("----------");
        System.out.println("Do-While loop:");
        int newIndex = 1;
        do{
            System.out.println(newIndex);
            newIndex++;
        }while(newIndex <= 10);
    }
}
