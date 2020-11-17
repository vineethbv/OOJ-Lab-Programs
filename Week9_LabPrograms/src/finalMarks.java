import CIE.Internals;
import SEE.SEE;
import java.lang.*;
import java.util.Scanner;

public class finalMarks {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);
        int n, count;

        System.out.println("Enter number of students");
        n = s.nextInt();

        for (count = 0; count < n; count++) {
            CIE.Internals cie = new Internals();
            SEE see = new SEE();

            cie.getData();
            cie.getCIEMarks();
            see.getSEEMarks();

            int[] CIEMarks = cie.getMarks();
            int[] SEEMarks = see.getMarks();
            int[] totalMarks = new int[5];

            for (int i = 0; i < 5; i++) {
                totalMarks[i] = CIEMarks[i] + (SEEMarks[i] / 2);
            }

            cie.printData();
            System.out.println("--------------------------------------------------------------");
            cie.printCIEMarks();
            System.out.println("--------------------------------------------------------------");
            see.printSEEMarks();
            System.out.println("--------------------------------------------------------------");

            for (int i = 0; i < 5; i++) {
                System.out.println("Total marks in subject "+ (i + 1) + ": " + totalMarks[i]);
            }
        }
    }
}
