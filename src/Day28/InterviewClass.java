package Day28;

public class InterviewClass {
    private String name;
    private int score;
    private boolean finaldec;
    private int Javapoint;
    private int SQL;
    private int softpoint;

    public InterviewClass(String name, int score, boolean finaldec, int javapoint, int SQL, int softpoint) {
        this.name = name;
        this.score = 0;
        this.finaldec =finaldec;
        Javapoint = javapoint;
        this.SQL = SQL;
        this.softpoint = softpoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean getFinaldec() {
        return finaldec;
    }

    public void setFinaldec(boolean finaldec) {
        this.finaldec = finaldec;
    }

    public int getJavapoint() {
        return Javapoint;
    }

    public void setJavapoint(int javapoint) {
        Javapoint = javapoint;
    }

    public int getSQL() {
        return SQL;
    }

    public void setSQL(int SQL) {
        this.SQL = SQL;
    }

    public int getSoftpoint() {
        return softpoint;
    }

    public void setSoftpoint(int softpoint) {
        this.softpoint = softpoint;
    }

    @Override
    public String toString() {
        return "InterviewClass{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", finaldec='" + finaldec + '\'' +
                ", Javapoint=" + Javapoint +
                ", SQL=" + SQL +
                ", softpoint=" + softpoint +
                '}';
    }

    public int calculateScore() {
        this.score = this.Javapoint + this.SQL + this.softpoint;
        System.out.println("The score is"+this.score);

        return this.score;

    }

    public void returndecision(){

        if(this.score>=90){
            System.out.println("You pass the interview");
        }else{
            System.out.println("FAILURE");
        }

    }
}
