/*
 * This is the basic source code for making your own frame.
 * Notes are added on each part of the source code.
 */

// These are the necessary imports to make a fully functional GUI.
// import java.awt.*; <- This is necessary,
//                     - I just commented it out because,
//                     - it is not currently used in the frame
//                     - it throws a yellow warning which throws me off.
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {

    /*
     * This space is for the field declarations.
     * This area will contain most of the GUI components.
     */

    public Main() {
        super("<Frame Title>");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         // Closes the frame when "X" is clicked.
        setResizable(false);                                    // Unables the user to resize the frame.
        setSize(800, 800);                                      // Size your frame to your liking.
        setLocationRelativeTo(null);                            // Makes the frame spawn at the center of the screen.
        setLayout(null);                                        // [1] Param: null if you will use setBounds()...
                                                                // [2] Param: new FlowLayout() for a beginner-friendly layout.

        /*
         * Don't forget to add your components,
         * using the add() method!
         */

        pack();                                                 // Use this IF AND ONLY IF you're using FlowLayout().
        setVisible(true);                                       // Positioned at the end of the constructor...
                                                                // to ensure that all components are added.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
         * Abstract method from ActionListener interface.
         * This is mostly for buttons.
         */
    }

    public static void main(String[] args) {
        /*
         * This is the necessary code to avoid threading issues.
         * This is better than just simply instantiating the frame.
         */
        SwingUtilities.invokeLater(() -> new Main());
    }

}