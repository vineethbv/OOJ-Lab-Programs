import java.util.Scanner;

class Student{
    String USN,name;
    int sem;
    Scanner sc = new Scanner(System.in);
    void setStuDetails(){
        System.out.println("Enter USN of Student: ");
        this.USN = sc.nextLine();
        System.out.println("Enter Name of Student: ");
        this.name = sc.nextLine();
        System.out.println("Enter Semester of Student: ");
        this.sem = sc.nextInt();
    }

    void getStuDetails(){
        System.out.println("USN: " + this.USN);
        System.out.println("Name: " + this.name);
        System.out.println("Semester: " + this.sem);
    }
}

class Test extends Student{
    double cieMarks[] = new double[5];
    int credits[] = new int[5];
    int totalCredits = 0;
    void setCieDetails(){
        for(int i=0;i<cieMarks.length;i++){
            System.out.println("Enter CIE marks(50) in course" + (i+1) + ": ");
            cieMarks[i] = sc.nextDouble();
            System.out.println("Enter credits of course" + (i+1) + ": ");
            credits[i] = sc.nextInt();
            totalCredits += credits[i];
        }
    }

}

class Exam extends Test{
    double seeMarks[] = new double[5];
    double totalMarks[] = new double[5];
    int totCredits = super.totalCredits;
    void setSeeDetails(){
        for(int i=0;i<cieMarks.length;i++){
            System.out.println("Enter SEE marks(100) in course" + (i+1) + ": ");
            seeMarks[i] = sc.nextDouble()/2;
        }
        calcTotalMarks();
    }
    void calcTotalMarks(){
        for(int i=0;i<5;i++){
            totalMarks[i] = cieMarks[i] + seeMarks[i];
        }
    }
}

class Result extends Exam{
    char grades[] = new char[5];
    double sgpa = 0;
    int points[] = new int[5];
    void calcSGPA(){
        for(int i = 0;i<5;i++){
            if(totalMarks[i] > 100){
                System.out.println("Error: Marks are above 100");
                return;
            }else if(totalMarks[i] >= 90){
                points[i] = 10;
            }else if(totalMarks[i] >= 80){
                points[i] = 9;
            }else if(totalMarks[i] >= 70){
                points[i] = 8;
            }else if(totalMarks[i] >= 60){
                points[i] = 7;
            }else if(totalMarks[i] >= 50){
                points[i] = 5;
            }else if(totalMarks[i] >= 40){
                points[i] = 4;
            }else{
                points[i] = 0;
            }
            
            sgpa += (points[i]*credits[i]);
        }
    }

    void calcGrade(){
        for(int i = 0;i<5;i++){
            if(totalMarks[i] > 100){
                System.out.println("Error: Marks are above 100");
                return;
            }else if(totalMarks[i] >= 90){
                grades[i] = 'S';
            }else if(totalMarks[i] >= 80){
                grades[i] = 'A';
            }else if(totalMarks[i] >= 70){
                grades[i] = 'B';
            }else if(totalMarks[i] >= 60){
                grades[i] = 'C';
            }else if(totalMarks[i] >= 50){
                grades[i] = 'D';
            }else if(totalMarks[i] >= 40){
                grades[i] = 'E';
            }else{
                points[i] = 'F';
            }
        }    
    }
    
        void getSGPA(){
            System.out.format("SGPA is %.2f",(sgpa/totalCredits));
        }
    
        void getGrades(){
            for(int i=0;i<5;i++){
                System.out.println("Subject "+(i+1)+": " + grades[i]);
            }
        }
}

public class SGPACalculator {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        n = sc.nextInt();
        Result results[] = new Result[n];
        for(int i=0;i<n;i++){
            results[i] = new Result();
            results[i].setStuDetails();
            results[i].setCieDetails();
            results[i].setSeeDetails();
            results[i].calcSGPA();
            results[i].calcGrade();
            results[i].getSGPA();
            results[i].getGrades();

        }
    }
}
