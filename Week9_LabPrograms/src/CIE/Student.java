package CIE;
import java.lang.*;
import java.util.Scanner;

    public class Student {
        private String USN;
        private String name;
        private int sem;
        Scanner s = new Scanner(System.in);

        public Student() {
            this("Unknown", "Unknown", 3);
        }

        public Student(String USN, String name, int sem) {
            this.USN = USN;
            this.name = name;
            this.sem = sem;
        }

        public String getUSN() {
            return USN;
        }

        public void setUSN(String USN) {
            this.USN = USN;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSem() {
            return sem;
        }

        public void setSem(int sem) {
            this.sem = sem;
        }

        public void getData() {
            String USN, name;
            int sem;

            System.out.println("Enter USN");
            USN = s.nextLine();
            setUSN(USN);

            System.out.println("Enter student name");
            name = s.nextLine();
            setName(name);

            System.out.println("Enter sem");
            sem = s.nextInt();
            setSem(sem);
        }

        public void printData() {
            System.out.println("USN: " + getUSN());
            System.out.println("Name: " + getName());
            System.out.println("Sem: " + getSem());
        }
    }

