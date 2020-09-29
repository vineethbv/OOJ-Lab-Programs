import java.util.*;

class noOfPNZ{

	public static void main (String[]args){

		Scanner s = new Scanner (System.in);

		int[] a = new int[10];
		int n, pCount = 0, nCount = 0, zCount = 0;

		System.out.println("Enter size of array.");

		n = s.nextInt();

		System.out.println("Enter elements of array.");

		for (int i = 0; i < n; i++){
			a[i] = s.nextInt();

			if (a[i] > 0)
				pCount++;
			else if (a[i] < 0)
				nCount++;
			else
				zCount++;
		}

		System.out.println("Number of positive values : " + pCount);
		System.out.println("Number of negative values : " + nCount);
		System.out.println("Number of zeros : " + zCount);
	}
}
