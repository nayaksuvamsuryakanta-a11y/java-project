import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jdemo extends JFrame implements ActionListener {
    // Declare components
    private JPanel panel;
    private JLabel userLabel, passwordLabel, message;
    private JTextField userNameText;
    private JPasswordField passwordText;
    private JButton submitButton;

    public jdemo() {
        // Set up the JFrame (main window)
        setTitle("Please Login Here !");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Use a panel with GridLayout for organization (e.g., 3 rows, 1 column)
        panel = new JPanel(new GridLayout(3, 1));
        
        // 1. Create labels and text fields
        userLabel = new JLabel("User Name :");
        userNameText = new JTextField();
        passwordLabel = new JLabel("Password :");
        passwordText = new JPasswordField();
        message = new JLabel();

        // 2. Create the submit button and add an Action Listener
        submitButton = new JButton("SUBMIT");
        submitButton.addActionListener(this); // 'this' refers to the current class implementing ActionListener

        // 3. Add components to the panel (labels and input fields are added in pairs)
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        inputPanel.add(userLabel);
        inputPanel.add(userNameText);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordText);

        // Add the input panel, button panel, and message label to the main panel
        panel.add(inputPanel);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        panel.add(buttonPanel);
        panel.add(message);
        
        // Add the main panel to the frame and make it visible
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    // Handle button action
    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = userNameText.getText();
        String password = new String(passwordText.getPassword());

        // Simple validation logic (e.g., check against hardcoded values)
        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
            message.setText(" Hello " + userName + "");
        } else {
            message.setText(" Invalid user.. ");
        }
    }

    public static void main(String[] args) {
        // Run the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new jdemo(); // Create and show the form
            }
        });
    }
}
