public class Boss extends GameEntity {

    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "Health: " + getHealth() + " Damage: " + getDamage() + "WeaponName: " + weapon.getWeaponname() +
                "Weaponatype" + weapon.getWeapontype();

    }

}
