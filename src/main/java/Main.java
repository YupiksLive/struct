public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 5) + " " + calc.mult(3, 2) + " " + calc.pow(2, 4));
    }
}