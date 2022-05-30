/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author munis
 */
public class Gui {
    
    
    public static void main(String[] args) {
        //new Gui();
        JFrame fr = new JFrame();
        JPanel jp = new JPanel();
        fr.add(jp);
        
        JLabel jl = new JLabel("new world");
        jp.add(jl);
        fr.setVisible(true);
        System.out.println("hello world");
        
    }
    
}
