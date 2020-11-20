package Bai7_Abstract_Interface.Thuc_Hanh._02_Interface_Comparable_cho_cac_lop_hh;

import Bai6_KeThua.Bai_Tap.Cirle_Cylinder.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){

    }

    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o){
        if (getRadius() > o.getRadius())
            return -1;
        else if(getRadius() < o.getRadius())
            return 1;
        else
            return 0;
    }
}
