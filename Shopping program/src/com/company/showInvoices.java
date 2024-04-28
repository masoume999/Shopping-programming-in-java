package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class showInvoices extends JFrame {
    private JButton backButton = new JButton("Back");
    private JLabel title = new JLabel("      Invoice code          Customer id           Payment code         Discount code          User name            Amount              Date");
    private JLabel text1;
    private JLabel text2;
    private JLabel text3;
    private JLabel text4;
    private JLabel text5;
    private JLabel text6;
    private JLabel text7;
    private JLabel text8;
    private JLabel text9;
    private JLabel text10;

    private JPanel showDependents = new JPanel();

    public showInvoices(String username,String password) {
        this.setSize(750, 600);//size of JFrame
        this.setTitle("(Sale invoices)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 7 - getHeight() / 7);

        this.add(showDependents);
        showDependents.setLayout(null);
//        createprofile.add(verticalScrollBar);
//        verticalScrollBar.setBounds(490 , 0 , 10 , 600);
//        createprofile.add(horizentalScrollBar);
//        horizentalScrollBar.setBounds(0 , 550 , 500 , 10);

        methods methods = new methods();
        String[] str = methods.getSaleinvoices().split("\\*");
        int i = 0;
        while (i < str.length) {
            switch (i) {
                case 0: {
                    text1 = new JLabel("   "+str[i]);
                    showDependents.add(text1);
                    text1.setBounds(1, 40, 750, 20);
                    i++;
                    break;
                }
                case 1: {
                    text2 = new JLabel("   "+str[i]);
                    showDependents.add(text2);
                    text2.setBounds(1, 60, 750, 20);
                    i++;
                    break;
                }
                case 2: {
                    text3 = new JLabel("   "+str[i]);
                    showDependents.add(text3);
                    text3.setBounds(1, 80, 750, 20);
                    i++;
                    break;
                }
                case 3: {
                    text4 = new JLabel("   "+str[i]);
                    showDependents.add(text4);
                    text4.setBounds(1, 100, 750, 20);
                    i++;
                    break;
                }
                case 4: {
                    text5 = new JLabel("   "+str[i]);
                    showDependents.add(text5);
                    text5.setBounds(1, 120, 750, 20);
                    i++;
                    break;
                }
                case 5: {
                    text6 = new JLabel("   "+str[i]);
                    showDependents.add(text6);
                    text6.setBounds(1, 140, 750, 20);
                    i++;
                    break;
                }
                case 6: {
                    text7 = new JLabel("   "+str[i]);
                    showDependents.add(text7);
                    text7.setBounds(1, 160, 750, 20);
                    i++;
                    break;
                }
                case 7: {
                    text8 = new JLabel("   "+str[i]);
                    showDependents.add(text8);
                    text8.setBounds(1, 180, 750, 20);
                    i++;
                    break;
                }
                case 8: {
                    text9 = new JLabel("   "+str[i]);
                    showDependents.add(text9);
                    text9.setBounds(1, 200, 750, 20);
                    i++;
                    break;
                }
                case 9: {
                    text10 = new JLabel("   "+str[i]);
                    showDependents.add(text10);
                    text10.setBounds(1, 220, 750, 20);
                    i++;
                    break;
                }
            }

            showDependents.add(title);
            showDependents.add(text1);

            showDependents.add(title);
            title.setBounds(1, 10, 750, 20);
            showDependents.add(backButton);
            backButton.setBounds(20, 450, 95, 50);

            backButton.addActionListener((ActionEvent e) -> {
                try {
                    Operator operator = new Operator(username,password);
                    this.setVisible(false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });
        }
    }
}