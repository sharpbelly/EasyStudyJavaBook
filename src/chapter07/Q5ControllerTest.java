package chapter07;

public class Q5ControllerTest {
    public static void main(String[] args) {
        Q5Controller[] c = {new Q5TV(false), new Q5Radio(true)};

        for(Q5Controller controller : c){
            controller.show();
        }
    }
}
