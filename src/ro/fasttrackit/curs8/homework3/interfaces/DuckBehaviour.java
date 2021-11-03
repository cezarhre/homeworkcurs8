package ro.fasttrackit.curs8.homework3.interfaces;

public class DuckBehaviour implements AnimalBehaviour {
    private String duckWalk;
    private String duckTalk;
    private String duckEat;

    public DuckBehaviour() {
        this.duckWalk = duckWalk;
        this.duckTalk = duckTalk;
        this.duckEat = duckEat;
    }

    public String animalWalk() {
        return "duck-walking";
    }

    public String animalTalk() {
        return "mac";
    }

    public String animalEat() {
        return "eat-worms";
    }
}
