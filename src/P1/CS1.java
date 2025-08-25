package P1;
public class CS1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        Aa.main(new String[]{"1","2","3"});
        for(int i = 0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}

class Aa{
    public static void main(String[] args) {
        System.out.println("Hi");
        CS1.main(new String[]{"1","2","3"});
    }
}