/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem.images;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

/**
 *
 * @author munis
 */
public class AllItems extends JFrame{
     public AllItems() {
       
        
       
        String[][] data={
            {"1", "Ps4","$500"},
            { "2","Sony TV", "$1000"},
            { "3","Sony TV", "$1000"} 
        }; 
        String[] ProductName = {"Product Name","Price","asd"};
        
        JTable jt = new JTable(data,ProductName);
         this.setSize(1000, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
       this.add(new JScrollPane(jt));
        
        
        
        
        
        
        
//         //FileWriter fr = new FileWriter("NewFile.txt");
//         try (FileReader fileReader = new FileReader("Allitems.txt");
//                BufferedReader br = new BufferedReader(fileReader);) {
//            String name = null;
//            while ((name = br.readLine()) != null) {
//                System.out.println(name);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("File not Open");
//       } 
//        

        //this.add(jt);
        
        this.setVisible(true);
        
    }
    
}
