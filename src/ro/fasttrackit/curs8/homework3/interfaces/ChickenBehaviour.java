package ro.fasttrackit.curs8.homework3.interfaces;

public class ChickenBehaviour implements AnimalBehaviour{

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
