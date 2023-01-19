import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackValueCalculator {
    private static String calculatePullValue() {
        String returnMessage = "";
        // Move along field input flow unless user cancels calculation part-way through.
        try {
            BigDecimal price = PackFieldInputs.inputCostField();
            int OP = PackFieldInputs.inputOPField();
            int orundum = PackFieldInputs.inputOrundumField();
            int tenRolls = PackFieldInputs.inputTenRollHeadhuntingField();
            int singleRolls = PackFieldInputs.inputSingleRollHeadhuntingField();

            // Conversions and formula to calculate the value of the pack in $USD per roll.
            int OPConvertedToOrundum = OP * 180;
            int cumulativeOrundum = OPConvertedToOrundum + orundum;
            double totalRolls = (cumulativeOrundum / 600) + (10 * tenRolls) + singleRolls;
            BigDecimal costPerRoll = price.divide(BigDecimal.valueOf(totalRolls), 3, RoundingMode.HALF_UP);

            returnMessage = String.format("The value of this pack in cost per roll is $%s per roll, with a total of %,.2f rolls included in this pack.", costPerRoll.toString(), totalRolls);
        }
        catch (NullPointerException e) {
            returnMessage = "Calculation cancelled.";
        }
        return returnMessage;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello! This is a basic value calculator for Arknights store packs and Originium\npacks to determine the approximate value in $USD per roll.\n\nBe aware that the calculated values only consider gacha potential! It does NOT\naccount for additional resources such as LMD, chips, battle records, etc. that\nmay be included in the pack.\n\nHappy Whaling!\n\n-Dokutah");
        String value = calculatePullValue();

        JOptionPane.showMessageDialog(null, value);
    }
}