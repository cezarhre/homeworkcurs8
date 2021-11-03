package ro.fasttrackit.curs8.homework3.interfaces;

public class DogBehaviour implements AnimalBehaviour {

    public String animalWalk() {
        return "dog-walking";
    }

    public String animalTalk() {
        return "hau";
    }

    public String animalEat() {
        return "eat-meat";
    }
}
