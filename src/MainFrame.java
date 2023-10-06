import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField middleNameField;
    private JTextField knowledgeField;
    private JTextField numberPhoneField;
    private JTextField gmailField;
    private JTextField priceField;
    private JButton orderButton;

    public MainFrame() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Order Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 2, 10, 10));

        JLabel[] labels = {
                new JLabel("First Name:"),
                new JLabel("Last Name:"),
                new JLabel("Middle Name:"),
                new JLabel("Knowledge:"),
                new JLabel("Phone Number:"),
                new JLabel("Email:"),
                new JLabel("Price:")
        };

        JTextField[] textFields = {
                firstNameField = new JTextField(),
                lastNameField = new JTextField(),
                middleNameField = new JTextField(),
                knowledgeField = new JTextField(),
                numberPhoneField = new JTextField(),
                gmailField = new JTextField(),
                priceField = new JTextField()
        };

        orderButton = new JButton("Place Order");
        orderButton.addActionListener(this);

        for (int i = 0; i < labels.length; i++) {
            add(labels[i]);
            add(textFields[i]);
        }

        add(new JLabel());
        add(orderButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == orderButton) {
            try {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String middleName = middleNameField.getText();
                String knowledge = knowledgeField.getText();
                long numberPhone = Long.parseLong(numberPhoneField.getText());
                String gmail = gmailField.getText();
                float price = Float.parseFloat(priceField.getText());

                Order order = new Order(firstName, lastName, middleName, knowledge, numberPhone, gmail);
                order.setPrice(price);

                JOptionPane.showMessageDialog(this, "Order placed successfully!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please check the fields.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}


