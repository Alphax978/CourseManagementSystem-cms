// The following files contains code for checking the results


// Database created: msystem


// For logging into student portal
// Username: student
// Password: student


package System.Students;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import System.DatabaseCreates;

import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class Results extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTable table;
    private JTextField search_all;
    private JButton b1;

    public void shows() {
        try {
            DatabaseCreates all = new DatabaseCreates();
            String take = "select * from student_info";
            PreparedStatement st = all.v.prepareStatement(take);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            all.v.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Results() {

        setBounds(185, 90, 930, 475);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79, 133, 1080, 282);
        contentPane.add(scrollPane);

        // creating table,also creating an object of JScrollpane since it is necessary
        // to create an object of Jscrollpane before creating a table
        table = new JTable();
        table.setBackground(new Color(240, 248, 255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        scrollPane.setViewportView(table);

        b1 = new JButton("Result");
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(630, 89, 138, 33);
        contentPane.add(b1);

        JLabel l1 = new JLabel("Check Result");
        l1.setForeground(new Color(107, 142, 35));
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(300, 15, 400, 47);
        contentPane.add(l1);

        JLabel vx = new JLabel("Enter name");
        vx.setForeground(new Color(107, 142, 35));
        vx.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        vx.setBounds(78, 80, 400, 47);
        contentPane.add(vx);

        search_all = new JTextField();
        search_all.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search_all.setBounds(260, 89, 357, 33);
        contentPane.add(search_all);
        search_all.setColumns(10);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true)));
        panel.setBounds(67, 54, 1100, 368);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        shows();
        setSize(1200, 700);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                new Marks(search_all.getText()).setVisible(true);
                this.setVisible(false);
            }
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public static void main(String[] args) {
    //     new ExamDetails().setVisible(true);
    // }
}