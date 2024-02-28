//The following file contains code for viewing Instructors and their respective modules

// Database created: msystem


// For logging into Instructor  portal
// Username: Teacher
// Password: Teacher


package System.Instructor;

import javax.swing.*;

import System.DatabaseCreates;

import java.awt.*;
import java.sql.*;

public class InstructorModules extends JFrame {
    JLabel a1, a2, a3;
    JTable v1;
    JButton b1, b2;
    JTextField rr;
    String x[] = { "Instructor","Module Name", "Course", "Semester", "year"}; // assigning column headers
    String y[][] = new String[20][5]; // creating rows and columns to store data in table;
    int i = 0, j = 0;

    InstructorModules() {
        super("View Modules");
        setSize(1260, 650);
        setLocation(200, 120);
        setLayout(null);


        try {
            // selecting all the values from students table and inserting them into new
            // table using loop concept
            DatabaseCreates ctv = new DatabaseCreates();
            String sent = "select * from module_info";
            ResultSet res = ctv.x.executeQuery(sent);
            while (res.next()) {
                y[i][j++] = res.getString("Instructor");
                y[i][j++] = res.getString("module_name");
                y[i][j++] = res.getString("course");
                y[i][j++] = res.getString("semester");
                y[i][j++] = res.getString("year");
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
    //     new ModuleDetails().setVisible(true);
    // }
}

