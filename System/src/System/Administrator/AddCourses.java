// The following file contains code for adding courses 
// admin can add courses and delete


// Database created: msystem


// For logging into Admin portal
// Username: Admin
// Password: Admin

package System.Administrator;
import System.DatabaseCreates;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddCourses implements ActionListener{
    JFrame t;
    JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9;
    JTextField b1,b2,b3,b4,b5,b6,b7;
    JButton v1,v2;

    AddCourses(){
        t = new JFrame("Add a Course");
        t.setBackground(Color.WHITE);
        t.setLayout(null);

        a6 = new JLabel("Course Information");
        a6.setBounds(300, 50, 500, 50);
        a6.setFont(new Font("serif", Font.ITALIC, 25));
        a6.setForeground(Color.black);
        t.add(a6);

        a1 = new JLabel("Course name ");
        a1.setBounds(150,150,600,30);
        a1.setFont(new Font("serif",Font.BOLD,20));
        t.add(a1);

        b1 = new JTextField();
        b1.setBounds(300,150,200,30);
        t.add(b1);

        a2 = new JLabel("Duration");
        a2.setBounds(150, 300, 200, 30);
        a2.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a2);

        b4 = new JTextField();
        b4.setBounds(300, 300, 200, 30);
        t.add(b4);

        a3 = new JLabel("Semesters");
        a3.setBounds(150, 200, 600, 30);
        a3.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a3);

        b2 = new JTextField();
        b2.setBounds(300, 200, 200, 30);
        t.add(b2);

        a4 = new JLabel("Module Count");
        a4.setBounds(150, 350, 200, 30);
        a4.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a4);

        b5 = new JTextField();
        b5.setBounds(300, 350, 200, 30);
        t.add(b5);

        a5 = new JLabel("Course Code");
        a5.setBounds(150, 250, 200, 30);
        a5.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a5);

        b3 = new JTextField();
        b3.setBounds(300, 250, 200, 30);
        t.add(b3);

        v1 = new JButton("Submit");
        v1.setBackground(Color.BLACK);
        v1.setForeground(Color.WHITE);
        v1.setBounds(160, 500, 150, 40);

        t.add(v1);

        v2 = new JButton("Cancel");
        v2.setBackground(Color.BLACK);
        v2.setForeground(Color.WHITE);
        v2.setBounds(360, 500, 150, 40);

        t.add(v2);

        v1.addActionListener(this);
        v2.addActionListener(this);



        t.setVisible(true);
        t.setSize(786, 660);
        t.setLocation(400, 90);

    }

    public void actionPerformed(ActionEvent ae){
        String a = b1.getText();
        String bb = b2.getText();
        String c = b3.getText();
        String d = b4.getText();
        String e = b5.getText();

        if (ae.getSource() == v1) {
            try {
                DatabaseCreates crt = new DatabaseCreates();
                String qen = "insert into course_info values('" + a + "','" + bb + "','" + c + "','" + d + "','" + e + "')";
                crt.x.executeUpdate(qen);
                JOptionPane.showMessageDialog(null, "Added a New Course Successfully");
                t.setVisible(false);

            } catch (Exception ee) {
                ee.printStackTrace();
            }
        } else if (ae.getSource() == v2) {
            t.setVisible(false);
        }


    }





    // public static void main(String[] args){
    //     new AddCourses().t.setVisible(true);
    // }
 
}
