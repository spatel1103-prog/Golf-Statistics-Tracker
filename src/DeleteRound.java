import javax.swing.*;
import java.io.FileNotFoundException;
public class DeleteRound {

    protected JPanel mainPanel;
    private JLabel numberDeleteLabel;
    private JTextField numberDeleteTextField;
    private JButton deleteRoundButton;

    public DeleteRound (GolfTracker tracker) {


        deleteRoundButton.addActionListener( e -> {

            String roundNum = numberDeleteTextField.getText();

            try {
                int roundNumberInt = Integer.parseInt(roundNum);

                if (roundNumberInt < 1 ||
                        roundNumberInt > tracker.getNumRoundsPlayed()) {

                    JOptionPane.showMessageDialog(
                            mainPanel,
                            "Invalid round number."
                    );

                    numberDeleteTextField.setText("");
                    return;
                }

                tracker.deleteRound ( roundNumberInt );

                try {
                    FileManager.saveRounds(tracker);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(
                            mainPanel,
                            "Error saving rounds."
                    );
                    return;
                }

                JOptionPane.showMessageDialog(
                        mainPanel,
                        "Round deleted successfully!"
                );
                numberDeleteTextField.setText("");

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        mainPanel,
                        "Please enter a valid round number."
                );
                numberDeleteTextField.setText("");


            }


        });


    }
}
