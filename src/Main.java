import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        GolfTracker tracker = FileManager.loadRounds();

        while (true) {

            printMenu();
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    addRound(scanner, tracker);
                    FileManager.saveRounds(tracker);

                    break;

                case 2:
                    tracker.displayRounds();
                    break;

                case 3:
                    if (tracker.getNumRoundsPlayed() == 0) {
                        System.out.println("No rounds have been added yet.");
                        break;
                    }
                    printStats(tracker);
                    break;

                case 4:
                    System.out.print("Which round would you like to delete? ");
                    int delete = scanner.nextInt();

                    tracker.deleteRound(delete);
                    FileManager.saveRounds(tracker);

                    break;

                case 5:
                    System.out.print("Which course would you like to search: ");
                    scanner.nextLine();
                    String course = scanner.nextLine();
                    tracker.searchByCourse(course);

                    break;

                case 6:
                    performanceTrend(tracker);
                    break;

                case 7:
                    FileManager.saveRounds(tracker);
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
            }
        }
    }

    private static void printMenu() {

        System.out.println("==============================");
        System.out.println("   GOLF STATISTICS TRACKER");
        System.out.println("==============================");
        System.out.println("1. Add Round");
        System.out.println("2. View All Rounds");
        System.out.println("3. View Statistics");
        System.out.println("4. Delete Round");
        System.out.println("5. Search by Course");
        System.out.println("6. View Performance Trends");
        System.out.println("7. Save & Exit");

        System.out.print("\nChoose an option: ");
    }

    private static void printStats(GolfTracker tracker) {
        System.out.println("=========== STATISTICS ===========");
        System.out.println("Rounds Played: " + tracker.getNumRoundsPlayed());
        System.out.println("Best round: " + tracker.getBestRound());
        System.out.println("Average score: " + tracker.getAverageScore());
        System.out.println("Worst Round: " + tracker.getWorstRound());
        System.out.println("Average Putts: " + tracker.getAveragePutts());
        System.out.println("Average Greens in Regulation: " + tracker.getAverageGIR());
        System.out.println("Average Penalty Strokes: " + tracker.getAveragePenaltyStrokes());
        System.out.println("Average Fairways Hit: " + tracker.getAverageFairwaysHit());
        System.out.println("===================================");
    }

    private static void addRound(Scanner scanner, GolfTracker tracker) throws FileNotFoundException {


        System.out.print("Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Date: ");
        String date = scanner.nextLine();

        System.out.print("Score: ");
        int score = scanner.nextInt();

        System.out.print("Putts: ");
        int putts = scanner.nextInt();

        System.out.print("Fairways Hit: ");
        int fairwaysHit = scanner.nextInt();

        System.out.print("Greens in Regulation: ");
        int gir = scanner.nextInt();

        System.out.print("Penalty Strokes: ");
        int penaltyStrokes = scanner.nextInt();

        GolfRound round = new GolfRound(courseName, date, score, putts, fairwaysHit, gir, penaltyStrokes);

        tracker.addRound(round);

    }

    private static void performanceTrend(GolfTracker tracker) {

        if (tracker.getNumRoundsPlayed() == 0) {
            System.out.println("No rounds played.");
            return;
        }

        int first = tracker.getRoundsList().get(0).getScore();
        int last = tracker.getLatestRound().getScore() ;
        System.out.println("First round: " + first );
        System.out.println("Latest round: " + last );
        System.out.println("Improvement: " + (last - first) );
        System.out.println("Average score: " + tracker.getAverageScore() + "\n");
    }
}