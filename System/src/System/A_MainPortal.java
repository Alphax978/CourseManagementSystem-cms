package System;

import System.Administrator.*;
import System.Students.*;
import System.Instructor.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class A_MainPortal extends JFrame implements ActionListener {

    public A_MainPortal() {
        super("Easy Course Management System");

        // ImageIcon ry = new ImageIcon(ClassLoader.getSystemResource("icons/Universs.jpg"));
        // Image er = ry.getImage().getScaledInstance(1780, 850, Image.SCALE_DEFAULT);
        // ImageIcon w = new ImageIcon(er);
        // JLabel q = new JLabel(w);
        // add(q);

        JMenuBar mvs = new JMenuBar();

        JMenu Admins = new JMenu("Admin");
        JMenuItem ns = new JMenuItem("Log In");
        Admins.setForeground(Color.BLUE); // changes the color of font

        ns.setFont(new Font("monospaced", Font.BOLD, 16));
        ns.setBackground(Color.white);

        ns.addActionListener(this);

        JMenu Instructors = new JMenu("Instructor ");
        JMenuItem vs = new JMenuItem("Log In to the portal");
        Instructors.setForeground(Color.BLUE);

        vs.setFont(new Font("monospaced", Font.BOLD, 16));
        vs.setBackground(Color.white);

        vs.addActionListener(this);

        JMenu Students = new JMenu("Student");
        JMenuItem rs = new JMenuItem("Log In to portal");
        Students.setForeground(Color.BLUE);

        rs.setFont(new Font("monospaced", Font.BOLD, 16));
        rs.setBackground(Color.white);

        rs.addActionListener(this);

        
        JMenu Exit = new JMenu("Exit");
        JMenuItem rc = new JMenuItem("Exit");
        Exit.setForeground(Color.BLUE);

        rc.setFont(new Font("monospaced", Font.BOLD, 16));
        rc.setBackground(Color.white);
        rc.addActionListener(this);

        Admins.add(ns);
        Instructors.add(vs);
        Students.add(rs);
        Exit.add(rc);

        // adding all the menus in menubar
        mvs.add(Admins);
        mvs.add(Instructors);
        mvs.add(Students);
        mvs.add(Exit);

        // adding the menubar in frame
        setJMenuBar(mvs);

        // font,layout and visibility of the frame is modified
        setFont(new Font("senserif", Font.BOLD, 30));
        setLayout(new FlowLayout());
        setSize(1700, 850);
        setVisible(true);

    }

    // The method below is created for opening the correct frame
    // for the button on the menu items which have been pressed

    public void actionPerformed(ActionEvent et) {
        String text = et.getActionCommand();

        if (text.equals("Log In")) {
            new AdminLogin().setVisible(true);
            setVisible(false);
        }

        else if (text.equals("Log In to the portal")) {
            new InstructorLogin().setVisible(true);
            setVisible(false);
        }

        if (text.equals("Log In to portal")) {
            new StudentLogin().setVisible(true);
            setVisible(false);
        }

        else if (text.equals("Exit")) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new A_MainPortal();

    }

}
