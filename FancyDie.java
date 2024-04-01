public class FancyDie
{
	private int faceValue;
	private String color;
	//add String color hereprivate String color;

   public FancyDie()
   {
      //faceValue=(int)(Math.random()*6)+1;
      roll();
      color="Black";
   }

   public FancyDie(int num, String s)
   {
      faceValue=num;
      color=s;
   }

   public void roll()
   {
	  faceValue=(int)(Math.random()*6)+1;
   }

   public int getFaceValue()
   {
	   return faceValue;
	}

   public void setFaceValue(int num)
   {
      faceValue=num;
    }

   public String getColor()
   {
	   return color;
   }

   public void setColor(String s)
   {
	   color=s;
   }

   public String toString()
   {
      return "Die with face: "+faceValue+" and color "+color;
    }

   //two fancy dice are equal if they have the same color and faceValue
   public boolean equals(FancyDie otherDie)
   {
       if (faceValue==otherDie.getFaceValue() && color.equals(otherDie.getColor()))
         return true;
       return false;
       //return faceValue==otherDie.getFaceValue() && color.equals(otherDie.getColor());
   }
  //for simplicity, a fancy die is smaller than the other if its facevalue is smaller than other die's
  public int compareTo(FancyDie otherDie)
  {   
     if (faceValue < otherDie.getFaceValue())
         return -1;
     else if (faceValue == otherDie.getFaceValue())
         return 0;
     else 
         return 1;
  }
   
}