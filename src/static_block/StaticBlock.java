package static_block;
public class StaticBlock {
    static int num;
    static String name;
    //This is Static Block
    static {
        num = 1000;
        name = "Shourav";
    }
    //Static Method
    static void display(){
        System.out.println("Number: "+num);
        System.out.println("Name: "+name);
    }
}
