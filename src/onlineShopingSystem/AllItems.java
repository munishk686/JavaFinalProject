/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

/**
 *
 * @author munish
 * This class extends JFrame and implements Disappear class.
 */
public class AllItems extends JFrame implements Disappear {

    @Override
    public void disapparWindow() {
        this.setVisible(false);
    }

    public AllItems() {
        
// The 2D array variable store all the products detail.
        String[][] data = {
            {"1", "Ps4 price", "$400"},
            {"2", "Sony TV 42inch price:", "$1000"},
            {"3", "Sony Soundbar  price:", "$500"},
            {"4", "Flower vase:", "$50"},
            {"5", "Persian Rugs:", "$500"},
            {"6", "Drink bottle:", "$10"},
            {"7", "Queen Bed:", "$1000"},
            {"8", "Queen mattress:", "$1000"},
            {"9", "Bed Sides:", "$500"},
            {"10", "Minecraft:", "$80"},
            {"11", "Call of Duty:", "$70"},
            {"12", "Super Mario:", "$50"},};

        String[] ProductName = {"Product No", "Product Name", "Price"};

        JTable jt = new JTable(data, ProductName);
        JScrollPane jScrollPane = new JScrollPane(jt);

        JPanel jpanel1 = new JPanel();
        jpanel1.setBackground(Color.red);
        jpanel1.add(jScrollPane);

        JButton button2 = new JButton("GO TO MAIN PAGE");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Disappar current window.
                disapparWindow();
            }
        });

        JPanel jpanel2 = new JPanel();
        jpanel2.setBackground(Color.cyan);
        jpanel2.add(button2);

        this.setSize(1000, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.add(jpanel1, BorderLayout.CENTER);
        this.add(jpanel2, BorderLayout.PAGE_END);

        this.setVisible(true);

    }

}
