//The following file contains code for the login frame
//The username and password is "Admin" and "Admin" respectively


// Database created: msystem


// For logging into Admin portal
// Username: Admin
// Password: Admin

package System.Administrator;
import java.awt.*;
import javax.swing.*;

import System.A_MainPortal;
import System.DatabaseCreates;

import java.awt.event.*;
import java.sql.*;

public class AdminLogin extends JFrame implements ActionListener {

    JFrame f;
    JLabel l1, l2;
    JTextField t1,t2;
    JButton b1, b2;

    public AdminLogin() {

        super("Administrator Login");

        setBackground(Color.white);
        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(150, 70, 150, 30);
        add(t2);


        b1 = new JButton("Login");
        b1.setBounds(40, 140, 120, 30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180, 140, 120, 30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(600, 300);
        setLocation(500, 200);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1){
        try {
            DatabaseCreates c1 = new DatabaseCreates();
            String u = t1.getText();
            String v = t2.getText();

            String q = "select * from admin_login where username='" + u + "' and passcode='" + v + "'";

            ResultSet rs = c1.x.executeQuery(q);
            if (rs.next()) {
                new AdminPortal().setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid login");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }else if (ae.getSource() == b2){
        new A_MainPortal().setVisible(true);
        setVisible(false);
    }

    }

    // public static void main(String[] arg) {
    //     new Login();
    // }
}