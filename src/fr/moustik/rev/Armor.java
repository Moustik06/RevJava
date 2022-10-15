package fr.moustik.rev;

public class Armor {
    public String name;
    public int armorPoints;

    public Armor(String name, int armorPoints) {
        this.name = name;
        this.armorPoints = armorPoints;
    }

    @Override
    public String toString(){
        return name + ", have " + armorPoints +" armor points.";
    }
}
