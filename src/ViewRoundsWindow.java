import javax.swing.*;

public class ViewRoundsWindow {
    protected JPanel mainPanel;
    private JTextArea roundsTextArea;


    public ViewRoundsWindow ( GolfTracker tracker ) {

        int i = 1;
        for ( GolfRound round : tracker.getRoundsList() ) {

            roundsTextArea.append("Round #" + i +  ": \n" );
            roundsTextArea.append(round.toString());
            roundsTextArea.append("\n");

        }



    }
}
