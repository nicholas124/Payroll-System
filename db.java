
package employee.payroll.system;

import java.sql.*;
import javax.swing.*;
public class db {
    
    
    
   public static Connection conn=null;
    public static Connection java_db(){
        
      // try{
            
           try{
         /**   Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            //st = con.createStatement();
        }catch(Exception ex){
            System.out.println("Error"+ex);
        } */
          
          Class.forName("org.sqlite.JDBC");
           Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\SILAS\\Documents\\NetBeansProjects\\Employee Payroll System\\empnet.sqlite");
           JOptionPane.showMessageDialog(null, "Connection to database is successful"); 
      
            return conn;
           
            
      }catch (Exception e){
          JOptionPane.showMessageDialog(null, e);
         return null;
      }
        
    }
}
