import java.util.*;
public class MyMethods{

public int surfaceArea(int width, int length, int height)
{
   int surfaceArea = 2*(length * width) + 2*(length*height) + 2*(height*width);
   return surfaceArea;
}

public double rightTriangle(double sideA, double hypotenuseB)
{
  double sideC = Math.sqrt(hypotenuseB*hypotenuseB - sideA*sideA);
  return sideC;

}

public Die comboDie(Die d1, Die d2)
{
   Die combo = new Die();
   combo.setColor((d1.getColor() + "-" + d2.getColor()));
   combo.setFaceValue((d1.getFaceValue() + d2.getFaceValue()) / 2);
   return combo;
}

}