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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author munish
 * This class extends JFrame and implements Disappear class.
 */
public class VideoGames extends JFrame implements Disappear {

    public static Connection conn;
    public static String url = "jdbc:derby:ShoppingDB_Ebd; create=true";
    public static String username = "root";
    public static String password = "root";
    Statement statement;
    String tableName = "CREATE TABLE SHOPPING_CART (PRODUCTNAME VARCHAR(50), PRICE VARCHAR(20))";
    ConnectionManager connectionManage = new ConnectionManager();

    @Override
    public void disapparWindow() {
        this.setVisible(false);
    }

    public VideoGames() {

        String[] vidPro = new String[3];
        vidPro[0] = "Minecraft $80";
        vidPro[1] = "Call of Duty $70";
        vidPro[2] = "Super Mario $50";

        JList jl = new JList(vidPro);
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
                 //Disappar current window.
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

        JLabel label5 = new JLabel("Select your product to buy");
        label5.setSize(400, 50);
        label5.setLocation(100, 150);
        label5.setFont(new Font("Helvetica", Font.BOLD, 20));

        JButton button = new JButton("BUY");
        button.setSize(100, 30);
        button.setLocation(500, 150);
         // This method checks table name SHOPPING_CART.
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
                        PreparedStatement ps = null;
                        if (num.equals("Minecraft $80")) {
                            ps = conn.prepareStatement("insert into SHOPPING_CART (PRODUCTNAME, PRICE) values('Minecraft' ,'$80')");
                            label2.setText("You have selected Minecraft $80");
                        }
                        if (num.equals("Call of Duty $70")) {
                            ps = conn.prepareStatement("insert into SHOPPING_CART (PRODUCTNAME, PRICE) values('Call of Duty' ,'$70')");
                            label2.setText("You have selected Call of Duty $70");
                        }
                        if (num.equals("Super Mario $50")) {
                            ps = conn.prepareStatement("insert into SHOPPING_CART (PRODUCTNAME, PRICE) values('Super Mario' ,'$50')");
                            label2.setText("You have selected Super Mario $50");
                        }

                        ps.executeUpdate();
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
        jpa.add(label5);

        this.add(jpa);
        this.setVisible(true);

    }

}
