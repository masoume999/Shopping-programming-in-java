package com.company;

import javax.swing.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class methods {
    public boolean isUser(String username) throws IOException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select User_Name from customer");

            while (rs.next()) {
                if (String.valueOf(rs.getString("User_Name")).equalsIgnoreCase(username)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean checkUser(String username, String password) throws IOException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select User_Name,Password from customer");

            while (rs.next()) {
                if (String.valueOf(rs.getString("User_Name")).equalsIgnoreCase(username) && String.valueOf(rs.getString("Password")).equalsIgnoreCase(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public String[] getInformation(String username) throws IOException {
        String[] infoArray = new String[6];
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select User_Name,First_name,Last_name,Email,Phone_number,Address,ZIP from customer");

            while (rs.next()) {
                if (String.valueOf(rs.getString("User_Name")).equalsIgnoreCase(username)) {
                    infoArray[0] = rs.getString("First_name");
                    infoArray[1] = rs.getString("Last_name");
                    infoArray[2] = rs.getString("Email");
                    infoArray[3] = rs.getString("Phone_number");
                    infoArray[4] = rs.getString("Address");
                    infoArray[5] = rs.getString("ZIP");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return infoArray;
    }

    public void changePassword(String username, String newpassword) throws IOException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("UPDATE Customer SET Password=? WHERE User_Name=?");

            statement.setString(1, newpassword);
            statement.setString(2, username);
            statement.executeUpdate();
            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateUser(String username, String firstname, String lastname, String email, String phonenumber, String address, String ZIP) throws IOException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("UPDATE Customer SET First_Name=?, Last_Name=?, Email=?, Phone_number=?, Address=?, ZIP=? WHERE User_Name=?");

            statement.setString(1, firstname);
            statement.setString(2, lastname);
            statement.setString(3, email);
            statement.setString(4, phonenumber);
            statement.setString(5, address);
            statement.setString(6, ZIP);
            statement.setString(7, username);
            statement.executeUpdate();
            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveUser(String username, String password, String firstname, String lastname, String email, String phonenumber, String address, String ZIP) throws IOException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)");

            statement.setString(1, phonenumber);
            statement.setString(2, username);
            statement.setString(3, password);
            statement.setString(4, firstname);
            statement.setString(5, lastname);
            statement.setString(6, email);
            statement.setString(7, phonenumber);
            statement.setString(8, address);
            statement.setString(9, ZIP);
            statement.executeUpdate();
            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int Counter(int number) throws FileNotFoundException {
        int counter = 0;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("SELECT COUNT(*) FROM commodity WHERE Category_code=?");
            statement.setInt(1, number);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                counter = rs.getInt("COUNT(*)");
            }
            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
        return counter;
    }

    public String[][] getcommodity(int counter, int number) {
        String[][] array = new String[counter][5];
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("select Commodity_code,Name,Price,Count,Stock_invoice from commodity WHERE Category_code=?");
            statement.setInt(1, number);
            ResultSet rs = statement.executeQuery();

            int i = 0;
            while (rs.next()) {
                array[i][0] = String.valueOf(rs.getInt("Commodity_code"));
                array[i][1] = rs.getString("Name");
                array[i][2] = String.valueOf(rs.getInt("Price"));
                array[i][3] = String.valueOf(rs.getInt("Count"));
                array[i][4] = String.valueOf(rs.getInt("Stock_invoice"));
                i++;
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return array;
    }

    public String chekLable(int counter, String[][] arr) {
        String str, st1, st2, st3, st4, st5;
        st1 = arr[counter][0];
        st2 = arr[counter][1];
        st3 = arr[counter][2];
        st4 = arr[counter][3];
        st5 = arr[counter][4];
        if (!st4.equalsIgnoreCase("0")) {
            st4 = "";
            st5 = "";
        } else if (st4.equalsIgnoreCase("0") && !st5.equalsIgnoreCase("0")) {
            st4 = "(اتمام موجودی در فروشگاه)";
            st5 = "(موجود در انبار)";
        } else if (st4.equalsIgnoreCase("0") && st5.equalsIgnoreCase("0")) {
            st4 = "";
            st4 = "(اتمام موجودی)";
        }
        if (st2.equalsIgnoreCase("")) {
            st2 = "_";
        }
        str = "code: " + st1 + "    Name: " + st2 + "    Price: " + st3 + "    " + st4 + "     " + st5;
        return str;
    }

    public void cartUpdaet(String array[][]) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            for (int i = 0; i < array.length; i++) {
                if (!array[i][0].equalsIgnoreCase("")) {
                    PreparedStatement statement = con.prepareStatement("INSERT INTO temp VALUES(?,?)");
                    statement.setInt(1, Integer.parseInt(array[i][0]));
                    statement.setInt(2, Integer.parseInt(array[i][1]));
                    statement.executeUpdate();
                }
            }

            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void logOut() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("DELETE FROM temp");
            statement.executeUpdate();
            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Boolean isManager(String username, String password) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select User_Name,Password from managerofsite");

            while (rs.next()) {
                if (String.valueOf(rs.getString("User_Name")).equals(username) && String.valueOf(rs.getString("Password")).equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public Boolean isOperator(String username, String password) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select User_Name,Password from site_operator");

            while (rs.next()) {
                if (String.valueOf(rs.getString("User_Name")).equals(username) && String.valueOf(rs.getString("Password")).equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void saveDiscount(String discount_code, String category_code, String subcategory_code, String usernameOFmanager, String percent, String date) throws IOException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("INSERT INTO discount VALUES (?,?,?,?,?,?)");

            statement.setString(1, discount_code);
            statement.setInt(2, Integer.parseInt(category_code));
            statement.setInt(3, Integer.parseInt(subcategory_code));
            statement.setString(4, usernameOFmanager);
            statement.setInt(5, Integer.parseInt(percent));
            statement.setInt(6, Integer.parseInt(date));
            statement.executeUpdate();
            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getEmployees() {
        String str = "";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("select * FROM employee");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                str = str + rs.getString(1) + "       " + rs.getString(2) + "            " +
                        rs.getString(3) + "          " + rs.getString(4) + "          " + rs.getString(5) + "          " +
                        rs.getString(6) + "          " + rs.getString(7) + "          " + rs.getString(8) + "             " +
                        rs.getString(9) + "*";
            }
            con.close();
            getCart();

        } catch (Exception e) {
            System.out.println(e);
        }
        return str;
    }

    public String getSaleinvoices() {
        String str = "";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("select * FROM sale_invoice");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                str = str + rs.getString(1) + "         " + rs.getString(2) + "         " +
                        rs.getString(3) + "                " + rs.getString(4) + "                      " + rs.getString(5) + "               " +
                        rs.getString(6) + "                 " + rs.getString(7) + "*";
            }
            con.close();
            getCart();

        } catch (Exception e) {
            System.out.println(e);
        }
        return str;
    }

    public String getDependents(String ID) {
        String str = "";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("select * FROM depedent WHERE ID=?");
            statement.setString(1,ID);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                str = str + rs.getString(2) + "        " +
                        rs.getString(3) + "         " + rs.getString(4) + "         " + rs.getString(5) + "         " +
                        rs.getString(6) + "*";
            }
            con.close();
            getCart();

        } catch (Exception e) {
            System.out.println(e);
        }
        return str;
    }

    public String getCart() {
        String str = "";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/test", "root", "");

            PreparedStatement statement = con.prepareStatement("select Commodity_code,Count FROM temp");
            ResultSet rs = statement.executeQuery();

            String st1 = "";
            String st2 = "";
            String st3 = "";
            String st4 = "";
            while (rs.next()) {
                st1 = String.valueOf(rs.getInt("Commodity_code"));
                st3 = String.valueOf(rs.getInt("Count"));
                PreparedStatement statement1 = con.prepareStatement("SELECT Name,Price FROM commodity WHERE Commodity_code=?");
                statement1.setInt(1, Integer.parseInt(st1));
                ResultSet rs1 = statement1.executeQuery();
                st2 = rs1.getString("Name");
                st4 = String.valueOf(rs1.getInt("Price"));
                str = str + st1 + "        " + st2 + "        " + st3 + "        " + st4 + "\n";
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return str;
    }
}