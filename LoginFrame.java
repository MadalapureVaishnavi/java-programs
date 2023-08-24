import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
//Creating LoginFrame class
public class LoginFrame extends JFrame implements ActionListener {
 
 
    //Creating constructor of LoginFrame() class
    LoginFrame()
    {
 
    }
 
    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
 
    }
}
Creating Object of LoginFrame class
step 3

Now we will create another class(Login.java in this example) where our main method will reside.
Now inside our main method, we will create the object of LoginFrame class and set some of its properties like its title, size and location, default close operation, and its visibility.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginFrame extends JFrame implements ActionListener {
 
 
    LoginFrame()
    {
 
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
 
    }
}
 
public class Login {
    public static void main(String[] a){
        //Creating object of LoginFrame class and setting some of its properties
        LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
 
    }
 
}
