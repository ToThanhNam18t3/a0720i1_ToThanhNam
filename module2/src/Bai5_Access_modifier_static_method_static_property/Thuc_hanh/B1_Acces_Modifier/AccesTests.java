package Bai5_Access_modifier_static_method_static_property.Thuc_hanh.B1_Acces_Modifier;


class A {
    public int data = 40;

    void msg() {
        System.out.println("Hello Java");
    }
}


    class Simple {
    public static void main(String args[]) {
        A obj = new A();
        System.out.println(obj.data);//Compile Time Error
        obj.msg();//Compile Time Error
    }
}

