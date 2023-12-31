import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutManager extends JFrame {

    private JTextField textField1, textField2;
    private JButton button;

    public LayoutManager() {
        // Set up the JFrame
        setTitle("Layout Manager");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        button = new JButton("Add Numbers");

        // Use FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JLabel("Number 1:"));
        flowPanel.add(textField1);
        flowPanel.add(new JLabel("Number 2:"));
        flowPanel.add(textField2);
        flowPanel.add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumbers();
            }
        });

        // Use BorderLayout for overall layout
        setLayout(new BorderLayout());
        add(flowPanel, BorderLayout.NORTH);
        // Use GridLayout for the result display
        JPanel gridPanel = new JPanel(new GridLayout(1, 1));
        gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(gridPanel, BorderLayout.CENTER);
        // Make the frame visible
        setVisible(true);
    }

    private void addNumbers() {
        try {
            // Get the numbers from text fields
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            // Perform the addition
            int result = num1 + num2;
            // Display the result in a JOptionPane
            JOptionPane.showMessageDialog(this, "Sum: " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            // Handle the case where input is not a valid number
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LayoutManager();
            }
        });
    }
}
