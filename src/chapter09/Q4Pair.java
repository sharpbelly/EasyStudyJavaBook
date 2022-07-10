package chapter09;

public class Q4Pair<T> {
    T first;
    T second;

    public Q4Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public <T> T first(){
        return (T)this.first;
    }
    public <T> T second(){

        return (T) this.second;
    }
}
