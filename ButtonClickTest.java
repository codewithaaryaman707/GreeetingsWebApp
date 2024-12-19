/*
Create another greeting app but this time use Jbutton
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

class ButtonCLick extends JFrame{
    Container c;
    JButton btnGreeting;
    JLabel lbMssg;
    ButtonCLick(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        Font f = new Font("Arial", Font.BOLD, 34);
        btnGreeting = new JButton("Greeting");
        lbMssg = new JLabel("");
        btnGreeting.setFont(f);
        lbMssg.setFont(f);

        c.add(btnGreeting);
        c.add(lbMssg);

        // INNER CLASS
        class EventHandling implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                LocalTime t = LocalTime.now();
                int hrs = t.getHour();
                String mssg = "";
                if(hrs <12) mssg = "GOOD MORNING";
                else if (hrs<16) mssg = "GOOD AFTERNOON";
                else mssg = "GOOD EVENING";
                lbMssg.setText(mssg);

                }
            }
            btnGreeting.addActionListener(new EventHandling());

        setSize(700,300);
        setLocationRelativeTo(null);
        setTitle("Application by Aaryamaan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        }

    }
public class ButtonClickTest {
    public static void main(String[] args){
        ButtonCLick bc = new ButtonCLick();
    }
}
