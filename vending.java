import java.awt.*;
import java.awt.event.*;

public class vending {
    public static void main(String[] args) {
        Frame frame = new Frame("Vending Machine");
        frame.setSize(500, 400);
        frame.setLayout(new FlowLayout());

        // Title Label
        Label titleLabel = new Label("Welcome to the Vending Machine!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(titleLabel);

        // Product Selection Label and Dropdown
        Label productLabel = new Label("Select Product:");
        Choice productChoice = new Choice();
        productChoice.add("Coke - 10");
        productChoice.add("Pepsi - 45");
        productChoice.add("Soda - 20");
        productChoice.add("Chips - 15");
        productChoice.add("Crackers - 40");
        productChoice.add("Cookies - 55");
        productChoice.add("Candy -  10");
        productChoice.add("Earphones - 700");
        productChoice.add("Books - 65");
        productChoice.add("Pens - 7");
        productChoice.add("Poha - 25");

        // Quantity Selection
        Label quantityLabel = new Label("Select Quantity:");
        Choice quantityChoice = new Choice();
        for (int i = 1; i <= 10; i++) {
            quantityChoice.add(String.valueOf(i));
        }

        // Display Area for Selected Item and Quantity
        Label outputLabel = new Label("Please select a product and quantity, then click 'Select'");
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        // Total Cost Label
        Label costLabel = new Label("Total Cost: rs 0.00");
        costLabel.setFont(new Font("Arial", Font.BOLD, 14));
        costLabel.setForeground(Color.BLUE);

        // Buttons for Selection and Cancel
        Button selectButton = new Button("Select");
        Button cancelButton = new Button("Cancel");

        // Action Listener for Select Button
        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedProduct = productChoice.getSelectedItem();
                int quantity = Integer.parseInt(quantityChoice.getSelectedItem());

                double price = 0.0;
                if (selectedProduct.contains("Coke")) price = 10;
                else if (selectedProduct.contains("Pepsi")) price = 45;
                else if (selectedProduct.contains("Soda")) price = 20;
                else if (selectedProduct.contains("Chips")) price = 15;
                else if (selectedProduct.contains("Crackers")) price = 40;
                else if (selectedProduct.contains("Cookies")) price = 55;
                else if (selectedProduct.contains("Candy")) price = 10;
                else if (selectedProduct.contains("Earphones")) price = 700;
                else if (selectedProduct.contains("Books")) price = 65;
                else if (selectedProduct.contains("Pens")) price = 7;
                else if (selectedProduct.contains("Poha")) price = 25;

                double totalCost = price * quantity;
                outputLabel.setText("Selected Product: " + selectedProduct + " | Quantity: " + quantity);
                costLabel.setText(String.format("Total Cost: rs%.2f", totalCost));
            }
        });

        // Action Listener for Cancel Button
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputLabel.setText("Selection canceled.");
                productChoice.select(0); // Reset to the first item
                quantityChoice.select(0); // Reset quantity to 1
                costLabel.setText("Total Cost: $0.00");
            }
        });

        // Adding Components to Frame
        frame.add(productLabel);
        frame.add(productChoice);
        frame.add(quantityLabel);
        frame.add(quantityChoice);
        frame.add(selectButton);
        frame.add(cancelButton);
        frame.add(outputLabel);
        frame.add(costLabel);

        // Close Button for Frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Make Frame Visible
        frame.setVisible(true);
    }
}