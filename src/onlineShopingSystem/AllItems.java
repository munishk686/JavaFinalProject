/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem;

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
 */
public class AllItems extends JFrame {

    public void goBack() {
        this.setVisible(false);
    }

    public AllItems() {

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

        String[] ProductName = {"Product N0", "Product Name", "Price"};

        JTable jt = new JTable(data, ProductName);
        this.setSize(1000, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        this.add(new JScrollPane(jt));

        this.setVisible(true);

    }

}
