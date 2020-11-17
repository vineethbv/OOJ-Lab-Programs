package CIE;

public class Internals extends Student {
    private int[] marks;

    public Internals() {
        super();
        marks = new int[5];
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void getCIEMarks() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter CIE marks in subject: " + (i + 1));
            System.out.print(">>>");
            marks[i] = s.nextInt();

            if (marks[i] > 50)
                marks[i] = 50;

            if (marks[i] < 0)
                marks[i] = 0;
        }

        setMarks(marks);
    }

    public void printCIEMarks() {
        for (int i = 0; i < 5; i++) {
            System.out.println("CIE marks in subject "+ (i + 1) + ": " + marks[i]);
        }
    }
}
