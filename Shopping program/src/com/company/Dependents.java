package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Dependents extends JFrame {
    private String id = "";
    private JLabel idlbl = new JLabel("Enter the employee's Id : ");
    private JTextField idtxt = new JTextField();
    private JButton searchbtn = new JButton("Show dependents");
    private JButton backbtn = new JButton("Back");

    private JPanel Dependents = new JPanel();

    public Dependents(String username) throws IOException {
        this.setSize(500,600);
        this.setTitle("(search dependents)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(Dependents);
        Dependents.setLayout(null);

        Dependents.add(idlbl);
        idlbl.setBounds(30,200,200,35);
        Dependents.add(idtxt);
        idtxt.setBounds(180,200,250,35);
        Dependents.add(searchbtn);
        searchbtn.setBounds(300,450,150,50);
        Dependents.add(backbtn);
        backbtn.setBounds(30,450,90,50);


        searchbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            id = idtxt.getText();
            showDependents showDependents = new showDependents(username,id);
        });
        backbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            try {
                Manager manager = new Manager(username);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }
}