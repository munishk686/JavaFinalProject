/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author munish
 * This class extends JFrame and implements Disappear class.
 */
public class About extends JFrame implements Disappear {

    @Override
    public void disapparWindow() {
        this.setVisible(false);
    }

    public About() {
        this.setSize(1000, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLayout(null);

        JPanel jpa = new JPanel();
        jpa.setLayout(null);
        jpa.setBackground(Color.MAGENTA);
        jpa.setSize(1000, 500);
        this.add(jpa);

        JLabel jla = new JLabel("The mission of this website is to provide the cheapest and quality product to your home");
        jla.setFont(new Font("Helvetica", Font.BOLD, 20));
        jla.setLocation(100, 100);
        jla.setSize(900, 150);

        JButton button2 = new JButton("GO TO MAIN PAGE");
        button2.setSize(150, 30);
        button2.setLocation(100, 400);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                   //Disappar current window.
                disapparWindow();
            }
        });

        jpa.add(jla);
        jpa.add(button2);
        this.setVisible(true);
    }

}
