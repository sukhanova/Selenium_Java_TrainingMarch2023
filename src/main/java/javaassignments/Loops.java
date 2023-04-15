package javaassignments;

public class Loops {
    public static void main(String[] args){

        //1. Print "I am a Batman" * 5 times
        System.out.println("Q1:");
        int counter = 0;
        do {
            System.out.println("I am a Batman");
            counter++;
        }while (counter < 5);

        // 2. Print "I am Batman 1" from 1 to 9
        System.out.println("Q2:");
        int topNumber = 10;
        for (int i = 1; i < topNumber; i++){
            System.out.println("I am a Batman " + i);
        }

        // 3. Print 10 to 1 using for, while and do-while loop
        System.out.println("Q3:");
        System.out.println("For loop:");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("-----");
        System.out.println("While loop:");
        int maxNum = 10;
        while (maxNum >=1){
            System.out.println(maxNum);
            maxNum--;
        }


        System.out.println("-----");
        System.out.println("Do-While loop:");
        int maxNumber = 10;
        do{
            System.out.println(maxNumber);
            maxNumber--;
        }while (maxNumber >=1);


        //4. Print "Hello World" ten times using while loop
        System.out.println("-------");
        System.out.println("Q4:");
        int q4Counter = 10;
        while (q4Counter >= 1){
            System.out.println("Hello World");
            q4Counter--;
        }

        // 5. Print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
        System.out.println("-------");
        System.out.println("Q5:");
        System.out.println("While loop:");
        int q5counter = 1;
        while (q5counter <= 100){
            System.out.println(q5counter);
            q5counter *=5;
        }

        System.out.println("For loop:");
        for (int iForCounter = 1; iForCounter <= 100; iForCounter*=5){
            System.out.println(iForCounter);
        }

        System.out.println("Do-While loop:");
        int iDoWhileCounter = 1;
        do {
            System.out.println(iDoWhileCounter);
            iDoWhileCounter*=5;
        }while(iDoWhileCounter <= 100);


        // 6. print all odd and even numbers between 1 to 100
        System.out.println("----------");
        System.out.println("Q6:");
        for (int q6Num = 1; q6Num <= 100; q6Num++){
            if(q6Num %2 == 0){
                System.out.println(q6Num + " is even number");
            }else{
                System.out.println(q6Num + " is odd number");
            }
        }
    }
}
