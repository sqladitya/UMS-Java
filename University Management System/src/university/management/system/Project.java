package university.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Aditya Anand
 * @github sqladitya
 */
public class Project extends JFrame implements ActionListener {
    Project() {
        setLocation(-10,0);
        setSize(1540,850);
        //adding image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1280,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        //Menubar new Information
        JMenuBar mb = new JMenuBar();
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.RED);
        mb.add(newInformation);
        //Details
        JMenuItem facultyinfo = new JMenuItem("New faculty Information");
        facultyinfo.addActionListener(this);
        newInformation.add(facultyinfo);
        facultyinfo.setBackground(Color.WHITE);
        
        JMenuItem studentinfo = new JMenuItem("New Student Information");
        studentinfo.addActionListener(this);
        newInformation.add(studentinfo);
        newInformation.add(studentinfo);
        facultyinfo.setBackground(Color.WHITE);
        

        
        
        //Menubar View Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);
        //Details
        JMenuItem facultydetails = new JMenuItem("View faculty  Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        details.add(studentdetails);
        studentdetails.addActionListener(this);
        studentdetails.setBackground(Color.WHITE);

        //Menubar leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.RED);
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        leave.add(facultyleave);
        facultyleave.addActionListener(this);
        facultyleave.setBackground(Color.WHITE);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        leave.add(studentleave);
        studentleave.addActionListener(this);
        studentleave.setBackground(Color.WHITE);

        //Leave Details
        JMenu leavedetails = new JMenu("Leave Details");
        leavedetails.setForeground(Color.RED);
        mb.add(leavedetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        leavedetails.add(facultyleavedetails);
        facultyleavedetails.addActionListener(this);
        facultyleavedetails.setBackground(Color.WHITE);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        leavedetails.add(studentleavedetails);
        studentleavedetails.addActionListener(this);
        studentleavedetails.setBackground(Color.WHITE);
                
        //update information
        JMenu updateinfo = new JMenu("Update Details");
        updateinfo.setForeground(Color.RED);
        mb.add(updateinfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updateinfo.add(updatefacultyinfo);
        updatefacultyinfo.addActionListener(this);
        updatefacultyinfo.setBackground(Color.WHITE);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Datails");
        updateinfo.add(updatestudentinfo);
        updatestudentinfo.addActionListener(this);
        updatestudentinfo.setBackground(Color.WHITE);

        
        //exam
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.RED);
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Result");
        exam.add(examinationdetails);
        examinationdetails.addActionListener(this);
        examinationdetails.setBackground(Color.WHITE);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        exam.add(entermarks);
        entermarks.addActionListener(this);
        entermarks.setBackground(Color.WHITE);


        //fee details
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.RED);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        fee.add(feestructure);
        feestructure.addActionListener(this);
        feestructure.setBackground(Color.WHITE);
        
        JMenuItem feeform = new JMenuItem("Student Fee form");
        fee.add(feeform);
        feeform.addActionListener(this);
        feeform.setBackground(Color.WHITE);
        
        //Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        utility.add(notepad);
        notepad.addActionListener(this);
        notepad.setBackground(Color.WHITE);
        
        JMenuItem calc = new JMenuItem("Calculator");
        utility.add(calc);
        calc.addActionListener(this);
        calc.setBackground(Color.WHITE);
        
        JMenu about = new JMenu("About");
        about.setForeground(Color.RED);
        about.addActionListener(this);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        about.add(ab);
        ab.addActionListener(this);
        ab.setBackground(Color.WHITE);
        
        //exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        exit.add(ex);
        ex.addActionListener(this);
        ex.setBackground(Color.WHITE);

        setJMenuBar(mb);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if (msg.equals("Exit")){
            setVisible(false);
        }
        else if (msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                
            } }else if (msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                
            }
        } else if(msg.equals("New faculty Information")){
            new AddTeacher();
        } else if(msg.equals("New Student Information")){
            new AddStudent();
        }else if(msg.equals("View faculty  Details")){
            new TeacherDetails();
        } else if(msg.equals("View Student Details")){
            new StudentDetails();
        }else if(msg.equals("Faculty Leave")){
            new TeacherLeave();
        } else if(msg.equals("Student Leave")){
            new StudentLeave();
        }else if(msg.equals("Faculty Leave Details")){
            new TeacherLeaveDetails();
        } else if(msg.equals("Student Leave Details")){
            new StudentLeaveDetails();
        }else if(msg.equals("Update Faculty Details")){
            new UpdateTeacher();
        }else if(msg.equals("Update Student Datails")){
            new UpdateStudent();
        }else if(msg.equals("Enter Marks")){
            new EnterMarks();
        }else if(msg.equals("Examination Result")){
            new ExaminationDetails();
        }else if(msg.equals("Fee Structure")){
            new FeeStructure();
        }else if(msg.equals("About")){
            new About();
        }else if(msg.equals("Student Fee form")){
            new StudentFeeForm();
        }
            
    
    
    }
    public static void main(String[] args) {
        new Project();
    }
}
