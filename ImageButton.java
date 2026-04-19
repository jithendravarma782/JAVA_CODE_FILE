/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
implementing the event handling mechanism with addActionListener( ).*/
package fourC;
import javax.swing.*;
import java.awt.event.*;

public class ImageButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Button");

        ImageIcon clockIcon = new ImageIcon("digitl clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hour glass.png");

        JButton clockBtn = new JButton("Digital Clock", clockIcon);
        JButton hourBtn = new JButton("Hour Glass", hourglassIcon);

        JLabel label = new JLabel();

        clockBtn.setBounds(30, 30, 150, 80);
        hourBtn.setBounds(200, 30, 150, 80);
        label.setBounds(50, 130, 300, 30);

        clockBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        hourBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.add(clockBtn);
        frame.add(hourBtn);
        frame.add(label);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}