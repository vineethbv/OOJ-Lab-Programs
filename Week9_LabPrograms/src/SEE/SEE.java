package SEE;
import java.lang.*;
import java.util.Scanner;

public class SEE extends CIE.Student{
        private int[] marks;
        Scanner s = new Scanner(System.in);

        public SEE() {
            super();
            marks = new int[5];
        }

        public int[] getMarks() {
            return marks;
        }

        public void setMarks(int[] marks) {
            this.marks = marks;
        }

        public void getSEEMarks() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter SEE marks in subject: " + (i + 1));
                System.out.print(">>>");
                marks[i] = s.nextInt();

                if (marks[i] > 100)
                    marks[i] = 100;

                if (marks[i] < 0)
                    marks[i] = 0;
            }

            setMarks(marks);
        }

        public void printSEEMarks() {
            for (int i = 0; i < 5; i++) {
                System.out.println("SEE marks in subject "+ (i + 1) + ": " + marks[i]);
            }
        }
    }
