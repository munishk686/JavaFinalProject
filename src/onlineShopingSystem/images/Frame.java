/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem.images;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author munis
 */
public class Frame extends JFrame {

    Panel1 jp = new Panel1();

    public Frame() {
        this.setSize(1000, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(jp);
              

    }

}
