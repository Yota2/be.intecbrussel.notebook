package be.intecbrussel.notebook.entities.animals;
import be.intecbrussel.notebook.entities.plants.Plant;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {
    //need to be fixed to know
    private Set<Plant> plantDiet = new HashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void printDiet() {
        //one way to short it loop
        for (Plant plant : plantDiet) {
            System.out.println(plant);
        }

        plantDiet.forEach(System.out::println);
    }

    public void addPlantToDiet(Plant plant) {
        this.plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", plantDiet=" + plantDiet +
                "} " + super.toString();
    }

}
