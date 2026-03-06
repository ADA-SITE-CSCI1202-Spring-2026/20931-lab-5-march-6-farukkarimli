public class Main1 {
     public static void main(String[] args) {
        Point p = new Point(0, 0);
        p.display();

        p.moveUp();
        p.moveRight();
        p.display(); // (1, 1)

        p.moveDown();
        p.moveLeft();
        p.display(); // (0, 0)
    }
}
