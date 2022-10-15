package fr.moustik.rev;

public abstract class Character extends LivingThing{
    protected Weapon[] weapons;
    protected String name;
    protected Armor[] armors;

    public void attack(LivingThing enemy,int dmg){
        enemy.takeDamage(dmg);
    }

    @Override
    public String toString(){
        return "My name is " + name;
    }
}
