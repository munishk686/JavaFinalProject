/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem.images;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author munis
 */
public class About extends JFrame {
     //JFrame jf = new JFrame();
     public About(){
         this.setSize(1000, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        
        
        JPanel jpa = new JPanel();
         jpa.setLayout(null);
        jpa.setBackground(Color.MAGENTA);
        jpa.setSize(1000, 500);
        this.add(jpa);
        
        JLabel jla = new JLabel("This is a very good company");
        jla.setFont(new Font("Helvetica", Font.BOLD, 20));
        jla.setLocation(100, 100);
        jla.setSize(320, 150);
        
        jpa.add(jla);
        this.setVisible(true);
     }
     
    
}
