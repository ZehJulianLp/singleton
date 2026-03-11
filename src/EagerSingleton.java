public class EagerSingleton {

    // Instanz wird sofort erstellt
    private static final EagerSingleton instance = new EagerSingleton();

    // privater Konstruktor verhindert neue Objekte
    private EagerSingleton() {
        System.out.println("EagerSingleton wurde erstellt");
    }

    // Zugriff auf die Instanz
    public static EagerSingleton getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hallo vom EagerSingleton");
    }
}