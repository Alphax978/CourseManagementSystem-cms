// The following file conatains code for Main Instrutor portal

// Database created: msystem


// For logging into Instructor  portal
// Username: Teacher
// Password: Teacher

package System.Instructor;
import System.A_MainPortal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InstructorPortal extends JFrame implements ActionListener {
    public InstructorPortal() {
        super("Easy Manage: Welcome User");

        // ImageIcon ry = new ImageIcon(ClassLoader.getSystemResource("icons/Universs.jpg"));
        // Image er = ry.getImage().getScaledInstance(1780, 850, Image.SCALE_DEFAULT);
        // ImageIcon w = new ImageIcon(er);
        // JLabel q = new JLabel(w);
        // add(q);

        JMenuBar ern = new JMenuBar();

    

        JMenu view = new JMenu("Modules");
        JMenuItem z = new JMenuItem("View Modules");
        view.setForeground(Color.BLUE); // changes the color of font

        z.setFont(new Font("monospaced", Font.BOLD, 16));
        z.setBackground(Color.white);

        z.addActionListener(this);

        JMenu models = new JMenu("Details");
        JMenuItem i = new JMenuItem("Student Details");
        models.setForeground(Color.BLUE);

        i.setFont(new Font("monospaced", Font.BOLD, 16));
        i.setBackground(Color.white);
      

        i.addActionListener(this);

        JMenu Details = new JMenu("Examination");
        JMenuItem r = new JMenuItem("Add Marks");
        Details.setForeground(Color.BLUE);

        r.setFont(new Font("monospaced", Font.BOLD, 16));
        r.setBackground(Color.white);
     

        r.addActionListener(this);
 

        JMenu Exit = new JMenu("Log Out");
        JMenuItem mq = new JMenuItem("Log Out");
        Exit.setForeground(Color.BLUE);

        mq.setFont(new Font("monospaced", Font.BOLD, 16));
        mq.setBackground(Color.white);
        mq.addActionListener(this);

    
        view.add(z);
        models.add(i);
        Details.add(r);
        Exit.add(mq);

        // adding all the menus in menubar
        ern.add(view);
        ern.add(models);
        ern.add(Details);
        ern.add(Exit);

        // adding the menubar in frame
        setJMenuBar(ern);

        // font,layout and visibility of the frame is modified
        setFont(new Font("senserif", Font.BOLD, 30));
        setLayout(new FlowLayout());
        setSize(1700, 850);

    }

    // The method below is created for opening the correct frame
    // for the button on the menu items which have been pressed

    public void actionPerformed(ActionEvent et) {
        String text = et.getActionCommand();

        if (text.equals("View Modules")) {
            new InstructorModules().setVisible(true);
        }

        else if (text.equals("Student Details")) {
            new StudentDetails().setVisible(true);
        }

        if (text.equals("Add Marks")) {
            new AddGrades().setVisible(true);
        }

        if (text.equals("Log Out")) {
            new A_MainPortal().setVisible(true);
            setVisible(false);
        }


    }
}