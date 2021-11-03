package ro.fasttrackit.curs8.homework3.interfaces;

public class CatBehaviour implements AnimalBehaviour {
    private String catWalk;
    private String catTalk;
    private String catEat;

    public CatBehaviour() {
        this.catWalk = catWalk;
        this.catTalk = catTalk;
        this.catEat = catEat;
    }

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
