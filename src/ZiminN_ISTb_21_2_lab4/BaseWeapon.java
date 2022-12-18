package ZiminN_ISTb_21_2_lab4;

abstract public class BaseWeapon {
    private String weaponName;
    private Dice damageDice;
    private int damageDiceAmount;
    private int accuracy;
    private int attackRange;

    public BaseWeapon()
    {
        weaponName = "Ножка от стула";
        damageDice = Dice.D4;
        damageDiceAmount = 1;
        accuracy = 0;
        attackRange = 5;
    }

    public BaseWeapon(String weaponName, Dice damageDice, int damageDiceAmount, int accuracy, int attackRange)
    {
        this.weaponName = weaponName;
        this.damageDice = damageDice;
        this.damageDiceAmount = damageDiceAmount;
        this.accuracy = accuracy;
        this.attackRange = attackRange;
    }

    public BaseWeapon(BaseWeapon weapon)
    {
        this.weaponName = weapon.weaponName;
        this.damageDice = weapon.damageDice;
        this.damageDiceAmount = weapon.damageDiceAmount;
        this.accuracy = weapon.accuracy;
        this.attackRange = weapon.attackRange;
    }

    public String getWeaponName() {return weaponName;}
    public Dice getDamageDice() {return damageDice;}
    public int getDamageDiceAmount() {return damageDiceAmount;}
    public int getAttackRange() {return attackRange;}
    public int getAccuracy() {return accuracy;}

    public void setWeaponName(String weaponName) {this.weaponName = weaponName;}
    public void setDamageDice(Dice damageDice) {this.damageDice = damageDice;}
    public void setDamageDiceAmount(int damageDiceAmount) {this.damageDiceAmount = damageDiceAmount;}
    public void setAttackRange(int attackRange) {this.attackRange = attackRange;}
    public void setAccuracy(int accuracy) {this.accuracy = accuracy;}

    abstract int Attack();
}
