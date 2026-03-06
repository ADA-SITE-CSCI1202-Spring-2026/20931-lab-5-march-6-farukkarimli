public class Rectangle {

    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return this.width == other.width && this.height == other.height;
        }

        return false;
    }
}