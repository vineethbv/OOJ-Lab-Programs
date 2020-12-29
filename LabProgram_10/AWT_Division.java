import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

class dialogERR {
  JFrame frame;

  dialogERR() {
    frame = new JFrame();
    JOptionPane.showMessageDialog(frame, "Cannot divide by non-integer values");
  }
}

public class AWT_Division extends Frame implements ActionListener {
  TextField tf1, tf2;
  Label l;
  Button b;

  AWT_Division() {
    tf1 = new TextField();
    tf1.setBounds(75, 50, 200, 25);
    
    tf2 = new TextField();
    tf2.setBounds(75, 100, 200, 25);

    l = new Label();

    b = new Button("Divide");
    b.setBounds(125, 200, 100, 50);
    b.addActionListener(this);
    
    addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e) {
         dispose();
      }
    });
    
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
    catch(NumberFormatException ne) {
      new dialogERR();
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
    new AWT_Division();  
  }
}

