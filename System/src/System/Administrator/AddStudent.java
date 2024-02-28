// The following file contains code for adding student


// Database created: msystem


// For logging into Admin portal
// Username: Admin
// Password: Admin

package System.Administrator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import System.DatabaseCreates;

public class AddStudent implements ActionListener {
    JFrame t;
    JLabel a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
    JTextField b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,b11;
    JButton r1, r2;

    AddStudent() {
        t = new JFrame("Add Student");
        t.setBackground(Color.WHITE);
        t.setLayout(null);

        a1 = new JLabel("Student Information");
        a1.setBounds(320, 30, 500, 50);
        a1.setFont(new Font("serif", Font.ITALIC, 25));
        a1.setForeground(Color.black);
        t.add(a1);

        a2 = new JLabel("Name");
        a2.setBounds(50, 150, 100, 30);
        a2.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a2);

        b1 = new JTextField();
        b1.setBounds(200, 150, 150, 30);
        t.add(b1);

        a3 = new JLabel("Father's Name");
        a3.setBounds(400, 150, 200, 30);
        a3.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a3);

        b2 = new JTextField();
        b2.setBounds(600, 150, 150, 30);
        t.add(b2);

        a4 = new JLabel("Age");
        a4.setBounds(50, 200, 100, 30);
        a4.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a4);

        b3 = new JTextField();
        b3.setBounds(200, 200, 150, 30);
        t.add(b3);

        a5 = new JLabel("DOB (dd/mm/yyyy)");
        a5.setBounds(400, 200, 200, 30);
        a5.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a5);

        b4 = new JTextField();
        b4.setBounds(600, 200, 150, 30);
        t.add(b4);

        a6 = new JLabel("Address");
        a6.setBounds(50, 250, 100, 30);
        a6.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a6);

        b5 = new JTextField();
        b5.setBounds(200, 250, 150, 30);
        t.add(b5);

        a7 = new JLabel("Phone Number");
        a7.setBounds(400, 250, 100, 30);
        a7.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a7);

        b6 = new JTextField();
        b6.setBounds(600, 250, 150, 30);
        t.add(b6);

        a8 = new JLabel("Email");
        a8.setBounds(50, 300, 100, 30);
        a8.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a8);

        b7 = new JTextField();
        b7.setBounds(200, 300, 150, 30);
        t.add(b7);

        a9 = new JLabel("Class X(GPA)");
        a9.setBounds(400, 300, 130, 30);
        a9.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a9);

        b8 = new JTextField();
        b8.setBounds(600, 300, 150, 30);
        t.add(b8);

        a10 = new JLabel("Class XII(GPA)");
        a10.setBounds(50, 350, 130, 30);
        a10.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a10);

        b9 = new JTextField();
        b9.setBounds(200, 350, 150, 30);
        t.add(b9);

        a12 = new JLabel("Roll Number");
        a12.setBounds(50, 400, 150, 30);
        a12.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a12);

        b10 = new JTextField();
        b10.setBounds(200, 400, 150, 30);
        t.add(b10);

        a13 = new JLabel("Course");
        a13.setBounds(400, 400, 150, 30);
        a13.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a13);

        b11 = new JTextField();
        b11.setBounds(600, 400, 150, 30);
        t.add(b11);

        r1 = new JButton("Submit");
        r1.setBackground(Color.BLACK);
        r1.setForeground(Color.WHITE);
        r1.setBounds(250, 550, 150, 40);

        t.add(r1);

        r2 = new JButton("Cancel");
        r2.setBackground(Color.BLACK);
        r2.setForeground(Color.WHITE);
        r2.setBounds(450, 550, 150, 40);

        t.add(r2);

        r1.addActionListener(this);
        r2.addActionListener(this);

        t.setVisible(true);
        t.setSize(900, 700);
        t.setLocation(350, 90);
    }

    // created a method for getting the data that is entered in the textfield
    // and also storing them in database

    public void actionPerformed(ActionEvent ae) {
        String a = b1.getText();
        String bon = b2.getText();
        String c = b3.getText();
        String d = b4.getText();
        String e = b5.getText();
        String fen = b6.getText();
        String g = b7.getText();
        String h = b8.getText();
        String i = b9.getText();
        String j = b10.getText();
        String k = b11.getText(); // fetches the option that is selected in combobox
        // Since combobox returns object of an object it is type casted into string

        // If submit button is pressed
        if (ae.getSource() == r1) {
            try {
                DatabaseCreates su = new DatabaseCreates();
                String z = "insert into student_info values('" + a + "','" + bon + "','" + c + "','" + d + "','" + e
                        + "','" + fen + "','" + g + "','" + h + "','" + i + "','" + j + "','" + k + "')";
                su.x.executeUpdate(z); // updates database
                JOptionPane.showMessageDialog(null, "Added a New Student Successfully"); // throws a pop up message
                t.setVisible(false);
            } catch (Exception err) {
                System.out.println("The error is:" + err);
            }

            // // If cancel button is pressed
        } else if (ae.getSource() == r2) {
            t.setVisible(false);

        }

    }

    // public static void main(String[] args) {
    //     new AddStudent().t.setVisible(true);
    // }

}
