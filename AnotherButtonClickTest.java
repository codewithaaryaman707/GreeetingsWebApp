/*
Create same app as previous one but by using Lambda expression
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

class AnotherButtonClick extends JFrame{
    Container c;
    JButton btnGreeting;
    JLabel lbMssg;
    AnotherButtonClick()
    {

        c = getContentPane();
        c.setLayout(new FlowLayout());
        Font f = new Font("Arial", Font.BOLD,38);
        btnGreeting = new JButton("Greeting");
        btnGreeting.setFont(f);
        lbMssg = new JLabel("");
        lbMssg.setFont(f);

        c.add(btnGreeting);
        c.add(lbMssg);

        ActionListener a = (ae)->{
            LocalTime t = LocalTime.now();
            int hr = t.getHour();
            String mssg = "";
            if(hr<12) mssg ="Good Morning";
            else if (hr<16) mssg ="Good Afternoon";
            else mssg = "Good Evening";
            lbMssg.setText(mssg);
        };
        btnGreeting.addActionListener(a);
        setSize(700,500);
        setLocationRelativeTo(null);
        setTitle("App by Aaryaman");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class AnotherButtonClickTest {
    public static void main(String[] args){
        AnotherButtonClick a = new AnotherButtonClick();
    }
}
