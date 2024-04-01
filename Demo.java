import java.util.Scanner;
public class Demo{
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter number of executives: ");
   int n = scan.nextInt();
   Executive[] arr = new Executive[n];
   for(int i = 0; i < arr.length; i++){
   System.out.printf("Enter name of executive ", (i+1));
   String name = scan.next();
   System.out.printf("Enter address of executive ", (i+1));
   String address = scan.next();
   System.out.printf("Enter the pay rate of executive: ", (i+1));
   double rate = scan.nextDouble();
   System.out.printf("Enter the bonus awarded to executive: ", (i+1));
   double execBonus = scan.nextDouble();
   System.out.printf("Enter phone of executive: ", (i+1));
   String phone = scan.next();
   System.out.printf("Enter social security number of executive ", (i+1));
   String social = scan.next();
   arr[i] = new Executive(name, address, phone, social, rate);
   try {
   arr[i].awardBonus(execBonus);
   } catch (BonusTooHighException w) {
   System.out.println(w.getMessage());
  }
  }
   for(int i=0; i<n; i++) {
   if(arr[i].getBonus() > 0) {
      double bonus = arr[i].getBonus();
      System.out.printf("Employee:"+ (i+1) + "Average Pay: " + arr[i].pay() + "Bonus: " +  bonus);
   
}

}
}

}