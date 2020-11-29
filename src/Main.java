import Characters.BaseCharacter;
import Characters.RogueCharacter;
import Weapons.Axe;
import Weapons.Spear;
import Weapons.Sword;
import Weapons.Weapon;

public class Main {
    public static void main(String[] args){
        System.out.println("Tests with Base character and Sword");
        Weapon sword = new Sword();
        BaseCharacter baseCharacter = new BaseCharacter(sword);
        baseCharacter.equip();
        baseCharacter.equip();
        baseCharacter.weapon.thrust();
        baseCharacter.weapon.printWeaponDetails();

        System.out.println("Tests with Rogue character and Spear");
        Weapon spear = new Spear();
        RogueCharacter rogueCharacter = new RogueCharacter(spear);
        rogueCharacter.equip();
        rogueCharacter.parry();
        rogueCharacter.setWeapon(new Axe());
        rogueCharacter.weapon.printWeaponDetails();
        rogueCharacter.weapon.thrust();
    }
}