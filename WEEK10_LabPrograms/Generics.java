class Test<X, Y, Z, W> {
  X projects;
  Y name;
  Z exp;
  W languages;

  Test(X projects, Y name, Z exp, W languages) {
    this.projects = projects;
    this.name = name;
    this.exp = exp;
    this.languages = languages;
  }

  public X getProjects() {
    return this.projects;
  }

  public Y getName() {
    return this.name;
  }

  public Z getExp() {
    return this.exp;
  }

  public W getLang() {
    return this.languages;
  }

  public void print() {
    System.out.println("Number of Projects: " + getProjects() + "\nDeveloper Name: " + getName() + "\nIndustry Expeience: " + getExp() + "\nKnown programming languages: " + getLang());
  }
}

class Generics {
  public static void main(String[] args) {
    Test<Integer, String, Integer, Integer> t = new Test<Integer, String, Integer, Integer>(10, "Vineeth", 11, 12);

    t.print();
  }
}