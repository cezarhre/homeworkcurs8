package ro.fasttrackit.curs8.homework3.interfaces;

public class MouseBehaviour implements AnimalBehaviour {

    public String animalWalk() {
        return "mouse-walking";
    }

    public String animalTalk() {
        return "chitz";
    }

    public String animalEat() {
        return "eat-cheese";
    }
}
