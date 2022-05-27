/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem.images;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author munis
 */
public class Panel1 extends JPanel {

    public Panel1() {
        // set Panel location and colour.
        this.setLayout(null);
        this.setBackground(Color.CYAN);
        this.setSize(1000, 500);

        JLabel jl1 = new JLabel("ONLINE SHOPPING SYSTEM");
        jl1.setLocation(250, 0);
        jl1.setSize(500, 100);
        jl1.setFont(new Font("Helvetica", Font.BOLD, 36));
        this.add(jl1);

        JButton jb1 = new JButton("ALL ITEMS");
        jb1.setLocation(600, 120);
        jb1.setSize(120, 50);
        jb1.setBackground(Color.LIGHT_GRAY);
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AllItems all = new AllItems();
            }

        });
        this.add(jb1);

        JButton jb2 = new JButton("ABOUT");
        jb2.setLocation(800, 120);
        jb2.setSize(120, 50);
        jb2.setBackground(Color.LIGHT_GRAY);
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                About ab = new About();
            }

        });
        this.add(jb2);

        JLabel jl2 = new JLabel("CATEGERYS");
        jl2.setLocation(50, 120);
        jl2.setSize(150, 50);
        jl2.setFont(new Font("Helvetica", Font.BOLD, 20));
        this.add(jl2);

        JButton jb3 = new JButton("ELECTRONICS");
        jb3.setLocation(50, 170);
        jb3.setSize(120, 50);
        jb3.setBackground(Color.LIGHT_GRAY);
        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Electronics ele = new Electronics();
            }

        });
        this.add(jb3);

        JButton jb4 = new JButton("HOWEWARES");
        jb4.setLocation(50, 230);
        jb4.setSize(120, 50);
        jb4.setBackground(Color.LIGHT_GRAY);
        this.add(jb4);

        JButton jb5 = new JButton("FURNITURE");
        jb5.setLocation(50, 290);
        jb5.setSize(120, 50);
        jb5.setBackground(Color.LIGHT_GRAY);
        this.add(jb5);

        JButton jb6 = new JButton("VIDEO GAMES");
        jb6.setLocation(50, 350);
        jb6.setSize(120, 50);
        jb6.setBackground(Color.LIGHT_GRAY);
        this.add(jb6);

        JButton jb7 = new JButton("EXIT");
        jb7.setLocation(800, 400);
        jb7.setSize(120, 50);
        jb7.setBackground(Color.LIGHT_GRAY);
        jb7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
        this.add(jb7);
        this.setVisible(true);
    }

}
