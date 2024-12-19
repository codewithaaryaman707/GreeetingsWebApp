/*
Creating first desktop application
That displays Welcome
 */

import javax.swing.*;
import java.awt.*;
class Welcome extends JFrame {
    Container c ;
    JLabel lab;
    Welcome(){
        c = getContentPane();
        lab = new JLabel("Welcome to this demo application by Aaryaman", JLabel.CENTER);
        Font f = new Font("Arial", Font.BOLD,34);
        lab.setFont(f);
        lab.setForeground(Color.BLUE);
        c.add(lab);

        setSize(600,400);
        setLocationRelativeTo(null);
        setTitle("App by Aaryamaan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class WelcomeTest {
    public static void main(String[] args){
        Welcome welcome = new Welcome();
    }
}
