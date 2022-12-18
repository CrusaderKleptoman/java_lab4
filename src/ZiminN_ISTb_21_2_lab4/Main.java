package ZiminN_ISTb_21_2_lab4;

public class Main {
    public static void main(String[] args)
    {
        MeleeWeapon mace = new MeleeWeapon("Mace", Dice.D6, 1, 0, 5);
        mace.Attack(10, 5);
    }
}