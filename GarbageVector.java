public class GarbageVector {
    private double x, y, z;

    GarbageVector(double arg_x, double arg_y, double arg_z) {
        x = arg_x;
        y = arg_y;
        z = arg_z;
    }

    double getLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return "Vector coordinates: "
                + "x = " + x
                + ", y = " + y
                + ", z = " + z;
    }
}
