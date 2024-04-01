import java.util.Scanner;

public class Library {
   Scanner scan = new Scanner(System.in);
   private int val;
   private Book books[];
   
   public Library(){
       val = 0;
       books = new Book[10];
   }
   public void addBook(){
       String title = "";
       int pages;
       if(val!=books.length)
       {
           System.out.print("Enter Book Title: ");
           title=scan.nextLine();
           int index=search(title);
           if(index!=-1)
           {
               System.out.println("Can't have duplicate books");
           }
           else
           {
              System.out.print("Enter no of pages :");
              pages=Integer.parseInt(scan.nextLine());
              Book b=new Book(pages,title);
              books[val]=b;
              val++;
              System.out.println("Library Contents: "+val);
              System.out.println(books[val-1]);
           }
       }
       else {
           System.out.println("Library is full");
       }
   } 
   public void delete(){
       String title=" ";
       if(val == 0)
       {
           System.out.println("Library is empty");
       }
       else
       {
         System.out.print("Enter Book Title :");
         title=scan.nextLine();
         int index=search(title);
         if(index==-1){
             System.out.println("Book is not in library");
           }
           else
           {
               for(int i=index;i<val;i++){
                   books[i]=books[i+1];
               }
               val--;
           }
          System.out.println("Book is deleted from library");
       }
   }
   private int search(String title) {
          for(int i = 0; i < val; i++)
          {
              if(books[i].getTitle().equalsIgnoreCase(title))
                  return i;
          }
          return -1;
      }
 public void changeBook(){
       String title="";
       int pages;
       if(val==0){
           System.out.println("Library is empty");
       }
       else
       {
           System.out.print("Enter the book title :");
           title=scan.nextLine();
           int index=search(title);
           if(index==-1){
               System.out.println("Book is not available in the library");
           }
           else
           {
             System.out.print("Enter the number of pages in the book:");
             pages=Integer.parseInt(scan.nextLine()); 
             books[index].setPages(pages);
             System.out.println("Book info is changed");
           }
       }
   } 
}