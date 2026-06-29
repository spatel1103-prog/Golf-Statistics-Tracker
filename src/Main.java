public class Main {

    public static void main (String [] args ) {

        GolfTracker tracker = new GolfTracker();

        tracker.addRound(new GolfRound(
                "Applebrook",
                "Jun 28",
                82,
                31,
                8,
                10,
                1));

        tracker.addRound(new GolfRound(
                "Merion",
                "Jul 5",
                79,
                29,
                10,
                12,
                0));

        tracker.addRound(new GolfRound(
                "Aronimink",
                "Jul 12",
                85,
                33,
                7,
                8,
                2));

        tracker.displayRounds();



    }



}
