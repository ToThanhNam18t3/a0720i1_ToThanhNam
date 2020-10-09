package Bai6_KeThua.Bai_Tap.Point2d_Point3D;

public class Point3d extends Poind2d {
    private float z = 0.0f;

    public Point3d() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3d(float z) {
        this.z = z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(float x , float y , float z) {
        float arrayXYZ[] = {getX(), getY(), getZ()};
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return "Location of x , y , z  : " + getX() + " " + getY() + " " + getZ();
    }
}
