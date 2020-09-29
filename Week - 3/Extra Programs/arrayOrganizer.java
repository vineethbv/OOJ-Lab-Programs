import java.util.*;

class arrayOrganizer{

	public static void main (String[]args){

		Scanner s = new Scanner (System.in);

		int[] a = new int[10], b = new int[10], c = new int[10];
		int cSum = 0, cAvg, cMin, cMax, j = 0, k = 0, n;

		System.out.println("Enter size of array.");

		n = s.nextInt();

		System.out.println("Enter elements of array.");

		for (int i = 0; i < n; i++){
			a[i] = s.nextInt();

			if (a[i] % 2 != 0){
        b[j] = a[i];
        j++;
      }
			else{
        c[k] = a[i];
        k++;
      }
		}

    System.out.println("Contents in array b :");

    for (int i = 0; i < j; i++){
			System.out.println(b[i]);
		}

    System.out.println("Contents in array c :");

    for (int i = 0; i < k; i++){
			System.out.println(c[i]);
      cSum += c[i];
		}

    cAvg = cSum / k;
    cMin = c[0];
    cMax = c[0];

    for (int i = 0; i < k; i++){
      if (cMin > c[i])
        cMin = c[i];
      
      if (cMax < c[i])
        cMax = c[i];
    }

    System.out.println("Sum of elements in c = " + cSum);
    System.out.println("Average of elements in c = " + cAvg);
    System.out.println("Minimum value in c = " + cMin);
    System.out.println("Maximum in c = " + cMax);
	}
}
