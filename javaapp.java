import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaapp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello World");

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create JButton
        JButton button = new JButton("Click Me");
        button.setBounds(80, 60, 120, 40);

        // Action Listener
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "Hello");
            }
        });

        // Add button
        frame.add(button);

        // Make frame visible
        frame.setVisible(true);
    }
}