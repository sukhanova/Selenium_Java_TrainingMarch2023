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


        // 6. print all odd and even numbers between 1 and 100
        System.out.println("----------");
        System.out.println("Q6:");
        for (int q6Num = 1; q6Num <= 100; q6Num++){
            if(q6Num %2 == 0){
                System.out.println(q6Num + " is even number");
            }else{
                System.out.println(q6Num + " is odd number");
            }
        }

       // 7. What will be the output of this program:
//        int i = 1;
//        while(i<=1){
//            System.out.println("Hi Java"); // infinite loop because we do not increase a variable used in conditionll never end
//        }

        // 8. Print A-Z, a-z, 0-9 with the respective ASCII numbers the console one using while and for loop.
        System.out.println("-------");
        System.out.println("Q8:");

        System.out.println("While loop:");

        // Capital letters A-Z
        int capLetterCounter = 65;
        while(capLetterCounter <= 90){
            System.out.println((char)capLetterCounter + " = " + capLetterCounter);
            capLetterCounter++;
        }

        // small letters a-z
        int smallLetterCounter = 97;
        while (smallLetterCounter <= 122){
            System.out.println((char) smallLetterCounter + " = " + smallLetterCounter);
            smallLetterCounter++;
        }

        // numbers 0-9
        int numbersCounter = 48;
        while (numbersCounter <= 57){
            System.out.println((char)numbersCounter + " = " + numbersCounter);
            numbersCounter++;
        }

        // Capital Letters A-Z
        System.out.println("For loop:");
        for (char c = 'A'; c <= 'Z'; c++){
            System.out.println(c + " = " + (int) c);
        }

        // small letters a-z
        for (char c = 'a'; c <= 'z'; c++){
            System.out.println(c + " = " + (int) c);
        }

        // numbers 0-9
        for (char c = '0'; c <= '9'; c++){
            System.out.println(c + " = " + (int) c);
        }

        // 9. Print the following series:
        // 1.0 2.0 3.0 ...... 10.0
        // 0 9 18 27 36 …99
        System.out.println("------");
        System.out.println("Q9:");
        System.out.println("Print doubles:");
        for (double d = 1.0; d <= 10.0; d++){
            System.out.println(d);
        }

        System.out.println("Print integers:");
        int num = 0;
        while (num < 100){
            System.out.println(num);
            num++;
        }

        // 10. Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
        System.out.println("-----");
        System.out.println("Q10:");

        System.out.println("For loop:");
        for (char c = 'a'; c <= 'z'; c++){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println("Vowel letter: " + c);
            } else {
                System.out.println(c);
            }
        }

        System.out.println("While loop:");
        char letter = 'a';
        while (letter <= 'z'){
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                System.out.println("Vowel letter: " + letter);
            } else{
                System.out.println(letter);
            }
            letter++;
        }


        // 11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
        System.out.println("------");
        System.out.println("Q11:");
        int maxNumberToMultiply = 1;
        while (maxNumberToMultiply <= 10){
            System.out.println(maxNumberToMultiply + " * " + 1);
            if(maxNumberToMultiply == 7){
                System.out.println("bye, see you tomorrow");
                break;
            }
            maxNumberToMultiply++;
        }

    }
}
