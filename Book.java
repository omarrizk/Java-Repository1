public class Book {
   private int page;
   private String title;
   public Book(int pages, String t) {
      page = pages;
      title = t;
   }
   public int getPages() {
      return page;
   }
   public void setPages(int mypage) {
      page = mypage;
   }
   public String getTitle() {
      return title;
   }

   public void setTitle(String myTitle) {
      title = myTitle;
   }
   public String toString() {
      return "Title: " + title + " Pages: " + page + " page";
   }
   public boolean equals(Book b) {
      if(page == b.getPages() && title.equals(b.getTitle())) {
         return true;
   } else {
      return false;
   }
}
   public int compareTo(Book b) {
      if (page < b.getPages()) {
         return -1;
   } else if (b.getPages() < page) {
      return 1;
   } else {
      return 0;
      }
   }
}