package ro.fasttrackit.curs8.homework3.interfaces;

public class DogBehaviour implements AnimalBehaviour {
    private String dogWalk;
    private String dogTalk;
    private String dogEat;

    public DogBehaviour() {
        this.dogWalk = dogWalk;
        this.dogTalk = dogTalk;
        this.dogEat = dogEat;
    }

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
