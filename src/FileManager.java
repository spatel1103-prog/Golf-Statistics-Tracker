import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManager {

    public static void saveRounds ( GolfTracker tracker ) throws FileNotFoundException {

        PrintWriter writer = new PrintWriter ( new File ("rounds.txt" ) );

        for ( GolfRound round : tracker.getRoundsList() ) {

            writer.println (

                    round.getCourseName() + "," +
                    round.getDate() + "," +
                    round.getScore() + "," +
                    round.getPutts() + "," +
                    round.getFairwaysHit() + "," +
                    round.getGreensInRegulation() + "," +
                    round.getPenaltyStrokes()
            );
        }

        writer.close();
    }


    public static GolfTracker loadRounds () throws FileNotFoundException {

        GolfTracker tracker = new GolfTracker ();

        File file = new File ("rounds.txt");

        if ( !file.exists() ) {
            return tracker;
        }

        Scanner scanner = new Scanner ( file );

        while ( scanner.hasNextLine() ) {
            String line = scanner.nextLine();

            String [] parts = line.split(",");

            tracker.addRound( new GolfRound (
                    parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6])
            ));
        }

        scanner.close();

        return tracker;
    }


}
