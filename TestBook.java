import java.util.Scanner;
public class TestBook{
public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int pageSum = 0, pageCount = 0;
   String bookTitle = "";
   Book smallestBook = new Book(pageCount, bookTitle);
   System.out.print("How many books you read this summer: ");
   int numberOfBooks = scan.nextInt();
   scan.nextLine();
   for (int i = 0; i <numberOfBooks; i++) {
      System.out.print("Enter book title: ");
      bookTitle = scan.nextLine();
      System.out.print("Enter page count: ");
      pageCount = scan.nextInt();
      pageSum += pageCount;
      numberOfBooks += 1;
      Book newBook = new Book(pageCount, bookTitle);
      if (smallestBook != null) {
         if (smallestBook.compareTo(newBook) < 0) {
            smallestBook = newBook;
      }
            } else {
                smallestBook = newBook;
            }

            scan.nextLine();
        }

        System.out.println("Average Page: " + pageSum / numberOfBooks);
        System.out.println("Smallest Book: "+ smallestBook);
    }
}