import java.util.Scanner;
public class Paint {
public static void main(String[] args) {
   final int COVERAGE = 350;  
   int length, width, height;
   double totalSqFt;
   import java.util.Scanner;
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter the length of the room:");
   length = sc.nextInt();
   System.out.print("Enter the width of the room:");
   width = sc.nextInt();
   System.out.print("Enter the height of the room:");
   height = sc.nextInt();
   totalSqFt = height*length*2 + width*height*2;
   paintNeeded = totalSqFt/COVERAGE;

   
   }
}