public class dog extends animal {

    private int maxRun;
    private int maxSwim;

    public dog(String name) {
        super(name);
        maxRun = (int) (Math.random()*(200+1)) + 400;
        maxSwim = (int) (Math.random()*(10+1)) + 5;
    }

    public void getMax() {
        System.out.println("Максимально для собаки: бег - " + maxRun + ", плавание - " + maxSwim);
    }

    @Override
    public void run(int lengthRun) {
        if (result (maxRun, lengthRun)) {
            System.out.println (name + " пробежал " + lengthRun + " метров");
        }
        else {
            System.out.println (name + " столько не пробежит");
        }
    }

    @Override
    public void swim(int lengthSwim) {
        if (result (maxSwim, lengthSwim)) {
            System.out.println (name + " проплыл " + lengthSwim + " метров");
        }
        else {
            System.out.println (name + " столько не проплывет");
        }
    }

}