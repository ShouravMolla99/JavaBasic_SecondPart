package method_overloading;

public class Main {

    public static void main(String[] args) {

        OverDemo od = new OverDemo();

        od.perfectValue(12,1,7);
        od.perfectValue(5,5);
        od.perfectValue(3.9,1.3, 1.6);
        od.perfectValue();
    }
}
