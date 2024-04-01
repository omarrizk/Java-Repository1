import java.util.Scanner;
public class TestPairOfDice{

   public static void main(String[] args)
   {
      int val1, val2;
      String color1, color2;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter initial die values");
      val1 = scan.nextInt();
      val2 = scan.nextInt();
      System.out.println("Enter colors of both dice");
      color1 = scan.next();
      color2 = scan.next();
      PairOfDice die = new PairOfDice(val1, val2);
      die.setDice1(val1, color1);
      die.setDice2(val2, color2);
      System.out.println("Sum of face values before roll: " + die.pairSum());
      die.roll();
      System.out.println("Sum of face values after roll: " + die.pairSum());
      System.out.println(die);
   }

}