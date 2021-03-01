package Bai12_Java_Collection_FrameWork.Thuc_Hanh._02_Phan_Biet_HashMap_HashSet;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        address = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        address = adress;
    }

    @Override
    public String toString(){
        return "Student@name=" + name + ",age=" + age + ",address=" + address;
    }
}
