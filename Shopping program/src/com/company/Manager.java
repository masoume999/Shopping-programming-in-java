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

public class Manager extends JFrame {

    private BufferedImage profilepicture = ImageIO.read(new File("D:\\AdminIcon.jpg"));
    private JLabel profilePicture = new JLabel(new ImageIcon(profilepicture));
    private JButton dependents = new JButton("Dependents");
    private JButton employees = new JButton("Employees");
    private JButton discount = new JButton("Applying Discount");
    private JButton logoutbtn = new JButton("Log out");


    JPanel Admin = new JPanel();

    public Manager(String username) throws IOException {

        this.setSize(500, 600);//size of JFrame
        this.setTitle("(Manager)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 7 - getHeight() / 7);

        this.add(Admin);
        Admin.setLayout(null);

        Admin.add(profilePicture);
        profilePicture.setBounds(20, 20, 100, 100);
        Admin.add(dependents);
        dependents.setBounds(20, 125, 110, 30);
        Admin.add(employees);
        employees.setBounds(130, 125, 100, 30);
        Admin.add(discount);
        discount.setBounds(230, 125, 150, 30);
        Admin.add(logoutbtn);
        logoutbtn.setBounds(380, 125, 80, 30);


        employees.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            Employee employee = new Employee(username);
        });
        discount.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            Discount discount = new Discount(username);
        });
        logoutbtn.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            try {
                Form form = new Form();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        dependents.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            try {
                Dependents dependents = new Dependents(username);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }
}
