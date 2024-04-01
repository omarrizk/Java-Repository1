public class UnitConverter {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter length in inches : ");
      double inch = sc.nextDouble();
      double foot = 0.0833333 * inch;
      System.out.println("Length in foot : " + foot);

   }
}