import java.util.*;

class sumOfIndices{

	public static void main (String[]args){

		Scanner s = new Scanner (System.in);

		int[] a = new int[10];
		int n, oddIndexSum = 0, evenIndexSum = 0;

		System.out.println("Enter size of array.");

		n = s.nextInt();

		System.out.println("Enter elements of array.");

		for (int i = 0; i < n; i++){
			a[i] = s.nextInt();

			if (i % 2 == 0)
				evenIndexSum = evenIndexSum + a[i];
			else
				oddIndexSum = oddIndexSum + a[i];
		}

		System.out.println("Sum of even index values : " + evenIndexSum);
		System.out.println("Sum of odd index values : " + oddIndexSum);

	}
}
