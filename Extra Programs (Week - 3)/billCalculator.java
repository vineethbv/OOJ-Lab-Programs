import java.util.*;

class billCalculator{

	public static void main (String[]args){

		Scanner s = new Scanner (System.in);

		int[][] a = new int[10][2];
		double bill = 0, discount, items, totalBill;

		System.out.println("Enter number of items.");

		items = s.nextInt();

		System.out.println("Enter quantity and price of items.");

		for (int i = 0; i < items; i++){
			for (int j = 0; j < 2; j++)
        a[i][j] = s.nextInt();
		}

    for (int i = 0; i < items; i++){
      int quantity = a[i][0];
      int pricePerItem = a[i][1];

      bill += quantity * pricePerItem;
		}

    System.out.println("Bill = " + bill);

    if (bill >= 10000)
      discount = 0.05D;
    else if (bill < 10000 && bill >= 7500)
      discount = 0.03D;
    else
      discount = 0.02D;

    totalBill = bill * discount;

    System.out.println("Bill after discount = " + totalBill);
	}
}
