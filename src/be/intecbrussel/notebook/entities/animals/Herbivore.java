package be.intecbrussel.notebook.entities.animals;
import be.intecbrussel.notebook.entities.plants.Plant;
import java.util.Comparator;
import java.util.Set;

public class Herbivore extends Animal implements Comparator<Plant>
{

    private Set<Plant> plantDiet;

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
    public  void  printDiet(){

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

    @Override
    public int compare(Plant o1, Plant o2) {
        return 0;
    }
}
