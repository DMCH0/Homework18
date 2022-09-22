package Homeworks.lesson8;

public class HW8_V2 {

    public static void main(String[] args) {

        int[] array1 = new int[10];                             //Массив из 10 элементов
        for (int i = 0; i < array1.length; i++) {               //Пока i < 21 (длинны массива array1) инкрементировать i
            array1[i] = (int) (Math.random() * (21 - 10)) + 10; //Заполнить массив целыми числами от 10 до 20 включ.[10,21)
        }
        if (array1.length > 0) {                                //Если 21 > 0
            double sum = 0;                                     //переменная sum = 0
            for (int j = 0; j < array1.length; j++) {           //цикл для суммирования всех значений массива array1
                sum += array1[j];                               //Сложение элементов массива array1 от 1 до 10 элемента.
            }
            double average = sum / array1.length;               //Подсчет среднего арифметического для массива
            System.out.println(average);                        //Вывести среднее арифметическое число
        }
    }
}
// Изначально сделал с int, но переделал вывод в double,
// поскольку при делении суммы на количество элементов может быть как целое так и дробное число.

