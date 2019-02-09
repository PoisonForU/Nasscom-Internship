public  void connect1(){
			//try{
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