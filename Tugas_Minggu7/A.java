package Tugas_Minggu7;

class A {
    void callthis() {
        System.out.println("Di dalam method kelas A");
    }
}

class B extends A {
    void callthis() {
        System.out.println("Di dalam method kelas B");
    }
}

class C extends A {
    void callthis() {
        System.out.println("Di dalam method kelas C");
    }
}
class DynamicDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;

        ref = b;
        ref.callthis();

        ref = c;
        ref.callthis();

        ref = a;
        ref.callthis();
    }
}