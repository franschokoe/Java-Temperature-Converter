import javax.swing.*;

public class TemperatureConverter {
    public static void main(String[] args){
        //declaring variables
        final double celsius_to_fahrenheit = (double)9/5;
        final double fahrenheit_to_celsius = (double)5/9;
        boolean programRunner = true;

        //initiallizing the while loop
        while (programRunner){
            int decisionOutput = JOptionPane.showConfirmDialog(
                    null ,
                    "Do you want to convert from F to C?\nYes to confirm, No to convert from C to F and Cancel to 'exit'" ,
                    "Converter",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );
            int Yes = JOptionPane.YES_OPTION;
            int No = JOptionPane.NO_OPTION;

            //Selection
            if(JOptionPane.YES_OPTION == Yes){
                double userTemp = Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        "Enter your temperature in Fahrenheit:"
                        ));

                System.out.println("Hello Yes" + userTemp);

                programRunner = false;
            }
            else if (JOptionPane.NO_OPTION == No) {
                double userTemp = Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        "Enter your temperature in Celsius:"

                ));
                System.out.println("Hello No..");
            }
        }

    }
}
