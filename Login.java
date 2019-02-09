import java.awt.*;
import javax.swing.*;
import java.util.*;  //calendar
import java.awt.event.*;
import java.sql.*; 
import java.io.*; 

public class Login extends JFrame{
	JTextField tf1,tf2,tf3,tf4;
	JPasswordField pf1,pf2;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3;
	String str;
	Login(String str1){
		str=str1;
		System.out.println(str);
	    /*JTextField tf1,tf2,tf3,tf4;
	    JPasswordField pf1,pf2;
	    JLabel l1,l2,l3,l4,l5,l6,l7;
	    JButton b1,b2,b3;*/
		getContentPane().setBackground(Color.gray);	//color Background
		l7=new JLabel("Login Page " + " "+str);
		l7.setBounds(400,50,500,50);
		l7.setFont(new Font("Serif", Font.BOLD, 24));
		add(l7);
		l1=new JLabel("Employee id/username");
		l1.setBounds(400,150,150,25);
		add(l1);
		tf1=new JTextField();
		tf1.setBounds(550,150,150,25);
        add(tf1);
		l3=new JLabel("Password");
		l3.setBounds(400,225,150,25);
		add(l3);
		pf1=new JPasswordField();
		pf1.setBounds(550,225,150,25);
        add(pf1);
		l5=new JLabel("forget password");
		l5.setBounds(550,300,150,25);
		add(l5);
		
		/*l5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});*/
		b1=new JButton(" Login ");  
        b1.setBounds(500,350,150,50);
		add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					connect1();
			}
		});
		b3=new JButton(" Back ");  
        b3.setBounds(700,350,150,50);
		add(b3);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					new Demo();
					dispose();
			}
		});
		b2=new JButton("Register");
		b2.setBounds(500,450,150,30);
		add(b2);
		Color Blue= new Color(0,0,100,100);
		b2.setFont(new Font("Serif", Font.BOLD, 24));
		b2.setBackground(Blue);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			         dispose();
					 new Employee();
			}
		});
		//Color Blue= new Color(0,0,100,100);
		//b1.setBackground(Blue);
		b1.setFont(new Font("Serif", Font.BOLD, 24));
		setSize(1000,700);
		setLayout(null);
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
	}
	public static void main(String args[]){
		 String str="Product Employee";
		 new Login(str);
	}
	public void connect1(){
				try{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");
				//String id=tf1.getText();
				PreparedStatement stmt=con.prepareStatement("select * from Employee where emp_username='"+tf1.getText()+"'");
				ResultSet rs=stmt.executeQuery();
				PreparedStatement st=con.prepareStatement("select * from Employee where emp_id='"+tf1.getText()+"'");
				ResultSet rs1=st.executeQuery();
				
				while(rs.next())
				{
					 String userID=rs.getString(3);
					 String password=rs.getString(7);
					 System.out.println(userID);
					 System.out.println(password);
					/*tf2.setText(rs.getString(2));
					tf3.setText(rs.getString(3));
					tf4.setText(rs.getString(4));
					tf5.setText(rs.getString(5));
					*/
					String e_name=tf1.getText();
					String e_password=new String(pf1.getPassword());
				if(e_name.equals(userID) && e_password.equals(password))	
						{  
					      
						    String mana="Manager Employee";
							String prod="Product Employee";
					
							if(str==mana){
								System.out.println("Enter");
								new Manager().setVisible(true);
							}
							else{
								if(str==prod){
									System.out.println("Enter1");
									new Product().setVisible(true);
									
								}
								else{
									if(str.equals("WareHouse Employee")){
										new WareHouse().setVisible(true);
									}
									/*else{
										if(str.equals("Customer")){
											new Customer().setVisible(true);
										}
									}*/
								}
							}
							dispose();
						} 
					else {
                    JOptionPane.showMessageDialog(null,"Incorrect username and password");
					}
				}
			/*	while(rs1.next())
				{
					 String userID=rs1.getString(1);
					 String password=rs1.getString(7);
					/*tf2.setText(rs.getString(2));
					tf3.setText(rs.getString(3));
					tf4.setText(rs.getString(4));
					tf5.setText(rs.getString(5));
					if(userID.equals(tf1.getText()) && (password.equals(new String(pf1.getPassword()))))	
						{
							new Product().setVisible(true);
							dispose();
						} 
					else {
                    JOptionPane.showMessageDialog(null,"Incorrect username and password");
					}
				}*/
				stmt.close();
				con.close();
				//visible();
				}
				catch (Exception e1){
							System.out.println(e1);
							JOptionPane.showMessageDialog(this, "Error in username","Result", JOptionPane.INFORMATION_MESSAGE);
					//if( input == JOptionPane.OK_OPTION)
					
							//dispose();
						//	JOptionPane.dispose();
		
				}		
			}
}
class ForgetPassword {    
    JFrame f;    
    ForgetPassword(String pro_id){    
    f=new JFrame();    
              
    f.setSize(300,400);    
    f.setVisible(true);    
	}     
}