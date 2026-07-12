import javax.swing.*;

public class ViewStatistics {

    protected JPanel mainPanel;
    private JTextArea viewStatsTextArea;

    public ViewStatistics (GolfTracker tracker ) {

        viewStatsTextArea.append ("Rounds Played: " + tracker.getNumRoundsPlayed());
        viewStatsTextArea.append ("\nBest Round: " + tracker.getBestRound());
        viewStatsTextArea.append ("\nAverage Score: " + tracker.getAverageScore());
        viewStatsTextArea.append ("\nWorst Round: " + tracker.getWorstRound());
        viewStatsTextArea.append ("\nAverage Putts: " + tracker.getAveragePutts());
        viewStatsTextArea.append ("\nAverage Greens In Regulation: " + tracker.getAverageGIR());
        viewStatsTextArea.append ("\nAverage Penalty Strokes: " + tracker.getAveragePenaltyStrokes());
        viewStatsTextArea.append ("\nAverage Fairways Hit: " + tracker.getAverageFairwaysHit());


    }
}
