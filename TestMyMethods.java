import java.util.Scanner;
public class TestMyMethods{
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   MyMethods m = new MyMethods();
   int width, length, height;
   double side, hypotenuse;
   Die d1 = new Die();
   Die d2 = new Die();
   Die die = new Die();
   
   System.out.println("Enter in a width");
   width = scan.nextInt();
   System.out.println("Enter in a length");
   length = scan.nextInt();
   /*
   System.out.println("Enter in a height");
   height = scan.nextInt();
   
   System.out.println("Enter a side length");
   side = scan.nextDouble();
   System.out.println("Enter a hypotenuse length");
   hypotenuse = scan.nextDouble();
   
   System.out.println("Enter color of die 1 and die 2");
   d1.setColor(scan.next());
   d2.setColor(scan.next());
   
   System.out.println("Enter face value of die 1 and die 2");
   d1.setFaceValue(scan.nextInt());
   d2.setFaceValue(scan.nextInt());
   */
   die = m.comboDie(d1,d2);
  
   System.out.println("The total surface area is " + m.surfaceArea(width, length, height));
   
   System.out.println("The other side is " + m.rightTriangle(side, hypotenuse));
   
   System.out.println("The color of die is " + die.getColor() + " the face value is " + die.getFaceValue());
   }
}