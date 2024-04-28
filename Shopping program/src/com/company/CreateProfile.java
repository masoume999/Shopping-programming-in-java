package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;


public class CreateProfile extends JFrame {
    private String firstname = "", lastname = "", email = "", phonenumber = "", address = "", zip = "";

    //    JScrollBar verticalScrollBar = new JScrollBar(JScrollBar.VERTICAL,10, 5, 0, 50);
//    JScrollBar horizentalScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,10, 5, 0, 50);
    private JLabel line = new JLabel("~~~~~~~~~~~~~~~~~");

    private JTextField   firstnametxt    = new JTextField();
    private JLabel       firstnamelbl    = new JLabel("First name      : ");
    private JTextField   lastnametxt         = new JTextField();
    private JLabel       lastnamelbl         = new JLabel("Last name      : ");
    private JTextField   phonenumbertxt         = new JTextField();
    private JLabel       phonenumberlbl         = new JLabel("Phone number : ");
    private JTextField   emailtxt         = new JTextField();
    private JLabel       emaillbl         = new JLabel("Email      : ");
    private JTextField   addresstxt         = new JTextField();
    private JLabel       addresslbl         = new JLabel("Address      : ");
    private JTextField   ZIPtxt         = new JTextField();
    private JLabel       ZIPlbl         = new JLabel("ZIP      : ");








    private JPanel createprofile = new JPanel();


    private JButton savebtn = new JButton("Save");


    public CreateProfile(String usernamestr , String passwordstr) {
        this.setSize(500, 600);//size of JFrame
        this.setTitle("Create profile");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(createprofile);
        createprofile.setLayout(null);
//        createprofile.add(verticalScrollBar);
//        verticalScrollBar.setBounds(490 , 0 , 10 , 600);
//        createprofile.add(horizentalScrollBar);
//        horizentalScrollBar.setBounds(0 , 550 , 500 , 10);

        {
            createprofile.add(firstnametxt);
            firstnametxt.setBounds(100, 10, 200, 30);
            createprofile.add(firstnamelbl);
            firstnamelbl.setBounds(1, 10, 100, 30);
            createprofile.add(lastnametxt);
            lastnametxt.setBounds(100, 50, 200, 30);
            createprofile.add(lastnamelbl);
            lastnamelbl.setBounds(1, 50, 100, 30);
            createprofile.add(phonenumbertxt);
            phonenumbertxt.setBounds(100, 90, 200, 30);
            createprofile.add(phonenumberlbl);
            phonenumberlbl.setBounds(1, 90, 100, 30);
            createprofile.add(emailtxt);
            emailtxt.setBounds(100, 130, 200, 30);
            createprofile.add(emaillbl);
            emaillbl.setBounds(1, 130, 100, 30);
            createprofile.add(addresstxt);
            addresstxt.setBounds(100, 170, 200, 30);
            createprofile.add(addresslbl);
            addresslbl.setBounds(1, 170, 100, 30);
            createprofile.add(ZIPtxt);
            ZIPtxt.setBounds(100, 210, 200, 30);
            createprofile.add(ZIPlbl);
            ZIPlbl.setBounds(1, 210, 100, 30);

        }


        createprofile.add(savebtn);
        savebtn.setBounds(150, 450, 100, 45);


            savebtn.addActionListener((ActionEvent e) -> {
                firstname = firstnametxt.getText();
                lastname = lastnametxt.getText();
                email = emailtxt.getText();
                phonenumber = phonenumbertxt.getText();
                address = addresstxt.getText();
                zip = ZIPtxt.getText();

                this.setVisible(false);
                try {
                    new methods().saveUser(usernamestr,passwordstr,firstname,lastname,email,phonenumber,address,zip);
                    JOptionPane.showMessageDialog(null, "~Welcome~\nYou are one of us now." , "hey!" , JOptionPane.YES_OPTION);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                try {
                    mainPage mainpage = new mainPage(usernamestr);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });

        }
    }
