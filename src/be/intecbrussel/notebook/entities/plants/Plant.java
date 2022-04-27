package be.intecbrussel.notebook.entities.plants;

import java.util.Objects;

public class Plant {
     private String name;
     private double height;

     public Plant(String name, double height) {
          this.name = name;
          this.height = height;
     }

     public Plant() {
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }


     public double getHeight() {
          return height;
     }

     public void setHeight(double height) {
          this.height = height;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (!(o instanceof Plant)) return false;
          Plant plant = (Plant) o;
          return getName().equals(plant.getName());
     }

     @Override
     public int hashCode() {
          return Objects.hash(getName());
     }
}
