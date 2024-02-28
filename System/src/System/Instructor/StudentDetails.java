// The following file contains code for viewing the information of student and their respective course

// Database created: msystem


// For logging into Instructor  portal
// Username: Teacher
// Password: Teacher

package System.Instructor;

import javax.swing.*;

import System.DatabaseCreates;

import java.awt.*;
import java.sql.*;

public class StudentDetails extends JFrame  {
    JLabel a1, a2, a3;
    JTable v1;
    JButton b1, b2;
    JTextField rr;
    String x[] = { "Name", "Course" }; //assigning column headers
    String y[][] = new String[20][2];  //creating rows and columns to store data in table;
    int i = 0, j = 0;

    StudentDetails() {
        super("Student Details");
        setSize(1260, 650);
        setLocation(200, 120);
        setLayout(null);


        try {
            //selecting all the values from students table and inserting them into new table using loop concept
            DatabaseCreates ctv = new DatabaseCreates();
            String sent = "select * from student_course";
            ResultSet res = ctv.x.executeQuery(sent);
            while (res.next()) {
                y[i][j++] = res.getString("Name");
                y[i][j++] = res.getString("Course_name");
                i++;
                j = 0;
            }
            v1 = new JTable(y, x);

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane pan = new JScrollPane(v1);
        pan.setBounds(20, 20, 1200, 330);
        add(pan);

        getContentPane().setBackground(Color.WHITE);
    }


    // public static void main(String[] args) {
    //     new StudentDetails().setVisible(true);
    // }
}