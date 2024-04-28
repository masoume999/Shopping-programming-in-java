package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Operator extends JFrame {

    private BufferedImage profilepicture = ImageIO.read(new File("D:\\AdminIcon.jpg"));
    private JLabel profilePicture = new JLabel(new ImageIcon(profilepicture));
    private JButton invoices = new JButton("Sale invoices");
    private JButton logoutbtn = new JButton("Log out");


    JPanel operator = new JPanel();

    public Operator(String username,String password) throws IOException {

        this.setSize(500, 600);//size of JFrame
        this.setTitle("(Operator)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 7 - getHeight() / 7);

        this.add(operator);
        operator.setLayout(null);

        operator.add(profilePicture);
        profilePicture.setBounds(20, 20, 100, 100);
        operator.add(invoices);
        invoices.setBounds(230, 125, 150, 30);
        operator.add(logoutbtn);
        logoutbtn.setBounds(380, 125, 80, 30);


        invoices.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            showInvoices showInvoices = new showInvoices(username,password);
        });
        logoutbtn.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            try {
                Form form = new Form();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}
