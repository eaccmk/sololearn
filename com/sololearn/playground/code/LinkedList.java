import java.util.LinkedList;

public class MyClass {
    public static void main(String[ ] args) throws ArithmeticException{
        LinkedList<Integer> c = new LinkedList<Integer>();
        c.add(0);
        c.add(2);
        c.add(3);
        int x=1;
        for(Integer s: c.get(0)) {
            System.out.println(x/s);
            throw new ArithmeticException("Division by Zero2");
        }
    }
}
