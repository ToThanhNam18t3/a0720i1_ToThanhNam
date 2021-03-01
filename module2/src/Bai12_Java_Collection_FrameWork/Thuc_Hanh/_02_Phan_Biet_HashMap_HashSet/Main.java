package Bai12_Java_Collection_FrameWork.Thuc_Hanh._02_Phan_Biet_HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        System.out.println(studentMap);

        for (Map.Entry<Integer, Student> student:studentMap.entrySet()){
            System.out.println(student.toString());
        }

        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);

        for (Student student:studentSet){
            System.out.println(studentSet.toString());
        }
    }




}
