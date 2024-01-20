package checkbox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {

    JCheckBox cbMyCheckbox;
    JButton btnMyButton;

    Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        btnMyButton = new JButton("Submit");
        btnMyButton.addActionListener(this);

        cbMyCheckbox = new JCheckBox("Some Label for the Checkbox");
        cbMyCheckbox.setFocusable(false);

        add(cbMyCheckbox);
        add(btnMyButton);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMyButton) {
            /*
             * isSelected(): will return boolean value.
             * true: the checkbox is selected.
             * false: the checkbox is not selected.
             */
            if (cbMyCheckbox.isSelected()) {
                System.out.println("Checkbox is selected.");
            } else {
                System.out.println("Checkbox isn't selected.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }

}