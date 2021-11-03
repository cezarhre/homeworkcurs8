package ro.fasttrackit.curs8.homework3.interfaces;

public class AnimalMain {
    public static void main(String[] args) {

        AnimalBehaviour CatBehaviour = new CatBehaviour();
        System.out.println(CatBehaviour.animalWalk() + " " + CatBehaviour.animalTalk() + " " + CatBehaviour.animalEat());

        AnimalBehaviour DogBehaviour = new DogBehaviour();
        System.out.println(DogBehaviour.animalWalk() + " " + DogBehaviour.animalTalk() + " " + DogBehaviour.animalEat());

        AnimalBehaviour MouseBehaviour = new MouseBehaviour();
        System.out.println(MouseBehaviour.animalWalk() + " " + MouseBehaviour.animalTalk() + " " + MouseBehaviour.animalEat());

        AnimalBehaviour ChickenBehaviour = new ChickenBehaviour();
        System.out.println(ChickenBehaviour.animalWalk() + " " + ChickenBehaviour.animalTalk() + " " + ChickenBehaviour.animalEat());

        AnimalBehaviour DuckBehaviour = new DuckBehaviour();
        System.out.println(DuckBehaviour.animalWalk() + " " + DuckBehaviour.animalTalk() + " " + DuckBehaviour.animalEat());

    }
}
