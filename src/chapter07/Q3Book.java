package chapter07;

public class Q3Book implements Comparable{
    int price;

    public Q3Book(int price) {
        this.price = price;
    }

    void show(){
        System.out.printf("Book [price = %d]\n",price);
    }

    @Override
    public int compareTo(Object o) {

        Q3Book book = (Q3Book) o;

        if(this.price<book.price)
            return -1;
        else if(this.price> book.price)
            return 1;
        else return 0;
    }
}
