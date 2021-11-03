package ro.fasttrackit.curs8.homework3.interfaces;

public class ChickenBehaviour implements AnimalBehaviour{
    private String chickenWalk;
    private String chickenTalk;
    private String chickenEat;

    public ChickenBehaviour() {
        this.chickenWalk = chickenWalk;
        this.chickenTalk = chickenTalk;
        this.chickenEat = chickenEat;
    }

    public String animalWalk() {
        return "chicken-walking";
    }

    public String animalTalk() {
        return "cot-cot";
    }

    public String animalEat() {
        return "eat-seeds";
    }
}
