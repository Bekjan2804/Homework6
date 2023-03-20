import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(45);
        boss.setHealth(100);
        boss.weapon.setWeaponname("Автомат");
        boss.weapon.setWeapontype(Weapontype.FIREWEAPON);
        System.out.println("Boss");
        System.out.println("Health: " + boss.getHealth() + " Damage: "
                + boss.getDamage() + " WeaponName: " + boss.weapon.getWeaponname() + " WeaponType: " + boss.weapon.getWeapontype());

        Skeleton skeleton = new Skeleton();
        skeleton.setDamage(60);
        skeleton.setHealth(150);
        skeleton.weapon.setWeaponname("Меч");
        skeleton.weapon.setWeapontype(Weapontype.COLDWEAPON);
        System.out.println("Skeleton");
        System.out.println("Health: " + skeleton.getHealth() + " Damage: "
                + skeleton.getDamage() + " WeaponName: " + skeleton.weapon.getWeaponname()
                + " WeaponType: " + skeleton.weapon.getWeapontype());

        Skeleton skeletonSecond = new Skeleton();
        skeletonSecond.setDamage(70);
        skeletonSecond.setHealth(200);
        skeletonSecond.weapon.setWeaponname("Makarov");
        skeletonSecond.weapon.setWeapontype(Weapontype.SIGNALWEAPON);
        System.out.println("SkeletonSecond");
        System.out.println("Health: " + skeletonSecond.getHealth() + " Damage: "
                + skeletonSecond.getDamage() + " WeaponName: " + skeletonSecond.weapon.getWeaponname()
                + " WeaponType: " + skeletonSecond.weapon.getWeapontype());
    }
}