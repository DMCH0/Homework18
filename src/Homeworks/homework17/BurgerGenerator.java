package Homeworks.homework17;
import java.util.Scanner;

public class BurgerGenerator {

    private int price = 50;
    private int numberOfAdditional = 1;

    public BurgerGenerator() {
        System.out.println("Стандартный бургер с ценой " + price + "грн готов!");
        askAboutAdditional();
    }

    private void askAboutAdditional() {
        if (numberOfAdditional > 3) {
            System.out.println("Вы добавили максимум ингредиентов, стоимость бургера: " + price + "грн");
            return;
        }
        System.out.println("Хотите добавить " + numberOfAdditional + "-й дополнительный ингредиент?");
        System.out.println("Выберете один из вариантов:\n" +
                "(1) Соус - 10грн\n" +
                "(2) Сыр - 20грн\n" +
                "(3) Котлета - 30грн\n" +
                "(4) Нет"
        );
        System.out.print("Сделайте Ваш выбор (Введите номер или название ингредиента): ");

        addToBurger(new Scanner(System.in).nextLine());
    }

    private void addToBurger(String whatToAdd) {
        whatToAdd = whatToAdd.toLowerCase();
        switch (whatToAdd) {
            case "1":
            case "соус":
                price += 10;
                System.out.println("Соус добавлен, +10грн к цене! Итого цена: " + price + "грн");
                numberOfAdditional++;
                askAboutAdditional();
                break;
            case "2":
            case "сыр":
                price += 20;
                System.out.println("Сыр добавлен, +20грн к цене! Итого цена: " + price + "грн");
                numberOfAdditional++;
                askAboutAdditional();
                break;
            case "3":
            case "котлета":
                price += 30;
                System.out.println("Котлета добавлена, +30грн к цене! Итого цена: " + price + "грн");
                numberOfAdditional++;
                askAboutAdditional();
                break;
            case "4":
            case "нет":
                System.out.println("Отлично! Ваш бургер собран, итого цена: " + price  + "грн");
                break;
            default:
                System.out.println("Такого варианта нет, попробуйте выбрать ещё раз!");
                askAboutAdditional();
                break;
        }
    }
}
