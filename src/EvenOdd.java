public interface EvenOdd {
    boolean isOdd(int number);



}
class OddImpl{
    public static void main(String[] args) {
        EvenOdd o1 = number -> (number % 2 != 0);
        System.out.println("Number = " + o1.isOdd(22));
    }
}
