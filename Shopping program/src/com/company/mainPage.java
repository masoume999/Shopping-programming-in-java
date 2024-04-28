package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mainPage extends JFrame {
    //    JScrollBar scrollBar = new JScrollBar();
    //private BufferedImage profilepicture = ImageIO.read(new File("D:\\MainIcon.jpg"));
    //private JLabel profilePicture = new JLabel(new ImageIcon(profilepicture));
    private JButton cart = new JButton("Cart");
    private JButton editProfilebtn = new JButton("Edit Profile");
    private JButton shoppingbtn = new JButton("Shopping");
    private JButton logoutbtn = new JButton("Log out");
    private JButton b1;

    private JLabel usernamelbl = new JLabel("Username  :");
    private JLabel Usrnamelbl  ;
    private JLabel firstnamelbl = new JLabel("Fist name  :");
    private JLabel Firstnamelbl ;
    private JLabel lastnamelbl = new JLabel("Last name  :");
    private JLabel Lastnamelbl ;
    private JLabel emaillbl = new JLabel("Email   :");
    private JLabel Emaillbl ;
    private JLabel phonenumberlbl = new JLabel("Phone number  :");
    private JLabel Phonenumberlbl ;
    private JLabel addresslbl = new JLabel("Address   :");
    private JLabel Addresslbl ;
    private JLabel ziplbl = new JLabel("ZIP  :");
    private JLabel ZIPlbl ;

    JPanel mainPage = new JPanel();

    public mainPage(String username) throws IOException {

        this.setSize(500, 600);
        this.setTitle(" ("+username+")");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(mainPage);
        mainPage.setLayout(null);

      //  mainPage.add(profilePicture);
      //  profilePicture.setBounds(20 , 20 , 100 , 100 );
        mainPage.add(cart);
        cart.setBounds(42,55,100,30);
        mainPage.add(editProfilebtn);
        editProfilebtn.setBounds(142 , 55 , 100 , 30);
        mainPage.add(shoppingbtn);
        shoppingbtn.setBounds(242 , 55 , 100 , 30);
        mainPage.add(logoutbtn);
        logoutbtn.setBounds(342 , 55 , 100 , 30);

        mainPage.add(usernamelbl);
        usernamelbl.setBounds(20, 135 , 100 , 30);
        mainPage.add(firstnamelbl);
        firstnamelbl.setBounds(20 , 170 , 100 , 30);
        mainPage.add(lastnamelbl);
        lastnamelbl.setBounds(20 , 205 , 100 , 30);
        mainPage.add(emaillbl);
        emaillbl.setBounds(20 , 240 , 100 , 30);
        mainPage.add(phonenumberlbl);
        phonenumberlbl.setBounds(20 , 275 , 100 ,30);
        mainPage.add(addresslbl);
        addresslbl.setBounds(20 , 310 , 100 ,30);
        mainPage.add(ziplbl);
        ziplbl.setBounds(20 , 345 , 100 , 30);

        methods m = new methods();
        String[] infoArray = m.getInformation(username);
        Firstnamelbl     = new JLabel(infoArray[0]);
        Lastnamelbl      = new JLabel(infoArray[1]);
        Emaillbl         = new JLabel(infoArray[2]);
        Phonenumberlbl   = new JLabel(infoArray[3]);
        Addresslbl       = new JLabel(infoArray[4]);
        ZIPlbl           = new JLabel(infoArray[5]);
        Usrnamelbl       = new JLabel(username);

        methods methods = new methods();


        mainPage.add(Usrnamelbl);
        Usrnamelbl.setBounds(120 , 135 , 100 , 30);
        mainPage.add(Firstnamelbl);
        Firstnamelbl.setBounds(120 , 170 , 100 , 30);
        mainPage.add(Lastnamelbl);
        Lastnamelbl.setBounds(120 , 205 , 100 ,30);
        mainPage.add(Emaillbl);
        Emaillbl.setBounds(120 , 240 , 100 ,30);
        mainPage.add(Phonenumberlbl);
        Phonenumberlbl.setBounds(120 , 275  , 100 ,30);
        mainPage.add(Addresslbl);
        Addresslbl.setBounds(120 , 310 , 100 ,30);
        mainPage.add(ZIPlbl);
        ZIPlbl.setBounds(120 , 345 , 100 ,30);

        cart.addActionListener((ActionEvent e)->{
            Cart cart = new Cart(username);
            this.setVisible(false);
        });
        editProfilebtn.addActionListener((ActionEvent e)->{
            EditProfile editProfile = new EditProfile(username);
            this.setVisible(false);
        });
        shoppingbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            Shopping shopping = new Shopping(username);
        });
        logoutbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            try {
                Form form = new Form();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }

}
