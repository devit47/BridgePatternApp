package Weapons;

public interface Weapon {
    String getName();
    void setName(String name);

    boolean isEquipped();
    void equip();
    void unequip();

    int getDamage();
    void setDamage(int percent);

    int getLevel();
    void setLevel(int level);

    void printWeaponDetails();

    void parry(int parryAbility);

    void thrust();

    void swing();
}