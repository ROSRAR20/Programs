import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d3_1 {

    public static void main(String[] args) {
        String filePath = "d3.txt"; // Replace with your file path
        int totalSum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalSum += processLine(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("The total sum of valid 'mul' instructions is: " + totalSum);
    }

    private static int processLine(String line) {
        int sum = 0;
        // Regex to match valid "mul(number,number)" instructions
        Pattern pattern = Pattern.compile("mul\\((\\d+),(\\d+)\\)");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            int operand1 = Integer.parseInt(matcher.group(1));
            int operand2 = Integer.parseInt(matcher.group(2));
            sum += operand1 * operand2;
        }
        return sum;
    }
}