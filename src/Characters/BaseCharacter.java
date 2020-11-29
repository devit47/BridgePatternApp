package Characters;

import Weapons.Weapon;

public abstract class BaseCharacter implements Character{
    int health;
    public Weapon weapon;

    public BaseCharacter(){}

    public BaseCharacter(Weapon weapon){
        this.weapon = weapon;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    @Override
    public void getWeapon(){
        weapon.printWeaponDetails();
    }

    @Override
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public void equip(){
        if(!weapon.isEquipped()){
            weapon.equip();
            System.out.println(weapon.getName() + ": equipped");
        }else{
            System.out.println(weapon.getName() + " is already equipped.");
        }
    }

    @Override
    public void decreaseWeaponDamage(){
        System.out.println("Decreasing weapon damage");
        weapon.setDamage(weapon.getDamage() - 1);
    }

    @Override
    public void increaseWeaponDamage(){
        System.out.println("Increasing weapon damage");
        weapon.setDamage(weapon.getDamage() + 1);
    }

    @Override
    public void decreaseWeaponLevel(){
        System.out.println("Decreasing weapon level");
        weapon.setLevel(weapon.getLevel() - 1);
    }

    @Override
    public void increaseWeaponLevel(){
        System.out.println("Increasing weapon level");
        weapon.setLevel(weapon.getLevel() + 1);
    }

}