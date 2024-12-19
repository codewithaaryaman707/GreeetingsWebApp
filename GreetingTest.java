/*
Creating second web application that would greet GM/GA/GE
 */
import javax.swing.*;
import java.awt.*;
import java.time.*;
class Greeting extends JFrame{

    Container c ;
    JLabel labMsg;

    Greeting(){
        LocalTime t = LocalTime.now();
        int hours = t.getHour();
        String mssg = "";
        if(hours<12) {
            mssg = "Good Morning";
        }
        else if (hours<16) {
            mssg = "Good Afternoon";
        }
        else {
            mssg = "Good Evening";
        }
        c = getContentPane();
        labMsg = new JLabel(mssg, JLabel.CENTER);
        Font f = new Font("Times New Roman", Font.BOLD, 34);
        labMsg.setFont(f);
        labMsg.setForeground(Color.BLUE);
        c.add(labMsg);

        setSize(600,400); // (width,height)
        setLocationRelativeTo(null);
        setTitle("App by Aaryamaan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class GreetingTest {
    public static void main(String args[]){
        Greeting greeting = new Greeting();
    }
}
