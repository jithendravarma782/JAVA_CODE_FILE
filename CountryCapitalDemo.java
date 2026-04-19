/*5c. Develop a Swing program in Java to add the countries USA,
 *  India, Vietnam, Canada, Denmark, France, Great Britain, 
 *  Japan, Africa, Greenland, Singapore into a JList and display
 *   the capital of the countries on console whenever the 
 *   countries are selected on the list.*/
package FIVE;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalDemo {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Country - Capital List");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Country list
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Map to store country and capital
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "No single capital"); // continent
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList
        JList<String> list = new JList<>(countries);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    String country = list.getSelectedValue();

                    // Get and print capital
                    String capital = capitals.get(country);
                    System.out.println("Capital of " + country + " is " + capital);
                }
            }
        });

        // Add to scroll pane
        JScrollPane scrollPane = new JScrollPane(list);
        frame.add(scrollPane);

        // Show frame
        frame.setVisible(true);
    }
}