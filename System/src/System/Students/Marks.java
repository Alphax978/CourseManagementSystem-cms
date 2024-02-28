// Database created: msystem


// For logging into student portal
// Username: student
// Password: student

package System.Students;

import java.awt.*;
import javax.swing.*;

import System.DatabaseCreates;

import java.sql.*;

public class Marks extends JFrame {

    JTextArea vs1;
    JPanel vs2;

    Marks() {
    }

    Marks(String spt) {
        setSize(500, 600);
        setLayout(new BorderLayout());

        vs2 = new JPanel();

        vs1 = new JTextArea(50, 15);
        JScrollPane opn = new JScrollPane(vs1);
        vs1.setFont(new Font("Senserif", Font.ITALIC, 18));

        add(vs2, "North");

        add(opn, "Center");

        setLocation(450, 140);
        ismarks(spt);
    }

    public void ismarks(String x) {
        try {
            DatabaseCreates p = new DatabaseCreates();

            vs1.setText("\tResult of Examination\n\nSubject\n");

            ResultSet rs1 = p.x.executeQuery("select * from subject_info where name='" + x + "'");

            if (rs1.next()) {
                vs1.append("\n\t" + rs1.getString("subject1"));
                vs1.append("\n\t" + rs1.getString("subject2"));
                vs1.append("\n\t" + rs1.getString("subject3"));
                vs1.append("\n\t" + rs1.getString("subject4"));
                vs1.append("\n\t" + rs1.getString("subject5"));
                vs1.append("\n-----------------------------------------");
                vs1.append("\n");
            }

            ResultSet rs2 = p.x.executeQuery("select * from marks_info where name='" + x + "'");

            if (rs2.next()) {

                int marks1 = Integer.parseInt(rs2.getString("marks1"));
                int marks2 = Integer.parseInt(rs2.getString("marks2"));
                int marks3 = Integer.parseInt(rs2.getString("marks3"));
                int marks4 = Integer.parseInt(rs2.getString("marks4"));
                int marks5 = Integer.parseInt(rs2.getString("marks5"));
                int totalmarks = marks1 + marks2 + marks3 + marks4 + marks5;

                vs1.append("\nMarks\n\n\t" + rs2.getString("marks1"));
                vs1.append("\n\t" + rs2.getString("marks2"));
                vs1.append("\n\t" + rs2.getString("marks3"));
                vs1.append("\n\t" + rs2.getString("marks4"));
                vs1.append("\n\t" + rs2.getString("marks5"));
                vs1.append("\n-----------------------------------------");
                vs1.append("\n");
                vs1.append("\nTotal marks obtained:       ");
                vs1.append(totalmarks + "/500");
                if (totalmarks > 250) {
                    vs1.append("\nSemester cleared!");
                } else {
                    vs1.append("\nSemester not cleared, you are requested to re-take the examination");
                }
                vs1.append("\n");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // public static void main(String[] args) {
    //     new StudentMarks().setVisible(true);
    // }
}