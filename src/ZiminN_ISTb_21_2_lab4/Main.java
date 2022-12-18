package ZiminN_ISTb_21_2_lab4;

public class Main {
    public static void main(String[] args)
    {
        RangeWeapon bow = new RangeWeapon("Bow", Dice.D8, 1, 2, 320);
        bow.Attack(8, 80);
    }
}