package ZiminN_ISTb_21_2_lab4;

public class RangeWeapon extends BaseWeapon{
    public RangeWeapon()
    {
        super();
        this.setWeaponName("Камень");
        this.setAttackRange(20);
    }

    public RangeWeapon(String weaponName, Dice damageDice, int damageDiceAmount, int accuracy, int attackRange)
    {
        super(weaponName, damageDice, damageDiceAmount, accuracy, attackRange);
    }

    public RangeWeapon(RangeWeapon rangeWeapon)
    {
        super(rangeWeapon);
    }

    @Override
    public int Attack(int enemyArmour, int distance) {
        return 0;
    }
}
