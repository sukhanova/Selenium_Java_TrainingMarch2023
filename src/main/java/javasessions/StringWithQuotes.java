package javasessions;

public class StringWithQuotes {

    public static void main(String[] args){

        String str = "I love \"Java\" and its concepts";
        System.out.println(str);

        String str1 = "This is some \"java\" code and \"Selenium\" code";
        System.out.println(str1);

        String username = "admin";
        String password = "admin123";

        // String Concatenation by + (String concatenation) operator
        String url = "https://" + username + ":" + password + "@abc.com/login.html";
        System.out.println("Url is: " + url);


        // String concatenation using format() method
        String url1 = String.format("https://%s:%s@abc.com/login.html",username,password);
        System.out.println("Url1 is: "+ url1);

        // print xpath -> expected output  a[text()='Benedict']
        String userName = "Benedict";
        String xpath = "//a[text()='"+ userName +"']";
        System.out.println(xpath); //
    }
}
