package javasessions;

public class TimeComplexityConcept {

    public static void main(String[] args){

        /*
        * Time Complexity - amount of time required to run a program
        * */

        // O(1)
        System.out.println("O(1)");
        int i = 1;
        System.out.println(i);


        // O(n) --> linear time
        System.out.println("O(n)");
        for (int k = 1; k <= 10; k++){
            System.out.println(k);
        }
        // 1 + n + n + n = 1 + 3n ---> Linear Equation
        // 3n + 1 --> 3n --> O(3n) ---> O(n)


        System.out.println("----------");
        int p = 1;
        while (p <= 100){
            System.out.println(p);
            p++;
        }
        // 1 + n + n + n = 1+3n --> 3n --> O(3n) --> O(n)


        int j = 1;
        while (j <= 100){
            System.out.println(j);
            if (j == 30){
                System.out.println("Match is found");
            }
            j++;
        }
        // 1 + n + n + n + 1 + n = 2 +4n --> 2(2n+1) --> 4n --> O(n)


        //(O^n2)
        System.out.println("(O^n2)");

        // nested for loop:
        for (int m = 0; m <= 9; m++){
            for (int n = 0; n <= 9; n++){
                System.out.print(m + "" + n+ " ");
            }
            System.out.println();
        }
        //outer loop: (1+n+n+n)
        // inner loop: (1+n+n+n)
        // (1+n+n+n)(1+n+n+n) --> (1+3n)(1+3n) --->1+3n+3n+9n^2---> 9n^2 + 6n + 1 --Quadratic equation
        // 9n^2 + 6n ---> 3n(3n+2) --> 9n^2 --> O(n^2)
        

    }
}
