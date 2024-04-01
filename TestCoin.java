public class TestCoin {
   public static void main(String[] args) {
      int tailCount = 0, headCount = 0;
      for(int i=0; i<25; i++){
         MonetaryCoin myCoin = new MonetaryCoin();
         myCoin.flip();
         System.out.println(myCoin.toString());
         if(myCoin.isHeads()){
         headCount++;
         System.out.println("The coin has head and you win.");
         }else{
         tailCount++;
         System.out.println("The coin has tail and you lose.");
         }
        }
      System.out.println("Number of Heads: "+ headCount);
      System.out.println("Number of Tails: "+ tailCount );
      System.out.println("Average: "+(tailCount*100) / 25);
      }

}