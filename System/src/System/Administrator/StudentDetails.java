// The following file contains code for viewing,adding and removing students


// Database created: msystem


// For logging into Admin portal
// Username: Admin
// Password: Admin


package System.Administrator;
import javax.swing.*;

import System.DatabaseCreates;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentDetails extends JFrame implements ActionListener {
    JLabel a1, a2, a3;
    JTable v1;
    JButton b1, b2;
    JTextField rr;
    String x[] = { "Name", "Father's Name", "Age", "Date of Birth", "Address", "Phone", "Email", "Class X(GPA)", "Class XII(GPA)", "Roll No", "Course" }; //assigning column headers
    String y[][] = new String[20][11];  //creating rows and columns to store data in table;
    int i = 0, j = 0;

    StudentDetails() {
        super("Student Details");
        setSize(1260, 650);
        setLocation(200, 120);
        setLayout(null);

        a1 = new JLabel("Enter Name  of the Student:");
        a1.setBounds(50, 360, 400, 30);
        a1.setFont(new Font("serif", Font.BOLD, 20));
        add(a1);

        rr = new JTextField();
        rr.setBounds(400, 360, 200, 30);
        add(rr);

        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100, 30);
        add(b1);

        a2 = new JLabel("Add New Student");
        a2.setBounds(50, 450, 400, 30);
        a2.setFont(new Font("serif", Font.BOLD, 20));
        add(a2);

        b2 = new JButton("Add Student");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150, 30);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        try {
            //selecting all the values from students table and inserting them into new table using loop concept
            DatabaseCreates ctv = new DatabaseCreates();
            String sent = "select * from student_info";
            ResultSet res = ctv.x.executeQuery(sent);
            while (res.next()) {
                y[i][j++] = res.getString("name");
                y[i][j++] = res.getString("fathers_name");
                y[i][j++] = res.getString("age");
                y[i][j++] = res.getString("dob");
                y[i][j++] = res.getString("address");
                y[i][j++] = res.getString("phone");
                y[i][j++] = res.getString("email");
                y[i][j++] = res.getString("class_x");
                y[i][j++] = res.getString("class_xii");
                y[i][j++] = res.getString("roll_number");
                y[i][j++] = res.getString("course");
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

    public void actionPerformed(ActionEvent ae) {

        DatabaseCreates ins = new DatabaseCreates();

        if (ae.getSource() == b1) {
            try {
                String gety = rr.getText();
                String delt = "delete from student_info where name = '" + gety + "'";
                ins.x.executeUpdate(delt);
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b2) {
            new AddStudent().t.setVisible(true);
            this.setVisible(false);
        }
    }

    // public static void main(String[] args) {
    //     new StudentDetails().setVisible(true);
    // }
}
