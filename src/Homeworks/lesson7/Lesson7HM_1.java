package Homeworks.lesson7;

public class Lesson7HM_1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {           //цикл for

            if(i % 3 == 0 && i % 5 == 0) {         //условный оператор + условие
                System.out.print("HelloWorld ");   //если число кратно и 3 и 5 то вместо него вывести HelloWorld
            }
            else if (i % 3 == 0){                  //если число кратно 3 то вместо него вывести Hello
                System.out.print("Hello ");
            }
            else if (i % 5 == 0) {                 //если число кратно 5 то вместо него вывести World
                System.out.print("World ");
            }
            else {
                System.out.print(i + " ");        //Вывести ряд чисел от 1 до 100 через пробел
            }
        }
    }
}