import Weapons.*;

public class Player {
    final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new MachineGun(),
                new WaterGun(),
                new Slingshot(),
                new RocketLauncher()

        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > getSlotsCount() || slot <= 0) {
            System.out.println("Ведено неверное значение");
        } else {
            Weapon weapon = weaponSlots[slot - 1];
            System.out.println(weapon.shot());
        }
    }
}
