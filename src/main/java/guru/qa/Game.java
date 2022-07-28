package guru.qa;

public class Game {

    public static void main(String[] args) {
        PlayerVolleyball player1 = new PlayerVolleyball("Ivan", 198, "spiker");
        PlayerVolleyball player2 = new PlayerVolleyball("Jendrik", 198, "defender");

        player1.supply();
        player2.suited();
        player1.pass();
        player2.atack();
    }
}
