/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem;

import java.sql.Connection;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static onlineShopingSystem.Electronics.conn;

/**
 *
 * @author munish
 */
public class Cart extends JFrame implements ItemListener {

    public static String url = "jdbc:derby:ShoppingDB_Ebd; create=true";
    public static String username = "root";
    public static String password = "root";
    public static String[][] st;
    ButtonGroup bg;
    JRadioButton rd1;
    JRadioButton rd2;
    JLabel jl3;

    @SuppressWarnings("empty-statement")
     public void disapparWindow() {
        this.setVisible(false);
    }

    public Cart() throws SQLException {

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

        JPanel jpa = new JPanel();
        jpa.setLayout(null);
        jpa.setBackground(Color.LIGHT_GRAY);
        jpa.setSize(1000, 500);

        JLabel jl1 = new JLabel("THIS IS YOUR SHOPPING");
        jl1.setLocation(250, 10);
        jl1.setSize(500, 40);
        jl1.setFont(new Font("Helvetica", Font.BOLD, 36));

        JTable table = new JTable(model);
        JScrollPane js = new JScrollPane(table);
        js.setLocation(100, 100);
        js.setSize(500, 200);

        JLabel jl2 = new JLabel("How do you want to pay");
        jl2.setLocation(100, 310);
        jl2.setSize(300, 25);
        jl2.setFont(new Font("Helvetica", Font.BOLD, 20));

        rd1 = new JRadioButton("CREDIT CARD");
        rd1.setLocation(420, 310);
        rd1.setSize(150, 25);
        rd1.addItemListener(this);

        rd2 = new JRadioButton("ONLINE BANKING");
        rd2.setLocation(600, 310);
        rd2.setSize(150, 25);
        rd2.addItemListener(this);
        bg = new ButtonGroup();
        bg.add(rd1);
        bg.add(rd2);

        jl3 = new JLabel();
        jl3.setLocation(100, 350);
        jl3.setSize(300, 25);
        jl3.setFont(new Font("Helvetica", Font.BOLD, 20));
        
         JButton button2 = new JButton("SUBMIT");
        button2.setSize(150, 30);
        button2.setLocation(100, 400);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                disapparWindow();
            }
        });

        this.setSize(1000, 500);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(jpa);

        jpa.add(jl1);
        jpa.add(jl2);
        jpa.add(js);
        jpa.add(rd1);
        jpa.add(rd2);
        jpa.add(jl3);
        jpa.add(button2);
        validate();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (rd1.isSelected()) {
            jl3.setText("Please pay by credit cart.");
        }
        if (rd2.isSelected()) {
            jl3.setText("Please pay by online banking.");
        }
    }

}
