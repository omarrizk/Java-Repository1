import java.util.*;
class app
   {
    public static boolean playGame()
    {
       Die die = new Die();
       Scanner scan = new Scanner(System.in);
       System.out.print("Choose a number between 2 and 12 ");
       int choice = scan.nextInt();
       for(int i = 0; i < 3; i++)
       { 
          die.roll();
          int roll1 = die.getFaceValue();
          die.roll();
          int roll2 = die.getFaceValue();
          int score = roll1 + roll2;
          if(score == choice)
            return true;
       }  
       return false;
      
    }
    public static void main(String[] args)
    {
       int person = 0;
       int compScore = 0;
       while(person < 100 && compScore < 100)
       {
          if(playGame())
              person += 5;
          else
              compScore += 3;  
          System.out.println("Persons score: " + person + ". Computer Score: " + compScore + "\n");  
       }
       if(person >= 100)
           System.out.println("Person won the game");
       else
           System.out.println("Computer won the game");     
    }
}