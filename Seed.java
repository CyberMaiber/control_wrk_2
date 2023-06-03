package control_wrk_2;

import java.util.ArrayList;

public class Seed {
    protected ArrayList<Animal> animalsInSeed = new ArrayList<>();
    Integer count = 0;

    public void addPet(String name, String birthDay, String type) throws Exception {
        PetAnimal pet = new PetAnimal(name, birthDay, type);
        if (!type.equalsIgnoreCase("cat") &&
                !type.equalsIgnoreCase("dog") &&
                !type.equalsIgnoreCase("hamster")) {
            throw new Exception("вид домашнего питомца не определен");
        }
        animalsInSeed.add(pet);

        count++;
    }

    public void addPack(String name, String birthDay, String type) throws Exception {
        PackAnimal pack = new PackAnimal(name, birthDay, type);
        if (!type.equalsIgnoreCase("horse") &&
                !type.equalsIgnoreCase("camel") &&
                !type.equalsIgnoreCase("donkey")) {
            throw new Exception("вид вьючного животного не определен");
        }
        animalsInSeed.add(pack);
        count++;
    }

    public void printSeed() {
        for (Animal anAnimal : this.animalsInSeed) {
            System.out.println(anAnimal.toString());
        }
    }
}
