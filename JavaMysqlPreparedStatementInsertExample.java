import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*; 
import java.io.*;
import java.util.Calendar;

/**
 * A Java MySQL PreparedStatement INSERT example.
 * Demonstrates the use of a SQL INSERT statement against a
 * MySQL database, called from a Java program, using a
 * Java PreparedStatement.
 * 
 * Created by Alvin Alexander, http://alvinalexander.com
 */
public class JavaMysqlPreparedStatementInsertExample extends JFrame
{
	public static void main(String[] args)
  { 
JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JPasswordField pf1,pf2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1;
	//	getContentPane().setBackground(Color.gray);	//color Background
		l7=new JLabel("SignUp Page");
		l7.setBounds(450,50,500,50);
		l7.setFont(new Font("Serif", Font.BOLD, 24));
		add(l7);
		l1=new JLabel("Employee Description");//DropDown 
		l1.setBounds(100,150,150,25);
		add(l1);
		tf1=new JTextField();
		tf1.setBounds(250,150,150,25);
        add(tf1);
		String sets=tf1.getTextField();
		int set=Integer.parse(sets);
    try
    {
      // create a mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/production";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
    
      // create a sql date object so we can use it in our INSERT statement
      Calendar calendar = Calendar.getInstance();
      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

      // the mysql insert statement
      String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
        + " values (?, ?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, "Barney");
      preparedStmt.setString (2, "Rubble");
      preparedStmt.setDate   (3, startDate);
      preparedStmt.setBoolean(4, false);
      preparedStmt.setInt    (5, set);

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
}
//dateAgentAdded(new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).parse(fieldDateAgentAdded.toString());
