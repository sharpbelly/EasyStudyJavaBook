package chapter09;

class Ticket implements Comparable {
    int no;

    public Ticket(int no) {
        this.no = no;
    }

    public int compareTo(Object o) {
        Ticket t = (Ticket) o;
        return no < t.no ? -1 : (no > t.no ? 1 : 0);
    }
}
