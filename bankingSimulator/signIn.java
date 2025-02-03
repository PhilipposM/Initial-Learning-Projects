import java.util.Scanner;

public class signIn {

  void acountEntrance(){
      boolean logInSignUp;  //if it is true then we sign up.  If false, we log in

      Scanner scanner = new Scanner(System.in); // Keep scanner open

      if(logInSignUp == false)
          System.out.print("Enter your name: ");
          String name = scanner.nextLine();
          System.out.println("Hello, " + name + "!");
          System.out.print("Enter your age: ");
          int age = scanner.nextInt();
          System.out.println("You are " + age + " years old.");
          // Don't close the scanner if you need it later
  }







}