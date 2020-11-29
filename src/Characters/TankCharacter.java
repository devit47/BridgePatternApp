package Characters;

import Weapons.Weapon;

public class TankCharacter extends BaseCharacter{
    int shieldbashAbility;

    public TankCharacter(Weapon weapon){
        super.weapon = weapon;
    }

    public void shieldbash(){
        System.out.println("Parrying");
        weapon.parry(this.shieldbashAbility);
    }

    public int getShieldbashAbility(){
        return shieldbashAbility;
    }

    public void setShieldbashAbility(int shieldbashAbility){
        this.shieldbashAbility = shieldbashAbility;
    }
}