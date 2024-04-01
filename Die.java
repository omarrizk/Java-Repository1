public class Die{
   private int faceValue;
   private String color;
   //constructor
   public Die()
   {
      faceValue = 3;
   }
   // constructor with paramaters
   public Die(int value)
   {
      faceValue = value;
   }
   // getter is a method that returns the data that you want to get
   public int getFaceValue()
   {
      return faceValue;
   }
   
   public String getColor()
   {
      return color;
   }
   // setter
   public void setFaceValue(int value)
   {
      faceValue = value;
   }
   
   public void setColor(String color)
   {
      this.color = color;
   }
   // roll method
   public void roll()
   {
      faceValue = (int)(Math.random()*6) + 1;
   }
   // toString
   
   public String toString()
   {
      return "This die with face value " + faceValue;
   }
}