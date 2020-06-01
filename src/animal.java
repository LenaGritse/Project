public abstract class animal {

    private int max;
    private int length;
    static int count = 0;

    static String name;

    public animal (String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int lengthRun);

    public abstract void swim(int lengthSwim);

    public static boolean result(int max, int length) {
        if (length > 0 && length <= max) {
            return true;
        }
        return false;
    }
}