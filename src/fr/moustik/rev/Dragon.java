package fr.moustik.rev;

public class Dragon implements MagicMonster,FlyingMonster{

    @Override
    public void fly(double speed) {

    }

    @Override
    public void spendMana(int manaPoints) {

    }

    public void fireBall(){
        System.out.print("The dragon launched a fireball, using %d points of mana");
    }
}
