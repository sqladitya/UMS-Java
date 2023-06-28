package university.management.system;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Aditya Anand 
 * @github 
 */
public class Main extends JFrame implements Runnable{
    Thread t;
    Main (){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1280,820,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        add(image);
        
        t = new Thread(this);
        t.start();
        setVisible(true);
        int x = 1;
        for (int i = 2;i<=600;i++,x+=1){
        setLocation(-10,0);
        setSize(1500,730);
        
        try{
            Thread.sleep(0);
        } catch(Exception e){}
        }
    }
    public void run(){
        try{Thread.sleep(5000); 
        setVisible(false);
        
        //next frame
        new Login();
        }
     catch (Exception e){
    
}
}
    public static void main(String [] args){
    new Main(); 
    }
    
}
