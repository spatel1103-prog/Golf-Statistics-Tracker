public class GolfRound {

    private String courseName;
    private String date;
    private int score;
    private int putts;
    private int fairwaysHit;
    private int greensInRegulation;
    private int penaltyStrokes;

    public GolfRound ( String courseName, String date, int score, int putts, int fairwaysHit, int greensInRegulation, int penaltyStrokes ) {
        this.courseName = courseName;
        this.date = date;
        this.score = score;
        this.putts = putts;
        this.fairwaysHit = fairwaysHit;
        this.greensInRegulation = greensInRegulation;
        this.penaltyStrokes = penaltyStrokes;
    }

    public String getCourseName () {
        return courseName;
    }

    public String getDate () {
        return date;
    }

    public int getScore () {
        return score;
    }

    public int getPutts () {
        return putts;
    }

    public int getFairwaysHit () {
        return fairwaysHit;
    }

    public int getGreensInRegulation() {
        return greensInRegulation;
    }

    public int getPenaltyStrokes () {
        return penaltyStrokes;
    }

    @Override
    public String toString () {

        return "Course Name: " + courseName + "\n" +
                "Date: " + date + "\n" +
                "Score: " + score + "\n" +
                "Putts: " + putts + "\n" +
                "Fairways Hit: " + fairwaysHit + "\n" +
                "Greens In Regulation: " + greensInRegulation + "\n" +
                "Penalty Strokes: " + penaltyStrokes + "\n";
    }


}
