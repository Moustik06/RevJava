package fr.moustik.rev;

import java.util.ArrayList;
import java.util.List;

public abstract class Character extends LivingThing{
    protected List<Weapon> Weapons = new ArrayList<Weapon>();
    protected String name;
    protected List<Armor> Armors = new ArrayList<Armor>();

    public void attack(LivingThing enemy,int dmg){
        System.out.printf("%s have attacked %s.\n",this.getName(),enemy.getName());
        enemy.takeDamage(dmg);

    }

    @Override
    public String toString(){
        return "My name is " + name;
    }
}
