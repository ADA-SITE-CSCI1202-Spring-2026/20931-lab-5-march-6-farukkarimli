public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(5, 10);
        Rectangle r3 = new Rectangle(4, 8);

        System.out.println(r1.equals(r2)); // true
        System.out.println(r1.equals(r3)); // false
    }
}
