package Bai6_KeThua.Bai_Tap.Point_MoveablePoint;

public class Main {
    public static void main(String[] args) {
        //Test Point
        Point testPoint = new Point(5.0f,3.0f);
        System.out.println(testPoint);


        //Test MoveablePoint
        MoveablePoint testMoveablePoint = new MoveablePoint(6.0f,7.0f);
        System.out.println(testMoveablePoint);
        System.out.println(testMoveablePoint.move());
    }
}
