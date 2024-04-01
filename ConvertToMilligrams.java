public class ConvertToMilligrams {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter number of kilograms: ");
       int kg = scan.nextInt();
       System.out.print("Enter number of grams: ");
       int g = scan.nextInt();
       System.out.print("Enter number of mill-grams: ");
       int milligram = scan.nextInt();
       int totalMilligram = ((kg * 1000) + g)*1000 + milligram;
       System.out.println("Total number of milli grams is " + totalMilligram);
    }

}