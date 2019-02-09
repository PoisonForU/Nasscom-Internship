import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignIn extends JFrame{
	JTextField tf1,tf2;
	JPasswordField pf1;
	JLabel l1,l2,l3,l4;
	JButton b1;
	SignIn(){
		l4=new JLabel("SignIn Page");
		l4.setBounds(450,50,500,50);
		l4.setFont(new Font("Serif", Font.BOLD, 24));
		add(l4);
		l1=new JLabel("Employee id/name");
		l1.setBounds(400,200,150,25);
		add(l1);
		tf1=new JTextField();
		tf1.setBounds(650,200,150,25);
        add(tf1);
		l2=new JLabel("Password");
		l2.setBounds(400,300,150,25);
		add(l2);
		pf1=new JPasswordField();
		pf1.setBounds(650,300,150,25);
        add(pf1);
		b1=new JButton("SignIn");  
        b1.setBounds(400,400,150,50);
		b1.setBackground(Color.gray);
		b1.setFont(new Font("Serif",Font.PLAIN,20));
		add(b1);
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	public static void main(String args[]){
		new SignIn();
	}
}