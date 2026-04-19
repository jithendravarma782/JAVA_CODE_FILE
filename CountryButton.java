/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed”
depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling
mechanism with addActionListener( ).*/
package fourB;
import javax.swing.*;
import java.awt.event.*;

public class CountryButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Button");

        JButton india = new JButton("India");
        JButton srilanka = new JButton("Srilanka");
        JLabel label = new JLabel();

        india.setBounds(50, 50, 100, 40);
        srilanka.setBounds(200, 50, 100, 40);
        label.setBounds(50, 120, 300, 30);

        india.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        srilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        frame.add(india);
        frame.add(srilanka);
        frame.add(label);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}