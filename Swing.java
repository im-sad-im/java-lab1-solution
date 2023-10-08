import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// import javax.swing.JFrame;
// import javax.swing.JLabel;

public class Swing extends JFrame implements ActionListener {
    private JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b1, b2;

    public Swing() {
        super("Handling Action Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("First value");
        l2 = new JLabel("Second value");
        l3 = new JLabel(" Result");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        setVisible(true);
        setSize(400, 300);
    }

    public void actionPerformed(ActionEvent ae) {
        int x, y, z;
        x = Integer.parseInt(t1.getText());
        y = Integer.parseInt(t2.getText());
        if (ae.getActionCommand() == "Add")
            z = x + y;
        else 
            z = x - y;
        t3.setText(String.valueOf(z));
    }
    // main method
    public static void main(String[] args) {
        new Swing();
    }
}