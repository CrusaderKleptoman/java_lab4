package ZiminN_ISTb_21_2_lab4;

import java.util.Scanner;

public class MeleeWeapon extends BaseWeapon{
    public MeleeWeapon()
    {
        super();
        this.setWeaponName("Ножка от стула");
    }

    public MeleeWeapon(String weaponName, Dice damageDice, int damageDiceAmount, int accuracy, int attackRange)
    {
        super(weaponName, damageDice, damageDiceAmount, accuracy, attackRange);
    }

    public MeleeWeapon(MeleeWeapon meleeWeapon)
    {
        super(meleeWeapon);
    }

    @Override
    public int Attack(int enemyArmour, int distance) {
        Scanner scanner = new Scanner(System.in);

        if (distance > this.getAttackRange())
        {
            System.out.println("Враг слишком далеко для удара, завершение атаки");
            return 0;
        }

        int rollDice = RollDice(Dice.D20) + this.getWeaponSharpening();
        System.out.printf("Бросок на попадание %d\n", rollDice);
        if (rollDice < enemyArmour)
        {
            System.out.println("Броня не пробита");
            return 0;
        }
        else
        {
            System.out.println("Броня пробита");
            rollDice = this.getWeaponSharpening();
            for (int i = 0; i < this.getDamageDiceAmount(); i++) {
                rollDice += RollDice(this.getDamageDice());
            }
        }

        System.out.printf("Нанесено урона %d\n", rollDice);
        return rollDice;
    }
}
