package fr.moustik.rev;

public class Player extends Character{

    public String getCurrentWeaponName() {
        return this.Weapons.get(currentWeapon).name;
    }
    public int getCurrentWeaponDamage() {
        return this.Weapons.get(currentWeapon).damage;
    }
    public void setCurrentWeapon(int currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public void addWeapon(Weapon weapon){
        this.Weapons.add(weapon);
    }
    public int currentWeapon;
    public Player(String name) {
        this.setName(name);
    }
}
