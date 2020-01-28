package Lambda;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    ArrayList<Cell> cellsQuant = new ArrayList<>();

    ArrayList<PlayerKub> playersList = new ArrayList<>();
    int currentPlayer = 0;


    public Game(int sizeField, PlayerKub... players) {
        TypeCell[] source = TypeCell.values();
        Random random = new Random();
        while (cellsQuant.size() <= sizeField) {
            cellsQuant.add(new Cell(source[random.nextInt(source.length - 1)]));
            for (PlayerKub temp : players) {
                playersList.add(temp);
            }

        }

    }


    public static void main(String[] args) {

        boolean iSwinner = false;

        PlayerKub igrok = new PlayerKub("Vasya");
        PlayerKub igrokDva = new PlayerKub("Kolya");
        PlayerKub igrokTri = new PlayerKub("Gena");

        Game gameOne = new Game(50, igrok, igrokDva, igrokTri);

        while (iSwinner == false ){
            for (PlayerKub temp : gameOne.playersList) {
                int kost = gameOne.throwKubik();
                if (temp.freez == 0) {
                    int var=temp.currentPlace+kost;
                    if(var>=gameOne.cellsQuant.size()-1){
                       iSwinner=true;
                       break;
                    }
                    Cell currentCell = gameOne.cellsQuant.get(var);
                    currentCell.prigovor(temp, gameOne.cellsQuant.size());
                    System.out.println(temp);
                    if(temp.currentPlace == gameOne.cellsQuant.size()-1){
                        iSwinner = true;
                        break;
                    }
                } else {
                    temp.freez--;
                    System.out.println("POKURITE");
                }
            }
        }



    }


    int throwKubik() {
        Random random = new Random();
        int result = random.nextInt(5) + 1;
        currentPlayer = currentPlayer == (playersList.size() - 1) ? 0 : currentPlayer++;
        return result;
    }

//    void gamePlay(ArrayList<Integer> field, PlayerKub playerOne, PlayerKub playerTwo) {
//        int winnerFirstCount = 0;
//        int winnnerSecondCount = 0;
//
//        while (winnerFirstCount <= 20 && winnnerSecondCount <= 20) {
//
//
//            int firstGo = throwKubik();
//            switch (firstGo) {
//
//                case 1:
//                    field.add(firstGo);
//                    System.out.println("1 все ок");
//                    winnerFirstCount += firstGo;
//                    break;
//                case 2:
//                    field.add(firstGo);
//                    System.out.println("1 не получилось, пропуск");
//                    winnerFirstCount += firstGo;
//                    break;
//                case 3:
//                    field.add(firstGo);
//                    System.out.println("1 PODEDA");
//                    winnerFirstCount += firstGo;
//                    break;
//                case 4:
//                    field.add(firstGo);
//                    System.out.println("1 VOT ETO DA");
//                    winnerFirstCount += firstGo;
//                    break;
//                case 5:
//                    field.add(firstGo);
//                    System.out.println("1 Sopernik NOOB");
//                    winnerFirstCount += firstGo;
//                    break;
//                case 6:
//                    field.add(firstGo);
//                    System.out.println("1 NORMUL");
//                    winnerFirstCount += firstGo;
//                    break;
//                default:
//                    break;
//            }
//
//
//            int secondGo = throwKubik();
//
//            switch (secondGo) {
//
//                case 1:
//                    field.add(secondGo);
//                    System.out.println("2 все ок");
//                    winnerFirstCount += firstGo;
//                    break;
//                case 2:
//                    field.add(secondGo);
//                    System.out.println("2 не получилось, пропуск");
//                    winnerFirstCount += firstGo;
//                    break;
//                case 3:
//                    field.add(secondGo);
//                    System.out.println("2 PODEDA");
//                    winnerFirstCount += firstGo;
//                    break;
//                case 4:
//                    field.add(secondGo);
//                    System.out.println("2 VOT ETO DA");
//                    winnerFirstCount += firstGo;
//                    break;
//                case 5:
//                    field.add(secondGo);
//                    System.out.println("2 Sopernik NOOB");
//                    winnerFirstCount += firstGo;
//                    break;
//                case 6:
//                    field.add(secondGo);
//                    System.out.println("2 NORMUL");
//                    winnerFirstCount += firstGo;
//                    break;
//                default:
//                    break;
//            }
//        }
//
//      }


}
