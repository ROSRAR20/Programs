import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField num1Field, num2Field, resultField;
    Button addButton, subtractButton, multiplyButton, divideButton, modulusButton, exponentButton, clearButton;

    public Calculator() {
        // Frame properties
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        setSize(400, 400);
        setTitle("Simple AWT Calculator with Exponentiation");

        // Labels and text fields
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // First number
        gbc.gridx = 0; gbc.gridy = 0;
        add(new Label("First Number:"), gbc);
        gbc.gridx = 1;
        num1Field = new TextField(5);
        add(num1Field, gbc);

        // Second number
        gbc.gridx = 0; gbc.gridy = 1;
        add(new Label("Second Number:"), gbc);
        gbc.gridx = 1;
        num2Field = new TextField(5);
        add(num2Field, gbc);

        // Result field
        gbc.gridx = 0; gbc.gridy = 2;
        add(new Label("Result:"), gbc);
        gbc.gridx = 1;
        resultField = new TextField(5);
        resultField.setEditable(false);
        add(resultField, gbc);

        // Buttons for operations
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(2, 3, 5, 5)); // 2 rows, 3 columns

        addButton = new Button("+");
        subtractButton = new Button("-");
        multiplyButton = new Button("*");
        divideButton = new Button("/");
        modulusButton = new Button("%");
        exponentButton = new Button("^");
        clearButton = new Button("Clear");

        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(modulusButton);
        buttonPanel.add(exponentButton);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 20;
        add(buttonPanel, gbc);

        // Clear button in the next line
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        add(clearButton, gbc);

        // Add action listeners
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        modulusButton.addActionListener(this);
        exponentButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Frame settings
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
            } else if (e.getSource() == multiplyButton) {
                result = num1 * num2;
            } else if (e.getSource() == divideButton) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultField.setText("Cannot divide by zero");
                    return;
                }
            } else if (e.getSource() == modulusButton) {
                result = num1 % num2;
            } else if (e.getSource() == exponentButton) {
                result = Math.pow(num1, num2);
            } else if (e.getSource() == clearButton) {
                num1Field.setText("");
                num2Field.setText("");
                resultField.setText("");
                return;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
