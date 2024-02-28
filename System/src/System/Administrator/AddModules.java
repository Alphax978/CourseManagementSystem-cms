// The following file contains code for adding a module


// Database created: msystem


// For logging into Admin portal
// Username: Admin
// Password: Admin



package System.Administrator;
import javax.swing.*;

import System.DatabaseCreates;

import java.awt.*;
import java.awt.event.*;

public class AddModules implements ActionListener {
    JFrame t;
    JLabel a1, a2, a3, a4, a5,a6;
    JTextField b1, b2, b3, b4;
    JButton v1, v2;

    AddModules() {
        t = new JFrame("Add a Module");
        t.setBackground(Color.WHITE);
        t.setLayout(null);

        a6 = new JLabel("Module Information");
        a6.setBounds(300, 20, 500, 50);
        a6.setFont(new Font("serif", Font.ITALIC, 25));
        a6.setForeground(Color.black);
        t.add(a6);

        a1 = new JLabel("Enter the Module name");
        a1.setBounds(310, 110, 786, 30);
        a1.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a1);

        b1 = new JTextField();
        b1.setBounds(260, 150, 280, 30);
        t.add(b1);

        a2 = new JLabel("Enter the Course that you want to add module on");
        a2.setBounds(180, 300, 786, 30);
        a2.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a2);

        b2 = new JTextField();
        b2.setBounds(300, 350, 200, 30);
        t.add(b2);

        a3 = new JLabel("Enter the Semester that you want to moudule on");
        a3.setBounds(180, 200, 786, 30);
        a3.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a3);

        b3 = new JTextField();
        b3.setBounds(220, 250, 350, 30);
        t.add(b3);

        a4 = new JLabel("Enter Year that you want to add module on");
        a4.setBounds(220, 400, 786, 30);
        a4.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a4);

        b4 = new JTextField();
        b4.setBounds(300, 450, 200, 30);
        t.add(b4);

        v1 = new JButton("Submit");
        v1.setBackground(Color.BLACK);
        v1.setForeground(Color.WHITE);
        v1.setBounds(200, 520, 150, 40);

        t.add(v1);

        v2 = new JButton("Cancel");
        v2.setBackground(Color.BLACK);
        v2.setForeground(Color.WHITE);
        v2.setBounds(450, 520, 150, 40);

        t.add(v2);

        v1.addActionListener(this);
        v2.addActionListener(this);

        t.setVisible(true);
        t.setSize(786, 660);
        t.setLocation(400, 98);

    }

    public void actionPerformed(ActionEvent ae) {
        String a = b1.getText();
        String bb = b2.getText();
        String c = b3.getText();
        String d = b4.getText();

        if (ae.getSource() == v1) {
            try {
                DatabaseCreates crt = new DatabaseCreates();
                String qen = "insert into module_info values('" + a + "','" + bb + "','" + c + "','" + d + "')";
                crt.x.executeUpdate(qen);
                JOptionPane.showMessageDialog(null, "Added a New Module Successfully");
                t.setVisible(false);

            } catch (Exception ee) {
                ee.printStackTrace();
            }
        } else if (ae.getSource() == v2) {
            t.setVisible(false);
        }

    }

    // public static void main(String[] args) {
    //     new AddModules().t.setVisible(true);
    // }

}