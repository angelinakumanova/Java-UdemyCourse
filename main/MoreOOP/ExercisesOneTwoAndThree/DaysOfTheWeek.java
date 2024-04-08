package MoreOOP.ExercisesOneTwoAndThree;

public enum DaysOfTheWeek {
    Monday("spaghetti"),
    Tuesday("tacos"),
    Wednesday("chicken"),
    Thursday("meatloaf"),
    Friday("hamburgers"),
    Saturday("pizza"),
    Sunday("roast");

    private String food;
    DaysOfTheWeek(String food) {
        this.food = food;
    }

    public String getFood() {
        return this.food;
    }
}
