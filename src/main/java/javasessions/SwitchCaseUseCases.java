package javasessions;

import java.util.Scanner;

public class SwitchCaseUseCases {
    public static void main(String[] args){

        // aeeiou case
        System.out.println("Enter a letter: ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);

        switch (letter){
            case 'a':
            case 'i':
            case 'e':
            case 'o':
            case 'u':
                System.out.println("Letter " + letter + " is a vowel");
                break;

            default:
                System.out.println("Letter " + letter + " is a consonant");
        }


        // env - dev/qa/stage/uat/prod
        System.out.println("Select environment:");
        String userEnvSelection = scanner.next();
        String environment = userEnvSelection.toString().toLowerCase();

        switch (environment){
            case "dev":
                System.out.println("Running script in dev environment");
                break;
            case "qa":
                System.out.println("Running script in qa environment");
                break;
            case "stage":
                System.out.println("Running script in stage environment");
                break;
            case "uat":
                System.out.println("Running script in uat environment");
                break;
            case "prod":
                System.out.println("Running script in prod environment");
                break;

            default:
                System.out.println("There is no " + environment + " environment found");

        }



        scanner.close();

    }
}
