/*5b. Develop a Swing program in Java to create a Tabbed Pan 
 * of RED, BLUE and GREEN and display the concerned color
 *  whenever the specific tab is selected in the Pan.*/
package FIVE;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedPaneDemo {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Tabbed Pane Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each tab
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        // Set background colors
        redPanel.setBackground(Color.RED);
        bluePanel.setBackground(Color.BLUE);
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add ChangeListener to detect tab change
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(index);

                // Display in console
                System.out.println(title + " tab is selected");
            }
        });

        // Add tabbed pane to frame
        frame.add(tabbedPane);

        // Make frame visible
        frame.setVisible(true);
    }
}