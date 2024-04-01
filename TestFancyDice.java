public class TestFancyDice
{
   public static void main(String[] args)
   {
      FancyDie d1 =  new FancyDie();
      //scanner and ask the use for a string (color)
      FancyDie d2 =  new FancyDie(2, "Black");
      
      //print the information for both dice
      System.out.println(d1);
      System.out.println(d2);
      
      //Write code that repeatedly rolls both dice until
      //they are equal. The program then prints the number
      //of roll until this happens
      
      int numRolls=0;
      //while the dice are not equal
     while (d1.equals(d2)!=true)//while (!d1.equals(d2))
      {
         d1.roll();
         d2.roll();
         System.out.println("After roll\n"+d1+"\n"+d2);
         //escape sequence "hello\""=>hello"
         //escape sequence \n, \', \", \t
         numRolls += 1;
       }
      
      System.out.println("It took "+numRolls+" rolls for the dice to be equal");
      //Modify the program so that it repeatedly rolls the first die
      //while it stays bigger than the second die.
      //The program prints the the screen the number of rolls for this to happen.
      numRolls=0;
      while (d1.compareTo(d2)==1)
      {
         d1.roll();
          System.out.println("After roll\n"+d1+"\n"+d2);
         numRolls += 1;
       }
      
      System.out.println("It took "+numRolls+" rolls for the first die to stay bigger than the second");

      
    }
  } 