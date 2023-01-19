import javax.swing.JOptionPane;
import java.math.BigDecimal;

public class PackFieldInputs {
    protected static BigDecimal inputCostField() {
        BigDecimal cost = new BigDecimal(0);
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                cost = BigDecimal.valueOf(Double.parseDouble(JOptionPane.showInputDialog("Enter the cost of the pack in USD\n(exclude the currency symbol):")));
                isValidInput = true;
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "The value you entered is not valid, please try again.");
            }
        }
        return cost;
    }

    protected static int inputOPField() {
        int OP = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                String input = JOptionPane.showInputDialog("Enter the number of Originite Prime included \nin the pack as a whole number.\n\nIf none is included, you may leave this field blank:");
                if (input.isBlank()) {
                    System.out.println(input);
                    break;
                }
                OP = Integer.parseInt(input);
                isValidInput = true;
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "The value you entered is not valid, please try again.");
            }
        }
        return OP;
    }

    protected static int inputOrundumField() {
        int orundum = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                String input = JOptionPane.showInputDialog("Enter the number of orundum included in the pack as a whole number.\n\nIf none is included, you may leave this field blank:");
                if (input.isBlank()) {
                    break;
                }
                orundum = Integer.parseInt(input);
                isValidInput = true;
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "The value you entered is not valid, please try again.");
            }
        }
        return orundum;
    }

    protected static int inputTenRollHeadhuntingField() {
        int headhuntingPermits = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                String input = JOptionPane.showInputDialog("Enter the number of ten-roll Headhunting Permits included in\nthe pack as a whole number. This is the number of permits,\nNOT the number of individual rolls.\n\nIf none is included, you may leave this field blank:");
                if (input.isBlank()) {
                    break;
                }
                headhuntingPermits = Integer.parseInt(input);
                isValidInput = true;
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "The value you entered is not valid, please try again.");
            }
        }
        return headhuntingPermits;
    }

    protected static int inputSingleRollHeadhuntingField() {
        int headhuntingPermits = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                String input = JOptionPane.showInputDialog("Enter the number of single-roll Headhunting Permits included\nin the pack as a whole number.\n\nIf none is included, you may leave this field blank:");
                if (input.isBlank()) {
                    break;
                }
                headhuntingPermits = Integer.parseInt(input);
                isValidInput = true;
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "The value you entered is not valid, please try again.");
            }
        }
        return headhuntingPermits;
    }
}
