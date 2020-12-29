class Main {
  public static void main(String[] args) {
    double d;
    
    System.out.println("No of command line arguemnets are : " + args.length);
    
    System.out.println("Command line arguemnets are : ");
    
    for (int i=0; i < args.length; i++) {
      d=Double.parseDouble(args[i]);
      System.out.println(d);
    }
  }
}