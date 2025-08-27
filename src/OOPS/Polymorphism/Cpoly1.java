package OOPS.Polymorphism;
// Static or Early Binding
public class Cpoly1 {
    Cpoly1(){

    }
    Cpoly1(int a){

    }
    public static void main(String[] args) {
        System.out.println("A");
        Cpoly1 cc = new Cpoly1();
        cc.m1(5);
        cc.main(4);
    }
    void m1(){
        System.out.println("B");
    }
    void m1(int a){
        System.out.println("C");
    }
//    int m1(){
//        System.out.println("D");
//        return 0;
//    }

    public static void main(int args) {
        System.out.println("E");
    }
}
