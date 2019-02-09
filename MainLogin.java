import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainLogin extends JFrame {
  public static void main(String[] args) {
      JFrame frame = new JFrame("main");
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	   ImageIcon i1,i2,i3,i4;
	   JLabel  lable,lable1,lable2,lable3,lable4,lable5;
		 lable1 = new JLabel("Welcome Partners");
	  lable1.setBounds(400,50,200,50);
      frame.getContentPane().add(lable1);
	// ImageIcon ii = new ImageIcon("manager.png");
           //JScrollPane jsp = new JScrollPane(lable);
       i1 = new ImageIcon("manager.png");
       lable2 = new JLabel(i1);
	  lable2.setBounds(100,250,200,200);
      //JScrollPane jsp = new JScrollPane(lable);
      frame.getContentPane().add(lable2);
	  // product house employee
	   i2 = new ImageIcon("product.jpeg");
      lable3 = new JLabel(i2);
	  lable3.setBounds(300,150,200,200);
      //JScrollPane jsp = new JScrollPane(lable);
      frame.getContentPane().add(lable3);
      frame. setSize(1000, 700);
    /*  JButton button = new JButton();
      button.setSize(new Dimension(50, 50));
      button.setLocation(500, 350);
     frame.getContentPane().add(button);
     */
frame.setVisible(true);
  }
  
}