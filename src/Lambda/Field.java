package Lambda;

import java.util.ArrayList;
import java.util.Random;

public class Field {


    public static void main(String[] args) {




    }


    int throwKubik (){
        Random random = new Random();
        int result = random.nextInt(5)+1 ;
        return result;
    }

    void gamePlay(ArrayList<Integer> field, PlayerKub playerOne, PlayerKub playerTwo) {
        int winnerFirstCount = 0;
        int winnnerSecondCount = 0;

        while (winnerFirstCount <= 20 && winnnerSecondCount <= 20) {


            int firstGo = playerOne.throwKubik();
            switch (firstGo) {

                case 1:
                    field.add(firstGo);
                    System.out.println("1 все ок");
                    winnerFirstCount += firstGo;
                    break;
                case 2:
                    field.add(firstGo);
                    System.out.println("1 не получилось, пропуск");
                    winnerFirstCount += firstGo;
                    break;
                case 3:
                    field.add(firstGo);
                    System.out.println("1 PODEDA");
                    winnerFirstCount += firstGo;
                    break;
                case 4:
                    field.add(firstGo);
                    System.out.println("1 VOT ETO DA");
                    winnerFirstCount += firstGo;
                    break;
                case 5:
                    field.add(firstGo);
                    System.out.println("1 Sopernik NOOB");
                    winnerFirstCount += firstGo;
                    break;
                case 6:
                    field.add(firstGo);
                    System.out.println("1 NORMUL");
                    winnerFirstCount += firstGo;
                    break;
                default:
                    break;
            }


            int secondGo = playerTwo.throwKubik();

            switch (secondGo) {

                case 1:
                    field.add(secondGo);
                    System.out.println("2 все ок");
                    winnerFirstCount += firstGo;
                    break;
                case 2:
                    field.add(secondGo);
                    System.out.println("2 не получилось, пропуск");
                    winnerFirstCount += firstGo;
                    break;
                case 3:
                    field.add(secondGo);
                    System.out.println("2 PODEDA");
                    winnerFirstCount += firstGo;
                    break;
                case 4:
                    field.add(secondGo);
                    System.out.println("2 VOT ETO DA");
                    winnerFirstCount += firstGo;
                    break;
                case 5:
                    field.add(secondGo);
                    System.out.println("2 Sopernik NOOB");
                    winnerFirstCount += firstGo;
                    break;
                case 6:
                    field.add(secondGo);
                    System.out.println("2 NORMUL");
                    winnerFirstCount += firstGo;
                    break;
                default:
                    break;
            }
        }


    }


}
