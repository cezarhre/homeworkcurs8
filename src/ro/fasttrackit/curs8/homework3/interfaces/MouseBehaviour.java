package ro.fasttrackit.curs8.homework3.interfaces;

public class MouseBehaviour implements AnimalBehaviour {
    private String mouseWalk;
    private String mouseTalk;
    private String mouseEat;

    public MouseBehaviour() {
        this.mouseWalk = mouseWalk;
        this.mouseTalk = mouseTalk;
        this.mouseEat = mouseEat;
    }

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
