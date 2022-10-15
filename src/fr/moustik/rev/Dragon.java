package fr.moustik.rev;

public class Dragon extends LivingThing implements MagicMonster,FlyingMonster{
    boolean fly;
    double flySpeed;


    @Override
    public void fly(double speed) {
        this.fly = true;
        this.flySpeed = speed;
    }

    @Override
    public void spendMana(int manaPoints) {
        useMana(manaPoints);
    }

    public void fireBall(){
        if (useMana(20)){
            System.out.print("The dragon launched a fireball, using 20 points of mana \n");
        }

    }
}
