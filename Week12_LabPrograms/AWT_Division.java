import java.awt.*;
import java.awt.event.*;

public class AWT_Division extends Frame implements ActionListener {
  TextField tf1, tf2;
  Label l;
  Button b;

  Main() {
    tf1 = new TextField();
    tf1.setBounds(75, 50, 200, 25);
    
    tf2 = new TextField();
    tf2.setBounds(75, 100, 200, 25);

    l = new Label();

    b = new Button("Divide");
    b.setBounds(125, 200, 100, 50);
    b.addActionListener(this);
    
    add(b);
    add(tf1);
    add(tf2);
    setSize(350,350);
    
    setLayout(null);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    try {
      String n1 = tf1.getText();
      String n2 = tf2.getText();
      int width, x;
      int q = Integer.parseInt(n1) / Integer.parseInt(n2);

      if ((int)Math.floor(Math.log10(Math.abs(q)) + 1) == 1)
        width = 75;
      else if ((int)Math.floor(Math.log10(Math.abs(q)) + 1) == 2)
        width = 90;
      else
        width = 110;
      
      x = (350 - width) / 2;
      l.setBounds(x, 150, width, 50);
      l.setText("Quotient: " + q);
      add(l);
    }
    catch(NumberFormatException ze) {
      l.setBounds(25, 150, 300, 50);
      l.setText("Cannot divide non-numeric / non-integer values");
      add(l);
    }
    catch(ArithmeticException ze) {
      l.setBounds(125, 150, 100, 50);
      l.setText("Cannot divide by zero");
      add(l);
    }
    catch(Exception ex) {
      System.out.println(ex);
    }
  }
  
  public static void main(String[] args) {
    new Main();  
  }
}
