import java.util.*;
public class ConvertFromMilligrams {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter total number of milligrams: ");
      int totalMill = scan.nextInt();
      int kg = totalMill/1000000;
      totalMill %=1000000;
      int mg = totalMg %1000;
      int g = totalMg/1000;
      System.out.println(kg + " kilograms " + g + " grams and " + mg + " milligrams");
    }

}