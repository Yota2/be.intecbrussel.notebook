package be.intecbrussel.notebook.entities.plants;

public class Bush extends Plant {
    private String fruit;
    private LeafType leafType;

    public Bush( String fruit , double height){
        super(fruit,height);
    }
    public Bush(String name){
        super.setName(name);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "fruit='" + fruit + '\'' +
                ", leafType=" + leafType +
                "} " + super.toString();
    }
}
