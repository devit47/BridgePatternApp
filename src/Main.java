import Characters.BaseCharacter;
import Characters.RogueCharacter;
import Characters.TankCharacter;
import Weapons.Axe;
import Weapons.Spear;
import Weapons.Sword;
import Weapons.Weapon;

public class Main {
    public static void main(String[] args){

        System.out.println("Tests with Rogue character and Spear");
        Weapon spear = new Spear();
        RogueCharacter rogueCharacter = new RogueCharacter(spear);
        rogueCharacter.equip();
        rogueCharacter.parry();
        rogueCharacter.setWeapon(new Axe());
        rogueCharacter.weapon.printWeaponDetails();
        rogueCharacter.weapon.thrust();

        System.out.println("Tests with Rogue character and Spear");
        Weapon axe = new Axe();
        TankCharacter tankCharacter = new TankCharacter(axe);
        tankCharacter.equip();
        tankCharacter.shieldbash();
        tankCharacter.setWeapon(new Axe());
        tankCharacter.weapon.printWeaponDetails();
        tankCharacter.weapon.thrust();
    }
}