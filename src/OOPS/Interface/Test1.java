package OOPS.Interface;

interface Inter1{
    int x = 122;

    void m1();

}

interface Inter2{
    int x = 145;
    void m3();
}

public class Test1 implements Inter1,Inter2{
    public static void main(String[] args) {
        System.out.println("Main entry point");
        System.out.println(Inter2.x);
        int  x = 113;
//        x = 114;
        System.out.println(x);

    }
    public void m1(){
        System.out.println("This is method 1");
    }
    public void m3(){
        System.out.println("This is method 3");
    }
}
