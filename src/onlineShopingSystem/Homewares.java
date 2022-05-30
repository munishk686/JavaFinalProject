/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author munis
 */
public class Homewares extends JFrame {

    public static Connection conn;
    public static String url = "jdbc:derby:ShoppingDB_Ebd; create=true";
    public static String username = "root";
    public static String password = "root";
    Statement statement;
    String tableName = "CREATE TABLE SHOPPING_CART (PRODUCTNAME VARCHAR(50), PRICE VARCHAR(20))";
    ConnectionManage connectionManage = new ConnectionManage();

    public void disapparWindow() {
        this.setVisible(false);
    }

    public Homewares() {

        String[] homPro = new String[3];
        homPro[0] = "Flower vase $50";
        homPro[1] = "Persian Rugs $500";
        homPro[2] = "Drink bottle $10";

        JList jl = new JList(homPro);
        jl.setSize(500, 100);
        jl.setLocation(100, 20);

        JLabel label2 = new JLabel();
        label2.setSize(400, 50);
        label2.setLocation(100, 200);
        label2.setFont(new Font("Helvetica", Font.BOLD, 20));

        JButton button2 = new JButton("GO TO MAIN PAGE");
        button2.setSize(150, 30);
        button2.setLocation(100, 400);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                disapparWindow();
            }
        });

        JButton button3 = new JButton("GO TO CART");
        button3.setSize(150, 30);
        button3.setLocation(800, 400);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Cart cart = new Cart();
                    disapparWindow();
                } catch (SQLException ex) {
                    Logger.getLogger(Electronics.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        JButton button = new JButton("BUY");
        button.setSize(100, 30);
        button.setLocation(100, 150);

        connectionManage.checkExistedTable("SHOPPING_CART");

        try {
            conn = DriverManager.getConnection(url, username, password);
            statement = conn.createStatement();
            statement.executeUpdate(tableName);
            System.out.println("table is created");
        } catch (SQLException ex) {
            Logger.getLogger(Electronics.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(url + " connected");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jl.getSelectedIndex() != -1) {
                    try {
                        String num = (String) jl.getSelectedValue();
                        PreparedStatement psH = null;
                        if (num.equals("Flower vase $50")) {
                            psH = conn.prepareStatement("insert into SHOPPING_CART (PRODUCTNAME, PRICE) values('Flower vase' ,'50')");
                            label2.setText("You have selected Flower vase $50");
                        }
                        if (num.equals("Persian Rugs $500")) {
                            psH = conn.prepareStatement("insert into SHOPPING_CART (PRODUCTNAME, PRICE) values('Persian Rugs' ,'500')");
                            label2.setText("You have selected Persian Rugs $500");
                        }
                        if (num.equals("Drink bottle $10")) {
                            psH = conn.prepareStatement("insert into SHOPPING_CART (PRODUCTNAME, PRICE) values('Drink bottle' ,'10')");
                            label2.setText("You have selected Drink bottle $10");
                        }

                         psH.executeUpdate();
                         //psH.close();
                        //statement.close();
                        //conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Electronics.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

        });

        this.setSize(1000, 500);
        this.setResizable(false);
        this.setLayout(null);

        JPanel jpa = new JPanel();
        jpa.setLayout(null);
        jpa.setBackground(Color.LIGHT_GRAY);
        jpa.setSize(1000, 500);

        jpa.add(jl);
        jpa.add(label2);
        jpa.add(button);
        jpa.add(button2);
        jpa.add(button3);

        this.add(jpa);
        this.setVisible(true);

    }

}
