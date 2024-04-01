public class UnitConverterS
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in grams : ");
        double gram = sc.nextDouble();
        double pound = gram / 453.592;
        System.out.println("Weight in pound : " + pound);
    }
}