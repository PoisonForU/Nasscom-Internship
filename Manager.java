import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
public class Manager extends JFrame
{ 
	JLabel l1,l2,l3,l4;
//JButton button2,button3,button4,button5;
Manager(){
	setLayout(null);
JButton button2 =new JButton(new ImageIcon("product.jpeg"));
//JButton button2=new JButton("SOMETHING");
button2.setBounds(250,100,200,200);
add(button2);
button2.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							String s2="Production Detail";
								new Product();
								dispose();
						}
						});
l2=new JLabel("Product Employee");
l2.setBounds(250,300,200,50);
add(l2);

JButton button3 =new JButton(new ImageIcon("warehouse.jpeg"));
//JButton button2=new JButton("SOMETHING");
button3.setBounds(650,100,200,200);
add(button3);
button3.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
									String s3="Warehouse Employee";
									new WareHouse();
								//dispose();
						}
						});
l3=new JLabel("WareHouse Employee");
l3.setBounds(700,300,200,50);
add(l3);

JButton button4 =new JButton(new ImageIcon("customer.jpeg"));
//JButton button2=new JButton("SOMETHING");
button4.setBounds(350,400,200,200);
add(button4);
button4.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							String s4="Customer";
							 new Login(s4);
							dispose();
						}
						});
l4=new JLabel("Supplier");
l4.setBounds(350,600,200,50);
add(l4);
JButton button5=new JButton(" Sign Out ");  
        button5.setBounds(700,500,150,50);
		add(button5);
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					new Demo();
					dispose();
			}
		});
setVisible(true);
setSize(1000,700);
//setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String a[])
{
  new Manager();
}
} 