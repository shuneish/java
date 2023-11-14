public class Square extends Shape {
    // attribute
    private int side;

    // method
    public void setSide(int s) {
        side = s;
    }

    public int getSide() {
        return side;
    }

    @Override
    public float calcArea() {
        float s;

        s = getSide();
        return (float)(s*s);
    }
}