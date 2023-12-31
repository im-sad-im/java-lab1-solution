import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNumbersApplet extends Applet implements ActionListener {
    private TextField num1Field, num2Field;
    private Button addButton;
    private Label resultLabel;

    public void init() {
        // Create components
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        addButton = new Button("Add");
        resultLabel = new Label("Result will be displayed here");

        // Add components to the applet
        add(new Label("Number 1:"));
        add(num1Field);
        add(new Label("Number 2:"));
        add(num2Field);
        add(addButton);
        add(resultLabel);

        // Register the ActionListener
        addButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the numbers from text fields
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            // Calculate the sum
            int sum = num1 + num2;

            // Display the result
            resultLabel.setText("Sum: " + sum);
        } catch (NumberFormatException ex) {
            // Handle the case where input is not a valid number
            resultLabel.setText("Invalid input. Please enter valid numbers.");
        }
    }
}
