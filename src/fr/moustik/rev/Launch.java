package fr.moustik.rev;

public class Launch {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        dragon1.setName("Alduin");

        dragon1.health = 20;
        dragon1.mana = 1000;
        dragon1.fullMana = 10000;

        System.out.println(dragon1.mana);
        dragon1.fireBall();
        System.out.println(dragon1.mana);

        Player p1 = new Player("Billy");

        Weapon w1 = new Weapon("Fire Sword",30);
        p1.addWeapon(w1);
        p1.setCurrentWeapon(0);
        System.out.println(p1.getCurrentWeaponName());

        p1.attack(dragon1, p1.getCurrentWeaponDamage());

        System.out.println(p1.getName());
    }
}
