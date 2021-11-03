package ro.fasttrackit.curs8.homework3.interfaces;

public class CatBehaviour implements AnimalBehaviour {

    public String animalWalk() {
        return "cat-walking";
    }

    public String animalTalk() {
        return "miau";
    }

    public String animalEat() {
        return "eat-mice";
    }
}
