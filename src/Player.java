public class Player {
    private String name;
    private String position;
    private int number;
    private int goalCounter;
    private int matchCounter;


    Player(){
        this.setMatchCounter(0);
        this.setgoalCounter(0);
    }

    Playerr (String name){
        this.setName(name);
        this.setMatchCounter(0);
        this.setGoalCounter(0);

    }



    //NAME SETTER
    public void setName(String name){
        this.name = name;
        return;
    }

    //NAME GETTER
    public String getName() {
        return this.name;
    }
    //NAME GETTER
    public void setPosition(String position) {
        this.position = position;
        return;
    }

    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGoalCounter() {
        return goalCounter;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
    }

    public int getMatchCounter() {
        return matchCounter;
    }

    public void setMatchCounter(int matchCounter) {
        this.matchCounter = matchCounter;
    }
}