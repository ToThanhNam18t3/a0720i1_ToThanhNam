package Bai6_KeThua.Bai_Tap.Point2d_Point3D;

public class Poind2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Poind2d(){

    }

    public Poind2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arrayXY = {getX(),getY()};
        return arrayXY;
    }

    @Override
    public String toString(){
        return "Location of x , y : " + getX() + " " + getY();
    }
}
