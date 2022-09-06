public class FactorialIMpl {
    public static void main(String[] args) {
    Factorial f1 = num -> {
        int fact = 1;
        for(int i = 1 ; i <= num ;i++){
            fact = fact * i;
        }
        return fact;
    };
        System.out.println("f1.isFact(10) = " + f1.isFact(10));
    }
}
