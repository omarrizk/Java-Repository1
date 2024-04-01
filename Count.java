import java.util.Scanner;
public class Count{
public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   final int max = 50;
   final int min = 0;
  
   int[] counter = new int[max+1];
   System.out.println("Enter a value between 0 and 50 inclusive");
   int val = scan.nextInt();
   while(val >= 0 && val <=50){
      counter[val] = counter[val] + 1;
   
      System.out.println("Enter in a value");
      val = scan.nextInt();
      
      }
  for(int i = 0; i < counter.length; i++){
        if(counter[i] > 0){
         System.out.println("There were " + counter[i] + " occurances at the value " + i );
        }
      }
   }

}