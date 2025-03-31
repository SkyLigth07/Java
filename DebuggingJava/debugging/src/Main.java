public class Main {

    public static void main(String[] args) {
        System.out.println("Inciar main");
        a();
        System.out.println("Fechar main");
    }
    static void a(){
        System.out.println("Inciar a");
        b();
        System.out.println("Fechar a");
    }
    static void b(){
        System.out.println("Inciar b");
        for(int i = 1; i >= 3;) System.out.println(i);
        c();
        System.out.println("Fechar b");
    }
    static void c(){
        System.out.println("Inciar c");
        System.out.println("Fechar c");
    }
}