package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.Comparator;
import java.util.Set;

public class Omnivore extends Animal implements Comparator<Plant> {

    private Set<Plant> plantDiet;
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    @Override
    public int compare(Plant o1, Plant o2) {
        return 0;
    }
}
