// The following file contains code for giving the marks to student

// Database created: msystem


// For logging into Instructor portal
// Username: Teacher
// Password: Teacher

package System.Instructor;

import javax.swing.*;

import System.DatabaseCreates;

import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class AddGrades extends JFrame implements ActionListener{
    JLabel a1,a2,a3,a4,a5,a6,a7;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11,t12,t13,t14;
    JButton r1;

    AddGrades(){

        setSize(700,700);
        setLocation(400,90);
        setLayout(null);

        a1 = new JLabel("Enter marks of Student");
        a1.setFont(new Font("serif", Font.BOLD, 30));
        a1.setBounds(50,0,500,80);
        add(a1);

        a2 = new JLabel("Enter Name of the Student");
        a2.setBounds(50,70,700,40);
        add(a2);

        t1 = new JTextField();
        t1.setBounds(280,80,200,20);
        add(t1);


        a5 = new JLabel("Enter Course ");
        a5.setBounds(50, 100, 700, 40);
        add(a5);

        t12 = new JTextField();
        t12.setBounds(280, 110, 200, 20);
        add(t12);

        a6 = new JLabel("Enter Year");
        a6.setBounds(50, 130, 700, 40);
        add(a6);

        t13 = new JTextField();
        t13.setBounds(280,140, 200, 20);
        add(t13);

        a7 = new JLabel("Enter semester");
        a7.setBounds(50, 160, 700, 40);
        add(a7);

        t14 = new JTextField();
        t14.setBounds(280, 170, 200, 20);
        add(t14);

        a3 = new JLabel("Enter Subject");
        a3.setBounds(50,230,200,40);
        add(a3);

        a4 = new JLabel("Enter Marks");
        a4.setBounds(250,230,200,40);
        add(a4);

        t2 = new JTextField();
        t2.setBounds(50,280,200,20);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(250,280,200,20);
        add(t3);

        t4 = new JTextField();
        t4.setBounds(50,310,200,20);
        add(t4);

        t5 = new JTextField();
        t5.setBounds(250,310,200,20);
        add(t5);

        t6 = new JTextField();
        t6.setBounds(50,340,200,20);
        add(t6);

        t7 = new JTextField();
        t7.setBounds(250,340,200,20);
        add(t7);

        t8 = new JTextField();
        t8.setBounds(50,370,200,20);
        add(t8);

        t9 = new JTextField();
        t9.setBounds(250,370,200,20);
        add(t9);

        t10 = new JTextField();
        t10.setBounds(50,400,200,20);
        add(t10);

        t11 = new JTextField();
        t11.setBounds(250,400,200,20);
        add(t11);

        r1 = new JButton("Submit");
        r1.setBounds(50,500,100,30);
        r1.setBackground(Color.BLACK);
        r1.setForeground(Color.WHITE);
        add(r1);

        r1.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == r1) {
                DatabaseCreates dbs = new DatabaseCreates();

                String sxf = "insert into subject_info values('" + t1.getText() + "','" + t12.getText() + "','" + t13.getText() + "','" + t13.getText() + "','" + t2.getText() + "','" + t4.getText()
                        + "','" + t6.getText() + "','" + t8.getText() + "','" + t10.getText() + "')";
                String sxg = "insert into marks_info values('" + t1.getText() + "','" + t3.getText() + "','" + t5.getText()
                        + "','" + t7.getText() + "','" + t9.getText() + "','" + t11.getText() + "')";

                dbs.x.executeUpdate(sxf);
                dbs.x.executeUpdate(sxg);

                JOptionPane.showMessageDialog(null, "Marks Inserted Successfully");
                this.setVisible(false);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // public static void main(String[] args) {
    //     new AddMarks().setVisible(true);
    // }

}