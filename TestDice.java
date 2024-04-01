public class TestDice{

   public static void main(String[] args){
   
   Die[] a = new Die[50];
   int count = 0;
   for(int i = 0; i < a.length; i++){
      a[i] = new Die();
      a[i].roll();
   if(a[i].getFaceValue() % 2 != 0){
      count++;
         }
      }
   System.out.println("There are "+ count + " die objects with odd face values");
   }
}