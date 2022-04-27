package be.intecbrussel.notebook.app;

import be.intecbrussel.notebook.entities.animals.Animal;
import be.intecbrussel.notebook.entities.animals.Carnivore;
import be.intecbrussel.notebook.entities.animals.Herbivore;
import be.intecbrussel.notebook.entities.animals.Omnivore;
import be.intecbrussel.notebook.entities.plants.*;
import be.intecbrussel.notebook.service.ForestNoteBook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {
        ForestNoteBook amazonForest = new ForestNoteBook();
        Flower flower = new Flower("Rose",2.4);
        Weed weed = new Weed("Weed",1.3);
        Bush bush = new Bush("Palmate",1.2);
        Bush bush2 = new Bush("Conifers",1.3);
        Tree tree = new Tree("Tree",3.2);
        tree.setLeafType(LeafType.SPEAR);
        weed.setArea(4);
        flower.setSmell(Scent.EARTHY);
        bush.setLeafType(LeafType.NEEDLE);
        bush2.setLeafType(LeafType.HAND);
        amazonForest.addPlant(flower);
        amazonForest.addPlant(weed);
        amazonForest.addPlant(bush);
        amazonForest.addPlant(bush2);
        amazonForest.addPlant(tree);
        amazonForest.addAnimal(new Omnivore("Fox",35,0.75,0.44));
        amazonForest.addAnimal(new Omnivore("Tiger",35,0.75,0.44));
        amazonForest.addAnimal(new Herbivore("Howler Monkey", 7.3,0.65,0.65));
        amazonForest.addAnimal(new Herbivore("Amazon Deer", 90,1.20,1.53));
        amazonForest.addAnimal(new Carnivore("Lion",250,1.20,1.50));
        amazonForest.addAnimal(new Carnivore("Wolf",250,1.20,1.50));
        amazonForest.addAnimal(new Omnivore("Bears",400,2.30,1.12));
        amazonForest.addAnimal(new Omnivore("Bird",0.50,0.20,0.60));
        amazonForest.addAnimal(new Carnivore("Cheetah",64,1,1.1));
        // set for the diet
        Set<Plant> dietForHerbivores = new HashSet<>();
        dietForHerbivores.add(new Plant("American Marigold", 1));
        dietForHerbivores.add(new Plant("Bacopa",2));
        amazonForest.getHerbivores().stream().forEach(e->e.setPlantDiet(dietForHerbivores));
        // aantal planten
        System.out.println("Amount of plants: " + amazonForest.getPlantCount());
        // aantal dieren
        System.out.println("Amount of animals: " + amazonForest.getAnimalCount());
        // ongesorteerde lijst van dieren en planten
        System.out.println("Unsorted list of animals and plants");
        amazonForest.printNoteBook();
        System.out.println("------------------------------------------------------------");
        System.out.println("Print all kinds of animals per type");
        System.out.println("---------------------Herbivores---------------------");
        amazonForest.getHerbivores().stream().forEach(e-> System.out.println(e.getName()));
        System.out.println("---------------------Omnivores---------------------");
        amazonForest.getOmnivores().stream().forEach(e-> System.out.println(e.getName()));
        System.out.println("---------------------Carnivores---------------------");
        amazonForest.getCarnivores().stream().forEach(e-> System.out.println(e.getName()));
        // Sorted list
        amazonForest.sortAnimalsByName();
        amazonForest.sortPlantsByName();
        System.out.println("------------------------------------------------------------");
        System.out.println("Sorted list of animals and plants");
        amazonForest.printNoteBook();
        System.out.println("-------------------------------------plants-----------------------------");
        Herbivore herbivore = new Herbivore("Howler Monkey", 7.3,0.65,0.65);
        herbivore.addPlantToDiet(weed);
        herbivore.addPlantToDiet(tree);
        System.out.println("--------------------------------HashCode Print Diets-----------------------------------");
        herbivore.printDiet();

    }
}


