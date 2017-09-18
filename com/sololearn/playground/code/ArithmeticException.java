public class Program {

    static int div(int a, int b) throws ArithmeticException, {
        if(b == 0) {
            //throw new ArithmeticException("Division by Zero");
              throw new ArithmeticException("Division by Zero2");
        } else {
            return b / a;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(42, 0));
    }

}
