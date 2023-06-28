package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

/**
 *
 * @author Aditya Anand
 * @github sqladitya
 */
public class TeacherLeave extends JFrame implements ActionListener{
    Choice cempid, ctime;
    JDateChooser dcdate;
    JButton submit,cancel;
            TeacherLeave(){
        setSize(500,550);
        setLocation(450,100);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Apply Leave (Teacher)");
        heading.setBounds(30,20,300,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(heading);
        
        JLabel lblempid = new JLabel("Search by Employee ID");
        lblempid.setBounds(60,100,300,20);
        lblempid.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblempid);
        
        cempid=new Choice();
        cempid.setBounds(60,130,200,20);
        add(cempid);
        
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while (rs.next()) {
                cempid.add(rs.getString("empid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60,180,300,20);
        lbldate.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lbldate);
       
        dcdate = new JDateChooser();
        dcdate.setBounds(60,210,200,20);
        add(dcdate);
        
        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60,260,200,20);
        lbltime.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lbltime);
        
        ctime=new Choice();
        ctime.setBounds(60,290,200,20);
        ctime.add("Full Day");
        ctime.add("Half Day");
        add(ctime);
        
        submit = new JButton("Submit");
        submit.setBounds(60,350,100,20);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        add(submit);
        
        //Cancel Button
        cancel = new JButton("Cancel");
        cancel.setBounds(200,350,100,20);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
        
    }
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == submit){
                    String empid = cempid.getSelectedItem();
                    String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
                    String duration = ctime.getSelectedItem();
                    
                    String query ="insert into teacherleave values('"+empid+"','"+date+"','"+duration+"')";
                    try{
                        conn c = new conn();
                        c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null,"Leave confirmed");
                        setVisible(false);
                    } catch(Exception e){
                        e.printStackTrace();
                    }
            }else {
                    setVisible(false);
                }
            }
            
    public static void main(String[] args) {
        new TeacherLeave();
    }
    
}
