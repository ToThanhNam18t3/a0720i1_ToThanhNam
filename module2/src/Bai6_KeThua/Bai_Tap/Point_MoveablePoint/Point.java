package Bai6_KeThua.Bai_Tap.Point_MoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(){
    }

    public Point(float x, float y) {
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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(float x, float y) {
        float[] arrayXY = {getX(),getY()};
        return  arrayXY;
    }

    @Override
    public String toString(){
        return "Location of x, y : " + getX() + getY();
    }
}