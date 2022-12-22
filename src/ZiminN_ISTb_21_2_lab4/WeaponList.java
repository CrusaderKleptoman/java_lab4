package ZiminN_ISTb_21_2_lab4;

import java.util.ArrayList;

public class WeaponList {
    private ArrayList<BaseWeapon> weaponList = new ArrayList<>();

    public void addWeapon(BaseWeapon weapon) {
        weaponList.add(weapon);
        System.out.println("Оружие добавлено в арсенал");
    }
    public void removeWeapon(BaseWeapon weapon) {
        weaponList.remove(weapon);
        System.out.println("Оружие убрано из арсенала");
    }

    public void removeWeaponWithID(int weaponID) {
        weaponList.remove(weaponList.get(weaponID - 1));
        System.out.println("Оружие убрано из арсенала");
    }
    public void writeWeapon(int weaponID)
    {
        var weapon = weaponList.get(weaponID - 1);
        if(weapon.getClass() == MeleeWeapon.class)
        {
            System.out.printf("Название оружия %s, урон оружия %d%s, модификатор попадания и урона %d, дистанция удара %d \n", weapon.getWeaponName(), weapon.getDamageDiceAmount(), weapon.getDamageDice().toString(), weapon.getWeaponSharpening(), weapon.getAttackRange());
        }
        if (weapon.getClass() == RangeWeapon.class)
        {
            System.out.printf("Название оружия %s, урон оружия %d%s, модификатор попадания и урона %d, дистанция выстрела %d, запас аммуниции %d \n", weapon.getWeaponName(), weapon.getDamageDiceAmount(), weapon.getDamageDice().toString(), weapon.getWeaponSharpening(), weapon.getAttackRange(), ((RangeWeapon) weapon).getAmmunition());
        }
    }

    public void writeWeaponList()
    {
        int count = 0;
        for (var weapon: weaponList)
        {
            count++;
            if (weapon.getClass() == MeleeWeapon.class) {
                System.out.printf("%d Название оружия %s, урон оружия %d%s, модификатор попадания и урона %d, дистанция удара %d \n", count, weapon.getWeaponName(), weapon.getDamageDiceAmount(), weapon.getDamageDice().toString(), weapon.getWeaponSharpening(), weapon.getAttackRange());
            }
            if (weapon.getClass() == RangeWeapon.class)
            {
                System.out.printf("%d Название оружия %s, урон оружия %d%s, модификатор попадания и урона %d, дистанция выстрела %d, запас аммуниции %d \n", count, weapon.getWeaponName(), weapon.getDamageDiceAmount(), weapon.getDamageDice().toString(), weapon.getWeaponSharpening(), weapon.getAttackRange(), ((RangeWeapon) weapon).getAmmunition());
            }
        }
    }
}