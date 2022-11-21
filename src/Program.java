import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String username = "food123";
        String password = "pas148!";

        Scanner input = new Scanner(System.in);
        System.out.println("user or admin enter u/a");
        String choiceInput = input.next();




        //create a boolean operator and counter for number of inputs allowed
        Boolean loggedIn = false;
        int i=1;

        while (loggedIn==false && i<=3) {


            System.out.println("username : ");
            //input for username
            String usernameInput = input.next();
            System.out.println("password: ");
            //input for password
            String passwordInput = input.next();
            //checking password and username input
            if (usernameInput.equals(username)) {
                if (passwordInput.equals(password)) {
                    System.out.println("Logged in");
                    loggedIn=true;
                } else {
                    System.out.println("Incorrect username/password");
                }
            } else {
                System.out.println("Incorrect username/password");
            }
            i++;
        }
    }
}