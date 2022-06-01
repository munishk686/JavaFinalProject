/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineShopingSystem;

import java.util.Scanner;

/**
 *
 * @author munish
 *  I am using NetBeans version 12.6
 * And java version 17.0.1
 */
public class Customers {

    Scanner sc = new Scanner(System.in);
    boolean isValid;
    private String name = "";
    private String address = "";
    private int phoneNo = 0;
    private String email = "";

    public Customers() {
    }

    public Customers(String name, String address, int phoneNo, String email) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n\tCustomers Detail" + "\n\t==============" + "\nName=\t\t" + name + "\nAddress=\t" + address + "\nPhoneNo=\t"
                + phoneNo + "\nEmail=\t\t" + email;
    }
// This methode allows user to input numbers only.

    public void validInput() {
        do {
            if (sc.hasNextInt()) {
                this.phoneNo = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("please input valid number");
                isValid = false;
                sc.next();
            }

        } while (!(isValid));
    }
// This methode takes customer details after buying products.

    public void inputCusDetail() {

        System.out.println("Please enter your Name. ");
        this.name = sc.nextLine();
        System.out.println("Please enter your Address. ");
        this.address = sc.nextLine();

        System.out.println("Please enter your Email ");
        this.email = sc.nextLine();
        System.out.println("Please enter your Phone No. ");
        validInput();

    }

}
