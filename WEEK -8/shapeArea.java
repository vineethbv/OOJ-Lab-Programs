import java.util.*;

abstract class Shape {
  int x;

  public Shape(int x) {
    this.x = x;
  }

  public abstract void printArea();
}

class Rectangle extends Shape {
  private int y;

  public Rectangle() {
    this(1, 1);
  }

  public Rectangle(int x, int y) {
    super(x);
    this.y = y;
  }

  public int getWidth() {
    return super.x;
  }

  public void setWidth() {
    Scanner s = new Scanner(System.in);
    int width;
    
    System.out.println("Enter width.");
    width = s.nextInt();
    super.x = width;
  }

  public int getHeight() {
    return this.y;
  }

  public void setHeight() {
    Scanner s = new Scanner(System.in);
    int height;
    
    System.out.println("Enter height.");
    height = s.nextInt();
    this.y = height;
  }

  @Override
  public void printArea() {
    setWidth();
    setHeight();
    System.out.println("Area = " + (getWidth() * getHeight()));
  }
}

class Circle extends Shape {
  private int y;

  public Circle() {
    this(1);
  }

  public Circle(int x) {
    super(x);
  }

  public int getRadius() {
    return super.x;
  }

  public void setRadius() {
    Scanner s = new Scanner(System.in);
    int radius;
    
    System.out.println("Enter radius.");
    radius = s.nextInt();
    super.x = radius;
  }

  @Override
  public void printArea() {
    setRadius();
    System.out.println("Area = " + (Math.PI * Math.pow(getRadius(), 2)));
  }
}

class Triangle extends Shape {
  private int y;

  public Triangle() {
    this(1, 1);
  }

  public Triangle(int x, int y) {
    super(x);
    this.y = y;
  }

  public int getBase() {
    return super.x;
  }

  public void setBase() {
    Scanner s = new Scanner(System.in);
    int base;
    
    System.out.println("Enter base.");
    base = s.nextInt();
    super.x = base;
  }

  public int getHeight() {
    return this.y;
  }

  public void setHeight() {
    Scanner s = new Scanner(System.in);
    int height;
    
    System.out.println("Enter height.");
    height = s.nextInt();
    this.y = height;
  }

  @Override
  public void printArea() {
    setBase();
    setHeight();
    System.out.println("Area = " + (0.5 * getBase() * getHeight()));
  }
}

class shapeArea {
  public static void main(String[] args) {
    Shape rect = new Rectangle();
    Shape circle = new Circle();
    Shape triangle = new Triangle();
    int opt = 0;
    Scanner s = new Scanner(System.in);

    while (opt != 4) {
      System.out.println("Your options are: \n1. Rectangle \n2. Circle \n3. Triangle.");
      opt = s.nextInt();

      if (opt == 1)
        rect.printArea();
      else if (opt == 2)
        circle.printArea();
      else if (opt == 3)
        triangle.printArea();
      else if (opt == 4)
        System.out.println("Terminating session.");
      else
        System.out.println("Invalid value passed.");
    }
  }
}
