package L06;

public class Point3 {

    public double x;
    public double y;
    public double z;


    public Point3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public Point3() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
