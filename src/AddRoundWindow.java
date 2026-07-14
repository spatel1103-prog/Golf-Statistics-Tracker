import javax.swing.*;
import java.io.FileNotFoundException;
public class AddRoundWindow {

    protected JPanel mainPanel;
    private JLabel courseNameLabel;
    private JLabel dateLabel;
    private JLabel scoreLabel;
    private JLabel puttsLabel;
    private JLabel fairwaysHitLabel;
    private JLabel greensInRegLabel;
    private JLabel penaltyStrokesLabel;
    private JTextField courseNameTextField;
    private JTextField dateTextField;
    private JTextField scoreTextField;
    private JTextField puttsTextField;
    private JTextField fairwaysHitTextField;
    private JTextField greensInRegTextField;
    private JTextField penaltyStrokesTextField;
    private JButton saveRoundButton;


    public AddRoundWindow( GolfTracker tracker ) {
        saveRoundButton.addActionListener(e -> {

            String courseName = courseNameTextField.getText();
            String date = dateTextField.getText();
            String score = scoreTextField.getText();
            String putts = puttsTextField.getText();
            String fairwaysHit = fairwaysHitTextField.getText();
            String greensInReg = greensInRegTextField.getText();
            String penaltyStrokes = penaltyStrokesTextField.getText();


            if ( courseName.isBlank() || date.isBlank() ) {
                JOptionPane.showMessageDialog(
                        mainPanel,
                        "Please enter a course name and date."
                );
                return;
            }

            try {

                int scoreNumber = Integer.parseInt(score);
                int puttsNumber = Integer.parseInt(putts);
                int fairwaysHitNumber = Integer.parseInt(fairwaysHit);
                int greensInRegNumber = Integer.parseInt(greensInReg);
                int penaltyStrokesNumber = Integer.parseInt(penaltyStrokes);


                if (scoreNumber < 0 ||
                        puttsNumber < 0 ||
                        fairwaysHitNumber < 0 ||
                        greensInRegNumber < 0 ||
                        penaltyStrokesNumber < 0) {

                    JOptionPane.showMessageDialog(
                            mainPanel,
                            "Statistics cannot be negative."
                    );

                    return;
                }

                GolfRound round = new GolfRound(
                        courseName,
                        date,
                        scoreNumber,
                        puttsNumber,
                        fairwaysHitNumber,
                        greensInRegNumber,
                        penaltyStrokesNumber
                );

                tracker.addRound(round);

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
                        "Round saved successfully!"
                );

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        mainPanel,
                        "Please enter valid numbers for all statistics."
                );

            }

            courseNameTextField.setText("");
            dateTextField.setText("");
            scoreTextField.setText("");
            puttsTextField.setText("");
            fairwaysHitTextField.setText("");
            greensInRegTextField.setText("");
            penaltyStrokesTextField.setText("");
        });

        }
    }
