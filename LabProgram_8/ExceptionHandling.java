/*
Write a program that demonstrates handling of exceptions in inheritance tree. Create a base class called “Father” and derived class called “Son” which extends the base class. In Father class, implement a constructor which takes the age and throws the exception Wrong Age( ) when the input age=father’s age. In Son class, implement a constructor that cases both father and son’s age and throws an exception if son’s age is >=father’s age.
*/

import java.lang.*;
import java.util.Scanner;

class wrongAge extends Exception
{
  public wrongAge(String msg) {
    super(msg);
  }
}

class Father
{
  private int age;
  
  Father(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
}

class Son extends Father
{
  private int sAge;

  Son(int fAge, int sAge) {
    super(fAge);
    this.sAge = sAge;
  }

  public int getSAge() {
    return this.sAge;
  }

  public void disp() throws wrongAge{
    if (super.getAge() <= getSAge() || super.getAge() < 0 || getSAge() < 0)
      throw new wrongAge("Please enter a valid age value.");
    else
      System.out.println("Father’s age: " + super.getAge() + "\nSon's age: " + this.getSAge());
  }
}

class ExceptionHandling {
  public static void main(String args[]){
    int dad = 1, son = 1;
    Scanner s = new Scanner(System.in);

    try {
      dad = s.nextInt();
      son = s.nextInt();
      Son s1 = new Son(dad, son);
      
      s1.disp();
    }
    catch (wrongAge e) {
      e.printStackTrace();
    }
  }
}
