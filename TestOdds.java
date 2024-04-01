public class TestOdds{
   public static void main(String[] args){
      int[] t = new int[] {5,7,8,3,4,9}; 
      System.out.println(totalOdds(t));
      }
   public static int totalOdds(int[] numArray){
      int count = 0;
      for(int i = 0; i < numArray.length; i++){
         if(numArray[i] % 2 != 0){
            count += 1;
         }
      }
      return count;
      }
}