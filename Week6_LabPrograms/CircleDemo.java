import java.util.*;
import java.lang.Math.*;

class CircleDemo {
  public static void main(String[] args) {
    double r, p, Ar;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter radius.");
    r = s.nextDouble();

    p = 2 * Math.PI * r;
    Ar = Math.PI * (Math.pow(r, 2));

    System.out.println("Perimeter = " + p + "\nArea = " + Ar);
  }
}