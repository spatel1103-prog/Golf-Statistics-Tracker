import javax.swing.*;

public class MainWindow {
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JButton addRoundButton;
    private JButton viewRoundsButton;
    private JButton viewStatisticsButton;
    private JButton deleteRoundButton;
    private JButton searchRoundByCourseButton;
    private GolfTracker tracker;

    public MainWindow () {

        tracker = new GolfTracker();
        addRoundButton.addActionListener(e -> {

            JFrame frame = new JFrame("Add Round");
            frame.setContentPane(new AddRoundWindow(tracker).mainPanel);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        });


        viewRoundsButton.addActionListener( e -> {

            if (tracker.getNumRoundsPlayed() == 0) {
                JOptionPane.showMessageDialog(
                        mainPanel,
                        "No rounds have been added yet."
                );
                return;
            }
            JFrame frame = new JFrame("View Rounds");
            frame.setContentPane(new ViewRoundsWindow(tracker).mainPanel);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);


        });

        viewStatisticsButton.addActionListener( e -> {

            if (tracker.getNumRoundsPlayed() == 0) {
                JOptionPane.showMessageDialog(
                        mainPanel,
                        "No rounds have been added yet."
                );
                return;
            }

            JFrame frame = new JFrame("View Statistics");
            frame.setContentPane(new ViewStatistics(tracker).mainPanel);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        });

        deleteRoundButton.addActionListener( e -> {

            if (tracker.getNumRoundsPlayed() == 0) {
                JOptionPane.showMessageDialog(
                        mainPanel,
                        "No rounds have been added yet."
                );
                return;
            }

            JFrame frame = new JFrame("Delete Round");
            frame.setContentPane(new DeleteRound(tracker).mainPanel);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        });

        searchRoundByCourseButton.addActionListener( e -> {

            if (tracker.getNumRoundsPlayed() == 0) {
                JOptionPane.showMessageDialog(
                        mainPanel,
                        "No rounds have been added yet."
                );
                return;
            }

            JFrame frame = new JFrame("Search Round by Course");
            frame.setContentPane(new SearchRound(tracker).mainPanel);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);


        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Golf Statistics Tracker");
        frame.setContentPane(new MainWindow().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
