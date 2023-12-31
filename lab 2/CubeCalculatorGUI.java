import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CubeCalculatorGUI extends JFrame {

    private JTextField inputTextField;
    private JLabel resultLabel;

    public CubeCalculatorGUI() {
        // Set up the JFrame
        setTitle("Cube Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        inputTextField = new JTextField();
        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Cube will be displayed here");

        // Set layout manager
        setLayout(new GridLayout(3, 1));

        // Add components to the frame
        add(inputTextField);
        add(calculateButton);
        add(resultLabel);

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateCube();
            }
        });
    }

    private void calculateCube() {
        try {
            // Get the input text from the text field
            String inputText = inputTextField.getText();
            // Parse the input text to a double
            double number = Double.parseDouble(inputText);
            // Calculate the cube
            double cube = Math.pow(number, 3);
            // Display the result in the label
            resultLabel.setText("Cube of " + number + " is: " + cube);
        } catch (NumberFormatException ex) {
            // Handle the case where input is not a valid number
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CubeCalculatorGUI().setVisible(true);
            }
        });
    }
}
