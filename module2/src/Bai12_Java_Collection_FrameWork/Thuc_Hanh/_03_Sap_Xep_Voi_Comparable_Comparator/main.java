package Bai12_Java_Collection_FrameWork.Thuc_Hanh._03_Sap_Xep_Voi_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections; 
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student = new Student("Kien",15,"Hn");
        Student student2 = new Student("Giang",16,"Hn");
        Student student3 = new Student("Ha",17,"Hn");
        Student student4 = new Student("Noi",19,"Hn");
        Student student5 = new Student("Nam",18,"Hn");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        lists.add(student5);

        Collections.sort(lists);
        for (Student p : lists) {
            System.out.println(p.toString());
        }

        Age age = new Age();
        Collections.sort(lists,age);
        System.out.println("So sanh theo tuoi : ");
        for(Student t:lists){
            System.out.println(t.toString());
        }
    }
}
