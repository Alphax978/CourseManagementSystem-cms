// The following file contains code for adding instructor

// Database created: msystem


// For logging into Admin portal
// Username: Admin
// Password: Admin

package System.Administrator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import System.DatabaseCreates;


public class AddInstructor implements ActionListener {

    JFrame t;
    JLabel id1, id2, id3, id4, id5, id6, id7, id8, id9, f, lab,lab1;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    JButton b, b1;
    JComboBox c1,c2;


    AddInstructor() {
        t = new JFrame("Add Instructor");
        t.setBackground(Color.white);
        t.setLayout(null);

        id8 = new JLabel("Instructor Information");
        id8.setBounds(320, 5, 500, 50);
        id8.setFont(new Font("serif", Font.ITALIC, 25));
        id8.setForeground(Color.black);
        t.add(id8);

        id1 = new JLabel("Name");
        id1.setBounds(50, 150, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        t.add(id1);

        t1 = new JTextField();
        t1.setBounds(200, 150, 150, 30);
        t.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400, 150, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        t.add(id2);

        t2 = new JTextField();
        t2.setBounds(600, 150, 150, 30);
        t.add(t2);

        id3 = new JLabel("Age");
        id3.setBounds(50, 200, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        t.add(id3);

        t3 = new JTextField();
        t3.setBounds(200, 200, 150, 30);
        t.add(t3);

        id4 = new JLabel("DOB (dd/mm/yyyy)");
        id4.setBounds(400, 200, 200, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        t.add(id4);

        t4 = new JTextField();
        t4.setBounds(600, 200, 150, 30);
        t.add(t4);

        id5 = new JLabel("Address");
        id5.setBounds(50, 250, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        t.add(id5);

        t5 = new JTextField();
        t5.setBounds(200, 250, 150, 30);
        t.add(t5);

        id6 = new JLabel("Phone");
        id6.setBounds(400, 250, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        t.add(id6);

        t6 = new JTextField();
        t6.setBounds(600, 250, 150, 30);
        t.add(t6);

        id7 = new JLabel("Email Id");
        id7.setBounds(50, 300, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        t.add(id7);

        t7 = new JTextField();
        t7.setBounds(200, 300, 150, 30);
        t.add(t7);

        id8 = new JLabel("Class X(%)");
        id8.setBounds(400, 300, 130, 30);
        id8.setFont(new Font("serif", Font.BOLD, 20));
        t.add(id8);

        t8 = new JTextField();
        t8.setBounds(600, 300, 150, 30);
        t.add(t8);

        id9 = new JLabel("Class XII(%)");
        id9.setBounds(50, 350, 130, 30);
        id9.setFont(new Font("serif", Font.BOLD, 20));
        t.add(id9);

        t9 = new JTextField();
        t9.setBounds(200, 350, 150, 30);
        t.add(t9);

        lab = new JLabel("Course");
        lab.setBounds(50, 400, 150, 30);
        lab.setFont(new Font("serif", Font.BOLD, 20));
        t.add(lab);

        String course[] = {"BIT","BBA","BCA" };
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200, 400, 150, 30);
        t.add(c1);

        lab1 = new JLabel("Education");
        lab1.setBounds(400, 400, 150, 30);
        lab1.setFont(new Font("serif", Font.BOLD, 20));
        t.add(lab1);

        String edu[] = { "B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "BA", "BCom"};
        c2 = new JComboBox(edu);
        c2.setBackground(Color.WHITE);
        c2.setBounds(600, 400, 150, 30);
        t.add(c2);


        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250, 550, 150, 40);

        t.add(b);

        b1 = new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450, 550, 150, 40);

        t.add(b1);

        b.addActionListener(this);
        b1.addActionListener(this);

        t.setVisible(true);
        t.setSize(900, 700);
        t.setLocation(350,90);
    }

    public void actionPerformed(ActionEvent ae) {

        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = (String) c1.getSelectedItem();
        String k = (String) c2.getSelectedItem();

        if (ae.getSource() == b) {
            try {
                DatabaseCreates crt = new DatabaseCreates();
                String qen = "insert into instructor_info values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
                crt.x.executeUpdate(qen);
                JOptionPane.showMessageDialog(null, "Added a New Instructor Successfully");
                f.setVisible(false);

            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }else if (ae.getSource() == b1) {
            t.setVisible(false);
        }
    }

    // public static void main(String[] arg) {
    //     new AddInstructor().t.setVisible(true);
    // }
}
    
