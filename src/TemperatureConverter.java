import javax.swing.*;

public class TemperatureConverter {
    public static <err> void main(String[] args){
        //declaring variables
        final double celsius_to_fahrenheit = (double)9/5;
        final double fahrenheit_to_celsius = (double)5/9;

        boolean programRunner = true;

        //initiallizing the while loop
        while (programRunner){
            int decisionOutput = JOptionPane.showConfirmDialog(
                    null ,
                    "Do you want to convert from F to C?\n\nYes to confirm, No to convert from C to F and Cancel to 'exit'" ,
                    "Converter",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );
            //Selection
            if(JOptionPane.YES_OPTION == decisionOutput){
                //formating the string to double
                double userTemp = Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        "Enter temperature in Fahrenheit:"
                        ));
                try{
                    // converting to celsius and formarting the results to 2 decimal
                    double showNewTemp =  fahrenheit_to_celsius*(userTemp - 32);
                    JOptionPane.showMessageDialog(
                            null,
                            String.format("The Temperature in Celsius is: %.2f C" , userTemp),
                            "Results",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    System.out.println("Hello Yes " + showNewTemp);

                    break;
                }
                catch ( NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                            null ,
                            "Please enter only numbers",
                            "Errro",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
            else if(JOptionPane.NO_OPTION == decisionOutput){
                //formating the string to double
                double userTemp = Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        "Enter temperature in Celsius"
                ));
                try{

                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(
                            null,
                            "Please enter correct charecters",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
//              //converting to Fahrenheit
                double showNewTemp = (celsius_to_fahrenheit*userTemp) + 32;
                JOptionPane.showMessageDialog(
                        null,
                        String.format("The Temperature in Celsius is: %.2f C" , showNewTemp),
                        "Results",
                        JOptionPane.INFORMATION_MESSAGE
                );
                System.out.println("Hello No " + showNewTemp);
                break;
            }
            else if(JOptionPane.CANCEL_OPTION == decisionOutput){
                JOptionPane.showMessageDialog(
                        null,
                        "Thank for using our Temperatures Converter.\n\nBye"
                );
                break;
            }
            else{
                JOptionPane.showMessageDialog(
                        null,
                        "Error Occured Please try again.");
                break;
            }
        }

    }
}
