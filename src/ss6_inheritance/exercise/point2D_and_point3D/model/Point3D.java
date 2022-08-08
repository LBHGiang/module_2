package ss6_inheritance.exercise.point2D_and_point3D.model;

public class Point3D extends Point2D {
    private float z = 0.0f;

    //constructor

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f,%.2f)", getX(), getY(), z);

    }
}
