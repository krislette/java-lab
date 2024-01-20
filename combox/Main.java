package combox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener{

    JComboBox<String> cbDropdown;
    String[] arrAnimals = {"Dog", 
                           "Cat", 
                           "Bird"};;

    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        cbDropdown = new JComboBox<String>(arrAnimals);
        cbDropdown.addActionListener(this);

        // Additional methods for combo boxes (dropdown).
        cbDropdown.setEditable(true);           // You can type the specific dropdown value you want to choose.
        cbDropdown.getItemCount();              // Retrieves the number of choices inside the dropdown.
        cbDropdown.addItem("Horse");            // Adds a choice to the dropdown.
        cbDropdown.insertItemAt("Pig", 0);      // Adds a chocie to the dropdown, at a specified index.
        cbDropdown.setSelectedIndex(0);         // Sets the default choice to be displayed on the dropdown.
        cbDropdown.removeItem("Cat");           // Removes a choice from the dropdown menu.
        cbDropdown.removeItemAt(0);             // Removes a choice from the dropdown menu... at a certain index.
        // cbDropdown.removeAll()               // Removes all items inside the combo box.

        add(cbDropdown);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cbDropdown) {
            /*
             * getSelectedItem() method retrieves the specific...
             * dropdown value that is selected by the user.
             */
            String strSelectedItem = (String) cbDropdown.getSelectedItem();

            if (strSelectedItem.equals("Dog")) System.out.println("Dog is selected.");
            if (strSelectedItem.equals("Cat")) System.out.println("Cat is selected.");
            if (strSelectedItem.equals("Bird")) System.out.println("Bird is selected.");

            // Returns the specifix index of the selected dropdown.
            int intSelectedIndex = cbDropdown.getSelectedIndex();
            System.out.println(intSelectedIndex);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }

}