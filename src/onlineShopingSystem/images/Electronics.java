/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem.images;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

/**
 *
 * @author munis
 */
public class Electronics extends JFrame {

    public static Connection conn;
    public static String url = "jdbc:derby://localhost:1527/new1";
    public static String username = "root";
    public static String password = "root";

    public void goBack() {
        this.setVisible(false);
    }

    public Electronics() {

        String[] elePro = new String[3];
        elePro[0] = "Ps4 $400";
        elePro[1] = "Sony TV 42inch $1000";
        elePro[2] = "Sony Soundbar $500";

        JList jl = new JList(elePro);
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
                goBack();
            }
        });

        JButton button3 = new JButton("GO TO CART");
        button3.setSize(150, 30);
        button3.setLocation(800, 400);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cart cart = new Cart();
                goBack();
            }
        });

        JButton button = new JButton("BUY");
        button.setSize(100, 30);
        button.setLocation(100, 150);

        try {
            conn = DriverManager.getConnection(url, username, password);
            Statement statement1 = conn.createStatement();
            PreparedStatement dl = conn.prepareStatement("delete from login");
            dl.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Electronics.class.getName()).log(Level.SEVERE, null, ex);
        }
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jl.getSelectedIndex() != -1) {

                    try {
                        conn = DriverManager.getConnection(url, username, password);
                        System.out.println(url + " connected");
                        Statement statement = conn.createStatement();
                        String num = (String) jl.getSelectedValue();
                        PreparedStatement ps = null;

                        if (num.equals("Ps4 $400")) {
                            ps = conn.prepareStatement("insert into login (id, password) values('Ps4' ,'400')");
                            label2.setText("You have selected Ps4 $400");
                        }
                        if (num.equals("Sony TV 42inch $1000")) {
                            ps = conn.prepareStatement("insert into login (id, password) values('Sony TV 42inch' ,'1000')");
                            label2.setText("You have selected Sony TV 42inch $1000");
                        }
                        if (num.equals("Sony Soundbar $500")) {
                            ps = conn.prepareStatement("insert into login (id, password) values('Sony Soundbar' ,'500')");
                            label2.setText("You have selected Sony Soundbar $500");
                        }

                        ps.executeUpdate();

                        statement.close();
                        conn.close();
                    } catch (SQLException ex) {
                        System.out.println("connection disconnected");
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
