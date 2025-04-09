class Student {
    public static void main(String[] args){
        A obja=new A();
        B objb=new B();
        obja.a();
        obja.b();
        objb.c();
        objb.a();
    }
}
class A {
    void a() {
        System.out.println("a-it is method of A clas");
    }

    void b() {
        System.out.println("b-it is method of A clas");
    }
}
class B extends A {
    void c() {
        System.out.println("c-it is method of B clas");
    }
}