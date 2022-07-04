package chapter07;

abstract class ChallangeCountable {
    protected String name;
    protected int num;
    abstract void count();

    public ChallangeCountable(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
