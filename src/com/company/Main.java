package com.company;


import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {



        /*
           Сортировка выбором

Рассмотрим пример сортировки по возрастанию. То есть, в результате выполнения программы,
на начальной позиции в массиве должен стоять минимальный элемент,
 на следующей — больший или равный и т. д., на последнем месте должен стоять наибольший элемент.
Суть алгоритма такова. Во всём массиве отыскиваем минимальный элемент,
меняем его местами с начальным. Затем в оставшейся части массива
 (т. е. среди всех элементов кроме начального) снова отыскиваем минимальный элемент,
  меняем его местами уже со вторым элементом в массиве. И так далее.
  Другими словами, берем нулевой элемент и определяем его как временно наименьший элемент и сравниваем последовательно с остальными,
   пока он меньше других. Если он вдруг оказывается больше очередного элемента в цепи сравнений,
    то определяем его как временно наименьший и продолжаем движение по массиву.
    В конце этот временно наименьший элемент ставим в нулевую ячейку (так как он действительно наименьший в данном массиве)
     а на его месть переносим элемент из нулевой ячейки (меняем их местами).
      Следующую итерацию начинаем со следующей (не нулевой а уже первой ячейки). И.Т.Д.

         */





        


        /*
        Дан массив произвольных положительных чисел. Так же дано число Х.
         Найти ближайшее число из массива к числу Х не более чем за один проход массива.
                   Например:
                   Массив 2, 6, 9, 4, 1, 23, 55
                   Число Х=10
                   Ближайшим является число 9
         */

//        int[] arr = new int[10];
//        Random random = new Random();
//        int x = 15, closestD = 0;
//
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = random.nextInt(99);
//            System.out.print(arr[i] + " ");
//            if(i != 0){
//                if(Math.abs(closestD - x) > Math.abs(arr[i] - x)){
//                    closestD = arr[i];
//                }
//            } else{
//              closestD = arr[i];
//            }
//        }
//
//        System.out.println();
//
//        System.out.println(closestD);

//
//
//
//        int[] arr = new int[7];
//        Random random = new Random();
//        int x = 10, closestDigit = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(91);
//            System.out.print(arr[i] + " ");
//            if (i != 0) {
//                if (Math.abs(closestDigit - 10) > Math.abs(arr[i] - 10)) {
//                    closestDigit = arr[i];
//                }
//            } else {
//                closestDigit = arr[i];
//            }
//        }
//
//        System.out.println();
//
//        System.out.println(closestDigit);



        /*
        Интересная задачка
     Для проверки остаточных знаний учеников после летних каникул,
     учитель младших классов решил начинать каждый урок с того,
     чтобы задавать каждому ученику пример из таблицы умножения,
     но в классе 15 человек, а примеры среди них не должны повторяться.
     В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров из таблицы умножения (от 2*2 до 9*9,
      потому что задания по умножению на 1 и на 10 — слишком просты).
      При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
         */


//        int[][] arr = new int[15][3];
//        Random random = new Random();
//
//        for(int i = 0; i < arr.length; i++){
//            arr[i][0] = random.nextInt(8) + 2;
//            arr[i][1] = random.nextInt(8) + 2;
//            arr[i][2] = arr[i][0] * arr[i][1];
//
//
//            boolean flag = false;
//
//            for(int j = 0; j < i; j++){
//                if(arr[i][0] == arr[j][0] && arr[i][1] == arr[j][1] || arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]){
//                    i--;
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag){
//               continue;
//            }
//
//            System.out.println(arr[i][0] + " * " + arr[i][1] + " = " + arr[i][2]);
//        }




        /*
        Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
         Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
          При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
          Порядок остальных элементов строки не важен (т.е. можно совершить только одну перестановку, а можно отсортировать по убыванию каждую строку).
          Вывести преобразованный массив на экран.
         */

//        int[][] arr = new int[6][7];
//        Random random = new Random();
//
//        for(int i = 0; i < arr.length; i++){
//            int maxIndex = 0, max = 0;
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j] = random.nextInt(10);
//                System.out.print(arr[i][j] + " ");
//                if(arr[i][j] > max){
//                    max = arr[i][j];
//                    maxIndex = j;
//                }
//            }
//
//            arr[i][maxIndex] = arr[i][0];   // вариант без темпа, ниже вариант с темпом
//            arr[i][0] = max;
//
//
////            int temp = arr[i][0];
////            arr[i][0] = max;
////            arr[i][maxIndex] = temp;
////            System.out.println();
//        }
//
//        System.out.println( " ######## ");
//
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }



        /*
        Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5; 5]. Вывести массив на экран.  Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.
         */


//        int[][] arr = new int[7][4];
//        Random random = new Random();
//        int maxIndex = 0, maxMult = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int mult = 1;
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(11) - 5;
//                System.out.print(arr[i][j] + " ");
//                mult *= arr[i][j];
//            }
//            if (Math.abs(mult) > maxMult) {
//                maxMult = Math.abs(mult);
//                maxIndex = i;
//            }
//            System.out.println(" # " + mult);
//        }
//
//        System.out.println(maxIndex);


        //SECOND

//        int[][] arr = new int[7][4];
//        int[] arr1 = new int[arr.length];
//        Random random = new Random();
//        int maxMult = 0, maxIndex = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(11) - 5;
//                System.out.print(arr[i][j] + " ");
//                if (j == 0) {
//                    arr1[i] = arr[i][j];
//                } else {
//                    arr1[i] = arr1[i] * arr[i][j];
//                }
//            }
//            System.out.println(" & " + arr1[i]);
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (Math.abs(arr1[i]) > maxMult) {
//                maxMult = Math.abs(arr1[i]);
//                maxIndex = i;
//            }
//            System.out.print(arr1[i] + " # ");
//        }
//
//
//        System.out.println();
//
//        System.out.println("Max * MODUL = " + maxMult + " AND MAX INDEX  = " + maxIndex);





        /*
       Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99; 99].
         Вывести массив на экран.
        После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).
         */


//        int[][] arr = new int[5][8];
//        Random random = new Random();
//        int max = -99;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(199) - 99;
//                System.out.print(arr[i][j] + " ");
//                if(arr[i][j] > max){
//                    max = arr[i][j];
//                }
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        System.out.println(max);


        /*
        Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10; 99].
        Вывести массив на экран.
         */


//        int[][] arr = new int[8][5];
//        Random random = new Random();
//
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j] = random.nextInt(80) + 10;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


//        int[][] arr1 = new int[][]{{1, 2, 3, 4, 5}, {0, -1, -2}, {10, 5, 15, 12}};       // не семметричная матрица

        /*
        Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
         Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
         Создать массив из n случайных целых чисел из отрезка [0; n] и вывести его на экран.
          Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
         */


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int n = 0;
//        int arr2Lenght = 0;
//
//        do {
//            System.out.println("Введите натуральное число больше 3");
//            if (scanner.hasNextInt()) {
//                n = scanner.nextInt();
//            } else {
//                scanner.nextLine();
//            }
//        } while (n <= 3);
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(n + 1);
//            System.out.print(arr[i] + " ");
//            if (arr[i] % 2 == 0 && arr[i] != 0) {
//                arr2Lenght++;
//            }
//        }
//
//        System.out.println();
//
//        int[] arr2 = new int[arr2Lenght];
//
//        for (int i = 0, j = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0 && arr[i] != 0) {
//                arr2[j] = arr[i];
//                System.out.print(arr2[j] + " ");
//                j++;
//            }
//        }



        /*
        Создать массив из n случайных целых чисел из отрезка [0; n] и вывести его на экран.
        Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

         */

//        int n = 8;
//        int arrOneLenght = 0;
//        int[] arr = new int[n];
//        Random random = new Random();
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(n + 1);
//            System.out.print(arr[i] + " ");
//            if (arr[i] % 2 == 0 && arr[i] != 0) {
//                arrOneLenght++;
//            }
//        }
//
//        int[] arr2 = new int[arrOneLenght];
//
//        System.out.println();
//
//        for (int i = 0, j = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0 && arr[i] != 0) {
//                arr2[j] = arr[i];
//                System.out.print(arr2[j] + " ");
//                j++;
//            }
//        }



        /*
        Программа должна создать массив из 12 случайных целых чисел из отрезка [-10; 10] таким образом,
         чтобы отрицательных и положительных элементов там было поровну и не было нулей.
          При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант,
           когда в массиве постоянно выпадает сначала 6 положительных,
           а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.



           Через один фор решить дома
         */


        // second variant

//
//        int[] arr = new int[12];
//        Random random = new Random();
//        int counterPlus = 0;
//        int counterMinus = 0;
//        int counter = 0;

//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(21) - 10;
//            if (arr[i] > 0) {
//                if (counterPlus < arr.length / 2) {
//                    counterPlus++;
//                } else {
//                    i--;
//                    continue;
//                }
//            } else if (arr[i] < 0) {
//                if (counterMinus < arr.length / 2) {
//                    counterMinus++;
//                } else {
//                    i--;
//                    continue;
//                }
//            } else {
//                i--;
//                continue;
//            }
//        }

        //first variant

//        do {
//            counterMinus = 0;
//            counterPlus = 0;
//
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = random.nextInt(21) - 10;
//                if (arr[i] > 0) {
//                    counterPlus++;
//                }
//                if (arr[i] < 0) {
//                    counterMinus++;
//                }
//                if (arr[i] == 0) {
//                    i--;
//                    continue;
//                }
//            }
//
//            counter++;
//        } while (counterMinus != counterPlus);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        System.out.println(counter);




        /*
        Пользователь должен указать с клавиатуры чётное положительное число,
         а программа должна создать массив указанного размера из случайных целых чисел из [-5; 5] и вывести его на экран в строку.
         После этого программа должна определить и сообщить пользователю о том,
         что сумма модулей какой половины массива больше: левой или правой, либо сообщить,
         что эти суммы модулей равны. Если пользователь введёт неподходящее число,
         то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.

         */

//        Scanner scanner = new Scanner(System.in);
//        int arrLenght = 0;
//        boolean flag = true;
//        Random random = new Random();
//        int counterPlus = 0;
//        int sum2 = 0;
//
//        do {
//            System.out.println("Enter digit");
//            if (scanner.hasNextInt()) {
//                arrLenght = scanner.nextInt();
//                if (arrLenght > 0 && arrLenght % 2 == 0) {
//                    flag = false;
//                }
//            } else {
//                scanner.nextLine();
//            }
//
//        } while (flag);
//
//        int[] arr = new int[arrLenght];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(11) - 5;
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arr.length / 2; i++) {
//            if(arr[i] < 0){
//                counterPlus = counterPlus - arr[i];    // counterPlus - arr[i] * -1   the same thing
//            } else {
//                counterPlus = counterPlus + arr[i];
//            }
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = arr.length / 2; i < arr.length; i++) {
//            if(arr[i] < 0){
//                sum2 = sum2 - arr[i];    // counterPlus - arr[i] * -1   the same thing
//            } else {
//                sum2 = sum2 + arr[i];
//            }
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        if (counterPlus > sum2) {
//            System.out.println(counterPlus + "Left sum is bigger");
//        } else if (sum2 > counterPlus) {
//            System.out.println(sum2 + "Right sum is bigger");
//        } else {
//            System.out.println("Both are equal");
//        }



        /*
        Создайте два массива из 10 целых случайных чисел из отрезка [1; 9] и третий массив из 10 действительных чисел.
         Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива
         с i-ым индексом к элементу из второго массива с i-ым индексом.
          Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
         */

//        int[] arr1 = new int[10];
//        int[] arr2 = new int[10];
//        double[] arr3 = new double[10];
//        Random random = new Random();
//        int integers = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = random.nextInt(9) + 1;
//            arr2[i] = random.nextInt(9) + 1;
//            arr3[i] = (double) arr1[i] / arr2[i];
//            if (arr3[i] == (int) arr3[i]) {
//                integers++;
//            }
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(arr3[i] + " ");
//        }
//
//        System.out.println();
//
//        System.out.print("Total Integers " + integers);





        /*
        Создайте массив из 11 случайных целых чисел из отрезка [-1; 1], выведите массив на экран в строку.
         Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
         Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
         */


//
//        int[] arr = new int[11];
//        Random random = new Random();
//        int zero = 0;
//        int minus = 0;
//        int plus = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(3) - 1;
//            System.out.print(arr[i] + " ");
//            if (arr[i] == 0) {
//                zero++;
//            }
//            if (arr[i] == -1) {
//                minus++;
//            }
//            if (arr[i] == plus) {
//                plus++;
//            }
//        }
//
//        System.out.println();
//
//        if (zero > minus && zero > plus) {
//            System.out.println("0");
//        }
//
//        if (minus > zero && minus > plus) {
//            System.out.println("-1");
//        }
//
//        if (plus > zero && plus > minus) {
//            System.out.println("1");
//        }



        /*
        Создайте массив из 12 случайных целых чисел из отрезка [-15; 15].
         Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
         */


//        int[] arr = new int[12];
//
//        Random random = new Random();
//        int max = -15;
//        int index = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(31) - 15;
//            System.out.print(arr[i] + " ");
//            if(max <= arr[i]){
//                max = arr[i]; // 12
//                index = i; // 1
//            }
//        }
//
//        System.out.println();
//
//        System.out.print(index);






        /*
        Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
        Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.

         //             for(int i = 0, a = 0, b = 1; i < 11; i++){
//                 System.out.print(b + " ");
//                 b = a + b;
//                 a = b - a;
//             }


         */


//        int[] arr = new int[20];
//
//        for(int i = 0, a = 0, b = 1; i < arr.length; i++){
//            arr[i] = b;
//            b = a + b;
//            a = b - a;
//        }
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//
//
//        for(int i = 0, a = 0, b = 1; i < arr.length; i++){
//            System.out.print((arr[i] = b) + " ");
//            b = a + b;
//            a = b - a;
//        }
//






        /*
        Создайте массив из 4 случайных целых чисел из отрезка [10; 99], выведите его на экран в строку.
        Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
         */

        //       NOVOE

//        Random random = new Random();
//        boolean flag = true;
//        int[] arr = new int[4];
//
//
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = random.nextInt(90) + 10;
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        for(int i = 0; i < arr.length - 1; i++){
//            if(arr[i] >= arr[i + 1]){
//                flag = false;
//                break;
//            }
//        }
//
//        if(flag){
//            System.out.println("All rising sequence");
//        } else {
//            System.out.println("Not rising sequence");
//        }

//                NOVOE

//        int[] arr = new int[]{10, 20, 30, 40};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        boolean flag = true;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] >= arr[i + 1]) {
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag) {
//            System.out.println(" VSE RISING SEQUENCE");
//        } else {
//            System.out.println(" NE RISING SEQUENCE");
//        }



        /*
           Создайте 2 массива из 5 случайных целых чисел из отрезка [0; 5] каждый,
           выведите массивы на экран в двух отдельных строках.
            Посчитайте среднее арифметическое элементов каждого массива и сообщите,
            для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
         */


//        НОВОЕ
//        int arrLenght =5, sum1 = 0, sum2 = 0, medAr1, medAr2;
//        int[] arr1 = new int[arrLenght];
//        int[] arr2 = new int[arrLenght];
//        Random random = new Random();
//
//        for(int i = 0; i < arr1.length; i++){
//            arr1[i] = random.nextInt(6);
//            System.out.print(arr1[i] + " ");
//            sum1 += arr1[i];
//        }
//
//        System.out.println();
//
//        for(int i = 0; i < arr2.length; i++){
//            arr2[i] = random.nextInt(6);
//            System.out.print(arr2[i] + " ");
//            sum2 += arr2[i];
//        }
//
//        System.out.println();
//
//        medAr1 = sum1 / arrLenght;
//        medAr2 = sum2 / arrLenght;
//
//        if(medAr1 > medAr2){
//            System.out.println(medAr1 + " Biggest medAr1");
//        } else if(medAr2 > medAr1){
//            System.out.println(medAr2 + " Biggest medAr2");
//        } else {
//            System.out.println("Both medAr are equal");
//        }
        // НОВОЕ


//        int arrLenght = 5;
//        int[] arr1 = new int[arrLenght];
//        int[] arr2 = new int[arrLenght];
//        int counterPlus = 0;
//        int sum2 = 0;
//        Random random = new Random();
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = random.nextInt(6);
//            System.out.print(arr1[i] + " ");
//            counterPlus += arr1[i];
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = random.nextInt(6);
//            System.out.print(arr2[i] + " ");
//            sum2 += arr2[i];
//        }
//
//        System.out.println();
//
//        if (counterPlus > sum2) {
//            System.out.println(counterPlus);
//        } else if (counterPlus < sum2) {
//            System.out.println(sum2);
//        } else {
//            System.out.println("PABNbI");
//        }


        /*
        Создайте массив из 8 случайных целых чисел из отрезка [1; 10]. Выведите массив на экран в строку.
         Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
         */

//        int[] arr = new int[8];
//        Random random = new Random();
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10) + 1;
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 != 0) {
//                arr[i] = 0;
//            }
//            System.out.print(arr[i] + " ");
//        }

        /*
        Создайте массив из 15 случайных целых чисел из отрезка [0; 9]. Выведите массив на экран.
         Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
         */

//
//        int[] arr = new int[15];
//        int chetnie = 0;
//        Random random = new Random();
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10);
//            System.out.print(arr[i] + " ");
//            if (arr[i] % 2 == 0 && arr[i] > 0) {
//                chetnie++;
//            }
//        }
//
//        System.out.println();
//        System.out.println(chetnie);


        /*
        Создайте массив из всех нечётных чисел от 1 до 99,
         выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке.
         */

// POVTOR


//        int[] arr;
//        int arrLenght = 0;
//
//        for(int i = 0; i < 100; i++){
//            if(i % 2 != 0){
//                arrLenght++;
//            }
//        }
//
//        arr = new int[arrLenght];
//
//
//        for(int i = 1, j = 0; i < 100; i++){
//            if(i % 2 != 0){
//                arr[j] = i;
//                System.out.print(arr[j] + " ");
//                j++;
//            }
//        }
//
//        System.out.println();
//
//        for(int i = arr.length - 1; i > -1; i--){
//            System.out.print(arr[i] + " ");
//        }

// POVTOR


//        int[] arr;
//        int arrLenght = 0;
//
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 != 0) {
//                arrLenght++;
//            }
//        }
//
//        arr = new int[arrLenght];
//
//        for (int i = 1, j = 0; i < 100; i++) {
//            if (i % 2 != 0) {
//                arr[j] = i;
//                System.out.print(arr[j] + " ");
//                j++;
//
//            }
//        }
//
//        System.out.println();
//
//        for (int i = arr.length - 1; i > -1; i--) {
//            System.out.print(arr[i] + " ");
//        }


        // ВТОРОЕ РЕШЕНИЕ УПРОЩЕННОЕ (wrong)


//        int[] arr = new int[100];
//
//        for(int i = 1; i < 100; i += 2){
//            arr[i] = i;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        for(int i = 99; i > 0; i -= 2){
////            arr[i] = i;
//            System.out.print(arr[i] + " ");
//        }



        /*
        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
2 4 6 … 18 20
2
4
6
…
20

         */

//        int[] arr = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }


        /*
        Задача 2. Дан массив действительныx чисел. Вычислить сумму положительных и произведение четных  по значению членов данного массива.
        Если членов с положительными или четными значениями нет, то выдать  соответствующее сообщение.
         */

        //NEW


//        Random random = new Random();
//        int n = 4;
//
//        int[] arr = new int[n];
//
//        int sum = 0;
//        int mul = 1;
//
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = random.nextInt(10);
//            if(arr[i] >=0){
//                sum += arr[i];
//            }
//            if(arr[i] % 2 == 0 && arr[i] != 0){
//                mul *= arr[i];
//            }
//        }
//
//        System.out.println(sum + " " + " " + mul);

        //NEW

//        int[] arr = new int[]{1, -2, 3, 0, 5, -6, 7, 8, -9, 10};
//
//        int resultSum = 0;
//        int resultMul = 1;
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > 0){
//                resultSum = resultSum + arr[i];
//            }
//            if(arr[i] % 2 == 0 && arr[i] != 0){
//                resultMul = resultMul * arr[i];
//            }
//        }
//
//        System.out.println(resultSum + " " + resultMul);



        /*
        Задача 1. Дан массив чисел: а[0], arrLenght[1], arrLenght[2], ..., а[n-1].
         Выяснить, имеются ли в данном массиве два идущих подряд  положительных элемента. Подсчитать количество таких пар.
         */

//        int[] arr = new int[]{1, -2, 3, 0, 5, -6, 7, 8, -9, 10};
//
//        int counter = 0;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if(arr[i] >= 0 && arr[i + 1] >= 0){
//                counter++;
//            }
//        }
//
//        System.out.println(counter);


//        int[] arr = new int[5];
//
//        int[] arr1;
//
//        int[] arr2 = new int[]{13, -1, 8, 0, 65, 33};
//
//        arr1 = new int[4];
//
//        arr[4] = 7;
//        arr[3] = -3;
//        arr[1] = 23;
//        arr[2] = arr[4] - arr[3];
//        arr[0] = 1;
//
//        int[] arr3, arr4, arr5;
        Main qwe = new Main();
        Main qwe1 = new Main();
        qwe.two();
qwe1.two();
for1();
        int[] arr1 = new int[]{7, 2, 5, 1, 4};

//        qwe.createArr(arr1);

//        int[] arr1 = new int[]{7, 2, 5, 1, 4};
//        ArrayList<int[]>  list=new ArrayList<>();
//        list.add(arr);
//        list.add(arr1);
//        for(int i=0;i<list.size();i++){
//           qwe.sortArray(list.get(i));
//        }

//        qwe.swap(arr23, 1, 2);
//        qwe.sortArray(arr);
//        qwe.sortArray(arr1);
//        System.out.println("--=-=-= " + qwe.indexOfMinPos(arr23, 0));
//        int w = qwe.sumArray(arr23);
//        System.out.println(w);
    }

    /*
          Сортировка выбором

Рассмотрим пример сортировки по возрастанию. То есть, в результате выполнения программы,
на начальной позиции в массиве должен стоять минимальный элемент,
на следующей — больший или равный и т. д., на последнем месте должен стоять наибольший элемент.
Суть алгоритма такова. Во всём массиве отыскиваем минимальный элемент,
меняем его местами с начальным. Затем в оставшейся части массива
(т. е. среди всех элементов кроме начального) снова отыскиваем минимальный элемент,
 меняем его местами уже со вторым элементом в массиве. И так далее.
 Другими словами, берем нулевой элемент и определяем его как временно наименьший элемент и сравниваем последовательно с остальными,
  пока он меньше других. Если он вдруг оказывается больше очередного элемента в цепи сравнений,
   то определяем его как временно наименьший и продолжаем движение по массиву.
   В конце этот временно наименьший элемент ставим в нулевую ячейку (так как он действительно наименьший в данном массиве)
    а на его месть переносим элемент из нулевой ячейки (меняем их местами).
     Следующую итерацию начинаем со следующей (не нулевой а уже первой ячейки). И.Т.Д.

        */
    void sortArray(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int posMin = indexOfMinPos(arr, i);
            swap(arr, i, posMin);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
//
//
//        System.out.println();
//
//        int counter = 0;
//        while (counter < arr.length) {
//            System.out.print(arr[counter] + " ");
//            counter++;
//        }


    }      //2, 4 , 6 , 3 ,8 , 10

    void swap(int[] arr, int index1, int index2) {
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

        } else {
            System.out.println("Enter different digits");
        }

    }
//  2,7,4,1    1, 7,4,2   1,2, 4,7   1,2,4,7

    int indexOfMinPos(int[] arr, int startP) {
        int index = startP;
        //  int currentMin = arr[startP];
        for (int i = startP; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                // currentMin = arr[i];
                index = i;
            }
        }
        //System.out.println(index);
        return index;
    }

    int sumArray(int[] arr45) {
        int result = 0;
        for (int temp : arr45){
            System.out.println(arr45);
            result += temp;
        }
        return result;
    }

    void createArr(int[] arr){
two();
for1();
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " / ");
        }

    }

int two(){
    System.out.println("asasasasa");
return 3;
    }

    static int for1(){
      return 5;
    }

}
