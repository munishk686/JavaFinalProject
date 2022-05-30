/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem;

import java.sql.Connection;
import java.awt.*;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static onlineShopingSystem.Electronics.conn;

/**
 *
 * @author munish
 */
public class Cart extends JFrame {

    public static String url = "jdbc:derby:ShoppingDB_Ebd; create=true";
    public static String username = "root";
    public static String password = "root";
    public static String[][] st;

    @SuppressWarnings("empty-statement")

    public Cart() throws SQLException {
        //Object[][] data;
        Connection conn;
        String[] columnName = {"products", "Price"};
        DefaultTableModel model = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println(url + " connected");
            Statement statement = conn.createStatement();

            String selectQuery = "SELECT * FROM SHOPPING_CART";
            ResultSet rs = null;

            rs = statement.executeQuery(selectQuery);
            while (rs.next()) {
                String prodType = rs.getString("PRODUCTNAME");
                String priceReturn = rs.getString("PRICE");

                Object[][] data = {{prodType, priceReturn}};
                // model.addRow(data);
                model = new DefaultTableModel(data, columnName);
                System.out.println(prodType + " " + priceReturn);
            }
            conn.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Electronics.class.getName()).log(Level.SEVERE, null, ex);
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
