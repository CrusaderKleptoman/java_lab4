package ZiminN_ISTb_21_2_lab4;

import java.io.*;
import java.util.Scanner;

public class Menu {

    private static WeaponList weaponList;
    private static BaseWeapon weapon;
    private static int readCommand() {
        Scanner scanner = new Scanner(System.in);
        int command = -1;
        try {
            command = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Неверное значение команды, повторите ввод");
            command = readCommand();
        }
        return command;
    }

    public static void MainMenu()
    {
        int command = -1;
        do {
            System.out.println("_______________________________________________________________");
            System.out.println("Главное меню");
            System.out.println("1 - работа с арсеналом");
            System.out.println("2 - работа с оружием");
            System.out.println("0 - закрыть программу");
            command = readCommand();

            switch (command) {
                case 1:
                    WeaponListMenu();
                    break;
                case 2:
                    WeaponMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Команды нет в списке, повторите ввод");
            }

        } while (command != 0);
    }

    public static void WeaponListMenu()
    {
        String armory = "armory.txt";
        int weaponAmount;
        String weaponType;
        Dice[] diceList = Dice.values();
        int ID;
        Scanner scanner = new Scanner(System.in);
        int command = -1;
        do {
            System.out.println("_______________________________________________________________");
            System.out.println("Главное меню");
            System.out.println("1 - проверить арсенал(считать оружие из файла)");
            System.out.println("2 - добавить оружие в арсенал");
            System.out.println("3 - убрать оружие из арсенала по номеру");
            System.out.println("4 - проверить оружие по номеру");
            System.out.println("5 - закрыть арсенал(с добавлением всего нового оружия в файл)");

            System.out.println("0 - закрыть программу");
            command = readCommand();

            switch (command) {
                case 1:
                    try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(armory))) {

                        weaponAmount = dataInputStream.readInt();
                        for (int i = 0; i < weaponAmount; i++) {
                            weaponType = dataInputStream.readUTF();
                            if (weaponType.equals("MeleeWeapon"))
                            {
                                MeleeWeapon meleeWeapon = new MeleeWeapon(dataInputStream.readUTF(), diceList[dataInputStream.readInt()-1], dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt());
                                weaponList.addWeapon(meleeWeapon);
                            }
                            if (weaponType.equals("RangeWeapon"))
                            {
                                RangeWeapon rangeWeapon = new RangeWeapon(dataInputStream.readUTF(), diceList[dataInputStream.readInt()-1], dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt());
                                weaponList.addWeapon(rangeWeapon);
                            }
                        }
                        
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    String name;
                    int dice;
                    int diceAmount;
                    int sharp;
                    int range;
                    int ammunition;
                    System.out.println("Выберите тип оружия, введите 1 для ближнего, 2 для дальнего");
                    weaponType = scanner.nextLine();
                    while(true) {
                        if (weaponType.equals("1")) {
                            System.out.println("Введите название оружие");
                            name = scanner.nextLine();
                            System.out.println("Введите кость урона");
                            dice = readCommand();
                            System.out.println("Введите количество костей урона");
                            diceAmount = readCommand();
                            System.out.println("Введите модификатор оружия");
                            sharp = readCommand();
                            System.out.println("Введите дистанцию атаки оружия");
                            range = readCommand();
                            MeleeWeapon meleeWeapon = new MeleeWeapon(name, diceList[dice - 1], diceAmount, sharp, range);
                            weaponList.addWeapon(meleeWeapon);
                            break;
                        }
                        if (weaponType.equals("2")) {
                            System.out.println("Введите название оружие");
                            name = scanner.nextLine();
                            System.out.println("Введите кость урона");
                            dice = readCommand();
                            System.out.println("Введите количество костей урона");
                            diceAmount = readCommand();
                            System.out.println("Введите модификатор оружия");
                            sharp = readCommand();
                            System.out.println("Введите дистанцию атаки оружия");
                            range = readCommand();
                            System.out.println("Введите запас аммуниции");
                            ammunition = readCommand();
                            RangeWeapon rangeWeapon = new RangeWeapon(name, diceList[dice - 1], diceAmount, sharp, range, ammunition);
                            weaponList.addWeapon(rangeWeapon);
                            break;
                        }
                        else {
                            System.out.println("Неверная команда");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите номер оружия");
                    ID = readCommand();
                    weaponList.removeWeaponWithID(ID - 1);
                    break;
                case 4:
                    System.out.println("Введите номер оружия");
                    ID = readCommand();
                    weaponList.writeWeapon(ID - 1);
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Команды нет в списке, повторите ввод");
            }

        } while (command != 0);
    }

    public static void WeaponMenu()
    {
        int command = -1;
        do {
            System.out.println("_______________________________________________________________");
            System.out.println("Главное меню");
            System.out.println("1 - работа с арсеналом");
            System.out.println("2 - работа с оружием");
            System.out.println("0 - закрыть программу");
            command = readCommand();

            switch (command) {
                case 1:

                    break;
                case 2:

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Команды нет в списке, повторите ввод");
            }

        } while (command != 0);
    }
}
