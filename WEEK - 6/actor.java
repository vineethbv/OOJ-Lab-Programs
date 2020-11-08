import java.util.*;

class Actor {
  private int ID;
  private String name;
  private int no_of_movies;
  private int no_of_years_exp;
  private double avgPerformance;
  Scanner s = new Scanner(System.in);

  public Actor() {
    setData();
  }

  public int getID() {
    return this.ID;
  }

  public void setID() {
    int id = s.nextInt();
    this.ID = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName() {
    String name = s.nextLine();
    this.name = name;
  }

  public int getNoOfMovies() {
    return this.no_of_movies;
  }

  public void setNoOfMovies() {
    int noOfMovies = s.nextInt();
    this.no_of_movies = noOfMovies;
  }

  public int getYearsOfExp() {
    return this.no_of_years_exp;
  }

  public void setYearsOfExp() {
    int yearsOfExp = s.nextInt();
    this.no_of_years_exp = yearsOfExp;
  }

  public void setData() {
    System.out.println("Enter actor ID.");
    setID();
    System.out.println("Enter actor name.");
    setName();
    System.out.println("Enter number of movies.");
    setNoOfMovies();
    System.out.println("Enter years of experience.");
    setYearsOfExp();
  }

  public double getAvgPerformance() {
    return this.avgPerformance;
  }

  public void setAvgPerformance() {
    this.avgPerformance = getNoOfMovies() / getYearsOfExp();
  }

  public void printData() {
    getAvgPerformance();

    System.out.println("Actor ID: " + getID() + "\nName: " + getName() + "\nNumebr of movies: " + getNoOfMovies() + "\nYears of Experience: " + getYearsOfExp() + "\nAverage: " + getAvgPerformance());
  }
}

class actor {
  public static void main(String[] args) {
    int n, i, highestIndex = 0;
    double highestAvg = 0;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter number of actors.");
    n = s.nextInt();

    Actor[] act = new Actor[n];

    for (i = 0; i < n; i++) {
      act[i] = new Actor();
      act[i].printData();
    }

    System.out.println("\nHighest average: ");
    for (i = 0; i < n; i++) {
      if (act[i].getAvgPerformance() > highestAvg) {
        highestAvg = act[i].getAvgPerformance();
        highestIndex = i;
      }
    }

    act[highestIndex].printData();
  }
}
