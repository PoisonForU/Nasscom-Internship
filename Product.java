import java.awt.*;
import javax.swing.*;
import java.util.*;  //calendar
import java.awt.event.*;
import java.sql.*; 
import java.io.*;  
public class Product extends JFrame{
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	Product(){
		l7=new JLabel("Product Detail");
		l7.setBounds(450,50,500,50);
		l7.setFont(new Font("Serif", Font.PLAIN, 24));
		add(l7);
		l1=new JLabel("Product id");
		l1.setBounds(100,150,150,25);
		add(l1);
		tf1=new JTextField();
		tf1.setBounds(250,150,150,25);
        add(tf1);
		l2=new JLabel("Product Description");
		l2.setBounds(600,150,150,25);
		add(l2);
		tf2=new JTextField();
		tf2.setBounds(750,150,150,25);
        add(tf2);
		l3=new JLabel("Product Type");
		l3.setBounds(100,225,150,25);
		add(l3);
		tf3=new JTextField();
		tf3.setBounds(250,225,150,25);
        add(tf3);
		l4=new JLabel("Manufacture Date");
		l4.setBounds(600,225,150,25);
		add(l4);
		tf4=new JTextField();
		tf4.setBounds(750,225,150,25);
        add(tf4);
		l5=new JLabel("WareHouse id");
		l5.setBounds(100,300,150,25);
		add(l5);
		tf5=new JTextField();
		tf5.setBounds(250,300,150,25);
        add(tf5);
		b1=new JButton("first");  
        b1.setBounds(80,400,100,50);
		add(b1);
		connect();
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				/*int pro_id = Integer.parseInt(tf1.getText());
				String pro_desc=tf2.getText();
				String pro_type=tf3.getText();
				String manu_date=tf4.getText();
				int pro_ware_house = Integer.parseInt(tf5.getText());
				*/
				connect1();
			}
		});
		b2=new JButton("last");  
        b2.setBounds(300,400,100,50);
		add(b2);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				connect2();
			}
		});
		b3=new JButton("next");  
        b3.setBounds(600,400,100,50);
		add(b3);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				connect3();
			}
		});
		b4=new JButton("prev");  
        b4.setBounds(820,400,100,50);
		add(b4);
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		b5=new JButton("Add");  
        b5.setBounds(80,500,100,50);
		add(b5);
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		b6=new JButton("Delete");  
        b6.setBounds(300,500,100,50);
		add(b6);
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		b7=new JButton("Edit");  
        b7.setBounds(600,500,100,50);
		add(b7);
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				connect1();
				 
			}
		});
		b8=new JButton("Save");  
        b8.setBounds(820,500,100,50);
		add(b8);
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[]){
		new Product();
	}
/*public void connect(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");
			Statement stmt=con.createStatement();
		}catch(Exception e){
			System.out.println("Error in retrieve data "+e);
		}
	}
	*/
	public  void connect1(){
			//try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con=java.sql.DriverManager.getConnection(conString,username,password);  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			rs.first();
			TableShow t=new TableShow(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			con.close();
		}catch(Exception e){
			System.out.println("Error in retrieve data "+e);
		}
		}	
	public  void connect2(){
			try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			rs.last();
			TableShow t=new TableShow(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			con.close();
		}catch(Exception e){
			System.out.println("Error in retrieve data "+e);
		}
		}		
		public  void connect3(){
			try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			rs.relative(1);
			TableShow t=new TableShow(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			con.close();
		}catch(Exception e){
			System.out.println("Error in retrieve data "+e);
		}
		}	
		public  void connect4(){
			try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			rs.previous();
			TableShow t=new TableShow(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			con.close();
		}catch(Exception e){
			System.out.println("Error in retrieve data "+e);
		}
		}			
		public  void connect5(){
			try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			rs.first();
			TableShow t=new TableShow(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			con.close();
		}catch(Exception e){
			System.out.println("Error in retrieve data "+e);
		}
		}		
		public  void connect6(){
			try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			rs.first();
			TableShow t=new TableShow(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			con.close();
		}catch(Exception e){
			System.out.println("Error in retrieve data "+e);
		}
		}		
		public  void connect7(){
			try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			rs.first();
			TableShow t=new TableShow(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			con.close();
		}catch(Exception e){
			System.out.println("Error in retrieve data "+e);
		}
		}		
		public  void connect8(){
			try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			rs.first();
			TableShow t=new TableShow(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			con.close();
		}catch(Exception e){
			System.out.println("Error in retrieve data "+e);
		}
		}		
}
 class TableShow {    
    JFrame f;    
    TableShow(int pro_id, String pro_des,String pro_type,String pro_manu_dae,String pro_ware_house){    
    f=new JFrame();    
    String data[][]={ {String.valueOf(pro_id),pro_des,pro_type,pro_manu_dae,pro_ware_house}};    
    String column[]={"pro_id","pro_des","pro_type","pro_menu_date","pro_ware_house"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
}