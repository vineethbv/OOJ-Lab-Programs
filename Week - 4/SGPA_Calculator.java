import java.lang.*;
import java.util.Scanner;

class Student{
  private String name;
  private String USN;
  private int[] credits;
  private int[] score;
  private float SGPA;

  public Student(){
    int[] credits = new int[3];
    int[] score = new int[3];
  }

  public String getName(){
    return name;
  }

  public void setName(){
    String name;
    
    System.out.print("Name : ");
    Scanner s = new Scanner(System.in);
    
    name = s.nextLine();
    this.name = name;
  }

  public String getUSN(){
    return USN;
  }

  public void setUSN(){
    String USN;
    
    System.out.print("USN : ");
    Scanner s = new Scanner(System.in);
    
    USN = s.nextLine();
    this.USN = USN;
  }

  public int[] getCredits(){
    return credits;
  }

  public void setCredits(){
    int[] credits = new int[3];
    
    System.out.print("Credits (Enter sequentially) :");
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < 3; i++)
      credits[i] = s.nextInt();

    this.credits = credits;
  }

  public int[] getScore(){
    return score;
  }

  public void setScore(){
    int[] score = new int[3];

    System.out.print("Scores (Enter sequentially) :");
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < 3; i++)
      score[i] = s.nextInt();
    
    this.score = score;
  }

  public float getSGPA(){
    return SGPA;
  }

  public void setData(){
    setName();
    setUSN();
    setCredits();
    setScore();
    setSGPA();
  }

  public void setSGPA(){
    int[] credits = getCredits();
    int[] score = getScore();
    int temp, sum = 0, creditSum = 0;
    float SGPA;

    for (int i = 0; i < 3; i++){
      temp = score[i] / 10;
      if (temp > 10)
        temp++;

      sum += temp * credits[i];
      System.out.println(sum);
      creditSum += credits[i]; 
    }

    SGPA = sum / creditSum;

    this.SGPA = SGPA;
  }

  public void printData(){
    System.out.println("Name : " + getName());
    System.out.println("USN : " + getUSN());
    System.out.println("SGPA : " + getSGPA());
  }
}

class SGPA_Calculator {
  public static void main(String[] args) {
    Student st = new Student();

    st.setData();
    st.printData();
  }
}
