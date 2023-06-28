package university.management.system;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author Aditya Anand
 * @github sqladitya
 */
public class Login extends JFrame implements ActionListener{
    JButton login, cancel;
    JTextField tfusername,tfpassword;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //Username Button
        JLabel lbusername = new JLabel("Username");
        lbusername.setBounds(40,40,100,20);
        add(lbusername);
         tfusername = new JTextField();
        tfusername.setBounds(150,40,150,20);
        add(tfusername);
        
        //Password Button
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40,80,100,20);
        add(lblpassword);
         tfpassword = new JPasswordField();
        tfpassword.setBounds(150,80,150,20);
        add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(50,140,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        add(login);
        
        //Cancel Button
        cancel = new JButton("Cancel");
        cancel.setBounds(200,140,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        setVisible(true);
        
        //adding image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        JLabel image = new JLabel(i1);
        image.setBounds(310,0,200,200);
        add(image);

        setSize(520, 250);
        setLocation(370,200);
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == login){
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            String query ="select * from login where username = '"+username+"' and password = '"+password+"'";
            try {
                conn c = new conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    new Project();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(true);
                }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
     else if (ae.getSource() == cancel){
        setVisible(false);
    }
    }

    
    public static void main(String[] args){
        new Login();
    }
}
