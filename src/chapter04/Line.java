package chapter04;

public class Line {
    int l;

    public Line(int l){
        this.l = l;
    }

    boolean isSameLine(Line l){

        if(this.l == l.l){
            return true;
        }
        return false;
    }
}
