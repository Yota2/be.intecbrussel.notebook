package be.intecbrussel.notebook.entities.animals;
import be.intecbrussel.notebook.entities.plants.Plant;
import java.util.Comparator;

public class  Carnivore extends Animal implements Comparator<Plant> {
    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", maxFoodSize=" + maxFoodSize +
                "} " + super.toString();
    }

    @Override
    public int compare(Plant o1, Plant o2) {
        return 0;
    }
}
