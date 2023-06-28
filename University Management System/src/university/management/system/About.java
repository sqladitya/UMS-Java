package university.management.system;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Aditya Anand
 * @github sqladitya
 */
public class About extends JFrame{
    
    About(){
        setSize(700,500);
        setLocation(100,150);
        getContentPane().setBackground(Color.WHITE);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,300,200);
        add(image);
        
        
        JLabel heading = new JLabel("<html>University<br/>Management<br/>System</html>");
        heading.setBounds(70,20,500,130);
        heading.setFont(new Font("Tahoma", Font.BOLD,30));
        add(heading);
        
        JLabel name = new JLabel("<html>Developed By: Aditya Anand<br/>Linkedin: @sqladitya<br/>Github: @sqladitya<br/>Email ID: myself.adityaanand@gmail.com<br/>Contact No.: +91 6205950894<br/>LPU Registration Number: 12102894");
        name.setBounds(70,220,400,230);
        name.setFont(new Font("Tahoma", Font.PLAIN,20));
        name.setForeground(Color.PINK);
        add(name);

        setLayout(null);
        
        
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new About();
    }
}
