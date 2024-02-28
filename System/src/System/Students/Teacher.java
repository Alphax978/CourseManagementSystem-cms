// The following file contains code for Viewing the Instructors and their respective modules

// Database created: msystem


// For logging into student portal
// Username: student
// Password: student

package System.Students;

import javax.swing.*;

import System.DatabaseCreates;
import java.awt.*;
import java.sql.*;


public class Teacher extends JFrame {
    
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2;
    JTextField t2;
    String x[] = {"Instrutor","Module","Course", "Semester","Year"};
    String y[][] = new String[20][5];
    int i=0, j=0;
    Teacher(){
        super("Instructor Details");
        setSize(1260,650);
        setLocation(200,120);
        setLayout(null);
        
        
        
        try{
            DatabaseCreates gcc  = new DatabaseCreates();
            String sn = "select * from module_info";
            ResultSet rs  = gcc.x.executeQuery(sn);
            while(rs.next()){
                y[i][j++]=rs.getString("Instructor");
                y[i][j++]=rs.getString("module_name");
                y[i][j++]=rs.getString("course");
                y[i][j++]=rs.getString("semester");
                y[i][j++]=rs.getString("year");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        add(sp);
        
        getContentPane().setBackground(Color.WHITE);
        
    }

    // public static void main(String[] args){
    //     new InstructorDetails().setVisible(true);
    // }
}
