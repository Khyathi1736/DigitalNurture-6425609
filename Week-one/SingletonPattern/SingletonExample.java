public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() {
        System.out.println("Singleton instance created.");
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getInstance();
        obj1.showMessage();

        SingletonExample obj2 = SingletonExample.getInstance();
        obj2.showMessage();

        System.out.println("Are both instances same? " + (obj1 == obj2));
    }
}
