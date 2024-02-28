// The following file contains code for student portal which allows student to choose course

// Database created: msystem


// For logging into student portal
// Username: student
// Password: student


package System.Students;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import System.DatabaseCreates;

public class ChooseCourse implements ActionListener {
    JFrame t;
    JLabel a1, a2,a6;
    JTextField b1;
    JComboBox b2;
    JButton r1, r2;

    ChooseCourse() {
        t = new JFrame("Choose a  Course");
        t.setBackground(Color.WHITE);
        t.setLayout(null);

        a6 = new JLabel("Course Selection");
        a6.setBounds(300, 50, 500, 50);
        a6.setFont(new Font("serif", Font.ITALIC, 25));
        a6.setForeground(Color.black);
        t.add(a6);

        a1 = new JLabel("Student Name ");
        a1.setBounds(150,150,600,30);
        a1.setFont(new Font("serif",Font.BOLD,20));
        t.add(a1);

        b1 = new JTextField();
        b1.setBounds(300,150,200,30);
        t.add(b1);

        a2 = new JLabel("Course");
        a2.setBounds(150, 250, 200, 30);
        a2.setFont(new Font("serif", Font.BOLD, 20));
        t.add(a2);

        String cs[] = {"BIT","BBA","BCA"};
        b2 = new JComboBox(cs);
        b2.setBackground(Color.WHITE);
        b2.setBounds(300, 250, 200, 30);
        t.add(b2);

        // a3 = new JLabel("Semesters");
        // a3.setBounds(150, 200, 600, 30);
        // a3.setFont(new Font("serif", Font.BOLD, 20));
        // t.add(a3);

        // b2 = new JTextField();
        // b2.setBounds(300, 200, 200, 30);
        // t.add(b2);

        // a4 = new JLabel("Module Count");
        // a4.setBounds(150, 350, 200, 30);
        // a4.setFont(new Font("serif", Font.BOLD, 20));
        // t.add(a4);

        // b5 = new JTextField();
        // b5.setBounds(300, 350, 200, 30);
        // t.add(b5);

        // a5 = new JLabel("Course Code");
        // a5.setBounds(150, 250, 200, 30);
        // a5.setFont(new Font("serif", Font.BOLD, 20));
        // t.add(a5);

        // b3 = new JTextField();
        // b3.setBounds(300, 250, 200, 30);
        // t.add(b3);

        // v1 = new JButton("Submit");
        // v1.setBackground(Color.BLACK);
        // v1.setForeground(Color.WHITE);
        // v1.setBounds(160, 500, 150, 40);

        // t.add(v1);

        // v2 = new JButton("Cancel");
        // v2.setBackground(Color.BLACK);
        // v2.setForeground(Color.WHITE);
        // v2.setBounds(360, 500, 150, 40);

        // t.add(v2);

        // v1.addActionListener(this);
        // v2.addActionListener(this);



        t.setVisible(true);
        t.setSize(786, 660);
        t.setLocation(400, 90);
       
    }

    // created a method for getting the data that is entered in the textfield
    // and also storing them in database

    public void actionPerformed(ActionEvent ae) {
        String a = b1.getText();
        String bon = (String)b2.getSelectedItem();
        // String c = b3.getText();
        // String d = b4.getText();
        // String e = b5.getText();
        // String fen = b6.getText();
        // String g = b7.getText();
        // String h = b8.getText();
        // String i = b9.getText();
        // String j = b10.getText();
        // String k = b11.getText(); // fetches the option that is selected in combobox
        // Since combobox returns object of an object it is type casted into string

        // If submit button is pressed
        if (ae.getSource() == r1) {
            try {
                DatabaseCreates su = new DatabaseCreates();
                String z = "insert into student_course values('" + a + "','" + bon + "')";
                su.x.executeUpdate(z); // updates database
                JOptionPane.showMessageDialog(null, "Course Selected"); // throws a pop up message
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