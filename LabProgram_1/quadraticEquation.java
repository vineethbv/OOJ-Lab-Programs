import java.lang.Math;
import java.util.*;

class quadraticEquation{
	public static void main (String[]args){
		Scanner s = new Scanner (System.in);
		Double a, b, c, det, r1, r2;

		System.out.println("Enter 3 numbers in a quadratic equation.");

		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();

    		det = (b*b) - (4*a*c);

		if (det > 0){
			r1 = (-b + Math.sqrt(det)) / (2 * a);
			r2 = (-b - Math.sqrt(det)) / (2 * a);
			System.out.println("Roots are real and unequal.\nRoots : " + r1 + ", " + r2);
		}
		else if (det == 0){
			r1 = -b / (2 * a);
			System.out.println("Roots are real and equal.\nRoots : " + r1);
		}
		else{
			System.out.println("No real roots.");
		}
	}
}
