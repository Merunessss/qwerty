package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exp {
    private String[][] source = {{"q", "й"}, {"w", "ц"}, {"e", "у"}, {"r", "к"}, {"t", "е"}, {"y", "н"}, {"u", "г"}, {"i", "ш"}, {"o", "щ"}, {"p", "з"}};

    public static void main(String[] args) {


        Exp exp = new Exp();

        exp.codeDecode("wqertyй");

//        int[][] twoDimeArr = new int[][]{{1, 3, 4, 7, 2, 3}, {3, 5, 6, 8, 4, 6, 3}, {2, 3, 8, 5, 456}};
//
//        int colCounter = 0;
//
//        int[] oneDimeArr1;//= new int[twoDimeArr[0].length];
//        int[] oneDimeArr2 = new int[twoDimeArr[1].length];
//        int[] oneDimeArr3 = new int[twoDimeArr[2].length];
//
//        for (int i = 0; i < twoDimeArr.length; i++) {
//            if (i == 0) {
//                oneDimeArr1 = twoDimeArr[i];
//            }
//
//            //to be continued
//
//        }
//
//        int countElem = 0;
//
//        for (int i = 0; i < twoDimeArr.length; i++) {
//            for (int j = 0; j < twoDimeArr[i].length; j++) {
//                System.out.print(twoDimeArr[i][j] + " ");
//                countElem++;
//            }
//        }
//
//        int[] oneArr = new int[countElem];
//        int arrCount = 0;
//
//        for (int i = 0; i < twoDimeArr.length; i++) {
//            for (int j = 0; j < twoDimeArr[i].length; j++) {
//                oneArr[arrCount] = twoDimeArr[i][j];
//                arrCount++;
//            }
//        }
//        System.out.print(Arrays.toString(oneArr));
//        MathUtil math = new MathUtil();
//
//        math.sortArrayBubble(oneArr);
//
//        int arrCount2 = 0;
//
//        for (int i = 0; i < twoDimeArr.length; i++) {
//            for (int j = 0; j < twoDimeArr[i].length; j++) {
//                twoDimeArr[i][j] = oneArr[arrCount2];
//                arrCount2++;
//            }
//        }
//
//        System.out.print(Arrays.deepToString(twoDimeArr));


        //разделение


//        Human hum33 = new Human(27, "aasa");
//        Human[] group = {new Human(21, "ewe"), new Human(45, "eew"), hum33};
//
//        group[0].eating();
//        Object[] array = {2, "eewew", 27,hum33};
//       // ((Human) array[2]).eating();
//
//        int[] arr = {3, 7, 9, 12};
//       // new Human(23, 'sd').eating();
//      //  System.out.println("qwqw7ddfdf7fddfdf".split("7"));
//
//        String[] stringArr = "Все,те\\на[ли бороговы, Пратчет".split("[\\[1-9:\\-.;, ]");
//String var="wewe\\sdfgh";
////" one\ two \ three  \\
// // [a-zA-Z0-9]  w  5   q4(-)
// //  [a-zA-Z0-9]{2}  QW 34 qw3
// //  [a-zA-Z0-9]{1,5}  qwe  QW345 w 1 12345
// // 044 - 12-12-123  044-[0-9]{2}-[0-9]{2}-[0-9]{3}
//        String regexpPhone="044-[0-9]{2}-[0-9]{2}-[0-9]{3}";
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter tel phone 044-**-**-***");
//        String telephone = scanner.nextLine();
//        System.out.println(telephone.matches(regexpPhone));
//        Exp exp=new Exp();
//        System.out.println(exp.insertLetterInPosition("1234567",3,'-'));
//        System.out.println(exp.dash(telephone));
////       // System.out.println(var);
////        for(int i = 0; i < stringArr.length; i++){
////            System.out.print(stringArr[i] + " ");
////
////        }
//    }
//
//String dash(String row) {
//   String result="";
//    result=insertLetterInPosition(row,3,'-');
//    result=insertLetterInPosition(result,6,'-');
//    result=insertLetterInPosition(result,8,'-');
//
//   return  result;
//}
//
//    private String insertLetterInPosition(String row, int index, char symbol) {
//        String result="";
//        char[] array=row.toCharArray();
//        for (int i = 0; i <array.length ; i++) {
//
//              result=(i!=index)?result+array[i]:result+symbol+array[i];
//
//        }
//        return result;
    }

    String codeDecode(String inputWord) {
        StringBuffer result = new StringBuffer("");

        String[][] source = {{"q", "й"}, {"w", "ц"}, {"e", "у"}, {"r", "к"}, {"t", "е"}, {"y", "н"}, {"u", "г"}, {"i", "ш"}, {"o", "щ"}, {"p", "з"}};
        String[] aWord = inputWord.split("");
//final  int var1=78;
//var1=34;
        for (int i = 0; i < aWord.length; i++) {
            for (int j = 0; j < source.length; j++) {
                if (source[j][0].equals(aWord[i])) {
                    result.append(source[j][1]);
                } else if (source[j][1].equals(aWord[i])) {
                    result.append(source[j][0]);
                } else {
                    System.out.println("those ain't no letters");
                    break;
                }
            }
        }

        System.out.println(result);
        return result.toString();
    }

}

