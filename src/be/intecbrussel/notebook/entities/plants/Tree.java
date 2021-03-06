package be.intecbrussel.notebook.entities.plants;

public class Tree  extends  Plant{
    private LeafType leafType;

    public Tree(String name) {
        this.setName(name);
    }

    public Tree( String name, double height) {
        super( name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leafType=" + leafType +
                "} " + super.toString();
    }
}