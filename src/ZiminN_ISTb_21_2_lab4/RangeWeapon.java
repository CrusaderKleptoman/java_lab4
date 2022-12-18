package ZiminN_ISTb_21_2_lab4;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        Boolean meleeShot = false;
        if (distance > this.getAttackRange())
        {
            System.out.println("Враг слишком далеко для выстрела, невозможно совершение атаки");
            return 0;
        }
        if (distance <= 5)
        {
            System.out.println("Враг слишком близко для точного выстрела, выстрелить с -2 к попаданию? Для подтверждения введите 1");
            if(scanner.nextLine().equals("1"))
            {
                System.out.println("Выстрел в ближнем бою подтверждён");
                meleeShot = true;
            }
            else
            {
                System.out.println("Завершение атаки");
                return 0;
            }
        }

        int rollDice = RollDice(Dice.D20) + this.getWeaponSharpening();
        if (meleeShot)
        {
            rollDice -= 2;
        }
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
