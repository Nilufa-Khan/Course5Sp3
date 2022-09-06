public class EvenOddImpl {
    public static void main(String[] args) {
    int num = 23;
    EvenOdd e1 = new EvenOdd() {
        @Override
        public boolean isOdd(int number) {
            boolean res =false;
            if(number % 2 != 0){
               res = true;
            }

            return res;
        }


    };
        System.out.println(":::number::: = " + e1.isOdd(23));
    }
}
