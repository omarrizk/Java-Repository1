public class Test7 {public static void main(String[] args) { int[] first = {1, 0,-1};int[] second = {1, 2,1};bigSwap(second,first[1]); System.out.println(first[1] + " " + second[1]);}public static void bigSwap(int[] first, int second) { int temp=first[1];first[1]=second*2; second=temp;}}