import java.awt.*;
import java.awt.event.*;

public class BMICalculator extends Frame implements ActionListener {
    Label lblHeight, lblWeight, lblResult, lblCategory, lblGender;
    TextField txtHeight, txtWeight, txtResult, txtCategory;
    Choice genderChoice;
    Button btnCalculate, btnClear;

    public BMICalculator() {
        // Setting up the Frame
        setTitle("BMI Calculator");
        setSize(400, 350);
        setLayout(new FlowLayout());
        setResizable(false);

        // Initialize components
        lblGender = new Label("Gender:");
        genderChoice = new Choice();
        genderChoice.add("Male");
        genderChoice.add("Female");

        lblHeight = new Label("Height (m):");
        txtHeight = new TextField(10);

        lblWeight = new Label("Weight (kg):");
        txtWeight = new TextField(10);

        btnCalculate = new Button("Calculate BMI");
        btnClear = new Button("Clear");

        lblResult = new Label("BMI:");
        txtResult = new TextField(15);
        txtResult.setEditable(false); // Make result field non-editable

        lblCategory = new Label("Category:");
        txtCategory = new TextField(15);
        txtCategory.setEditable(false); // Make category field non-editable

        // Add components to the Frame
        add(lblGender);
        add(genderChoice);
        add(lblHeight);
        add(txtHeight);
        add(lblWeight);
        add(txtWeight);
        add(btnCalculate);
        add(btnClear);
        add(lblResult);
        add(txtResult);
        add(lblCategory);
        add(txtCategory);

        // Register listeners for the buttons
        btnCalculate.addActionListener(this);
        btnClear.addActionListener(this);

        // Window close action
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Event handling for button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            try {
                double height = Double.parseDouble(txtHeight.getText());
                double weight = Double.parseDouble(txtWeight.getText());
                String gender = genderChoice.getSelectedItem();

                // Calculate BMI
                double bmi = weight / (height * height);

                // Display BMI result
                txtResult.setText(String.format("%.2f", bmi));

                // Determine the category
                String category;
                if (bmi < 18.5) {
                    category = "Underweight";
                } else if (bmi >= 18.5 && bmi < 24.9) {
                    category = "Healthy";
                } else if (bmi >= 25 && bmi < 29.9) {
                    category = "Overweight";
                } else {
                    category = "Obese";
                }

                // Include gender information in the category display
                txtCategory.setText(gender + ": " + category);
            } catch (NumberFormatException ex) {
                txtResult.setText("Invalid input");
                txtCategory.setText("");
            }
        } else if (e.getSource() == btnClear) {
            // Clear all fields
            txtHeight.setText("");
            txtWeight.setText("");
            txtResult.setText("");
            txtCategory.setText("");
            genderChoice.select(0); // Reset gender to the first option (Male)
        }
    }

    public static void main(String[] args) {
        BMICalculator frame = new BMICalculator();
        frame.setVisible(true);
    }
}