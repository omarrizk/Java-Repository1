public class PairOfDice
{
   Die d1 = new Die();
   Die d2 = new Die();
   public PairOfDice(int v1, int v2)
   {
      d1.setFaceValue(v1);      
      d2.setFaceValue(v2);
   }
   public void setDice1(int val, String color)
   {
      d1.setFaceValue(val);
      d1.setColor(color);
   }
   public void setDice2(int val, String color)
   {
      d2.setFaceValue(val);
      d2.setColor(color);
   }
   
   public int getDice1()
   {
      return d1.getFaceValue();
   }
   public int getDice2()
   {
      return d2.getFaceValue();
   }

   public void roll()
   {
      d1.roll();
      d2.roll();
   }
   
   public String toString()
   {
      return "Colors of both dice " + d1.getColor() +", " + d2.getColor();
   }
   
   public int pairSum()
   {
      return d1.getFaceValue() + d2.getFaceValue();
   }
   
}