public class cat extends animal {

    private int maxRun;
    private int maxSwim;

    public cat(String name) {
        super(name);
        maxRun = (int) (Math.random()*(100+1)) + 150;
        maxSwim = 0;
    }

    public void getMax() {
        System.out.println("Максимально для кота: бег - " + maxRun + ", плавание - " + maxSwim);
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
        if (result (maxSwim, lengthSwim) != true) {
            System.out.println (name + " не умеет плавать");
        }
    }

}