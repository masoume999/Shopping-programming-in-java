package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Cart extends JFrame {
    private JButton backButton = new JButton("Back");
    private JLabel title = new JLabel();
    private JLabel text = new JLabel();
    private JLabel banknmae = new JLabel("Choose your bank");
    private JRadioButton bank1 = new JRadioButton("قوامین");
    private JRadioButton bank2 = new JRadioButton("سامان");
    private JRadioButton bank3 = new JRadioButton("ملی");
    private JRadioButton bank4 = new JRadioButton("اقتصاد نوین");
    private JRadioButton bank5 = new JRadioButton("کشاورزی");
    private JRadioButton bank6 = new JRadioButton("شهر");
    private JRadioButton bank7 = new JRadioButton("مسکن");
    private JRadioButton bank8 = new JRadioButton("انصار");

    private JPanel Cart = new JPanel();

    public Cart(String username) {
        this.setSize(500, 600);//size of JFrame
        this.setTitle("(Cart)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(Cart);
        Cart.setLayout(null);
//        createprofile.add(verticalScrollBar);
//        verticalScrollBar.setBounds(490 , 0 , 10 , 600);
//        createprofile.add(horizentalScrollBar);
//        horizentalScrollBar.setBounds(0 , 550 , 500 , 10);

        Cart.add(title);
        Cart.add(text);
        Cart.add(banknmae);
        Cart.add(bank1);
        Cart.add(bank2);
        Cart.add(bank3);
        Cart.add(bank4);
        Cart.add(bank5);
        Cart.add(bank6);
        Cart.add(bank7);
        Cart.add(bank8);

        Cart.add(backButton);
        backButton.setBounds(20, 450, 95, 50);
        Cart.add(title);
        title.setBounds(42,10,400,20);
        Cart.add(text);
        text.setBounds(42,40,400,280);

        Cart.add(bank1);
        Cart.add(bank2);
        Cart.add(bank3);
        Cart.add(bank4);
        Cart.add(bank5);
        Cart.add(bank6);
        Cart.add(bank7);
        Cart.add(bank8);

        Cart.add(banknmae);
        banknmae.setBounds(42,340,200,20);
        bank1.setBounds(50 , 360 , 100 , 30);
        bank2.setBounds(150 , 360 , 100 , 30);
        bank3.setBounds(250 , 360 , 100 , 30);
        bank4.setBounds(350 , 360 , 100 , 30);
        bank5.setBounds(50 , 390 , 100 , 30);
        bank6.setBounds(150 , 390 , 100 , 30);
        bank7.setBounds(250 , 390 , 100 , 30);
        bank8.setBounds(350 , 390 , 100 , 30);

        backButton.addActionListener((ActionEvent e) -> {
            try {
                mainPage mainPage = new mainPage(username);
                this.setVisible(false);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

    }
}
