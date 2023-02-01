package method_overloading;

public class OverDemo {

    //Method overloading Practise
    void perfectValue(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        System.out.println("Total Value Three integers: "+result);
    }

    void perfectValue(int number1, int number2) {
        int result2 = number1 + number2;
        System.out.println("Total Value of two integers: "+result2);
    }
    void perfectValue(double num1, double num2, double num3) {
        double result3 = num1 + num2 + num3;
        System.out.println("Total Value is: "+result3);
    }
    void perfectValue() {
        System.out.println("Total Value is Empty");
    }
}
