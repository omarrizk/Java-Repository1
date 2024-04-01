import java.util.*;
public class StudentNames
   {
      public static void main(String[] args)
      {
      Scanner scan = new Scanner(System.in);
      String[] name = new String[3];
      System.out.println("Please enter 3 student names");
      for(int i = 0; i < 3; i++)
      {
      name[i] = scan.nextLine();
      }
      int sum = 0;
      for(int i = 0; i < 3; i++)
      {
      sum += name[i].length();
      }
      double average = sum/3;
      String firstLetters = "";
      for(int i = 0; i < 3; i++)
      {
      firstLetters += name[i].charAt(0);
      }
      System.out.println(average);
      System.out.println(firstLetters);
   }
}