/*5a. Develop a Swing program in Java to add the countries 
 * USA, India, Vietnam, Canada, Denmark, France, Great Britain, 
 * Japan, Africa, Greenland, Singapore into a JList and display 
 * them on console whenever the countries are selected on the list.*/
package FIVE;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Country List");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Country list data
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);

        // Set selection mode (single selection)
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add selection listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // Avoid duplicate events
                if (!e.getValueIsAdjusting()) {
                    String selected = list.getSelectedValue();

                    // Print to console
                    System.out.println(selected + " is selected");
                }
            }
        });

        // Add list to scroll pane
        JScrollPane scrollPane = new JScrollPane(list);

        // Add to frame
        frame.add(scrollPane);

        // Make visible
        frame.setVisible(true);
    }
}