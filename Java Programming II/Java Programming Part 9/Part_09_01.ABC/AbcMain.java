public class AbcMain {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        // B inherits class A and class C inherits class B
        // Class A is the superclass for class C and class B is the superclass for class C

        c.a();
        c.b();
        c.c();
    }
}
