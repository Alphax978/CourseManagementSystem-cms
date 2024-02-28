// The following file contains code for main student portal

// Database created: msystem


// For logging into student portal
// Username: student
// Password: student


package System.Students;
import System.A_MainPortal;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentPortal extends JFrame implements ActionListener {
    public StudentPortal() {
        super("Easy Manage: Welcome User");

        // ImageIcon ry = new ImageIcon(ClassLoader.getSystemResource("icons/Universs.jpg"));
        // Image er = ry.getImage().getScaledInstance(1780, 850, Image.SCALE_DEFAULT);
        // ImageIcon w = new ImageIcon(er);
        // JLabel q = new JLabel(w);
        // add(q);

        JMenuBar oop = new JMenuBar();

        JMenu choice = new JMenu("Course");
        JMenuItem z = new JMenuItem("Choose Course");
        choice.setForeground(Color.BLUE); // changes the color of font

        z.setFont(new Font("monospaced", Font.BOLD, 16));
        z.setBackground(Color.white);

        z.addActionListener(this);

        JMenu models = new JMenu("Modules");
        JMenuItem i = new JMenuItem("Module Details");
        models.setForeground(Color.BLUE);

        i.setFont(new Font("monospaced", Font.BOLD, 16));
        i.setBackground(Color.white);
      

        i.addActionListener(this);

        JMenu Details = new JMenu("Details");
        JMenuItem r = new JMenuItem("Instructor Details");
        Details.setForeground(Color.BLUE);

        r.setFont(new Font("monospaced", Font.BOLD, 16));
        r.setBackground(Color.white);
     

        r.addActionListener(this);
 

        JMenu see = new JMenu("Results");
        JMenuItem x = new JMenuItem("Check Results");
        see.setForeground(Color.BLUE);

        x.setFont(new Font("monospaced", Font.BOLD, 16));
        x.setBackground(Color.white);

        x.addActionListener(this);

        JMenu Exit = new JMenu("Log Out");
        JMenuItem mq = new JMenuItem("Log Out");
        Exit.setForeground(Color.BLUE);

        mq.setFont(new Font("monospaced", Font.BOLD, 16));
        mq.setBackground(Color.white);
        mq.addActionListener(this);

        choice.add(z);
        models.add(i);
        Details.add(r);
        see.add(x);
        Exit.add(mq);

        // adding all the menus in menubar
        oop.add(choice);
        oop.add(models);
        oop.add(Details);
        oop.add(see);
        oop.add(Exit);

        // adding the menubar in frame
        setJMenuBar(oop);

        // font,layout and visibility of the frame is modified
        setFont(new Font("senserif", Font.BOLD, 30));
        setLayout(new FlowLayout());
        setSize(1700, 850);

    }

    // The method below is created for opening the correct frame
    // for the button on the menu items which have been pressed

    public void actionPerformed(ActionEvent et) {
        String text = et.getActionCommand();

        if (text.equals("Choose Course")) {
            new ChooseCourse().t.setVisible(true);
        }

        else if (text.equals("Module Details")) {
            new StudentModules ().setVisible(true);
        }

        if (text.equals("Instructor Details")) {
            new Teacher().setVisible(true);
        }

        else if (text.equals("Check Results")) {
            new Results().setVisible(true);
        }

        // else if (text.equals("Add Modules")) {
        //     new AddModules().t.setVisible(true);
        // }

        // else if (text.equals("Student Details")) {
        //     new StudentDetails().setVisible(true);
        // }

        // else if (text.equals("Instructor Details")) {
        //     new InstructorDetails().setVisible(true);
        // }

        // else if (text.equals("Course Details")) {
        //     new CourseDetails().setVisible(true);
        // }

        // else if (text.equals("Examination Details")) {
        //     new ExamDetails().setVisible(true);
        // }



        // else if (text.equals("Module Details")) {
        //     new ModuleDetails().setVisible(true);
        // }

         if (text.equals("Log Out")) {
            new A_MainPortal().setVisible(true);
            setVisible(false);
        }

    }



}
