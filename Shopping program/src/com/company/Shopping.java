package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Shopping extends JFrame {
    private JButton backButton = new JButton("Back");
    private JButton Button1 = new JButton("کت");
    private JButton Button2 = new JButton("دامن");
    private JButton Button3 = new JButton("پیراهن");
    private JButton Button4 = new JButton("مانتو");
    private JButton Button5 = new JButton("شلوار");
    private JButton Button6 = new JButton("اورال");
    private JButton Button7 = new JButton("کفش");
    private JButton Button8 = new JButton("کیف");
    private JButton Button9 = new JButton("روسری/شال");
    private JPanel Shopping = new JPanel();

    public Shopping(String username) {
        this.setSize(500,600);
        this.setTitle("(Shopping)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        this.add(Shopping);
        Shopping.setLayout(null);

        Shopping.add(backButton);
        Shopping.add(Button1);
        Shopping.add(Button2);
        Shopping.add(Button3);
        Shopping.add(Button4);
        Shopping.add(Button5);
        Shopping.add(Button6);
        Shopping.add(Button7);
        Shopping.add(Button8);
        Shopping.add(Button9);

        backButton.setBounds(20,450,95,50);

        Button1.setBounds(180 , 10 , 130 , 35);
        Button2.setBounds(180 , 60 , 130 , 35);
        Button3.setBounds(180 , 110 , 130 , 35);
        Button4.setBounds(180 , 160 , 130 , 35);
        Button5.setBounds(180 , 210 , 130 , 35);
        Button6.setBounds(180 , 260 , 130 , 35);
        Button7.setBounds(180 , 310 , 130 , 35);
        Button8.setBounds(180 , 360 , 130 , 35);
        Button9.setBounds(180 , 410 , 130 , 35);


        backButton.addActionListener((ActionEvent e) -> {
            try {
                mainPage mainPage = new mainPage(username);
                this.setVisible(false);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        Button1.addActionListener((ActionEvent e) -> {
            Shopping.setVisible(false);
            try {
                Category category= new Category(username,1);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });
        Button2.addActionListener((ActionEvent e) -> {
            Shopping.setVisible(false);
            try {
                Category category= new Category(username,2);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });
        Button3.addActionListener((ActionEvent e) -> {
            Shopping.setVisible(false);
            try {
                Category category= new Category(username,3);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });
        Button4.addActionListener((ActionEvent e) -> {
            Shopping.setVisible(false);
            try {
                Category category= new Category(username,4);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });
        Button5.addActionListener((ActionEvent e) -> {
            Shopping.setVisible(false);
            try {
                Category category= new Category(username,5);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });
        Button6.addActionListener((ActionEvent e) -> {
            Shopping.setVisible(false);
            try {
                Category category= new Category(username,6);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });
        Button7.addActionListener((ActionEvent e) -> {
            Shopping.setVisible(false);
            try {
                Category category= new Category(username,7);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });
        Button8.addActionListener((ActionEvent e) -> {
            Shopping.setVisible(false);
            try {
                Category category= new Category(username,8);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });
        Button9.addActionListener((ActionEvent e) -> {
            Shopping.setVisible(false);
            try {
                Category category= new Category(username,9);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });
    }
}
