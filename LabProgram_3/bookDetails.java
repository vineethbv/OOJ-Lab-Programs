import java.util.*;
import java.util.ArrayList;
import java.util.List;

class book{
  private String title;
  private int noOfPages;
  private String author;
  private float price;

  public book(){
    this("Unknown book", "Unknown author");
  }

  public book(String title, String author) {
    this(title, 50, author, 0.0f);
  }

  public book(String title, int noOfPages, String author, float price) {
    setTitle(title);
    setNoOfPages(noOfPages);
    setAuthor(author);
    setPrice(price);
   }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter book title.");
    title = s.nextLine();
    this.title = title;
  }

  public int getNoOfPages() {
    return noOfPages;
  }

  public void setNoOfPages(int noOfPages) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter book number of pages.");
    noOfPages = s.nextInt();
    this.noOfPages = noOfPages;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter book author.");
    author = s.nextLine();
    this.author = author;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter book price.");
    price = s.nextInt();
    this.price = price;
  }

  @Override
  public String toString(){
    return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nNumber of Pages: " + getNoOfPages() + "\nPrice: " + getPrice() + "\n";
  }
}

class bookDetails {
  public static void main(String[] args) {
    ArrayList<book> b = new ArrayList<book>();
    Scanner s = new Scanner(System.in);
    int n, i;

    System.out.println("Enter number of books");
    n = s.nextInt();

    i = 0;

    while (i < n) {
      b.add(new book());
      i++;
    }

    System.out.println(b.toString());
  }
}
