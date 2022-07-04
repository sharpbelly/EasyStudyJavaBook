package chapter07;

public class Q4TalkableTest {
    static void speak(Q4Talkable a){
        a.talk();
    }

    public static void main(String[] args) {
        speak(new Q4Korean());
        speak(new Q4American());
    }
}
