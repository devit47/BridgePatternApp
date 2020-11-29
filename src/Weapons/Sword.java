package Weapons;

public class Sword implements Weapon{
    private String name;
    private boolean equipped = false;
    private int damage = 12;
    private int level = 1;

    public Sword(){
        this.name = "Iron Sword";
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean isEquipped(){
        return equipped;
    }

    @Override
    public void equip(){
        equipped = true;
    }

    @Override
    public void unequip(){
        equipped = false;
    }

    @Override
    public int getDamage(){
        return damage;
    }

    @Override
    public void setDamage(int damage){
        this.damage = damage;
    }

    @Override
    public int getLevel(){
        return level;
    }

    @Override
    public void setLevel(int level){
        this.level = level;
    }

    @Override
    public void parry(int parryAbility){

    }

    @Override
    public void thrust(){
        int damageOutput = damage;
        System.out.println("Thrust attack: " + damageOutput);
    }

    @Override
    public void swing() {
        int damageOutput = (int) (damage * .75);
        System.out.println("Swing attack: " + damageOutput);
    }

    @Override
    public void printWeaponDetails() {
        System.out.println("------------------------------------\nWeapon Details {");
        System.out.println("\tName: " + getName());
        System.out.println("\tEquipped: " + equipped);
        System.out.println("\tDamage: " + damage);
        System.out.println("\tLevel: " + level);
        System.out.println("}\n");
    }
}