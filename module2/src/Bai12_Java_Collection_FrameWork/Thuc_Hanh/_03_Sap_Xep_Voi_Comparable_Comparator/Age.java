package Bai12_Java_Collection_FrameWork.Thuc_Hanh._03_Sap_Xep_Voi_Comparable_Comparator;

import java.util.Comparator;

public class Age implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        } else if(o1.getAge() == o2.getAge()){
            return 0;
        }else {
            return -1;
        }
    }
}
