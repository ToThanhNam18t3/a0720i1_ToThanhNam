package Bai9_DSA_Danh_Sach.Bai_Tap.Trien_Khai_ArrList_Thu_Vien;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student(){
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1,"Nam");
        Student b = new Student(2,"Huy");
        Student c = new Student(3,"Quang");
        Student d = new Student(4,"Dao");
        Student e = new Student(5,"My");


        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        studentMyList.clear();

        for(int i = 0; i < studentMyList.size; i++){
            Student student =(Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }



}
