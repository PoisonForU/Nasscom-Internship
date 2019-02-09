import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
public class Demo extends JFrame
{ 
JLabel l1,l2,l3,l4;
JButton button1,button2,button3,button4,button5;
Demo()
{
JButton button1 =new JButton(new ImageIcon("manager.png"));
//JButton button2=new JButton("SOMETHING");
button1.setBounds(200,100,200,200);
add(button1);
button1.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
								new Login("Manager Employee");
								dispose();
						}
						});
l1=new JLabel("Manager");
l1.setBounds(200,300,200,50);
add(l1);

JButton button2 =new JButton(new ImageIcon("product.jpeg"));
//JButton button2=new JButton("SOMETHING");
button2.setBounds(600,100,200,200);
add(button2);
button2.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							String s2="Product Employee";
								new Login(s2);
							dispose();
						}
						});
l2=new JLabel("Product Employee");
l2.setBounds(600,300,200,50);
add(l2);

JButton button3 =new JButton(new ImageIcon("warehouse.jpeg"));
//JButton button2=new JButton("SOMETHING");
button3.setBounds(200,400,200,200);
add(button3);
button3.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
									String s3="Warehouse Employee";
									new Login(s3);
								dispose();
						}
						});
l3=new JLabel("WareHouse Employee");
l3.setBounds(200,600,200,50);
add(l3);

JButton button4 =new JButton(new ImageIcon("customer.jpeg"));
//JButton button2=new JButton("SOMETHING");
button4.setBounds(600,400,200,200);
add(button4);
button4.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							String s4="Supplier";
							 new Login(s4);
							dispose();
						}
						});
l4=new JLabel("Customer");
l4.setBounds(600,600,200,50);
add(l4);
/*
JButton button5=new JButton("Register");
button5.setBounds()
*/
setVisible(true);
setSize(1000,700);
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String a[])
{
  new Demo();
}
} 