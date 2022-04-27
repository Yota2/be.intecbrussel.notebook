package be.intecbrussel.notebook.service;
import be.intecbrussel.notebook.entities.animals.Animal;
import be.intecbrussel.notebook.entities.animals.Carnivore;
import be.intecbrussel.notebook.entities.animals.Herbivore;
import be.intecbrussel.notebook.entities.animals.Omnivore;
import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.*;

public class ForestNoteBook {
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public ForestNoteBook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plants.size();
    }

    public int getAnimalCount() {
        return animals.size();
    }

    public void addAnimal (Animal animal){
            // check for duplicates
            boolean isPresent = false;
            if (this.animals != null) {
                isPresent = this.animals.stream().anyMatch(o -> animal.getName().equals(o.getName()));
            }
            if (isPresent) {
                System.out.println("This animal already exists ");
                return;
            }
            // put it in the right field
            if (animal instanceof Carnivore) {
                this.carnivores.add((Carnivore) animal);
            } else if (animal instanceof Omnivore) {
                this.omnivores.add((Omnivore) animal);
            } else if (animal instanceof Herbivore) {
                this.herbivores.add((Herbivore) animal);
            }
            this.animals.add(animal);
    }

    public void addPlant (Plant plant){
        if(!plants.contains(plant)) {
            plants.add(plant);
        }
            // check for duplicates
        //how can i implement  hashCode?
       /*
        boolean isPresent = false;
        if (this.plants != null) {
            isPresent = this.plants.stream().anyMatch(o -> plant.getName().equals(o.getName()));
        }
            if (isPresent) {
                System.out.println("This plant already exists");
                return;
            }
            this.plants.add(plant);
        */
        }

        public void printNoteBook () {
            System.out.println("-------Print all kinds of animals-------");
            this.animals.stream().forEach(e-> System.out.println(e.getName()));
            System.out.println("-------Print all kinds of plants-------");
            this.plants.stream().forEach(e-> System.out.println(e.getName()));
        }

        public void sortAnimalsByName () {
            animals.sort(Comparator.comparing(Animal::getName));
        }
    public void printPlant2 () {
        System.out.println("-------------Print unsorted Plants for 2 X-------------");
      this.plants.stream().forEach(e-> System.out.println(e.getName()));
    }

        public void sortPlantsByName () {
            plants.sort(Comparator.comparing(Plant::getName));
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForestNoteBook)) return false;
        ForestNoteBook that = (ForestNoteBook) o;
        return getPlantCount() == that.getPlantCount() && plants.equals(that.plants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlantCount(), plants);
    }


}
