package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(99);
        Player player3 = new Player(93);

        Player.info();

        Player player4 = new Player(98);
        Player player5 = new Player(99);

        Player player6 = new Player(94);

        Player.info();

        Player player7 = new Player(100);

        Player.info();

        for (int i=1; i<100; i++)
        player5.run();

        Player.info();
    }
}





