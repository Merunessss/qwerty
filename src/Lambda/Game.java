package Lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Game extends Field {


    public static void main(String[] args) {

        Game game = new Game();

      ArrayList<Integer> fieldGame = new ArrayList<>();

        PlayerKub igrokOne = new PlayerKub("Igrok_One");
        PlayerKub igrokTwo = new PlayerKub("Igrok_Two");



        game.gamePlay(fieldGame, igrokOne,igrokTwo);

    }
}
