package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;


public class EditUser extends JFrame {

    private JTextField   firstnametxt    = new JTextField();
    private JLabel       firstnamelbl    = new JLabel("Full name      : ");
    private JTextField   lastnametxt         = new JTextField();
    private JLabel       lastnamelbl         = new JLabel("Last name      : ");
    private JTextField   emialtxt         = new JTextField();
    private JLabel       emiallbl         = new JLabel("Email      : ");
    private JTextField   phonenumbertxt     = new JTextField();
    private JLabel       phonenumberlbl     = new JLabel("Phone number      : ");
    private JTextField   addresstxt     = new JTextField();
    private JLabel       addresslbl     = new JLabel("Address      : ");
    private JTextField   ZIPtxt     = new JTextField();
    private JLabel       ZIPlbl     = new JLabel("ZIP      : ");


    private JPanel edituser = new JPanel();


    private JButton changebtn = new JButton("Change");
    private JButton backButton = new JButton("Back");


    public EditUser (String myUsername) {
        this.setSize(500, 600);//size of JFrame
        this.setTitle("(edit user information)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(edituser);
        edituser.setLayout(null);

        {
            edituser.add(firstnametxt);
            firstnametxt.setBounds(100, 10, 200, 30);
            edituser.add(firstnamelbl);
            firstnamelbl.setBounds(1, 10, 100, 30);
            edituser.add(lastnametxt);
            lastnametxt.setBounds(100, 50, 200, 30);
            edituser.add(lastnamelbl);
            lastnamelbl.setBounds(1, 50, 100, 30);
            edituser.add(emialtxt);
            emialtxt.setBounds(100, 90, 200, 30);
            edituser.add(emiallbl);
            emiallbl.setBounds(1, 90, 100, 30);
            edituser.add(phonenumbertxt);
            phonenumbertxt.setBounds(100, 130, 200, 30);
            edituser.add(phonenumberlbl);
            phonenumberlbl.setBounds(1, 130, 100, 30);
            edituser.add(addresstxt);
            addresstxt.setBounds(100, 170, 200, 30);
            edituser.add(addresslbl);
            addresslbl.setBounds(1, 170, 100, 30);
            edituser.add(ZIPtxt);
            ZIPtxt.setBounds(100, 210, 200, 30);
            edituser.add(ZIPlbl);
            ZIPlbl.setBounds(1, 210, 100, 30);

        }


        edituser.add(changebtn);
    //    changebtn.setBounds(150, 450, 100, 45);
        edituser.add(backButton);
        backButton.setBounds(20,450,90,50);
        changebtn.setBounds(380,450,90,50);

        {
            backButton.addActionListener((ActionEvent e) -> {
                edituser.setVisible(false);
                try {
                    mainPage mainpage = new mainPage(myUsername);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });

            changebtn.addActionListener((ActionEvent e) -> {
                String firstname = firstnametxt.getText();
                String lastname = lastnametxt.getText();
                String email = emialtxt.getText();
                String phonenumber = phonenumbertxt.getText();
                String address = addresstxt.getText();
                String ZIP = ZIPtxt.getText();

                this.setVisible(false);
                try {
                    if (!firstname.equalsIgnoreCase("") && !lastname.equalsIgnoreCase("") && !email.equalsIgnoreCase("") && !phonenumber.equalsIgnoreCase("") && !address.equalsIgnoreCase("") && !ZIP.equalsIgnoreCase("")) {
                        new methods().updateUser(myUsername, firstname, lastname, email, phonenumber, address, ZIP);
                    } else
                        JOptionPane.showMessageDialog(null, "text fields can not be empty");
                        EditUser editUser = new EditUser(myUsername);
                }
                    catch (IOException e1) {
                    e1.printStackTrace();
                }
                try {
                    mainPage mainpage = new mainPage(myUsername);
                    this.setVisible(false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });
        }
    }
}