import java.util.*;

class transposeOfMatrix {
  public static void main(String[] args) {
    int m, n, i = 0, j = 0;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter number of rows in matrix.");
    m = s.nextInt();

    System.out.println("Enter number of columns in matrix.");
    n = s.nextInt();

    int[][] a = new int[m][n];
    int[][] b = new int[n][m];

    System.out.println("Enter elements of matrix.");
    
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++)
        a[i][j] = s.nextInt();
    }

    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++)
        b[j][i] = a[i][j];
    }

    System.out.println("\nOriginal matrix: ");

    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++)
        System.out.print(a[i][j] + " ");
      System.out.println();
    }

    System.out.println("\nTranspose of original matrix: ");

    for (i = 0; i < n; i++) {
      for (j = 0; j < m; j++)
        System.out.print(b[i][j] + " ");
      System.out.println();
    }
  }
}