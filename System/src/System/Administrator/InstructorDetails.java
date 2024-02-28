
// The following file contains code for viewing,adding,removing instructor



// Database created: msystem


// For logging into Admin portal
// Username: Admin
// Password: Admin

package System.Administrator;
import javax.swing.*;

import System.DatabaseCreates;

import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class InstructorDetails extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2;
    JTextField t2;
    String x[] = {"Name","Father's Name","Age","Date of Birth","Address","Phone","Email","Class X(GPA)", "Class XII(GPA)", "Course","Education"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    InstructorDetails(){
        super("Instructor Details");
        setSize(1260,650);
        setLocation(200,120);
        setLayout(null);
        
        l1 = new JLabel("Enter Name of Instructor : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100 ,30);
        add(b1);
            
        l2 = new JLabel("Add New Instructor");
        l2.setBounds(50,450,400,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);
        
        b2 = new JButton("Add");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150 ,30);
        add(b2);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        try{
            DatabaseCreates gcc  = new DatabaseCreates();
            String sn = "select * from instructor_info";
            ResultSet rs  = gcc.x.executeQuery(sn);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("fathers_name");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("class_x");
                y[i][j++]=rs.getString("class_xii");
                y[i][j++]=rs.getString("Expertise");
                y[i][j++]=rs.getString("Education");
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
        
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
        DatabaseCreates vxx = new DatabaseCreates();
    
        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String qen = "delete from instructor_info where name = '"+a+"'";
                vxx.x.executeUpdate(qen);
                this.setVisible(false);
                new InstructorDetails().setVisible(true);
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new AddInstructor().f.setVisible(true);
            this.setVisible(false);
        }
    }
    // public static void main(String[] args){
    //     new InstructorDetails().setVisible(true);
    // }
}
