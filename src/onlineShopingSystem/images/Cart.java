/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem.images;

import java.sql.Connection;
import java.awt.Color;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author munis
 */
public class Cart extends JFrame {
   
    @SuppressWarnings("empty-statement")
    public Cart(){
         Connection conn;
      String url = "jdbc:derby://localhost:1527/new1";
      String username = "root";
      String password = "root";
      //Object[][] element = null;
      // String name = "ram";
        //String names = "400";
       Object[][] data=null;
       //= {{name,names}};
                    String[] columnName = {"products","Price"};
        DefaultTableModel model = new DefaultTableModel(data,columnName);
       
         try {
            
            conn = DriverManager.getConnection(url, username, password);
            System.out.println(url + " connected");
           Statement statement = conn.createStatement();
           
           ResultSet rs =  statement.executeQuery("SELECT * FROM login");
          while(rs.next()){
              String product = rs.getString("id");
              String price = rs.getString("password");
              Object[] element = {product,price};
             model.addRow(element);
          }
             System.out.println("Data has been fetched");
        } catch (SQLException ex) {
            System.out.println("connection disconnected");
            
        }

    
                              

       
       JTable table = new JTable(model);
       JScrollPane js = new JScrollPane(table);
       js.setLocation(100, 100);
       js.setSize(500, 200);  
       
        
       
        
        
        
        
         JLabel jl1 = new JLabel("THIS IS YOUR SHOPPING");
        jl1.setLocation(250, 0);
        jl1.setSize(500, 50);
        jl1.setFont(new Font("Helvetica", Font.BOLD, 36));
        
                       
         JPanel jpa = new JPanel();
        jpa.setLayout(null);
        jpa.setBackground(Color.LIGHT_GRAY);
        jpa.setSize(1000, 500);
        
        this.setSize(1000, 500);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(jpa);
        jpa.add(jl1);
       jpa.add(js);
        validate();
    }
    
}
