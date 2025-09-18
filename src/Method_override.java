class A {
    int a;
    public int ham(){
        return 1;
    }
    public void mthd()
    {
        System.out.println("I am mthd of class A");
    }
    public void mtd2(){
        System.out.println("I amd mtd of class A ");
    }
}

class B extends A{
    public int maa(){
        return 3;
    }
    public void mtd2(){
        System.out.println("I am mtd2 of class B");
    }

}
public class Method_override {
    public static void main(String[] args) {
        B a = new B();
        a.mtd2();
        a.mthd();
        A obj1 = a;
        obj1.ham();
        obj1.mtd2();

    }
}
