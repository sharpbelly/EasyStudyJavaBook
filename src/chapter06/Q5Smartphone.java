package chapter06;

public class Q5Smartphone extends Q5Telephone {
    private String game;

    Q5Smartphone(String owner, String game) {
        super(owner,"when");
        this.game = game;
    }

    void playGame() {
        System.out.printf("%s가 %s 게임을 하는 중이다.\n", owner, game);
    }
}
