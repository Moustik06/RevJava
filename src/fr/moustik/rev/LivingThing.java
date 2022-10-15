package fr.moustik.rev;

public abstract class LivingThing {
    protected int health;
    protected int fullHeath;

    protected int mana;
    protected int fullMana;

    protected void useMana(int amount){
        if ((this.mana - amount) < 0){
            System.out.println("You don't have enough mana.");
        }
        else {
            this.mana -= amount;
        }
    }

    protected void getMana(int amount){
        if (this.mana + amount > fullMana){
            this.mana = this.fullMana;
            System.out.println("Your mana is now at the maximum");
        }
        else{
            this.mana += amount;
        }
    }

    protected void regenHealth(int amount){
        if (this.health + amount > fullHeath){
            this.health = this.fullHeath;
            System.out.println("Your mana is now at the maximum");
        }
        else{
            this.health += amount;
        }
    }
    protected void takeDamage(int amount){
        this.health -= amount;
    }

    protected boolean isDead(){
        return this.health <= 0;
    }
}
