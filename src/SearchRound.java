import javax.swing.*;

public class SearchRound {
    protected JPanel mainPanel;
    private JLabel courseNameLabel;
    private JTextField courseNameTextField;
    private JButton searchButton;
    private JTextArea resultsTextArea;


    public SearchRound ( GolfTracker tracker ) {

        searchButton.addActionListener( e -> {

            String courseName = courseNameTextField.getText();
            resultsTextArea.setText("");

            boolean found = false;

            for (GolfRound round : tracker.getRoundsList()) {

                if (round.getCourseName().equalsIgnoreCase(courseName)) {
                    resultsTextArea.append(round.toString());
                    resultsTextArea.append("\n");
                    found = true;
                }

            }

            if (!found) {
                resultsTextArea.setText("No rounds found for that course.");
            }

        });



    }
}
