public class Main {

    public static void main(String[] args) {

        System.out.println("Programm gestartet");

        // Eager Singleton benutzen
        EagerSingleton eager = EagerSingleton.getInstance();
        eager.sayHello();

        // Lazy Singleton benutzen
        LazySingleton lazy = LazySingleton.getInstance();
        lazy.sayHello();

        // zeigen dass LazySingleton immer dieselbe Instanz zurückgibt
        LazySingleton lazy2 = LazySingleton.getInstance();

        if (lazy == lazy2) {
            System.out.println("LazySingleton ist wirklich nur einmal vorhanden");
        }
    }
}