package chapter09;

@SuppressWarnings("ALL")
public class Q7 {
    public static void main(String[] args) {
        Q7Box<Number> i = new Q7Box<>();
        i.set(new Integer(100));
        System.out.println(i.get());

        Q7Box<String> s = new Q7Box<>();
        s.set("만능이네!");
        System.out.println(s.get());
    }
}
