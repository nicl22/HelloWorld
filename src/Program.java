import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //creating an object user
        User user = new User();
        Scanner input = new Scanner(System.in);

        //create a boolean operator and counter for number of inputs allowed
        Boolean loggedIn = false;
        int i=1;
        String usernameInput;
        //do while loop that will ke
        do{
            System.out.println("username : ");
             usernameInput = input.next();
            System.out.println("password: ");
            //input for password
            String passwordInput = input.next();
            //checking password and username input
            if (usernameInput.equals(user.getUsername())) {
                if (passwordInput.equals(user.getPassword())) {
                    System.out.println("Logged in");
                    loggedIn=true;
                } else {
                    System.out.println("Incorrect username/password");
                }
            } else {
                System.out.println("Incorrect username/password");
            }
        }
        while(loggedIn == false);

    }
}