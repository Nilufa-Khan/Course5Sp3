public class Main {
    public static void main(String[] args) {
        String s1 = "Ramesh";
        String s2 = "Animesh";
        Name n1 = new Name() {
            public boolean isStartingWithA(String  str){
                return str.charAt(0) == 'A';
            }
        };
        System.out.println("n1.isStartingWithA(s1) = " + n1.isStartingWithA(s2));
    }
}
