import java.util.*;

abstract class Player {
  String name;
  int matchesPlayed;
  double avg;
  Scanner s = new Scanner(System.in);

  abstract public String getName();
  abstract public void setName();
  abstract public int getMatches();
  abstract public void setMatches();
  abstract public double getAvgScore();
  abstract public void setAvgScore();
  abstract public void printData();
}

class Batsman extends Player {
  private double runsScored;

  public Batsman() {
    setData();
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName() {
    String name = s.nextLine();
    this.name = name;
  }

  @Override
  public int getMatches() {
    return matchesPlayed;
  }

  @Override
  public void setMatches() {
    int matches = s.nextInt();
    this.matchesPlayed = matches;
  }

  public double getRunsScored() {
    return runsScored;
  }

  public void setRunsScored() {
    double runs = s.nextDouble();
    this.runsScored = runs;
  }

  public void setData() {
    System.out.println("Enter batsman name.");
    setName();
    System.out.println("Enter total number of matches.");
    setMatches();
    System.out.println("Enter total runs scored from all matches.");
    setRunsScored();
  }

  @Override
  public double getAvgScore() {
    return avg;
  }

  @Override
  public void setAvgScore() {
    this.avg = getRunsScored() / getMatches();
  }

  @Override
  public void printData() {
    setAvgScore();

    System.out.println("Name = " + this.getName() + "\nTotal runs scored = " + this.getRunsScored() + "\nAverage score = " + this.getAvgScore());
  }
}

class Bowler extends Player {
  private double runsGiven;

  public Bowler() {
    setData();
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName() {
    String name = s.nextLine();
    this.name = name;
  }

  @Override
  public int getMatches() {
    return matchesPlayed;
  }

  @Override
  public void setMatches() {
    int matches = s.nextInt();
    this.matchesPlayed = matches;
  }

  @Override
  public double getAvgScore() {
    return avg;
  }

  public double getRunsGiven() {
    return this.runsGiven;
  }

  public void setRunsGiven() {
    double runs = s.nextDouble();
    this.runsGiven = runs;
  }

  public void setData() {
    System.out.println("Enter bowler name.");
    setName();
    System.out.println("Enter total number of matches.");
    setMatches();
    System.out.println("Enter total runs given from all matches.");
    setRunsGiven();
  }

  @Override
  public void setAvgScore() {
    this.avg = getRunsGiven() / getMatches();
  }

  @Override
  public void printData() {
    setAvgScore();

    System.out.println("Name = " + this.getName() + "\nTotal runs given = " + this.getRunsGiven() + "\nAverage score = " + this.getAvgScore());
  }
}

class Main {
  public static void main(String[] args) {
    int m, n, i;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter number of batsman");
    m = s.nextInt();
    Player bat[] = new Batsman[m];

    System.out.println("Enter number of bowlers");
    n = s.nextInt();
    Player ball[] = new Bowler[n];

    for (i = 0; i < m; i++) {
      bat[i] = new Batsman();
      bat[i].printData();
    }

    for (i = 0; i < n; i++) {
      ball[i] = new Bowler();
      ball[i].printData();
    }
  }
}
