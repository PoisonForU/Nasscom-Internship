package ComboDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

public class DBClass {

    String conString = "jdbc:mysql://localhost:3306/production";
    String username = "root";
    String password = "";

    //INSERT INTO DB
    public Boolean add(int id,String name,String type,String manu_date,int ware_house) {
        //SQL STMT
        String sql = "INSERT INTO production(pro_id,pro_des,pro_type,pro_manu_date,pro_ware_house) VALUES('"+id+"','"+des+"','"+type+"','"+manu_date+"','"+ware_house"')";

        try {
            //CONNECTION"
            Connection con = DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
             return false;
        }

    }

    //RETRIEVE DATA 
    public DefaultComboBoxModel retrieve()
    {
        DefaultComboBoxModel dm=new DefaultComboBoxModel();

        //SQL
        String sql="SELECT * FROM product";

        try
        {
            Connection con=DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s=con.prepareStatement(sql);
            ResultSet rs=s.executeQuery(sql);

            //LOOP THRU GETTING ALL VALUES
            while(rs.next())
            {
                //GET VALUES
                String name=rs.getString(1);

                dm.addElement(name);
            }

            return dm;

        }catch (SQLException ex) {
            ex.printStackTrace();
             return null;
        }

    }

    //UPDATE DATA
    public Boolean update(int id,String name,String type,String manu_date,int ware_house)
    {
        String sql="UPDATE playerstb SET Name ='" + value + "' WHERE Name='" + id + "'";

        try
        {
            //GET COONECTION
            Connection con=DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch (SQLException ex) {
            ex.printStackTrace();
             return false;
        }

    }

    //DELETE
    public Boolean delete(int id)
    {
        String sql="DELETE FROM product WHERE Name ='"+id+"'";

        try
        {
            //GET COONECTION
            Connection con=DriverManager.getConnection(conString, username, password);

             //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch (SQLException ex) {
            ex.printStackTrace();
             return false;
        }

    }
}