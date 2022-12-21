package ZiminN_ISTb_21_2_lab4;

import java.util.ArrayList;

public class WeaponList {
    private ArrayList<MeleeWeapon> meleeWeaponList = new ArrayList<>();
    private ArrayList<RangeWeapon> rangeWeaponList = new ArrayList<>();

    public void addMeleeWeapon(MeleeWeapon meleeWeapon) {
        meleeWeaponList.add(meleeWeapon);
    }
    public void addRangeWeapon(RangeWeapon rangeWeapon) {
        rangeWeaponList.add(rangeWeapon);
    }
    public void removeMeleeWeapon(MeleeWeapon meleeWeapon) {
        meleeWeaponList.remove(meleeWeapon);
    }
    public void removeRangeWeapon(RangeWeapon rangeWeapon) {
        rangeWeaponList.remove(rangeWeapon);
    }

    public void writeMeleeWeaponList()
    {
        for (MeleeWeapon weapon: meleeWeaponList)
        {
            System.out.printf("Название оружия %s, урон оружия %d%s, модификатор попадания и урона %d, дистанция удара %d \n", weapon.getWeaponName(), weapon.getDamageDiceAmount(), weapon.getDamageDice().toString(), weapon.getWeaponSharpening(), weapon.getAttackRange());
        }
    }

    public void writeRangeWeaponList()
    {
        for (RangeWeapon weapon: rangeWeaponList)
        {
            System.out.printf("Название оружия %s, урон оружия %d%s, модификатор попадания и урона %d, дистанция выстрела %d, запас боеприпасов %d \n", weapon.getWeaponName(), weapon.getDamageDiceAmount(), weapon.getDamageDice().toString(), weapon.getWeaponSharpening(), weapon.getAttackRange(), weapon.getAmmunition());
        }
        
    }
}
