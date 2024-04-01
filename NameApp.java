import java.util.Scanner;
import java.util.Random;
public class NameApp{

public static void main(String[] args){

String firstName;
String lastName;
String composition;

Scanner scan = new Scanner(System.in);

System.out.println("Enter your first name");

firstName = scan.nextLine();

System.out.println("Enter your last name");

lastName = scan.nextLine();

System.out.println("The name you entered is " + firstName + " " + lastName);
Random rand = new Random();
composition = firstName.substring(0,1) + lastName.substring(0,5) + (rand.nextInt(89) + 10);

System.out.print(composition);
   }
}