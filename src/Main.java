import java.util.Scanner;

public class Main {
    private static void printMenu() {
        System.out.println("\n== МЕНЮ ==");
        System.out.println("1. Задание 1.1");
        System.out.println("2. Задание 1.3");
        System.out.println("3. Задание 1.5");
        System.out.println("4. Задание 1.7");
        System.out.println("5. Задание 1.9");
        System.out.println("6. Задание 2.1");
        System.out.println("7. Задание 2.3");
        System.out.println("8. Задание 2.5");
        System.out.println("9. Задание 2.7");
        System.out.println("10. Задание 2.9");
        System.out.println("11. Задание 3.1");
        System.out.println("12. Задание 3.3");
        System.out.println("13. Задание 3.5");
        System.out.println("14. Задание 3.7");
        System.out.println("15. Задание 3.9");
        System.out.println("16. Задание 4.1");
        System.out.println("17. Задание 4.3");
        System.out.println("18. Задание 4.5");
        System.out.println("19. Задание 4.7");
        System.out.println("20. Задание 4.9");
        System.out.println("0. Выход");
        System.out.print("> ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Methods task1 = new Methods();
        Conditions task2 = new Conditions();
        Cycles task3 = new Cycles();
        Array task4 = new Array();

        int choice;

        do {
            printMenu();

            while (!input.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 20");
                System.out.print("> ");
                input.next();
            }

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Задание 1.1
                    System.out.println("== Поиск дробная части числа ==");
                    System.out.println("Введите значение x: ");
                    System.out.print("> ");
                    double x1 = input.nextDouble();
                    System.out.println("Дробнач часть числа: " + task1.fraction(x1));
                    break;

                case 2:
                    // Задание 1.3
                    System.out.println("== Букву в число ==");
                    System.out.println("Введите цифру: ");
                    System.out.print("> ");
                    char number2 = input.next().charAt(0);
                    System.out.println(task1.charToNum(number2));
                    break;

                case 3:
                    // Задание 1.5
                    System.out.println("== Двузначное число ==");
                    System.out.println("Введите значение x для проверки на двухзначность: ");
                    System.out.print("> ");
                    int num3 = input.nextInt();
                    System.out.println("Число двухзначно: " + task1.is2Digits(num3));
                    break;

                case 4:
                    // Задание 1.7
                    System.out.println("== Диапазон ==");
                    System.out.println("Введите границы a и b");
                    System.out.print("a = ");
                    int a4 = input.nextInt();
                    System.out.print("b = ");
                    int b4 = input.nextInt();
                    System.out.println("Введите число для проверки нахождения в диапазоне");
                    System.out.print("num = ");
                    int num4 = input.nextInt();
                    System.out.println(task1.isInRange(a4, b4, num4));
                    break;

                case 5:
                    // Задание 1.9
                    System.out.println("== Равенство ==");
                    System.out.print("a = ");
                    int a5 = input.nextInt();
                    System.out.print("b = ");
                    int b5 = input.nextInt();
                    System.out.print("c = ");
                    int c5 = input.nextInt();
                    System.out.println(task1.isEqual(a5, b5, c5));
                    break;

                case 6:
                    // Задание 2.1
                    System.out.println("== Модуль числа ==");
                    System.out.println("Введите число, для поиска его модуля");
                    System.out.print("x = ");
                    int x6 = input.nextInt();
                    System.out.println("Модуль числа: " + task2.abs(x6));
                    break;

                case 7:
                    // Задание 2.3
                    System.out.println("== Тридцать пять ==");
                    System.out.println("Введите значение, для проверки числа на деление на 3 или 5");
                    System.out.print("x = ");
                    int x7 = input.nextInt();
                    System.out.println(task2.is35(x7));
                    break;

                case 8:
                    // Задание 2.5
                    System.out.println("== Тройной максимум ==");
                    System.out.println("Введите значения для поиска максимума среди 3 чисел");
                    System.out.print("x = ");
                    int x8 = input.nextInt();
                    System.out.print("y = ");
                    int y8 = input.nextInt();
                    System.out.print("z = ");
                    int z8 = input.nextInt();
                    System.out.print("Максимум: " + task2.max3(x8, y8, z8));
                    break;

                case 9:
                    // Задание 2.7
                    System.out.println("== Двойная сумма ==");
                    System.out.println("Введите значения x и y для суммы двух чисел");
                    System.out.print("x = ");
                    int x9 = input.nextInt();
                    System.out.print("y = ");
                    int y9 = input.nextInt();
                    System.out.print("Сумма x и y: " + task2.sum2(x9, y9));
                    break;

                case 10:
                    // Задание 2.9
                    System.out.println("== День недели ==");
                    System.out.println("Введите число, для вывода дня недели");
                    System.out.print("x = ");
                    int day10 = input.nextInt();
                    System.out.println(task2.day(day10));
                    break;

                case 11:
                    // Задание 3.1
                    System.out.println("== Числа подряд ==");
                    System.out.println("Введите значение n, для вывода чисел от 0 до n");
                    System.out.print("n = ");
                    int n11 = input.nextInt();
                    System.out.println(task3.listNums(n11));
                    break;

                case 12:
                    // Задание 3.3
                    System.out.println("== Четные числа ==");
                    System.out.println("Введите положительное число x, для вывода четных чисел от 0 до x: ");
                    int number12;
                    do {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число");
                            System.out.print("> ");
                            input.next();
                        }
                        number12 = input.nextInt();
                        if (number12 <= 0) {
                            System.out.println("Ошибка: число должно быть положительным");
                            System.out.print("> ");
                        }
                    } while (number12 <= 0);
                    System.out.println(task3.chet(number12));
                    break;

                case 13:
                    // Задание 3.5
                    System.out.println("== Длина числа ==");
                    System.out.println("Введите число: ");
                    System.out.print("> ");
                    while (!input.hasNextLong()) {
                        System.out.println("Ошибка: введите целое число");
                        System.out.print("> ");
                        input.next();
                    }
                    long number13 = input.nextLong();
                    System.out.println(task3.numLen(number13));
                    break;

                case 14:
                    // Задание 3.7
                    System.out.println("== Квадрат ==");
                    System.out.println("Введите число: ");
                    System.out.print("> ");
                    int number14;
                    do {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число");
                            System.out.print("> ");
                            input.next();
                        }
                        number14 = input.nextInt();
                        if (number14 <= 0) {
                            System.out.println("Ошибка: число должно быть положительным");
                            System.out.print("> ");
                        }
                    } while (number14 <= 0);
                    task3.square(number14);
                    break;

                case 15:
                    // Задание 3.9
                    System.out.println("== Правый треугольник ==");

                    System.out.println("Введите число: ");
                    System.out.print("> ");
                    int number15;
                    do {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число");
                            System.out.print("> ");
                            input.next();
                        }
                        number15 = input.nextInt();
                        if (number15 <= 0) {
                            System.out.println("Ошибка: число должно быть положительным");
                            System.out.print("> ");
                        }
                    } while (number15 <= 0);
                    task3.rightTriangle(number15);
                    break;

                case 16:
                    // Задание 4.1
                    System.out.println("== Поиск первого значения ==");

                    System.out.println("Введите кол-во элементов массива: ");
                    System.out.print("> ");
                    while (!input.hasNextInt()) {
                        System.out.println("Ошибка: введите целое число ");
                        System.out.print("> ");
                        input.next();
                    }
                    int arrayLen16 = input.nextInt();
                    int[] arr16 = new int[arrayLen16];

                    System.out.println("Введите целочисленные элементы массива через пробел: ");
                    System.out.print("> ");
                    for (int i = 0; i < arrayLen16; i++) {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число ");
                            System.out.print("> ");
                            input.next();
                        }
                        arr16[i] = input.nextInt();
                    }
                    if (input.hasNextLine()) {
                        input.nextLine();
                    }

                    System.out.println("Введите число, индекс первого вхождения которого хотите узнать");
                    System.out.print("> ");
                    while (!input.hasNextInt()) {
                        System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
                        System.out.print("> ");
                        input.next();
                    }
                    int x16 = input.nextInt();
                    System.out.println("Первое вхождение числа на индексе: " + task4.findFirst(arr16, x16));
                    break;

                case 17:
                    // Задание 4.3
                    System.out.println("== Поиск максимального ==");

                    System.out.println("Введите кол-во элементов массива: ");
                    System.out.print("> ");
                    while (!input.hasNextInt()) {
                        System.out.println("Ошибка: введите целое число ");
                        System.out.print("> ");
                        input.next();
                    }
                    int arrayLen17 = input.nextInt();
                    int[] arr17 = new int[arrayLen17];

                    System.out.println("Введите целочисленные элементы массива через пробел: ");
                    System.out.print("> ");
                    for (int i = 0; i < arrayLen17; i++) {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число ");
                            System.out.print("> ");
                            input.next();
                        }
                        arr17[i] = input.nextInt();
                    }
                    if (input.hasNextLine()) {
                        input.nextLine();
                    }
                    System.out.println("Максимальное значение по модулю: " + task4.maxAbs(arr17));
                    break;

                case 18:
                    // Задание 4.5
                    System.out.println("== Добавление массива в массив ==");

                    System.out.println("Введите кол-во элементов первого массива: ");
                    System.out.print("> ");
                    int arrLen18;
                    do {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число");
                            System.out.print("> ");
                            input.next();
                        }
                        arrLen18 = input.nextInt();
                        if (arrLen18 <= 0) {
                            System.out.println("Ошибка: число должно быть положительным");
                            System.out.print("> ");
                        }
                    } while (arrLen18 <= 0);

                    int[] arr18 = new int[arrLen18];
                    System.out.println("Введите целочисленные элементы массива через пробел: ");
                    System.out.print("> ");
                    for (int i = 0; i < arrLen18; i++) {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число ");
                            System.out.print("> ");
                            input.next();
                        }
                        arr18[i] = input.nextInt();
                    }
                    if (input.hasNextLine()) {
                        input.nextLine();
                    }

                    System.out.println("Введите кол-во элементов второго массива: ");
                    System.out.print("> ");
                    int insLen18;
                    do {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число");
                            System.out.print("> ");
                            input.next();
                        }
                        insLen18 = input.nextInt();
                        if (insLen18 <= 0) {
                            System.out.println("Ошибка: число должно быть положительным");
                            System.out.print("> ");
                        }
                    } while (insLen18 <= 0);

                    int[] ins18 = new int[insLen18];
                    System.out.println("Введите целочисленные элементы массива через пробел: ");
                    System.out.print("> ");
                    for (int i = 0; i < insLen18; i++) {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число ");
                            System.out.print("> ");
                            input.next();
                        }
                        ins18[i] = input.nextInt();
                    }
                    if (input.hasNextLine()) {
                        input.nextLine();
                    }

                    System.out.println("Введите позицию, на которую хотите вставить второй массив");
                    while (!input.hasNextInt()) {
                        System.out.println("Ошибка: введите целое число ");
                        System.out.print("> ");
                        input.next();
                    }
                    int pos18 = input.nextInt();
                    System.out.println("Получившийся массив: ");
                    int[] add_arr18 = task4.add(arr18, ins18, pos18);
                    for (int i = 0; i < add_arr18.length; i++) {
                        System.out.print(add_arr18[i] + " ");
                    }
                    System.out.println();
                    break;

                case 19:
                    // Задание 4.7
                    System.out.println("== Возврат реверса ==");

                    System.out.println("Введите кол-во элементов массива: ");
                    System.out.print("> ");
                    int arrLen19;
                    do {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число");
                            System.out.print("> ");
                            input.next();
                        }
                        arrLen19 = input.nextInt();
                        if (arrLen19 <= 0) {
                            System.out.println("Ошибка: число должно быть положительным");
                            System.out.print("> ");
                        }
                    } while (arrLen19 <= 0);

                    int[] arr19 = new int[arrLen19];
                    System.out.println("Введите целочисленные элементы массива через пробел: ");
                    System.out.print("> ");
                    for (int i = 0; i < arrLen19; i++) {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число ");
                            System.out.print("> ");
                            input.next();
                        }
                        arr19[i] = input.nextInt();
                    }
                    if (input.hasNextLine()) {
                        input.nextLine();
                    }

                    System.out.println("Получившийся массив: ");
                    int[] reverseArr19 = task4.reverseBack(arr19);
                    for (int i = 0; i < reverseArr19.length; i++) {
                        System.out.print(reverseArr19[i] + " ");
                    }
                    System.out.println();
                    break;

                case 20:
                    // Задание 4.9
                    System.out.println("== Все вхождения ==");

                    System.out.println("Введите кол-во элементов массива: ");
                    System.out.print("> ");
                    int arrLen20;
                    do {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число");
                            System.out.print("> ");
                            input.next();
                        }
                        arrLen20 = input.nextInt();
                        if (arrLen20 <= 0) {
                            System.out.println("Ошибка: число должно быть положительным");
                            System.out.print("> ");
                        }
                    } while (arrLen20 <= 0);

                    int[] arr20 = new int[arrLen20];
                    System.out.println("Введите целочисленные элементы массива через пробел: ");
                    System.out.print("> ");
                    for (int i = 0; i < arrLen20; i++) {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число ");
                            System.out.print("> ");
                            input.next();
                        }
                        arr20[i] = input.nextInt();
                    }
                    if (input.hasNextLine()) {
                        input.nextLine();
                    }

                    int x20;
                    System.out.println("Введите число");
                    do {
                        while (!input.hasNextInt()) {
                            System.out.println("Ошибка: введите целое число");
                            System.out.print("> ");
                            input.next();
                        }
                        x20 = input.nextInt();
                        if (x20 <= 0) {
                            System.out.println("Ошибка: число должно быть положительным");
                            System.out.print("> ");
                        }
                    } while (x20 <= 0);

                    System.out.println("Массив с индексами вхождения: ");
                    int[] arrInx20 = task4.findAll(arr20, x20);
                    if (arrInx20.length == 0) {
                        System.out.println("Число " + x20 + " не найдено в массиве.");
                    } else {
                        for (int i = 0; i < arrInx20.length; i++) {
                            System.out.print(arrInx20[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Выход из программы...");
                    break;

                default:
                    System.out.println("Ошибка: выберите число от 0 до 20");
            }

        } while (choice != 0);

    }
}
