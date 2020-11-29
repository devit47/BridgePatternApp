package Characters;

import Weapons.Weapon;

public class RogueCharacter extends BaseCharacter{
    int parryAbility;

    public RogueCharacter(Weapon weapon){
        super.weapon = weapon;
    }

    public void parry(){
        System.out.println("Parrying");
        weapon.parry(this.parryAbility);
    }

    public int getParryAbility(){
        return parryAbility;
    }

    public void setParryAbility(int parryAbility){
        this.parryAbility = parryAbility;
    }

}