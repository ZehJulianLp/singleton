public class LazySingleton {

    private static LazySingleton instance;

    // privater Konstruktor
    private LazySingleton() {
        System.out.println("LazySingleton wurde erstellt");
    }

    // Instanz wird erst erzeugt wenn sie gebraucht wird
    public static LazySingleton getInstance() {

        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

    public void sayHello() {
        System.out.println("Hallo vom LazySingleton");
    }
}