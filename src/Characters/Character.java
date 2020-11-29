package Characters;

import Weapons.Weapon;

public interface Character {
    void equip();
    void decreaseWeaponDamage();
    void increaseWeaponDamage();
    void decreaseWeaponLevel();
    void increaseWeaponLevel();
    void getWeapon();
    void setWeapon(Weapon weapon);
}