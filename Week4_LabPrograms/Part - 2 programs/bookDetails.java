import java.util.*;

class book{
  private int ID;
  private String title;
  private int noOfPages;
  private int yearOfPublishing;
  private String author;
  private String publisher;
  private float price;

  public book(){ }

  public int getID() {
    return ID;
  }

  public void setID() {
    Scanner s = new Scanner(System.in);
    int ID;

    ID = s.nextInt();
    this.ID = ID;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle() {
    Scanner s = new Scanner(System.in);
    String title;

    title = s.nextLine();
    this.title = title;
  }

  public int getNoOfPages() {
    return noOfPages;
  }

  public void setNoOfPages() {
    Scanner s = new Scanner(System.in);
    int noOfPages;

    noOfPages = s.nextInt();
    this.noOfPages = noOfPages;
  }

  public int getYearOfPublishing() {
    return yearOfPublishing;
  }

  public void setYearOfPublishing() {
    Scanner s = new Scanner(System.in);
    int yearOfPublishing;

    yearOfPublishing = s.nextInt();
    this.yearOfPublishing = yearOfPublishing;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor() {
    Scanner s = new Scanner(System.in);
    String author;

    author = s.nextLine();
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher() {
    Scanner s = new Scanner(System.in);
    String publisher;

    publisher = s.nextLine();
    this.publisher = publisher;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice() {
    Scanner s = new Scanner(System.in);
    float price;

    price = s.nextInt();
    this.price = price;
  }

  public void getData() {
    System.out.println("Enter book ID.");
    setID();
    System.out.println("Enter book title.");
    setTitle();
    System.out.println("Enter book number of pages.");
    setNoOfPages();
    System.out.println("Enter book year of publishing.");
    setYearOfPublishing();
    System.out.println("Enter book author.");
    setAuthor();
    System.out.println("Enter book publisher.");
    setPublisher();
    System.out.println("Enter book price.");
    setPrice();
  }

  public void displayData(){
    System.out.println("Book ID : " + getID());
    System.out.println("Book Title : " + getTitle());
    System.out.println("Number of pages : " + getNoOfPages());
    System.out.println("Year of publishing : " + getYearOfPublishing());
    System.out.println("Book Author : " + getAuthor());
    System.out.println("Book Publisher : " + getPublisher());
    System.out.println("Price : " + getPrice());
  }
}

class bookDetails {
    public static float cmpHighestPrice(float a, float b, float c) {
    if (a > b && a > c)
      return a;
    if (b > a && b > c)
      return b;
    return c;
  }

  public static int leastPages(int a, int b, int c) {
    if (a < b && a < c)
      return a;
    if (b < a && b < c)
      return b;
    return c;
  }

  public static void main(String[] args) {
    book b1 = new book();
    book b2 = new book();
    book b3 = new book();
    Scanner s = new Scanner(System.in);
    String author;
    int count2020 = 0;

    b1.getData();
    b1.displayData();
    b2.getData();
    b2.displayData();
    b3.getData();
    b3.displayData();

    System.out.println("Whose book are you looking for?");
    author = s.nextLine();

    if (author.equals(b1.getAuthor()))
      b1.displayData();
    else if (author.equals(b2.getAuthor()))
      b2.displayData();
    else if (author.equals(b3.getAuthor()))
      b3.displayData();
    else
      System.out.println("Unknown author");

    System.out.println("Most expensive book : " + cmpHighestPrice(b1.getPrice(), b2.getPrice(), b3.getPrice()));

    if (b1.getYearOfPublishing() == 2020)
      count2020++;
    if (b2.getYearOfPublishing() == 2020)
      count2020++;
    if (b3.getYearOfPublishing() == 2020)
      count2020++;

    System.out.println("Number of books published in 2020 : " + count2020);

    System.out.println("Book with least number of pages : " + leastPages(b1.getNoOfPages(), b2.getNoOfPages(), b3.getNoOfPages()));
  }
}
