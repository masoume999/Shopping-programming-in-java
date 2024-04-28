package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Discount extends JFrame {

    private String discount_code = "", category_code = "", subcategory_code = "", percent = "", date = "";

    //    JScrollBar verticalScrollBar = new JScrollBar(JScrollBar.VERTICAL,10, 5, 0, 50);
//    JScrollBar horizentalScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,10, 5, 0, 50);
    private JLabel line = new JLabel("~~~~~~~~~~~~~~~~~");

    private JTextField   DCtxt    = new JTextField();
    private JLabel       DClbl    = new JLabel("Discount code      : ");
    private JTextField   CCtxt         = new JTextField(null);
    private JLabel       CClbl         = new JLabel("Category code      : ");
    private JTextField   SCtxt         = new JTextField(null);
    private JLabel       SClbl         = new JLabel("Sub category code : ");
    private JTextField   percenttxt         = new JTextField();
    private JLabel       percentlbl         = new JLabel("Percent      : ");
    private JTextField   Datetxt         = new JTextField("");
    private JLabel       Datelbl         = new JLabel("Date      : ");

    private JPanel Discount = new JPanel();


    private JButton savebtn = new JButton("Save");
    private JButton backButton = new JButton("Back");


    public Discount(String usernameOFmanager) {
        this.setSize(500, 600);//size of JFrame
        this.setTitle("Applying discount");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(Discount);
        Discount.setLayout(null);
//        createprofile.add(verticalScrollBar);
//        verticalScrollBar.setBounds(490 , 0 , 10 , 600);
//        createprofile.add(horizentalScrollBar);
//        horizentalScrollBar.setBounds(0 , 550 , 500 , 10);

        {
            Discount.add(DCtxt);
            DCtxt.setBounds(202, 10, 200, 30);
            Discount.add(DClbl);
            DClbl.setBounds(1, 10, 200, 30);
            Discount.add(CCtxt);
            CCtxt.setBounds(202, 50, 200, 30);
            Discount.add(CClbl);
            CClbl.setBounds(1, 50, 200, 30);
            Discount.add(SCtxt);
            SCtxt.setBounds(202, 90, 200, 30);
            Discount.add(SClbl);
            SClbl.setBounds(1, 90, 200, 30);
            Discount.add(percenttxt);
            percenttxt.setBounds(202, 130, 200, 30);
            Discount.add(percentlbl);
            percentlbl.setBounds(1, 130, 200, 30);
            Discount.add(Datetxt);
            Datetxt.setBounds(202, 170, 200, 30);
            Discount.add(Datelbl);
            Datelbl.setBounds(1, 170, 200, 30);
        }


        Discount.add(savebtn);
        savebtn.setBounds(380,450,90,50);
        Discount.add(backButton);
        backButton.setBounds(20,450,90,50);

        backButton.addActionListener((ActionEvent e) -> {
            Discount.setVisible(false);
            try {
                Manager manager = new Manager(usernameOFmanager);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        savebtn.addActionListener((ActionEvent e) -> {
            discount_code = DCtxt.getText();
            category_code = CCtxt.getText();
            subcategory_code = SCtxt.getText();
            percent = percenttxt.getText();
            date = Datetxt.getText();

            this.setVisible(false);
            try {
                new methods().saveDiscount(discount_code,category_code,subcategory_code,usernameOFmanager,percent,date);
                JOptionPane.showMessageDialog(null, "اعمال تخفیف با موفقیت انجام شد." , "" , JOptionPane.YES_OPTION);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                Manager manager = new Manager(usernameOFmanager);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

    }

}
