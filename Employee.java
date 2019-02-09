import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*; 
import java.io.*;
public class Employee extends JFrame{
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JPasswordField pf1,pf2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1,b3;
	JPopupMenu popup; 
	JMenu menu, submenu;
		 JComboBox cb;
     JMenuItem i1, i2, i3, i4, i5;
		String desc[]={"Manager Employee","Product Employee","Warehouse Employee","Supplier"};
	Employee(){
		getContentPane().setBackground(Color.gray);	//color Background
		l7=new JLabel("SignUp Page");
		l7.setBounds(450,50,500,50);
		l7.setFont(new Font("Serif", Font.BOLD, 24));
		add(l7);
		l1=new JLabel("Employee Description");//DropDown 
		l1.setBounds(100,150,150,25);
		add(l1);
	//	tf1=new JTextField();
	//	tf1.setBounds(250,150,150,25);
	/*	//JTextField textField = new JTextField();
		 popup = new JPopupMenu();
		tf1.add(popup);
		tf1.setComponentPopupMenu(popup);

// 2. Let's create a sub-menu that "expands"
	 subMenu = new JMenu("m");
		subMenu.add("m1");
		subMenu.add("m2");

// 3. Finally, add the sub-menu and item to the popup
		popup.add(subMenu);
		popup.add("n");
		  add(tf1);
		 // setJMenuBar(mb);
		*/
	//	add(tf1);
	
	 cb=new JComboBox(desc);
	cb.setBounds(250,150,150,25);
	add(cb);
		l2=new JLabel("Employee name");
		l2.setBounds(600,150,150,25);
		add(l2);
		tf2=new JTextField();
		tf2.setBounds(750,150,150,25);
        add(tf2);
		l3=new JLabel("Employee username");
		l3.setBounds(100,225,150,25);
		add(l3);
		tf3=new JTextField();
		tf3.setBounds(250,225,150,25);
        add(tf3);
		l4=new JLabel("Gender");
		l4.setBounds(600,225,150,25);
		add(l4);
		tf4=new JTextField();
		tf4.setBounds(750,225,150,25);
        add(tf4);
		l5=new JLabel("Mobile Number");
		l5.setBounds(100,300,150,25);
		add(l5);
		tf5=new JTextField();
		tf5.setBounds(250,300,150,25);
        add(tf5);
		l6=new JLabel("Employee email");
		l6.setBounds(600,300,150,25);
		add(l6);
		tf6=new JTextField();
		tf6.setBounds(750,300,150,25);
        add(tf6);
		
		l7=new JLabel("Password");
		l7.setBounds(100,375,150,25);
		add(l7);
		pf1=new JPasswordField();
		pf1.setBounds(250,375,150,25);
        add(pf1);
		l8=new JLabel("Hint");
		l8.setBounds(600,375,150,25);
		add(l8);
		//radio button
		b1=new JButton("SignUp");  
        b1.setBounds(400,500,150,50);
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
		Color lightBlue= new Color(0,0,50,50);
		b1.setBackground(lightBlue);
		b1.setFont(new Font("Serif", Font.BOLD, 24));
		setSize(1000,700);
		setLayout(null);
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
	}
	public static void main(String args[]){
		new Employee();
	}
	public void connect1(){
		try {
			// connection string
				Class.forName("com.mysql.jdbc.Driver").newInstance();
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");
					Statement st = con.createStatement();
					String Empl_mob=tf5.getText();
					String Emp_password=new String(pf1.getPassword());
					st.executeUpdate("insert into Employee(Emp_name,Emp_username,Emp_gendr,emp_mob,emp_email,emp_password) VALUES('"+ tf2.getText() + "','" + tf3.getText() + "','"+ tf4.getText() + "','" + Empl_mob+"','" + tf6.getText()+"','" + Emp_password+"')");
					//JOptionPane.showConfirmDialog(null, "Your Data Has been Inserted","Result", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
					new Product();
					st.close();
					con.close();
					new Product();
					}catch (Exception e1){
								JOptionPane.showConfirmDialog(null, "Insert All data correctly","Result", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
								System.out.println("Exception:" + e1);
								}
		}

}
/*class MenuExample  
{  
          JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5;  
          MenuExample(){  
          JFrame f= new JFrame("Menu and MenuItem Example");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
          submenu=new JMenu("Sub Menu");  
          i1=new JMenuItem("Item 1");  
          i2=new JMenuItem("Item 2");  
          i3=new JMenuItem("Item 3");  
          i4=new JMenuItem("Item 4");  
          i5=new JMenuItem("Item 5");  
          menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu.add(i4); submenu.add(i5);  
          menu.add(submenu);  
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
}
			JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
          submenu=new JMenu("Sub Menu");  
          i1=new JMenuItem("Item 1");  
          i2=new JMenuItem("Item 2");  
          i3=new JMenuItem("Item 3");  
          i4=new JMenuItem("Item 4");  
          i5=new JMenuItem("Item 5");  
          menu.add(i1);
		  menu.add(i2);
		  menu.add(i3);  
          submenu.add(i4); 
		  submenu.add(i5);  
          menu.add(submenu);  
          mb.add(menu); 
			tf1.add(mb); */