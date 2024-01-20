package radio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {

    JRadioButton rbPizzaButton;
    JRadioButton rbHamburgerButton;
    JRadioButton rbHotdogButton;
    ButtonGroup bgFoodButtons;

    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        // Instantiate all RADIO buttons.
        rbPizzaButton = new JRadioButton("Pizza");
        rbHamburgerButton = new JRadioButton("Hamburger");
        rbHotdogButton = new JRadioButton("Hotdog");

        // Instantiate the button group and add all radio buttons.
        bgFoodButtons = new ButtonGroup();
        bgFoodButtons.add(rbPizzaButton);
        bgFoodButtons.add(rbHamburgerButton);
        bgFoodButtons.add(rbHotdogButton);

        rbPizzaButton.addActionListener(this);
        rbHamburgerButton.addActionListener(this);
        rbHotdogButton.addActionListener(this);

        // Don't forget all radio buttons to your frame!
        add(rbPizzaButton);
        add(rbHamburgerButton);
        add(rbHotdogButton);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
         * Note: Radio buttons act like your typical buttons.
         * Each time they are clicked, an action event is triggered.
         * So just put an action listener to your radio buttons and there you have it!
         */
        if (e.getSource() == rbPizzaButton) System.out.println("You get a pizza!");
        if (e.getSource() == rbHamburgerButton) System.out.println("You get a hamburger!");
        if (e.getSource() == rbHotdogButton) System.out.println("You get a hotdog!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }

}