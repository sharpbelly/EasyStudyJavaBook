package chapter07;

abstract class Q5Controller {
    boolean power;

    public Q5Controller(boolean power) {
        this.power=power;
    }

    void show(){
        if(power==true)
            System.out.println(getName()+"가 켜졌습니다.");
        else System.out.println(getName()+"가 꺼졌습니다.");
    }

    abstract String getName();
}
