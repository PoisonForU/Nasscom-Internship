import java.awt.*;
import javax.swing.*;
import java.util.*;  //calendar
import java.awt.event.*;
import java.sql.*; 
import java.io.*; 
//Date Cander Show
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
 
import javax.swing.JFormattedTextField.AbstractFormatter;
 
public class WareHouse extends JFrame{
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	int i=1;
	WareHouse(){
				getContentPane().setBackground(Color.gray);	//color Background
		l7=new JLabel("WareHouse Detail");
		l7.setBounds(450,50,500,50);
		l7.setFont(new Font("Serif", Font.PLAIN, 24));
		add(l7);
		l1=new JLabel("WareHouse id");
					l1.setBounds(100,150,150,25);
					add(l1);
		tf1=new JTextField();
		tf1.setBounds(250,150,150,25);
		add(tf1);
		l2=new JLabel("WareHouse Description");
		l2.setBounds(600,150,150,25);
		add(l2);
		tf2=new JTextField();
		tf2.setBounds(750,150,150,25);
        add(tf2);
		l3=new JLabel("WareHouse Type");
		l3.setBounds(100,225,150,25);
		add(l3);
		tf3=new JTextField();
		tf3.setBounds(250,225,150,25);
        add(tf3);
		l4=new JLabel("Storage Date");
		l4.setBounds(600,225,150,25);
		add(l4);
		tf4=new JTextField();
		tf4.setBounds(750,225,150,25);
        add(tf4);
		l5=new JLabel("Product id");
		l5.setBounds(100,300,150,25);
		add(l5);
		tf5=new JTextField();
		tf5.setBounds(250,300,150,25);
        add(tf5);
		b1=new JButton("first");  
        b1.setBounds(80,400,100,50);
		add(b1);
		//connect();
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
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
				connect4();
			}
		});
		b5=new JButton("Add");  
        b5.setBounds(80,500,100,50);
		add(b5);
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				connect5();
			}
		});
		b6=new JButton("Delete");  
        b6.setBounds(300,500,100,50);
		add(b6);
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				notVisible();
					connect6();
			}
		});
		b7=new JButton("Edit");  
        b7.setBounds(600,500,100,50);
		add(b7);
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					notVisible();
					l1=new JLabel("WareHouse id");
					l1.setBounds(100,150,150,25);
					add(l1);
					tf1=new JTextField();
					tf1.setBounds(250,150,150,25);
					add(tf1);
					connect7();
				}
				
        });
		b8=new JButton("Save");  
        b8.setBounds(820,500,100,50);
		add(b8);
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				connect8();
			}
		});
		b11=new JButton("Search warehouse");
        b11.setBounds(600,300,150,25);
		add(b11);
		b11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				connect11();
			}
		});
		b12=new JButton(" Sign Out ");  
        b12.setBounds(800,300,150,25);
		add(b12);
		b12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					new Demo();
					dispose();
			}
		});
		
		setSize(1000,700);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String args[]){
		new WareHouse();
	}
	public  void connect1(){
			try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from warehouse");
			rs.first();
			TableShow1 t=new TableShow1(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
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
			ResultSet rs=stmt.executeQuery("select * from warehouse");
			rs.last();
			TableShow1 t=new TableShow1(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
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
			ResultSet rs=stmt.executeQuery("select * from warehouse");
			rs.relative(i);
			TableShow1 t=new TableShow1(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
			i=i+1;
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
			ResultSet rs=stmt.executeQuery("select * from warehouse");
			rs.previous();
			rs.relative(i);
			TableShow1 t=new TableShow1(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
			i=i-1;
			con.close();
		}catch(Exception e){
			System.out.println("Error in retrieve data "+e);
		}
		}			
		public  void connect5(){
			 b5.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
            }
        });

		}		
		public  void connect6(){
					l1=new JLabel("WareHouse id");
					l1.setBounds(100,150,150,25);
					add(l1);
					tf1=new JTextField();
					tf1.setBounds(250,150,150,25);
					add(tf1);
					b10=new JButton("ID wants to Deleted");
					b10.setBounds(750,150,150,25);
					add(b10);
						b10.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
								connect10();
						}
						});
			}		
		public  void connect7(){					
					b9=new JButton("WareHouse_ID data wants to Updated");
					b9.setBounds(600,300,200,50);
					add(b9);
					b9.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
								connect9();
						}
						});
								}
		
		public  void connect8(){ 
			try {
			// connection string
				Class.forName("com.mysql.jdbc.Driver").newInstance();
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");
					Statement st = con.createStatement();
					String ware_id=tf1.getText();
					int warehouse_id=
					st.executeUpdate("insert into warehouse(warehouse_id,warehouse_desc,warehouse_type,warehouse_storage_date,pro_id) VALUES('"+tf1.getText()+"','"+ tf2.getText() + "','" + tf3.getText() + "','"+ tf4.getText() + "','" + tf5.getText()+"')");
					JOptionPane.showConfirmDialog(null, "Your Data Has been Inserted","Result", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
					st.close();
					con.close();
					}catch (Exception e1){
								System.out.println("Exception:" + e1);
								}
		}
		public void connect9(){
			try{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");
				String id=tf1.getText();
				PreparedStatement stmt=con.prepareStatement("select * from warehouse where warehouse_id='"+id+"'");
				ResultSet rs=stmt.executeQuery();
				b9.setVisible(false);
				
				if(rs.next()){
					tf2.setText(rs.getString(2));
					tf3.setText(rs.getString(3));
					tf4.setText(rs.getString(4));
					tf5.setText(rs.getString(5));
				}
				stmt.close();
					con.close();
					}catch (Exception e1){
					JOptionPane.showConfirmDialog(null, "Data is not present","Result", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
			}
			visible();
			b9.setVisible(false);
		}	
			public void connect10(){
				try{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");
				String id=tf1.getText();
				PreparedStatement stmt=con.prepareStatement("Search warehouse_id='"+id+"'");
				stmt.executeUpdate();
				b10.setVisible(false);
				JOptionPane.showConfirmDialog(null, "Your Data Has been Search","id", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
				stmt.close();
				con.close();
				visible();
				}catch (Exception e1){
					System.out.println("Exception:" + e1);
				}
			}
			public void connect11(){
				try{
					DefaultTableModel model = new DefaultTableModel(
					new Object[]{"warehouse_id","pro_desc","warehouse_type","warehouse_storage_date","pro_id"},0);
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","");
				String id=tf1.getText();
				PreparedStatement stmt=con.prepareStatement("select * from warehouse where warehouse_id='"+id+"'");
				ResultSet rs=stmt.executeQuery();
				while(rs.next())
				{
					Object[] rows = {rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)};
					model.addRow(rows);
				}
				//TableShow t=new TableShow(model);
				b10.setVisible(false);
				JOptionPane.showConfirmDialog(null, "Your Data Has been Deleted","id", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
				stmt.close();
				con.close();
				visible();
				}catch (Exception e1){
					System.out.println("Exception:" + e1);
				}
		}
		
			
		public void notVisible(){
			
			tf2.setVisible(false);
			tf3.setVisible(false);
			tf4.setVisible(false);
			tf5.setVisible(false);
			l2.setVisible(false);
			l3.setVisible(false);
			l4.setVisible(false);
			l5.setVisible(false);
		}		
		public void visible(){
			
			tf2.setVisible(true);
			tf3.setVisible(true);
			tf4.setVisible(true);
			tf5.setVisible(true);
			l2.setVisible(true);
			l3.setVisible(true);
			l4.setVisible(true);
			l5.setVisible(true);
		}
	}
 class TableShow1 {    
    JFrame f;    
    TableShow1(int pro_id, String pro_des,String pro_type,String pro_manu_dae,int pro_ware_house){    
    f=new JFrame();    
    String data[][]={ {String.valueOf(pro_id),pro_des,pro_type,pro_manu_dae,String.valueOf(pro_ware_house)}};    
    String column[]={"warehouse_id","pro_desc","warehouse_type","warehouse_storage_date","pro_id"};      
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp = new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
	}   
	
/*TableShow(DefaultTableModel model)
	{
		f=new JFrame(); 
		JTable jt=new JTable(model);    
		jt.setBounds(30,40,200,300);          
		JScrollPane sp = new JScrollPane(jt);    
		f.add(sp);          
		f.setSize(300,400);    
		f.setVisible(true);    
	}
	*/
}