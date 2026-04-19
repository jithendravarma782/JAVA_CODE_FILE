/*5d. Develop a Swing program in Java to create a Tabbed 
 * Pan of Cyan, Magenta and Yellow and display the concerned 
 * color whenever the specific tab is selected in the Pan*/
package FIVE;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPaneDemo {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Color Tabbed Pane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        // Set background colors
        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Event handling
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();
                String tabName = tabbedPane.getTitleAt(index);

                // Display in console
                System.out.println(tabName + " tab is selected");
            }
        });

        // Add to frame
        frame.add(tabbedPane);

        // Make visible
        frame.setVisible(true);
    }
}