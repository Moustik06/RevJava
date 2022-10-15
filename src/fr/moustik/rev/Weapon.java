package fr.moustik.rev;

public class Weapon {
    public String name;
    public int damage;


    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString(){
        return name + ", dealing " + damage + " damage.";
    }
}
