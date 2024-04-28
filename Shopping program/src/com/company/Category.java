package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Category extends JFrame {

    private JButton cartUpdatebtn = new JButton("Cart update");
    private JButton backButton = new JButton("Back");

    private JLabel       lbl1;
    private JLabel       lbl2;
    private JLabel       lbl3;
    private JLabel       lbl4;
    private JLabel       lbl5;
    private JLabel       lbl6;
    private JLabel       lbl7;
    private JLabel       lbl8;
    private JLabel       lbl9;
    private JLabel       lbl10;

    private JRadioButton btn1 = new JRadioButton();
    private JRadioButton btn2 = new JRadioButton();
    private JRadioButton btn3 = new JRadioButton();
    private JRadioButton btn4 = new JRadioButton();
    private JRadioButton btn5 = new JRadioButton();
    private JRadioButton btn6 = new JRadioButton();
    private JRadioButton btn7 = new JRadioButton();
    private JRadioButton btn8 = new JRadioButton();
    private JRadioButton btn9 = new JRadioButton();
    private JRadioButton btn10 = new JRadioButton();

    private JTextField   txt1     = new JTextField();
    private JTextField   txt2     = new JTextField();
    private JTextField   txt3     = new JTextField();
    private JTextField   txt4     = new JTextField();
    private JTextField   txt5     = new JTextField();
    private JTextField   txt6     = new JTextField();
    private JTextField   txt7     = new JTextField();
    private JTextField   txt8     = new JTextField();
    private JTextField   txt9     = new JTextField();
    private JTextField   txt10     = new JTextField();


    private JPanel Category = new JPanel();

    String b1="",b2="",b3="",b4="",b5="",b6="",b7="",b8="",b9="",b10="";
    String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="",a9="",a10="";
    int n=0;


    public Category(String myUsername,int number) throws FileNotFoundException {
        this.setSize(500, 600);//size of JFrame
        this.setTitle("");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(Category);
        Category.setLayout(null);
        int c = 1;
        int i = 0;
        String str;
        methods methods = new methods();
        int counter = methods.Counter(number);
        String[][] array = new String[counter][5];
        array = methods.getcommodity(counter,number);
        while (c <= counter){
            switch (c) {
                case 1: {
                    str = methods.chekLable(i,array);
                    lbl1 = new JLabel(str);
                    Category.add(lbl1);
                    lbl1.setBounds(3, 10, 433, 30);
                    Category.add(btn1);
                    Category.add(txt1);
                    txt1.setBounds(433, 10, 25, 30);
                    btn1.setBounds(458, 10, 25, 30);
                    c++;
                    i++;
                    break;
                }
                case  2: {
                    str = methods.chekLable(i,array);
                    lbl2 = new JLabel(str);
                    Category.add(lbl2);
                    lbl2.setBounds(3, 50, 433, 30);
                    Category.add(btn2);
                    Category.add(txt2);
                    txt2.setBounds(433, 50, 25, 30);
                    btn2.setBounds(458, 50, 100, 30);
                    c++;
                    i++;
                    break;
                }
                case 3:{
                    str = methods.chekLable(i,array);
                    lbl3 = new JLabel(str);
                    Category.add(lbl3);
                    lbl3.setBounds(3, 90, 433, 30);
                    Category.add(btn3);
                    Category.add(txt3);
                    txt3.setBounds(433, 90, 25, 30);
                    btn3.setBounds(458, 90, 100, 30);
                    c++;
                    i++;
                    break;
                }
                case 4:{
                    str = methods.chekLable(i,array);
                    lbl4 = new JLabel(str);
                    Category.add(lbl4);
                    lbl4.setBounds(3, 130, 433, 30);
                    Category.add(btn4);
                    Category.add(txt4);
                    txt4.setBounds(433, 130, 25, 30);
                    btn4.setBounds(458, 130, 100, 30);
                    c++;
                    i++;
                    break;
                }
                case 5:{
                    str = methods.chekLable(i,array);
                    lbl5 = new JLabel(str);
                    Category.add(lbl5);
                    lbl5.setBounds(3, 170, 433, 30);
                    Category.add(btn5);
                    Category.add(txt5);
                    txt5.setBounds(433, 170, 25, 30);
                    btn5.setBounds(458 , 170 , 100 , 30);
                    c++;
                    i++;
                    break;
                }
                case 6:{
                    str = methods.chekLable(i,array);
                    lbl6 = new JLabel(str);
                    Category.add(lbl6);
                    lbl6.setBounds(3, 210, 433, 30);
                    Category.add(btn6);
                    Category.add(txt6);
                    txt6.setBounds(433, 210, 25, 30);
                    btn6.setBounds(458 , 210 , 100 , 30);
                    c++;
                    i++;
                    break;
                }
                case 7:{
                    str = methods.chekLable(i,array);
                    lbl7 = new JLabel(str);
                    Category.add(lbl7);
                    lbl7.setBounds(3, 250, 433, 30);
                    Category.add(btn7);
                    Category.add(txt7);
                    txt7.setBounds(433, 250, 25, 30);
                    btn7.setBounds(458 , 250 , 100 , 30);
                    c++;
                    i++;
                    break;
                }
                case 8:{
                    str = methods.chekLable(i,array);
                    lbl8 = new JLabel(str);
                    Category.add(lbl8);
                    lbl8.setBounds(3, 290, 433, 30);
                    Category.add(btn8);
                    Category.add(txt8);
                    txt8.setBounds(433, 290, 25, 30);
                    btn8.setBounds(458 , 290 , 100 , 30);
                    c++;
                    i++;
                    break;
                }
                case 9:{
                    str = methods.chekLable(i,array);
                    lbl9 = new JLabel(str);
                    Category.add(lbl9);
                    lbl9.setBounds(3, 330, 433, 30);
                    Category.add(btn9);
                    Category.add(txt9);
                    txt9.setBounds(433, 330, 25, 30);
                    btn9.setBounds(458 , 330 , 100 , 30);
                    c++;
                    i++;
                    break;
                }
                case 10:{
                    str = methods.chekLable(i,array);
                    lbl10 = new JLabel(str);
                    Category.add(lbl10);
                    lbl10.setBounds(3, 370, 433, 30);
                    Category.add(btn10);
                    Category.add(txt10);
                    txt10.setBounds(433, 370, 25, 30);
                    btn10.setBounds(458 , 370 , 100 , 30);
                    c++;
                    i++;
                    break;
                }
            }
        }

        Category.add(cartUpdatebtn);
        Category.add(backButton);
        backButton.setBounds(20,450,90,50);
        cartUpdatebtn.setBounds(340,450,130,50);


        int j = 0;

        String[][] arr = new String[counter][4];

        String[][] finalArray = array;
        int finalJ = j;
        btn1.addActionListener((ActionEvent e) -> {
            b1 = finalArray[finalJ][0];
        });
        j++;
        int finalJ1 = j;
        btn2.addActionListener((ActionEvent e) -> {
            b2 = finalArray[finalJ1][0];

        });
        j++;
        int finalJ2 = j;
        btn3.addActionListener((ActionEvent e) -> {
            b3 = finalArray[finalJ2][0];
        });
        j++;
        int finalJ3 = j;
        btn4.addActionListener((ActionEvent e) -> {
            b4 = finalArray[finalJ3][0];
        });
        j++;
        int finalJ4 = j;
        btn5.addActionListener((ActionEvent e) -> {
            b5 = finalArray[finalJ4][0];
        });
        j++;
        int finalJ5 = j;
        btn6.addActionListener((ActionEvent e) -> {
            b6 = finalArray[finalJ5][0];
        });
        j++;
        int finalJ6 = j;
        btn7.addActionListener((ActionEvent e) -> {
            b7 = finalArray[finalJ6][0];
        });
        j++;
        int finalJ7 = j;
        btn8.addActionListener((ActionEvent e) -> {
            b8 = finalArray[finalJ7][0];
        });
        j++;
        int finalJ8 = j;
        btn9.addActionListener((ActionEvent e) -> {
            b9 = finalArray[finalJ8][0];
        });
        j++;
        int finalJ9 = j;
        btn10.addActionListener((ActionEvent e) -> {
            b10 = finalArray[finalJ9][0];
        });

        backButton.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            Shopping shopping = new Shopping(myUsername);
        });

        cartUpdatebtn.addActionListener((ActionEvent e) -> {
            a1 = txt1.getText();
            a2 = txt2.getText();
            a3 = txt3.getText();
            a4 = txt4.getText();
            a5 = txt5.getText();
            a6 = txt6.getText();
            a7 = txt7.getText();
            a8 = txt8.getText();
            a9 = txt9.getText();
            a10 = txt10.getText();
            this.setVisible(false);
            while (n < counter) {
                switch (n) {
                    case 0: {
                        arr[n][0] = b1;
                        arr[n][1] = a1;
                        n++;
                        break;
                    }
                    case 1: {
                        arr[n][0] = b2;
                        arr[n][1] = a2;
                        n++;
                        break;
                    }
                    case 2: {
                        arr[n][0] = b3;
                        arr[n][1] = a3;
                        n++;
                        break;
                    }
                    case 3: {
                        arr[n][0] = b4;
                        arr[n][1] = a4;
                        n++;
                        break;
                    }
                    case 4: {
                        arr[n][0] = b5;
                        arr[n][1] = a5;
                        n++;
                        break;
                    }
                    case 5: {
                        arr[n][0] = b6;
                        arr[n][1] = a6;
                        n++;
                        break;
                    }
                    case 6: {
                        arr[n][0] = b7;
                        arr[n][1] = a7;
                        n++;
                        break;
                    }
                    case 7: {
                        arr[n][0] = b8;
                        arr[n][1] = a8;
                        n++;
                        break;
                    }
                    case 8: {
                        arr[n][0] = b9;
                        arr[n][1] = a9;
                        n++;
                        break;
                    }
                    case 9: {
                        arr[n][0] = b10;
                        arr[n][1] = a10;
                        n++;
                        break;
                    }
                }
            }
            methods.cartUpdaet(arr);
            Shopping shopping = new Shopping(myUsername);
        });
    }
}