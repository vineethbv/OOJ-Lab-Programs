import java.util.Scanner;

class Player {
  private int ID;
  private String name;
  private int[] scores;
  private int noOfMatches;
  private String[] matches;
  private float avgScore;

  public Player() {
    int[] scores = new int[10];
    String[] matches = new String[10];
    int noOfMatches = 10;
  }

  public int getID() {
    return ID;
  }

  public void setID() {
    int ID;
    Scanner s = new Scanner(System.in);

    ID = s.nextInt();
    this.ID = ID;
  }

  public String getName() {
    return name;
  }

  public void setName(){
    String name;
    Scanner s = new Scanner(System.in);

    name = s.nextLine();
    this.name = name;
  }

  public int getNoOfMatches(){
    return noOfMatches;
  }

  public void setNoOfMatches(){
    Scanner s = new Scanner(System.in);
    int NoOfMatches;

    NoOfMatches = s.nextInt();
    this.noOfMatches = NoOfMatches;
  }

  public String[] getMatches() {
    return matches;
  }

  public void setMatches() {
    String[] matches = new String[10];
    int NoOfMatches= getNoOfMatches();
    Scanner s = new Scanner(System.in);

    for (int i = 0; i < NoOfMatches; i++){
      matches[i] = s.nextLine();
    }
    
    this.matches = matches;
  }

  public int[] getScores() {
    return scores;
  }

  public void setScores(){
    int[] scores = new int[10];
    int NoOfMatches = getNoOfMatches();
    Scanner s = new Scanner(System.in);

    for (int i = 0; i < NoOfMatches; i++){
      scores[i] = s.nextInt();
    }

    this.scores = scores;
  }

  public float getAvgScore(){
    return avgScore;
  }

  public void setAvgScore(){
    int[] scores = getScores();
    int sum = 0, avg;
    int NoOfMatches = getNoOfMatches();
    Scanner s = new Scanner(System.in);

    for (int i = 0; i < NoOfMatches; i++){
      sum += scores[i];
    }

    avg = sum / NoOfMatches;

    this.avgScore = avg;
  }

  public void getData(){
    System.out.println("Enter ID: ");
    setID();
    System.out.println("Enter name: ");
    setName();
    System.out.println("Enter number of matches: ");
    setNoOfMatches();
    System.out.println("Enter matches: ");
    setMatches();
    System.out.println("Enter scores in each match: ");
    setScores();
  }

  public void displayAvgScore(){
    System.out.println("Average score of " + getName() + " = " + getAvgScore());
  }

  public float cmpAvgScore(Player p1, Player p2){
    return p1.getAvgScore() > p2.getAvgScore() ? p1.getAvgScore() : p2.getAvgScore();
  }
}

class scoreCalculator {
  public static void main(String[] args) {
    Player p1 = new Player();
    Player p2 = new Player();

    p1.getData();
    p1.setAvgScore();
    p1.displayAvgScore();

    p2.getData();
    p2.setAvgScore();
    p2.displayAvgScore();

    System.out.println("Greater Average Score = " + p1.cmpAvgScore(p1, p2));
  }
}
