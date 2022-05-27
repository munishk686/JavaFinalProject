/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem.images;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

/**
 *
 * @author munis
 */
public class SecondMain {
    public static void main(String[] args) {
         
        
         String[][] data={
            { "Ps4","$500","as"},
            { "Sony TV", "$1000","lk"},
            { "Sony TV", "$1000","kjh"} 
        }; 
        String[] ProductName = {"Product Name","Price","asd"};
        
        JTable table = new JTable(data,ProductName);
        
        JFrame frame = new JFrame("Table Demo");
        //frame.add(table);
       frame.add(new JScrollPane(table));
        frame.setSize(1000, 500);
      //  frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
       // frame.setLayout(null);
         frame.setVisible(true);
    }
    }
            
    
   


