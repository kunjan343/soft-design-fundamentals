public class Singleton {
    private static Singleton onlyObject = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (onlyObject == null) {
            onlyObject = new Singleton();
        }
        return onlyObject;
    }
}
