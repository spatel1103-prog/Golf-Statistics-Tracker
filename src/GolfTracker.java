import java.util.ArrayList;

public class GolfTracker {

    private ArrayList<GolfRound> rounds;


    public GolfTracker ( ) {
        rounds = new ArrayList<GolfRound> ();
    }

    public void addRound ( GolfRound round ) {

        rounds.add(round);
        System.out.println("Round added successfully.");

    }

    public void displayRounds () {

        int i = 1;

        for ( GolfRound round : rounds ) {
            System.out.println( "Round #" + i + ":");
            System.out.println(round);
            System.out.println();
            i ++;
        }
    }

    private void ensureRoundsExist() {
        if ( rounds.isEmpty() ) {
            throw new IllegalStateException("No rounds played");
        }
    }

    public int getNumRoundsPlayed() {
        return rounds.size();
    }

    public int getBestRound () {

        ensureRoundsExist();

        int min = rounds.get(0).getScore();

        for ( int i = 0; i < rounds.size(); i ++ ) {

            if ( rounds.get(i).getScore() < min ) {
                min = rounds.get(i).getScore();
            }

        }

        return min;
    }

    public double getAverageScore () {

        ensureRoundsExist();

        int total = 0;

        for ( GolfRound round : rounds ) {
            total += round.getScore();
        }

        return (double) total / getNumRoundsPlayed();

    }

    public int getWorstRound () {

        ensureRoundsExist();

        int max = rounds.get(0).getScore();

        for ( GolfRound round : rounds ) {

            if ( round.getScore() > max ) {
                max = round.getScore();
            }

        }

        return max;
    }

    public double getAveragePutts () {

        ensureRoundsExist();

        int total = 0;

        for ( GolfRound round : rounds ) {
            total += round.getPutts();
        }

        return (double) total / getNumRoundsPlayed();

    }

    public double getAverageGIR () {

        ensureRoundsExist();

        int total = 0;

        for ( GolfRound round : rounds ) {
            total += round.getGreensInRegulation();
        }

        return (double) total / getNumRoundsPlayed();

    }

    public double getAveragePenaltyStrokes () {

        ensureRoundsExist();

        int total = 0;

        for ( GolfRound round : rounds ) {
            total += round.getPenaltyStrokes();
        }

        return (double) total / getNumRoundsPlayed();

    }

    public double getAverageFairwaysHit () {

        ensureRoundsExist();

        int total = 0;

        for ( GolfRound round : rounds ) {
            total += round.getFairwaysHit();
        }

        return (double) total / getNumRoundsPlayed();

    }

    public ArrayList<GolfRound> getRoundsList() {
        return rounds;
    }

    public void deleteRound ( int index ) {

        ensureRoundsExist();
        if ( index < 1 || index > rounds.size() ) {
            System.out.println("Invalid round number.");
            return;
        }

        rounds.remove(index-1);

        System.out.println("Round deleted successfully.");
    }


    public void searchByCourse ( String courseName ) {

        int num = 0;

        for ( int i = 0; i < rounds.size(); i ++ ) {

            String name = rounds.get(i).getCourseName();

            if ( name.equalsIgnoreCase(courseName) ) {

                System.out.println ( "Round #" + i+1 + "; \n" );
                System.out.println( rounds.get(i) ) ;
                num ++;
            }
        }

        if ( num == 0 ) {
            System.out.println("No rounds for that course.\n");
        }
    }

    public GolfRound getLatestRound () {
        return rounds.getLast();
    }

}
